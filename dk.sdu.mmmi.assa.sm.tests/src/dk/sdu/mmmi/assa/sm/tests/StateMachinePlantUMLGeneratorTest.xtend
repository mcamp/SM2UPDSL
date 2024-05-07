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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two
					test_one --> test_two
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two
					test_one --> test_two : test?
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
					[*] --> test_one
					state "one" as test_one
					state "failState" as test_failState <<end>> #red
					test_one --> test_failState : sthFail?
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two {
						[*] --> test_two_inner_three
						state "three" as test_two_inner_three
						state "four" as test_two_inner_four
						test_two_inner_three --> test_two_inner_four : sthInside?
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two {
						[*] --> test_two_inner_innerOne
						state "innerOne" as test_two_inner_innerOne
						state "innerTwo" as test_two_inner_innerTwo
						test_two_inner_innerOne --> test_two_inner_innerTwo : / finish!
					}
					state "three" as test_three
					test_one --> test_two
					test_two --> test_three : finish?
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two
					test_one --> test_two : [after 500ms]
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
					[*] --> test_one
					state "one" as test_one
					state "two" as test_two
					test_one --> test_two : [after 500ms] / finish!
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
					[*] --> m1_one
					state "one" as m1_one
				}
				--
				[*] --> m2
				state m2 {
					[*] --> m2_two
					state "two" as m2_two
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
					[*] --> m1_one
					state "one" as m1_one
				}
				--
				[*] --> m2
				state m2 {
					[*] --> m2_two
					state "two" as m2_two
				}
				--
				[*] --> m3
				state m3 {
					[*] --> m3_three
					state "three" as m3_three
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
					[*] --> m1_one
					state "one" as m1_one
					state "two" as m1_two
					m1_one --> m1_two : [false]
					m1_one --> m1_two : [true]
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
					[*] --> m1_one
					state "one" as m1_one
					state "two" as m1_two
					m1_one --> m1_two : [false] / signal1!
					m1_one --> m1_two : [true] / signal2!
				}
			@enduml
		''')
	}
	
	
}