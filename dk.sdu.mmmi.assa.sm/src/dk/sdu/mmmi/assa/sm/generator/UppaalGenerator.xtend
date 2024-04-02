package dk.sdu.mmmi.assa.sm.generator

import dk.sdu.mmmi.assa.sm.stateMachine.Machine
import dk.sdu.mmmi.assa.sm.stateMachine.Root
import dk.sdu.mmmi.assa.sm.stateMachine.State
import dk.sdu.mmmi.assa.sm.stateMachine.Transition
import dk.sdu.mmmi.assa.sm.stateMachine.impl.MachineImpl
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class UppaalGenerator {
	
	def generate(Root root, IFileSystemAccess2 fsa) {
		fsa.generateFile(root.name+'/uppaal.xta', root.compile)
	}
	
	def CharSequence compile(Root root)'''
	«IF root.hasTimeoutTransition»clock gen_clock;«ENDIF»
	«FOR channel: root.allChannels BEFORE "chan " SEPARATOR ", " AFTER ";"»«channel»«ENDFOR»
	«FOR machine: root.eAllContents.toIterable.filter(Machine)»«machine.compile»«ENDFOR»
	«FOR automata:root.allAuxiliarAutomata»«automata.compile»«ENDFOR»
	system «FOR automata:root.allAutomata SEPARATOR ", " AFTER ';'»«automata.nameOrInner»«ENDFOR»
	'''
	
	def dispatch compile(Machine machine)'''
	process «machine.nameOrInner» {
		«IF !machine.states.isEmpty»
		state
			«FOR state:machine.states SEPARATOR ",\n" AFTER ';'»«state.name»«state.bodyIfTimeoutTransition»«ENDFOR»
		init «machine.states.head.name»;
		«ENDIF»
		«IF !machine.transitions.isEmpty»
		trans
			«FOR transition : machine.transitions SEPARATOR ",\n" AFTER ';'»«transition.from.name» -> «transition.to.name» {
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
	
	def nameOrInner(Machine machine){
		val container = EcoreUtil2.getContainerOfType(machine, State)
		if(container === null) return machine.name
		return container.name+"_"+machine.name
	}
	
	def compileAction(Transition transition)'''
	«IF transition.isTime»
	guard gen_clock >= «transition.timeout.toClockString»;
	«ENDIF»
	«IF !transition.when.isNullOrEmpty»
	sync «transition.when»?;
	«ENDIF»
	«IF !transition.signal.isNullOrEmpty»
	sync «transition.signal»!;
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
	
	def CharSequence bodyIfTimeoutTransition(State state){
		if (!state.hasTimeoutTransition) return ""
		" " +state.compileBody
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
	
	def List<String> allChannels(Root root) {
		val whenTx = root.eAllContents.filter(Transition).filter[!when.isNullOrEmpty]
		val signalTx = root.eAllContents.filter(Transition).filter[!signal.isNullOrEmpty]
		val List<String> channels = newLinkedList;
		channels.addAll(whenTx.map[when].toList)
		val missingChannels = signalTx.filter[!channels.contains(signal)].map[signal]
		channels.addAll(missingChannels.toList)
		return channels
	}
}

class AuxiliarAutomaton extends MachineImpl {
	public var String signal
}
