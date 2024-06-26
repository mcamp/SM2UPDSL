package dk.sdu.mmmi.assa.sm.generator

import dk.sdu.mmmi.assa.sm.stateMachine.BoolExp
import dk.sdu.mmmi.assa.sm.stateMachine.Delay
import dk.sdu.mmmi.assa.sm.stateMachine.Expression
import dk.sdu.mmmi.assa.sm.stateMachine.Machine
import dk.sdu.mmmi.assa.sm.stateMachine.Negation
import dk.sdu.mmmi.assa.sm.stateMachine.Range
import dk.sdu.mmmi.assa.sm.stateMachine.Root
import dk.sdu.mmmi.assa.sm.stateMachine.SMBool
import dk.sdu.mmmi.assa.sm.stateMachine.SMNumber
import dk.sdu.mmmi.assa.sm.stateMachine.State
import dk.sdu.mmmi.assa.sm.stateMachine.Statement
import dk.sdu.mmmi.assa.sm.stateMachine.Time
import dk.sdu.mmmi.assa.sm.stateMachine.Transition
import dk.sdu.mmmi.assa.sm.stateMachine.VarAssignation
import dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition
import dk.sdu.mmmi.assa.sm.stateMachine.VarReference
import dk.sdu.mmmi.assa.sm.stateMachine.impl.MachineImpl
import dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl
import dk.sdu.mmmi.assa.sm.stateMachine.impl.VarAssignationImpl
import java.util.LinkedHashSet
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class UppaalGenerator {
	
	var List<UppaalProcess> processes
	var List<String> channels
	var List<String> clocks
	
	def generate(Root root, IFileSystemAccess2 fsa) {
		processes = root.allUppaalProcesses
		channels = root.allChannels.toList
		clocks = root.allClocks
		fsa.generateFile(root.name+'/uppaal.xta', root.compile)
	}
	
		
	def List<UppaalProcess> allUppaalProcesses(Root root) {
		val List<UppaalProcess> ret = newArrayList
		ret.addAll(root.allMachinesToProcesses)
		ret.addAll(root.allSyncTransitionsToProcesses)
		ret
	}
	
	def List<UppaalProcess> allMachinesToProcesses(Root root) {
		val List<UppaalProcess> ret = newArrayList
		ret.addAll(root.eAllContents.filter(Machine).map[new UppaalProcess(it)].toList)
		ret
	}
	
	def List<UppaalProcess> allSyncTransitionsToProcesses(Root root) {
		val List<UppaalProcess> ret = newArrayList
		val allWhenTx = root.eAllContents.filter(Transition).reject[it.when.isNullOrEmpty].toList
		val allSignalTx = root.eAllContents.filter(Transition).reject[it.signal.isNullOrEmpty].toList
		val allWhenNoSignalTx = allWhenTx.reject[whenTx |
			allSignalTx.exists[signalTx | signalTx.signal == whenTx.when]
		]
		val allSignalNoWhenTx = allSignalTx.reject[signalTx |
			allWhenTx.exists[whenTx | signalTx.signal == whenTx.when]
		]

		val List<Transition> noRepeatedWhen = newArrayList
		for(when: allWhenNoSignalTx) {
			if(!noRepeatedWhen.exists[addedWhen | addedWhen.when == when.when])
				noRepeatedWhen.add(when);
		}
		
		val List<Transition> noRepeatedSignal = newArrayList
		for(signal: allSignalNoWhenTx) {
			if(!noRepeatedSignal.exists[addedSignal | addedSignal.signal == signal.signal])
				noRepeatedSignal.add(signal);
		}
		
		ret.addAll(noRepeatedWhen.map[UppaalProcess.fromWhenTransition(it)].toList)
		ret.addAll(noRepeatedSignal.map[UppaalProcess.fromSignalTransition(it)].toList)
		ret
	}
	
	def CharSequence compile(Root root)'''
	«FOR clock: clocks BEFORE "clock " SEPARATOR ", " AFTER ";"»«clock»«ENDFOR»
	«FOR channel: channels BEFORE "chan " SEPARATOR ", " AFTER ";"»«channel»«ENDFOR»
	«FOR variable: root.vars»
	«variable.type» «variable.name» = «variable.expression.compileExpression»;
	«ENDFOR»
	«FOR process: processes»«process.compile»«ENDFOR»
«««	«FOR automata:root.allAuxiliarAutomata»«automata.compile»«ENDFOR»
	system «FOR process:processes SEPARATOR ", " AFTER ';'»«process.name»«ENDFOR»
	'''
	
	def dispatch compile(UppaalProcess process)'''
	process «process.name» {
		«FOR variable: process.vars»
		«variable.type» «variable.name» := «variable.expression.compileExpression»;
		«ENDFOR»
		«IF !process.states.isEmpty»
		state
			«FOR state:process.states SEPARATOR ",\n" AFTER ';'»«state.name»«state.compileBody»«ENDFOR»
		«IF process.hasCommittedState»
		commit «FOR state:process.states.filter[committed] SEPARATOR ", " AFTER ";"»«state.name»«ENDFOR»
		«ENDIF»
		init «process.initState.name»;
		«ENDIF»
		«IF !process.transitions.isEmpty»
		trans
			«FOR transition : process.transitions SEPARATOR ",\n" AFTER ';'»«transition.from» -> «transition.to» {
				«transition.compileAction»
			}«ENDFOR»
		«ENDIF»		
	}
	'''
	
	def String compileExpression(Expression expression) {
		switch expression {
			SMNumber: expression.value.toString
			SMBool: expression.value ? 1.toString : 0.toString
			BoolExp: '''(«expression.left.compileExpression» «expression.op» «expression.right.compileExpression»)'''
			VarReference: expression.variable.name
			Negation: '''!(«expression.exp.compileExpression»)'''
		}
	}
	
	/*
	 * Notes:
	 * Only using the concept that an auxiliar automaton is generated always in the same way.
	 * This may change by:
	 * 	1. creating a new type of auxiliar automaton, adding a new compile method
	 * 	2. adding the right data to the auxiliar automaton: states and transitions
	 */
	def dispatch compile(AuxiliarAutomaton machine)'''
	process «machine.name» {
		state
			initSync;
		init initSync;
		trans
			initSync -> initSync {
				sync «machine.signal»!;
			};
	}
	'''
	
	def allAuxiliarAutomata(Root root){
		val whenTxs = root.eAllContents.filter(Transition).filter[!when.isNullOrEmpty].toList
		val signalTxs = root.eAllContents.filter(Transition).filter[!signal.isNullOrEmpty].toList
		var List<Transition> txs = newArrayList;
		for(whenTx: whenTxs) {
			var found = false
			for(signalTx: signalTxs) {
				if(signalTx.signal == whenTx.when){
					found = true // todo: Should put a break, but not available in xtend. Find a better way to loop
				}
			}
			if(!found)
				txs.add(whenTx)
		}
		txs.map[toAuxiliarAutomaton].toList
	}
	
	/*
	 * Notes:
	 * Create only an auxiliar automaton with auxiliar data (eg., signal)
	 * It may be useful to also create auxiliar tx and states,
	 * depending on how we generate different automata
	 */
	def toAuxiliarAutomaton(Transition transition){
		val automaton = new AuxiliarAutomaton
		automaton.name = 'gen_sync_'+transition.when
		automaton.signal = transition.when
		automaton
	}
	
	def allAutomata(Root root){
		val List<Machine> ret = newLinkedList(root.eAllContents.toIterable.filter(Machine).toList)
		ret.addAll(root.allAuxiliarAutomata)
		ret
	}
	
	def compileAction(UppaalTransition transition) {
		// guards
		val List<String> guards = newArrayList
		if(transition.isTime)
			guards.add("gen_clock >= "+transition.timeout.toClockString)
		if(transition.hasGuard)
			guards.add(transition.guard.compileGuard)
		
		// assigns
		val List<String> assigns = newArrayList
		if (transition.toStateWithTimeTransition)
			assigns.add("gen_clock := 0")
		for(action: transition.myActions)
			assigns.add(action.compileAction)
		for(action: transition.actions)
			assigns.add(action.compileAction)
		return '''
		«FOR guard: guards BEFORE "guard " SEPARATOR " && " AFTER ";"»«guard»«ENDFOR»
		«IF !transition.sync.isNullOrEmpty»
		sync «transition.sync»;
		«ENDIF»
		«FOR action: assigns BEFORE "assign " SEPARATOR ", " AFTER ";"»«action»«ENDFOR»
		'''
	}
	
	def String compileGuard(Object guard) {
		switch guard {
			Expression: guard.compileExpression
			String: guard
		}
	}
	
	def String compileAction(Statement statement) {
		switch statement {
			VarAssignation: '''«statement.variable.name» := «statement.expression.compileExpression»'''	
		}
	}
	
	def CharSequence toClockString(float seconds) {
		val clock = seconds
		return clock.toInt +""
	}
	
	def int toInt(float number) {
		return Math.round(number)
	}
	
	def CharSequence compileBody(UppaalState state){
		val originalState = state.originalState
		if(originalState === null) {
			if (state.body.isBlank) return ""
			return '''
			 {
				«state.body»
			}'''
		} 
		return originalState.compileBody
	}
	
	def compileBody(State state){
		var conditions = newArrayList
		if (state.hasTimeoutTransition)
			conditions.add("gen_clock <= "+state.timeoutTransition.timeout.toClockString)
		if (conditions.isEmpty) return ""
		'''
		 {
			«FOR condition: conditions SEPARATOR " && "»«condition»«ENDFOR»
		}'''
	}
	
	def hasTimeoutTransition(Root root) {
		root.eAllContents.filter(Transition).exists[isTime]
	}
	
	def hasStartupDelayProperty(Root root) {
		!root.eAllContents.filter(Delay).isNullOrEmpty
	}
	
	def hasTimeoutTransition(State state) {
		state.allOutboundTransitions.exists[isTime]
	}
	
	def timeoutTransition(State state) {
		state.allOutboundTransitions.head
	}
	
	def allOutboundTransitions(State state) {
		val root = EcoreUtil2.getContainerOfType(state, Root)
		return root.eAllContents.filter(Transition).filter[from==state]
	}
	
	def List<String> allAuxiliarChannels(Root root) {
		val whenTx = root.eAllContents.filter(Transition).filter[!when.isNullOrEmpty]
		val signalTx = root.eAllContents.filter(Transition).filter[!signal.isNullOrEmpty]
		val List<String> channels = newLinkedList;
		channels.addAll(whenTx.map[when].toList)
		val missingChannels = signalTx.filter[!channels.contains(signal)].map[signal]
		channels.addAll(missingChannels.toList)
		return channels
	}
	
	def List<String> allNestedChannels(Root root) {
		val statesWithMachine = root.eAllContents.filter(State).filter[machine!==null]
		statesWithMachine.map['''gen_«name»_«machine.name»_start'''].toList
	}
	
	def LinkedHashSet<String> allChannels(Root root) {
		val retValue = newLinkedHashSet
		retValue.addAll(root.allAuxiliarChannels)
		retValue.addAll(root.allNestedChannels)
		return retValue
	}
	
	def List<String> allClocks(Root root) {
		val retValue = newArrayList
		if (root.hasTimeoutTransition) retValue.add("gen_clock")
		if (root.hasStartupDelayProperty) retValue.add("startup_clock")		
		return retValue
	}
	
}

