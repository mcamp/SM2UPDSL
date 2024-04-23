package dk.sdu.mmmi.assa.sm.generator

import dk.sdu.mmmi.assa.sm.stateMachine.Machine
import dk.sdu.mmmi.assa.sm.stateMachine.Root
import dk.sdu.mmmi.assa.sm.stateMachine.State
import dk.sdu.mmmi.assa.sm.stateMachine.Transition
import dk.sdu.mmmi.assa.sm.stateMachine.impl.MachineImpl
import dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class UppaalGenerator {
	
	var List<UppaalProcess> processes
	var List<String> channels
	
	def generate(Root root, IFileSystemAccess2 fsa) {
		processes = root.allUppaalProcesses
		channels = root.allChannels
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

		ret.addAll(allWhenNoSignalTx.map[new UppaalProcess(it)].toList)
		ret.addAll(allSignalNoWhenTx.map[new UppaalProcess(it)].toList)
		ret
	}
	
	def CharSequence compile(Root root)'''
	«IF root.hasTimeoutTransition»clock gen_clock;«ENDIF»
	«FOR channel: channels BEFORE "chan " SEPARATOR ", " AFTER ";"»«channel»«ENDFOR»
	«FOR process: processes»«process.compile»«ENDFOR»
«««	«FOR automata:root.allAuxiliarAutomata»«automata.compile»«ENDFOR»
	system «FOR process:processes SEPARATOR ", " AFTER ';'»«process.name»«ENDFOR»
	'''
	
	def dispatch compile(UppaalProcess process)'''
	process «process.name» {
		«IF !process.states.isEmpty»
		state
			«FOR state:process.states SEPARATOR ",\n" AFTER ';'»«state.name»«state.bodyIfTimeoutTransition»«ENDFOR»
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
	
	def compileAction(UppaalTransition transition)'''
	«IF transition.isTime»
	guard gen_clock >= «transition.timeout.toClockString»;
	«ENDIF»
	«IF !transition.sync.isNullOrEmpty»
	sync «transition.sync»;
	«ENDIF»
	«IF transition.isTime»
	assign gen_clock := 0;
	«ENDIF»
	'''
	
	def CharSequence toClockString(float seconds) {
		val clock = seconds*10
		return clock.toInt +""
	}
	
	def int toInt(float number) {
		return Math.round(number)
	}
	
	def CharSequence bodyIfTimeoutTransition(UppaalState state){
		val originalState = state.originalState
		if(originalState === null) return ""
		if (!originalState.hasTimeoutTransition) return ""
		return " " +originalState.compileBody
	}
	
	def compileBody(State state)'''
	{
		gen_clock <= «state.timeoutTransition.timeout.toClockString»
	}'''
	
	def hasTimeoutTransition(Root root) {
		root.eAllContents.filter(Transition).exists[isTime]
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
	
	def List<String> allChannels(Root root) {
		val retValue = newArrayList
		retValue.addAll(root.allAuxiliarChannels)
		retValue.addAll(root.allNestedChannels)
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
	var public List<UppaalTransition> transitions = newArrayList
	
	new(Machine machine) {
		
		this.name = machine.processName
		
		// If machine is nested, it has an aux init state and an extra transition (if it has states)
		if(machine.isNested) {
			this.genInitNestedMachine(machine)
		}
		
		// Add transitions to process
		// Fill txs first because state creates transitions, which I want them at the end
		this.fillTransitions(machine)
		
		// Add states to process
		this.fillStates(machine)
		
	}
	
	new(Transition transition) {
		if(transition.when !== null) {
			this.createFromWhenTransition(transition)
		}
		else if(transition.signal !== null) {
			this.createFromSignalTransition(transition)
		}
		
	}
	
	def private createFromWhenTransition(Transition transition) {
		// Create name
		this.name = "gen_sync_"+transition.when
		
		//Create states
		states.add(new UppaalState("initSync"))
		
		//Create transition
		val tx = new UppaalTransition
		tx.from = "initSync"
		tx.to = "initSync"
		tx.sync = transition.when+"!"
		transitions.add(tx)
	}
	
	def private createFromSignalTransition(Transition transition) {
		// Create name
		this.name = "gen_sync_"+transition.signal
		
		//Create states
		states.add(new UppaalState("initSync"))
		
		//Create transition
		val tx = new UppaalTransition
		tx.from = "initSync"
		tx.to = "initSync"
		tx.sync = transition.signal+"?"
		transitions.add(tx)
	}
	
	def private genInitNestedMachine(Machine machine) {
		val genInit = "gen_init"
		this.states.add(new UppaalState("gen_init"))
		if(!machine.states.empty) {
			val newTransition = new UppaalTransition
			newTransition.from = genInit
			newTransition.to = machine.states.get(0).name
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
				val newTransition = new UppaalTransition
				newTransition.from = preStateName
				newTransition.to = state.name
				// synchronization channel, signaling the start of the nested machine
				newTransition.channel = state.machine.startMachineChannel
				newTransition.sync = newTransition.channel+"!"
				
				this.transitions.add(newTransition)
			}
			
			// If state is "final" in nested machine: 
			if(state.isFinal) {
				val newTransition = new UppaalTransition
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
			// If not, add transition like normal
			else {
				this.transitions.add(new UppaalTransition(transition))
			}
		}	
		
	}
	
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
}

class UppaalTransition {
	var public String from
	var public String to
	var public String sync
	var public String channel
	var public float timeout
	var public boolean isTime
	
	new(){ }

	new(Transition transition) {
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
}

class UppaalState {
	var public String name
	var public State originalState
	var public boolean committed = false
	
	new(State state) {
		this.name = state.name
		this.originalState = state
	}
	
	new(String name) {
		this.name = name
	}
}