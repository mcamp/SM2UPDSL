/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StateMachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("dk/sdu/mmmi/assa/sm/parser/antlr/internal/InternalStateMachine.tokens");
	}
}