class AuxiliarAutomaton extends MachineImpl {
	public var String signal
}

class AuxiliarState extends StateImpl {
	public State nextState
}

class UppaalProcess {
	var public String name
	val public List<UppaalState> states = newArrayList
	val public List<UppaalTransition> transitions = newArrayList
	val public List<UppaalState> firstGeneratedStates = newArrayList
	var public Machine originalMachine
	
	new(Machine machine) {
		this.originalMachine = machine
		this.name = machine.processName
		
		// If machine is nested, it has an aux init state and an extra transition (if it has states)
		if(machine.isNested) {
			this.genInitNestedMachine(machine)
		}
		
		// If machine has startup delay safety property
		if(machine.hasStartupDelay){
			this.genStartupDelay(machine)
		}
		
		// Add transitions to process
		// Fill txs first because state creates transitions, which I want them at the end
		this.fillTransitions(machine)
		
		// Add states to process
		this.fillStates(machine)
		
		// TODO: Add from safety property
		//this.fillFromSafetyProperties(machine)
		
		this.states.addAll(this.firstGeneratedStates)
	}
	
	new(){}
	
	def static fromSignalTransition(Transition transition) {
		val process = new UppaalProcess()
		// Create name
		process.name = "gen_sync_"+transition.signal
		
		//Create states
		process.states.add(new UppaalState("initSync"))
		
		//Create transition
		val tx = new UppaalTransition(EcoreUtil2.getContainerOfType(transition, Machine))
		tx.from = "initSync"
		tx.to = "initSync"
		tx.sync = transition.signal+"?"
		process.transitions.add(tx)
		
		return process
	}
	
