/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractStateMachineValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage.eINSTANCE);
		return result;
	}
}
