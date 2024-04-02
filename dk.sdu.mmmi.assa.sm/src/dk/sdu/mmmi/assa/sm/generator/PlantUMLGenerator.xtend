package dk.sdu.mmmi.assa.sm.generator

import dk.sdu.mmmi.assa.sm.stateMachine.Machine
import dk.sdu.mmmi.assa.sm.stateMachine.Root
import dk.sdu.mmmi.assa.sm.stateMachine.State
import dk.sdu.mmmi.assa.sm.stateMachine.Transition
import org.eclipse.xtext.generator.IFileSystemAccess2

class PlantUMLGenerator {
	
	def generate(Root root, IFileSystemAccess2 fsa) {
		fsa.generateFile(root.name+'/plantuml.txt', root.compile)
	}
	
	def compile(Root root)'''
	@startuml
	[*] --> «root.machine.name»
	state «root.machine.name»«IF !root.machine.states.empty» {
		«root.machine.compileBody»
	}«ENDIF»
	@enduml
	'''
	
	def compile(State state)'''
	state «state.nameOrNested»«IF state.isFail» <<end>> #red«ENDIF»
	'''
	
	def compile(Transition transition)'''
	«transition.from.name» --> «transition.to.name»«transition.compileAction»
	'''
	
	def nameOrNested(State state) {
		if(state.machine === null) return state.name
		return state.compileNestedMachine
	}
	
	def compileNestedMachine(State state)'''
	"«state.name»/«state.machine.name»" as «state.name» {
		«state.machine.compileBody»
	}
	'''
	
	def CharSequence compileBody(Machine machine)'''
	[*] --> «machine.states.head.name»
	«FOR state:machine.states»«state.compile»«ENDFOR»
	«FOR transition:machine.transitions»«transition.compile»«ENDFOR»
	'''
	
	def compileAction(Transition transition){
		var ret = ""
		if(transition.isTime) ret = " : after "+transition.timeout.toMillisecondsString+"ms"
		if(!transition.when.isNullOrEmpty) ret = " : "+transition.when+"?"
		if(!transition.signal.isNullOrEmpty){
			if(ret.isEmpty) ret = " : "
			else ret += " | "
			ret += transition.signal+"!"
		} 
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
	
	
	
	
	
}