	def static fromWhenTransition(Transition transition) {
		val process = new UppaalProcess()
		// Create name
		process.name = "gen_sync_"+transition.when
		
		//Create states
		process.states.add(new UppaalState("initSync"))
		
		//Create transition
		val tx = new UppaalTransition(EcoreUtil2.getContainerOfType(transition, Machine))
		tx.from = "initSync"
		tx.to = "initSync"
		tx.sync = transition.when+"!"
		process.transitions.add(tx)
		
		return process
	}
	
	def List<VarDefinition> vars() {
		if(originalMachine === null) return newArrayList
		return originalMachine.vars
	}
	
	def private genInitNestedMachine(Machine machine) {
		val genInit = "gen_init"
		this.states.add(new UppaalState("gen_init"))
		if(!machine.states.empty) {
			val newTransition = new UppaalTransition(machine)
			newTransition.from = genInit
			val toState = machine.states.get(0)
			// TODO: Hack, when safety property, we created a pre state, here this is hardcoded to make it work with init state of nested machine
			if (toState.properties.isNullOrEmpty)
				newTransition.to = toState.name
			else
				newTransition.to = toState.preStateName
			// synchronization channel, waiting for starting nested machine
			newTransition.channel = machine.startMachineChannel
			newTransition.sync = newTransition.channel+"?"
			
			this.transitions.add(newTransition)
		}
	}
	
