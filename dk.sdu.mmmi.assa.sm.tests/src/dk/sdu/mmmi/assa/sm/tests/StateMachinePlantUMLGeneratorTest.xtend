package dk.sdu.mmmi.assa.sm.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension org.junit.Assert.assertEquals

@ExtendWith(InjectionExtension)
@InjectWith(StateMachineInjectorProvider)

class StateMachinePlantUMLGeneratorTest {
	@Inject extension CompilationTestHelper
	
	def void assertPlantUML(CharSequence program, CharSequence plantUml){
		program.compile[
			val key = allGeneratedResources.keySet.filter[contains('plantuml.txt')].head
			plantUml.toString.assertEquals(allGeneratedResources.get(key).toString)
		]
	}
	
	@Test
	def machineNoState(){
		'''
			project projectTest
			machine test {}
		'''.assertPlantUML(
		'''
			@startuml
				[*] --> test
				state test
			@enduml
		''')
	}
	
	@Test
	def machineWithStates(){
		'''
			project test
			machine test {
				state one
				state two
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state two
				}
			@enduml
			'''
		)
	}
	
	@Test
	def machineWithTransitions(){
		'''
			project test
			machine test {
				state one
				state two
				one -> two
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state two
					one --> two
				}
			@enduml
			'''
		)
	}
	
	@Test
	def machineWithWhenTransitions(){
		'''
			project test
			machine test {
				state one
				state two
				one -> two when test
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state two
					one --> two : test?
				}
			@enduml
			'''
		)
	}
	
	@Test
	def failState(){
		'''
			project test
			machine test {
				state one
				fail state failState
				one -> failState when sthFail
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state failState <<end>> #red
					one --> failState : sthFail?
				}
			@enduml
			'''
		)
	}
	
	@Test
	def nestedMachine(){
		'''
			project test
			machine test {
				state one
				state two with machine inner{ 
					state three
					state four
					three -> four when sthInside
				}
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state "two/inner" as two {
						[*] --> three
						state three
						state four
						three --> four : sthInside?
					}
				}
			@enduml
			'''
		)
	}
	
	@Test
	def nestedMachineComm(){
		'''
			project test
			machine test {
				state one
				state two with machine inner{ 
					state innerOne
					state innerTwo
					innerOne -> innerTwo signal finish
				}
				state three
				one -> two
				two -> three when finish
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state "two/inner" as two {
						[*] --> innerOne
						state innerOne
						state innerTwo
						innerOne --> innerTwo : / finish!
					}
					state three
					one --> two
					two --> three : finish?
				}
			@enduml
			'''
		)
	}
	
	@Test
	def void timeTransition() {
		'''
			project test
			machine test {
				state one
				state two
				one -> two after 0.5
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state two
					one --> two : [after 500ms]
				}
			@enduml
			'''
		)
	}
	
	@Test
	def void signalTimeoutTransition() {
		'''
			project test
			machine test {
				state one
				state two
				one -> two after 0.5 signal finish
			}
		'''.assertPlantUML(
			'''
			@startuml
				[*] --> test
				state test {
					[*] --> one
					state one
					state two
					one --> two : [after 500ms] / finish!
				}
			@enduml
			'''
		)
	}
	
	@Test
	def void multipleMachines() {
		'''
			project test
			machine m1 {
				state one
			}
			machine m2 {
				state two
			}
		'''.assertPlantUML(
			'''
			@startuml
			[*] --> test
			state test {
				[*] --> m1
				state m1 {
					[*] --> one
					state one
				}
				--
				[*] --> m2
				state m2 {
					[*] --> two
					state two
				}
			}
			@enduml
			'''
		)
	}
	
	@Test
	def void multipleThreeMachines() {
		'''
			project test
			machine m1 {
				state one
			}
			machine m2 {
				state two
			}
			machine m3 {
				state three
			}
		'''.assertPlantUML(
			'''
			@startuml
			[*] --> test
			state test {
				[*] --> m1
				state m1 {
					[*] --> one
					state one
				}
				--
				[*] --> m2
				state m2 {
					[*] --> two
					state two
				}
				--
				[*] --> m3
				state m3 {
					[*] --> three
					state three
				}
			}
			@enduml
			'''
		)
	}
	
	@Test
	def void guardTransitions() {
		'''
			project test
			machine m1 {
				state one
				state two
				one -> two guard false
				one -> two guard true
			}
		'''.assertPlantUML('''
			@startuml
				[*] --> m1
				state m1 {
					[*] --> one
					state one
					state two
					one --> two : [false]
					one --> two : [true]
				}
			@enduml
		''')
	}
	
	@Test
	def void guardAndSignalTransition() {
		'''
			project test
			machine m1 {
				state one
				state two
				one -> two guard false signal signal1
				one -> two guard true signal signal2
			}
		'''.assertPlantUML('''
			@startuml
				[*] --> m1
				state m1 {
					[*] --> one
					state one
					state two
					one --> two : [false] / signal1!
					one --> two : [true] / signal2!
				}
			@enduml
		''')
	}
	
	
}