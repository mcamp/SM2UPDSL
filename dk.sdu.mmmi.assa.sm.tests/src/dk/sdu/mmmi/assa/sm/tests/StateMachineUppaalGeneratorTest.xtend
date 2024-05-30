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
	def nestedMachine(){
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
			chan gen_two_inner_start;
			process test {
				state
					one,
					gen_pre_two,
					two;
				commit gen_pre_two;
				init one;
				trans
					gen_pre_two -> two {
						sync gen_two_inner_start!;
					};
			}
			process two_inner {
				state
					gen_init,
					three,
					four;
				init gen_init;
				trans
					gen_init -> three {
						sync gen_two_inner_start?;
					};
			}
			system test, two_inner;
			'''
		)
	}
	
	@Test
	def nestedMachineWithTransition(){
		'''
			project test
			machine test {
				state one
				state two with machine inner{ 
					state innerOne
					state innerTwo
					innerOne -> innerTwo when test
				}
				one -> two
			}
		'''.assertUppaal(
			'''
			chan test, gen_two_inner_start;
			process test {
				state
					one,
					gen_pre_two,
					two;
				commit gen_pre_two;
				init one;
				trans
					one -> gen_pre_two {
					},
					gen_pre_two -> two {
						sync gen_two_inner_start!;
					};
			}
			process two_inner {
				state
					gen_init,
					innerOne,
					innerTwo;
				init gen_init;
				trans
					gen_init -> innerOne {
						sync gen_two_inner_start?;
					},
					innerOne -> innerTwo {
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
			system test, two_inner, gen_sync_test;
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
			chan finish, gen_two_inner_start;
			process test {
				state
					one,
					gen_pre_two,
					two,
					three;
				commit gen_pre_two;
				init one;
				trans
					one -> gen_pre_two {
					},
					two -> three {
						sync finish?;
					},
					gen_pre_two -> two {
						sync gen_two_inner_start!;
					};
			}
			process two_inner {
				state
					gen_init,
					innerOne,
					innerTwo;
				commit innerTwo;
				init gen_init;
				trans
					gen_init -> innerOne {
						sync gen_two_inner_start?;
					},
					innerOne -> innerTwo {
						sync finish!;
					},
					innerTwo -> gen_init {
					};
			}
			system test, two_inner;
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
				state three
				one -> two
				two -> three after 5
				
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			process test {
				state
					one,
					two {
						gen_clock <= 5
					},
					three;
				init one;
				trans
					one -> two {
						assign gen_clock := 0;
					},
					two -> three {
						guard gen_clock >= 5;
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
				state three
				one -> two
				two -> three after 5 signal finish
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			chan finish;
			process test {
				state
					one,
					two {
						gen_clock <= 5
					},
					three;
				init one;
				trans
					one -> two {
						assign gen_clock := 0;
					},
					two -> three {
						guard gen_clock >= 5;
						sync finish!;
					};
			}
			process gen_sync_finish {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync finish?;
					};
			}
			system test, gen_sync_finish;
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
					innerOne -> innerTwo after 5 signal finish
				}
				one -> two when ready
				two -> one when finish
			}
		'''.assertUppaal(
			'''
			clock gen_clock;
			chan ready, finish, gen_two_inner_start;
			process test {
				state
					one,
					gen_pre_two,
					two;
				commit gen_pre_two;
				init one;
				trans
					one -> gen_pre_two {
						sync ready?;
					},
					two -> one {
						sync finish?;
					},
					gen_pre_two -> two {
						sync gen_two_inner_start!;
					};
			}
			process two_inner {
				state
					gen_init,
					innerOne {
						gen_clock <= 5
					},
					innerTwo;
				commit innerTwo;
				init gen_init;
				trans
					gen_init -> innerOne {
						sync gen_two_inner_start?;
						assign gen_clock := 0;
					},
					innerOne -> innerTwo {
						guard gen_clock >= 5;
						sync finish!;
					},
					innerTwo -> gen_init {
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
		'''.assertUppaal(
			'''
			process m1 {
				state
					one;
				init one;
			}
			process m2 {
				state
					two;
				init two;
			}
			system m1, m2;
			'''
		)
	}
	
	@Test
	def void multipleMachinesWithSignals() {
		'''
			project test
			machine m1 {
				state one
				state two
				state three
				one -> two when signal2
				one -> three when signal3
			}
			machine m2 {
				state m21
				m21 -> m21 signal signal2
				m21 -> m21 signal signal3
			}
		'''.assertUppaal(
			'''
			chan signal2, signal3;
			process m1 {
				state
					one,
					two,
					three;
				init one;
				trans
					one -> two {
						sync signal2?;
					},
					one -> three {
						sync signal3?;
					};
			}
			process m2 {
				state
					m21;
				init m21;
				trans
					m21 -> m21 {
						sync signal2!;
					},
					m21 -> m21 {
						sync signal3!;
					};
			}
			system m1, m2;
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
		'''.assertUppaal('''
			process m1 {
				state
					one,
					two;
				init one;
				trans
					one -> two {
						guard 0;
					},
					one -> two {
						guard 1;
					};
			}
			system m1;
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
		'''.assertUppaal('''
			chan signal1, signal2;
			process m1 {
				state
					one,
					two;
				init one;
				trans
					one -> two {
						guard 0;
						sync signal1!;
					},
					one -> two {
						guard 1;
						sync signal2!;
					};
			}
			process gen_sync_signal1 {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync signal1?;
					};
			}
			process gen_sync_signal2 {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync signal2?;
					};
			}
			system m1, gen_sync_signal1, gen_sync_signal2;
		''')
	}
	
	@Test
	def void guardSignalAndMultipleMachines() {
		'''
			project test
			machine m1 {
				state one
				state two
				state three
				one -> two when signal1
				one -> three when signal2
			}
			machine m2 {
				state m21
				m21 -> m21 guard false signal signal1
				m21 -> m21 guard true signal signal2
			}
		'''.assertUppaal('''
			chan signal1, signal2;
			process m1 {
				state
					one,
					two,
					three;
				init one;
				trans
					one -> two {
						sync signal1?;
					},
					one -> three {
						sync signal2?;
					};
			}
			process m2 {
				state
					m21;
				init m21;
				trans
					m21 -> m21 {
						guard 0;
						sync signal1!;
					},
					m21 -> m21 {
						guard 1;
						sync signal2!;
					};
			}
			system m1, m2;
		''')
	}
	
	@Test
	def void safetyPropertyStartupDelay() {
		'''
			project test
			machine m1 {
				state one
				state two
				state three safety properties {
					startup delay 50
				}
				one -> two
				two -> three after 5
				three -> one after 5
			}
		'''.assertUppaal('''
			clock gen_clock, startup_clock;
			process m1 {
				state
					one,
					two {
						gen_clock <= 5
					},
					three {
						gen_clock <= 5
					},
					gen_pre_three;
				commit gen_pre_three;
				init one;
				trans
					one -> two {
						assign gen_clock := 0;
					},
					three -> one {
						guard gen_clock >= 5;
					},
					two -> gen_pre_three {
						guard gen_clock >= 5;
					},
					gen_pre_three -> three {
						guard startup_clock >= 50;
						assign gen_clock := 0;
					},
					gen_pre_three -> one {
						guard startup_clock < 50;
					};
			}
			system m1;
		''')
	}
	
	@Test
	def machineWithWhenAndSignalTransitions(){
		'''
			project test
			machine test {
				state one
				state two
				one -> two when testWhen signal testSignal
			}
		'''.assertUppaal(
			'''
			chan testWhen, testSignal;
			process test {
				state
					one,
					two,
					gen_pre_two;
				commit gen_pre_two;
				init one;
				trans
					one -> gen_pre_two {
						sync testWhen?;
					},
					gen_pre_two -> two {
						sync testSignal!;
					};
			}
			process gen_sync_testWhen {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync testWhen!;
					};
			}
			process gen_sync_testSignal {
				state
					initSync;
				init initSync;
				trans
					initSync -> initSync {
						sync testSignal?;
					};
			}
			system test, gen_sync_testWhen, gen_sync_testSignal;
			'''
		)
	}
	
	@Test
	def void machineWithVariables() {
		'''
		project test
		machine test {
			bool test_var := false
			state one
			state two
			one -> two actions {
				test_var := true
			}
			one -> two actions {
				test_var := false
			}
		}
		'''.assertUppaal('''
		process test {
			bool test_var := 0;
			state
				one,
				two;
			init one;
			trans
				one -> two {
					assign test_var := 1;
				},
				one -> two {
					assign test_var := 0;
				};
		}
		system test;
		''')
	}
	
	@Test
	def void safetyPropertyOnInnerMachine() {
		'''
			project test
			machine m1 {
				state one
				state two with machine inner {
					state innerState safety properties {
						startup delay 5	
					}
				}
			}
		'''.assertUppaal('''
			clock startup_clock;
			chan gen_two_inner_start;
			process m1 {
				state
					one,
					gen_pre_two,
					two;
				commit gen_pre_two;
				init one;
				trans
					gen_pre_two -> two {
						sync gen_two_inner_start!;
					};
			}
			process two_inner {
				state
					gen_init,
					innerState,
					gen_pre_innerState;
				commit gen_pre_innerState;
				init gen_init;
				trans
					gen_init -> gen_pre_innerState {
						sync gen_two_inner_start?;
					},
					gen_pre_innerState -> innerState {
						guard startup_clock >= 5;
					},
					gen_pre_innerState -> gen_init {
						guard startup_clock < 5;
					};
			}
			system m1, two_inner;
		''')
	}
}