	def private fillStates(Machine machine) {
		for(state: machine.states) {
			//add auxiliar states if the state has nested machine
			if(state.hasNestedMachine) {
				val preStateName = state.preStateName
				val preState = new UppaalState(preStateName)
				preState.committed = true
				this.states.add(preState)
				
				// Create tx from auxiliar state to original state, activating the nested machine
				val newTransition = new UppaalTransition(machine)
				newTransition.from = preStateName
				newTransition.to = state.name
				// synchronization channel, signaling the start of the nested machine
				newTransition.channel = state.machine.startMachineChannel
				newTransition.sync = newTransition.channel+"!"
				
				this.transitions.add(newTransition)
			}
			
			// If state is "final" in nested machine: 
			if(state.isFinal) {
				val newTransition = new UppaalTransition(machine)
				newTransition.from = state.name
				newTransition.to = "gen_init"
				this.transitions.add(newTransition)
			}
			
			//add each state to the process
			this.states.add(new UppaalState(state))
		}
	}
	
	def private fillTransitions(Machine machine) {
		for(transition:machine.transitions) {
			// New transitions if outgoing state has nested machine
			if(transition.to.hasNestedMachine) {
				this.genTransitionToStartNestedMachine(transition)	
			}
			
			// New transitions if tx has when and signal
			else if(!(transition.signal.nullOrEmpty || transition.when.nullOrEmpty)) {
				this.genTransitionWithWhenSignal(transition)
			}
			
			// Do not fill tx when outgoing state has a delay startup
			else if(!transition.to.properties.nullOrEmpty) {
				
			}
			// If not, add transition like normal
			else {
				this.transitions.add(new UppaalTransition(transition))
			}
		}	
	}
	
// TODO: implement safety properties over state
//	def private fillFromSafetyProperties(Machine machine) {	
//		// Generated transitions: from startup delay states
//		for(state: machine.states) {
//			val startupDelay = state.properties.filter(Delay).head
//			if(startupDelay !== null) {
//				val preStateName = state.preStateName
//				val preState = new UppaalState(preStateName)
//				preState.committed = true
//				this.states.add(preState)
//
//				// Modify every transition that comes to a delay state
//				for(transition : machine.transitions.filter[to === state]){
//					val tx = new UppaalTransition(transition)
//					tx.to = preStateName
//					this.transitions.add(tx)	
//				}
//				
//				// two new transitions: one to the state when delay is correct, one to init when delay is not correct
//				var tx = new UppaalTransition(machine)
//				tx.from = preStateName
//				tx.to = state.name
//				tx.setGuard("startup_clock >= "+startupDelay.time.toClockString)
//				this.transitions.add(tx)
//				
//				tx = new UppaalTransition(machine)
//				tx.from = preStateName
//				tx.to = this.initState.name
//				tx.setGuard("startup_clock < "+startupDelay.time.toClockString)
//				this.transitions.add(tx)
//			}
//		}
//	}
	
