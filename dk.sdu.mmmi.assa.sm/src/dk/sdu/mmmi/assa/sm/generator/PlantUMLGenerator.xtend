package dk.sdu.mmmi.assa.sm.generator

import dk.sdu.mmmi.assa.sm.stateMachine.Machine
import dk.sdu.mmmi.assa.sm.stateMachine.Root
import dk.sdu.mmmi.assa.sm.stateMachine.State
import dk.sdu.mmmi.assa.sm.stateMachine.Transition
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class PlantUMLGenerator {
	
	def generate(Root root, IFileSystemAccess2 fsa) {
		fsa.generateFile(root.name+'/plantuml.txt', root.compile)
	}
	
	def compile(Root root)'''
	@startuml
	«IF root.machines.size > 1»
	[*] --> «root.name»
	state «root.name» {
	«ENDIF»
		«FOR machine:root.machines SEPARATOR "\n--"»
		[*] --> «machine.name»
		state «machine.name»«IF !machine.states.empty» {
			«machine.compileBody»
		}«ENDIF»
		«ENDFOR»
	«IF root.machines.size > 1»
	}
	«ENDIF»
	@enduml
	'''
	
	def compile(State state)'''
	state "«state.name»" as «state.nestedName»«IF state.machine !== null» {
		«state.machine.compileBody»
	}«ENDIF»«IF state.isFail» <<end>> #red«ENDIF»
	'''
	
	def compile(Transition transition)'''
	«transition.from.nestedName» --> «transition.to.nestedName»«transition.compileAction»
	'''
	
	def CharSequence compileBody(Machine machine)'''
	[*] --> «machine.states.head.nestedName»
	«FOR state:machine.states»«state.compile»«ENDFOR»
	«FOR transition:machine.transitions»«transition.compile»«ENDFOR»
	'''
	
	def compileAction(Transition transition){
		if(!transition.hasBody) return ""
		var ret = " :"
		if(transition.hasWhen) ret += " "+transition.when+"?"
		if(transition.isTime) ret += " [after "+transition.timeout.toMillisecondsString+"ms]"
		if(transition.hasGuard) ret += " ["+transition.guard+"]"
		if(transition.hasSignal) ret += " / "+transition.signal+"!"

		return ret
	}
	
	def CharSequence toMillisecondsString(float seconds) {
		val milliseconds = seconds*1000
		if(milliseconds % 10 == 0)
			return milliseconds.toInt+""
		return milliseconds+""
	}
	
	def int toInt(float number) {
		return Math.round(number)
	}
	
	
	def hasBody(Transition transition) {
		return transition.hasWhen 
			|| transition.isTime
			|| transition.hasSignal
			|| transition.hasGuard
		
	}
	
	def CharSequence nestedName(State state){
		return state.nestedName("_")
	}
	
	def CharSequence nestedName(State state, String separator) {
		var ret = ""
		val parentMachine = state.parentMachine
		val parentState = parentMachine.parentState
		if(parentState !== null)
			ret = parentState.nestedName(separator)+separator+ret
		ret+""+state.parentMachine.name+separator+state.name
	}
	
	def parentMachine(State state) {
		EcoreUtil2.getContainerOfType(state, Machine)
	}
	
	def parentState(Machine machine) {
		EcoreUtil2.getContainerOfType(machine, State)	
	}
}