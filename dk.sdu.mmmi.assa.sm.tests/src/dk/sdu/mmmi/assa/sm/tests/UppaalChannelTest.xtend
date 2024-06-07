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
class UppaalChannelTest {
	@Inject extension CompilationTestHelper
	
	def void assertUppaal(CharSequence program, CharSequence plantUml){
		program.compile[
			val key = allGeneratedResources.keySet.filter[contains('uppaal.xta')].head
			plantUml.toString.assertEquals(allGeneratedResources.get(key).toString)
		]
	}
	
	@Test
	
	def void whensWithSameSignal() {
		'''
		project test
		machine test {
			state A
			state B
			state C
			
			A -> B when sig
			B -> C when sig
		}
		'''.assertUppaal('''
		chan sig;
		process test {
			state
				A,
				B,
				C;
			init A;
			trans
				A -> B {
					sync sig?;
				},
				B -> C {
					sync sig?;
				};
		}
		process gen_sync_sig {
			state
				initSync;
			init initSync;
			trans
				initSync -> initSync {
					sync sig!;
				};
		}
		system test, gen_sync_sig;
		''')
	}

}