	/**
	 * If a transition goes to a state with a nested machine
	 * We need to modify this transition to point to the generated "pre" state
	 * And create a new one that goes from pre to the original state, activating the nested machine
	 */ 
	def private genTransitionToStartNestedMachine(Transition transition) {
		// Create tx to pre generated state
		// Use previous code to create transition
		val newTransition = new UppaalTransition(transition)
		val newState = transition.to.preStateName
		// Modify the outgoing state
		newTransition.to = newState
		this.transitions.add(newTransition)
	}
	
	/**
	 * If a transition has a when and a signal, we need to add a new state to support multiple sync in uppaal
	 * Moreover, it creates the pre_state if needed
	 */ 
	def private genTransitionWithWhenSignal(Transition transition) {
		// Create tx to pre generated state
		// Use previous code to create transition
		val newStateName = transition.to.preStateName
		
		val newTransition1 = new UppaalTransition(EcoreUtil2.getContainerOfType(transition, Machine))
		newTransition1.from = transition.from.name
		newTransition1.to = newStateName
		newTransition1.sync = transition.when + "?"
		this.transitions.add(newTransition1)
		
		val newTransition2 = new UppaalTransition(EcoreUtil2.getContainerOfType(transition, Machine))
		newTransition2.from = newStateName
		newTransition2.to = transition.to.name
		newTransition2.sync = transition.signal + "!"
		this.transitions.add(newTransition2)
		
		val newState = this.firstGeneratedStates.findFirst[	it.name == newStateName ]

		if (newState === null) {
			val preState = new UppaalState(newStateName)
			preState.committed = true
			this.firstGeneratedStates.add(preState)
		}
		
	}
	
	def UppaalState initState() {
		return states.empty ? null : states.get(0)
	}
	
	/**
	 * Returns all channels used in the process
	 * Iterate over all transitions, check if the channel is defined, and if it has not been added to the array
	 * Then, return array
	 */
	def List<String> allChannels() {
		val List<String> ret = newArrayList
		for(transition:transitions) {
			if(transition.hasChannel && !ret.contains(transition.channel))
				ret.add(transition.channel)
		}
		ret
	}
	
	
	def isNested(Machine machine) {
		if(EcoreUtil2.getContainerOfType(machine, State) === null) return false
		return true
	}
	
	def parentState(Machine machine) {
		return EcoreUtil2.getContainerOfType(machine, State)
	}
	
	def processName(Machine machine){
		if(machine.isNested) return machine.parentState.name+"_"+machine.name
		return machine.name
	}
	
	def hasNestedMachine(State state) {
		return state.machine !== null
	}
	
	def preStateName(State state) {
		return "gen_pre_"+state.name
	}
	
	def startMachineChannel(Machine machine) {
		"gen_"+machine.processName+"_start"
	}
	
	/**
	 * A state is defined as final if:
	 *   It is an outgoing state of a transition with signal used on parent machine
	 *   The transition using the signal (when) should start from the parent state
	 *   It does not have outgoing transitions [TODO: this should be imposed in the DSL itself]
	 * TODO: This approach only works with direct parent, not ancestors 
	 */
	def isFinal(State state){
		val machine = EcoreUtil2.getContainerOfType(state, Machine)
		val parentState = EcoreUtil2.getContainerOfType(machine, State)
		// If does not have parent state, then it is not a state from a nested machine
		if(parentState === null) return false
		
		val tx = machine.transitions.findFirst[to === state && !signal.isNullOrEmpty]
		// If it does not have an outgoing tx with a signal, it is not final state
		if(tx === null) return false
		
		val parentMachine = EcoreUtil2.getContainerOfType(parentState, Machine)
		val parentTx = parentMachine.transitions.findFirst[from === parentState && tx.signal === it.when]
		// If the outgoing tx from the parent state does not match the signal from the nested state
		//   then it is not a final state
		if(parentTx !== null) return false
		
		// It is a final state
		return true
	}
	
