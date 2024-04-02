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
class StateMachineUppaalGeneratorTest {
	@Inject extension CompilationTestHelper
	
	def void assertUppaal(CharSequence program, CharSequence plantUml){
		program.compile[
			val key = allGeneratedResources.keySet.filter[contains('uppaal.xta')].head
			plantUml.toString.assertEquals(allGeneratedResources.get(key).toString)
		]
	}
	
	@Test
	def machineNoState(){
		'''
			project test
			machine test {}
		'''.assertUppaal(
		'''
			process test {
			}
			system test;
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
		'''.assertUppaal(
			'''
			process test {
				state
					one,
					two;
				init one;
			}
			system test;
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
		'''.assertUppaal(
			'''
			process test {
				state
					one,
					two;
				init one;
				trans
					one -> two {
					};
			}
			system test;
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
		'''.assertUppaal(
			'''
			chan test;
			process test {
				state
					one,
					two;
				init one;
				trans
					one -> two {
						sync test?;
					};
			}
			process gen_sync_test {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync test!;
					};
			}
			system test, gen_sync_test;
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
		'''.assertUppaal(
			'''
			chan sthFail;
			process test {
				state
					one,
					failState;
				init one;
				trans
					one -> failState {
						sync sthFail?;
					};
			}
			process gen_sync_sthFail {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync sthFail!;
					};
			}
			system test, gen_sync_sthFail;
			'''
		)
	}
	
	@Test
	def nestedMachnie(){
		'''
			project test
			machine test {
				state one
				state two with machine inner{ 
					state three
					state four
				}
			}
		'''.assertUppaal(
			'''
			process test {
				state
					one,
					two;
				init one;
			}
			process two_inner {
				state
					three,
					four;
				init three;
			}
			system test, two_inner;
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
		'''.assertUppaal(
			'''
			chan finish;
			process test {
				state
					one,
					two,
					three;
				init one;
				trans
					one -> two {
					},
					two -> three {
						sync finish?;
					};
			}
			process two_inner {
				state
					innerOne,
					innerTwo;
				init innerOne;
				trans
					innerOne -> innerTwo {
						sync finish!;
					};
			}
			system test, two_inner;
			'''
		)
	}
	
	@Test
	def void timeTransitionWithSeconds() {
		'''
			project test
			machine test {
				state one
				state two
				one -> two after 5
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			process test {
				state
					one {
						gen_clock <= 50
					},
					two;
				init one;
				trans
					one -> two {
						guard gen_clock >= 50;
						assign gen_clock := 0;
					};
			}
			system test;
			'''
		)
	}
	
	
	@Test
	def void timeTransitionWithMilliSeconds() {
		'''
			project test
			machine test {
				state one
				state two
				one -> two after 0.5
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			process test {
				state
					one {
						gen_clock <= 5
					},
					two;
				init one;
				trans
					one -> two {
						guard gen_clock >= 5;
						assign gen_clock := 0;
					};
			}
			system test;
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
		'''.assertUppaal(
			'''
			clock gen_clock;
			chan finish;
			process test {
				state
					one {
						gen_clock <= 5
					},
					two;
				init one;
				trans
					one -> two {
						guard gen_clock >= 5;
						sync finish!;
						assign gen_clock := 0;
					};
			}
			system test;
			'''
		)
	}
	
	@Test
	def nestedMachineCommAndTimeout(){
		'''
			project test
			machine test {
				state one
				state two with machine inner{ 
					state innerOne
					state innerTwo
					innerOne -> innerTwo after 0.5 signal finish
				}
				one -> two when ready
				two -> one when finish
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			chan ready, finish;
			process test {
				state
					one,
					two;
				init one;
				trans
					one -> two {
						sync ready?;
					},
					two -> one {
						sync finish?;
					};
			}
			process two_inner {
				state
					innerOne {
						gen_clock <= 5
					},
					innerTwo;
				init innerOne;
				trans
					innerOne -> innerTwo {
						guard gen_clock >= 5;
						sync finish!;
						assign gen_clock := 0;
					};
			}
			process gen_sync_ready {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync ready!;
					};
			}
			system test, two_inner, gen_sync_ready;
			'''
		)
	}
	
	
	
}