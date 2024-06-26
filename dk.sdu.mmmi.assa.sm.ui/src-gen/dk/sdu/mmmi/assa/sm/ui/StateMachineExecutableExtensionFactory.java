/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.ui;

import com.google.inject.Injector;
import dk.sdu.mmmi.assa.sm.ui.internal.SmActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StateMachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SmActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SmActivator activator = SmActivator.getInstance();
		return activator != null ? activator.getInjector(SmActivator.DK_SDU_MMMI_ASSA_SM_STATEMACHINE) : null;
	}

}