	def hasCommittedState(){
		states.findFirst[committed] !== null
	}
	
	
	//TODO: repeated code, build utils
	def CharSequence toClockString(float seconds) {
		val clock = seconds
		return clock.toInt +""
	}
	
	//TODO: repeated code, build utils
	def int toInt(float number) {
		return Math.round(number)
	}
	
	def boolean hasStartupDelay(Machine machine) {
		return !machine.properties.filter(Delay).isEmpty
	}
	
	def private genStartupDelay(Machine machine) {
		val uppaalstate = new UppaalState("gen_init")
		this.states.add(uppaalstate)
		val property = machine.properties.filter(Delay).head
		val fromTime = property.time.from
		val toTime = property.time.to
		uppaalstate.body = "startup_clock <= "+toTime
		if(!machine.states.empty) {
			val newTransition = new UppaalTransition(machine)
			newTransition.from = uppaalstate.name
			newTransition.to = machine.states.get(0).name
			newTransition.setGuard("startup_clock >= "+fromTime)
			
			val List<Statement> actions = property.statements
			newTransition.putActions(actions)
			this.transitions.add(newTransition)
		}
	}
	
	def dispatch int getFrom(Time time) {
		time.value
	}
	
	def dispatch int getFrom(Range range) {
		range.from
	}
	
	def dispatch int getTo(Time time) {
		time.value
	}
	
	def dispatch int getTo(Range range) {
		range.to
	}
	
}

class UppaalTransition {
	var public String from
	var public String to
	var public String sync
	var public String channel
	var public float timeout
	var public boolean isTime
	var String guard
	var public List<Statement> myActions = newArrayList
	
	var Transition originalTx
	var Machine originalMachine
	
	new(Machine machine){ 
		originalMachine = machine
	}

	new(Transition transition) {
		originalTx = transition
		originalMachine = EcoreUtil2.getContainerOfType(transition, Machine)
		
		from = transition.from.name
		to = transition.to.name
		if(!transition.when.isNullOrEmpty) {
			sync = transition.when+"?"
			channel = transition.when	
		}
		if(!transition.signal.isNullOrEmpty) {
			sync = transition.signal+"!"
			channel = transition.signal	
		}
		
		
		this.timeout = transition.timeout
		this.isTime = transition.isTime
	}
	
	def hasChannel(){
		!channel.nullOrEmpty
	}
	
	def hasGuard(){
		if (originalTx === null) return !(this.guard === null)
		return originalTx.hasGuard
	}
	
	def Object getGuard() {
		return  originalTx === null ? this.guard : originalTx.guard 
	}
	
	def void setGuard(String guard) {
		this.guard = guard
	}
	
	def putActions(List<Statement> actions) {
		this.myActions = actions;
	}
	def getActions() {
		if(originalTx===null) 
				return newArrayList
		return originalTx.actions
	}
	
	def toStateWithTimeTransition() {
		val state = originalMachine.states.findFirst[it.name == to]
		if (state === null) return false;
		return state.outgoingTransitions.exists[it.isTime]
	}
	
	def getOutgoingTransitions(State state) {
		return EcoreUtil2.getContainerOfType(state, Machine).transitions.filter[it.from == state]
	}
	
}

class UppaalState {
	var public String name
	var public State originalState
	var public boolean committed = false
	var public String body = ""
	
	new(State state) {
		this.name = state.name
		this.originalState = state
		if(state.isFinal)
			committed = true
	}
	
	/**
	 * TODO: Duplicated method, create utils 
	 */
	def isFinal(State state){
		val machine = EcoreUtil2.getContainerOfType(state, Machine)
		val parentState = EcoreUtil2.getContainerOfType(machine, State)
		// If does not have parent state, then it is not a state from a nested machine
		if(parentState === null) return false
		
		val tx = machine.transitions.findFirst[to === state && !signal.isNullOrEmpty]
		// If it does not have an outgoing tx with a signal, it is not final state
		if(tx === null) return false
		
		val parentMachine = EcoreUtil2.getContainerOfType(parentState, Machine)
		val parentTx = parentMachine.transitions.findFirst[from === parentState && tx.signal === it.when]
		// If the outgoing tx from the parent state does not match the signal from the nested state
		//   then it is not a final state
		if(parentTx !== null) return false
		
		// It is a final state
		return true
	}
	
	new(String name) {
		this.name = name
	}
}