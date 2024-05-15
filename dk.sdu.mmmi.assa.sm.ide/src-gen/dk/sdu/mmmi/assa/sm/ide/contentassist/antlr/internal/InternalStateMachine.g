/*
 * generated by Xtext 2.25.0
 */
grammar InternalStateMachine;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.assa.sm.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.sdu.mmmi.assa.sm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.assa.sm.services.StateMachineGrammarAccess;

}
@parser::members {
	private StateMachineGrammarAccess grammarAccess;

	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRoot
entryRuleRoot
:
{ before(grammarAccess.getRootRule()); }
	 ruleRoot
{ after(grammarAccess.getRootRule()); } 
	 EOF 
;

// Rule Root
ruleRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRootAccess().getGroup()); }
		(rule__Root__Group__0)?
		{ after(grammarAccess.getRootAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMachine
entryRuleMachine
:
{ before(grammarAccess.getMachineRule()); }
	 ruleMachine
{ after(grammarAccess.getMachineRule()); } 
	 EOF 
;

// Rule Machine
ruleMachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMachineAccess().getGroup()); }
		(rule__Machine__Group__0)
		{ after(grammarAccess.getMachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSafetyProperty
entryRuleSafetyProperty
:
{ before(grammarAccess.getSafetyPropertyRule()); }
	 ruleSafetyProperty
{ after(grammarAccess.getSafetyPropertyRule()); } 
	 EOF 
;

// Rule SafetyProperty
ruleSafetyProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSafetyPropertyAccess().getAlternatives()); }
		(rule__SafetyProperty__Alternatives)
		{ after(grammarAccess.getSafetyPropertyAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloat
entryRuleFloat
:
{ before(grammarAccess.getFloatRule()); }
	 ruleFloat
{ after(grammarAccess.getFloatRule()); } 
	 EOF 
;

// Rule Float
ruleFloat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloatAccess().getGroup()); }
		(rule__Float__Group__0)
		{ after(grammarAccess.getFloatAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolean
entryRuleBoolean
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;

// Rule Boolean
ruleBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMachineAccess().getStatesAssignment_3_0()); }
		(rule__Machine__StatesAssignment_3_0)
		{ after(grammarAccess.getMachineAccess().getStatesAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getMachineAccess().getTransitionsAssignment_3_1()); }
		(rule__Machine__TransitionsAssignment_3_1)
		{ after(grammarAccess.getMachineAccess().getTransitionsAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getFailAssignment_0_0()); }
		(rule__State__FailAssignment_0_0)
		{ after(grammarAccess.getStateAccess().getFailAssignment_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getEndAssignment_0_1()); }
		(rule__State__EndAssignment_0_1)
		{ after(grammarAccess.getStateAccess().getEndAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSafetyPropertyAccess().getGroup_0()); }
		(rule__SafetyProperty__Group_0__0)
		{ after(grammarAccess.getSafetyPropertyAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSafetyPropertyAccess().getGroup_1()); }
		(rule__SafetyProperty__Group_1__0)
		{ after(grammarAccess.getSafetyPropertyAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__0__Impl
	rule__Root__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getProjectKeyword_0()); }
	'project'
	{ after(grammarAccess.getRootAccess().getProjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__1__Impl
	rule__Root__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getNameAssignment_1()); }
	(rule__Root__NameAssignment_1)
	{ after(grammarAccess.getRootAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getMachinesAssignment_2()); }
	(rule__Root__MachinesAssignment_2)*
	{ after(grammarAccess.getRootAccess().getMachinesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Machine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Machine__Group__0__Impl
	rule__Machine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMachineAccess().getMachineKeyword_0()); }
	'machine'
	{ after(grammarAccess.getMachineAccess().getMachineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Machine__Group__1__Impl
	rule__Machine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMachineAccess().getNameAssignment_1()); }
	(rule__Machine__NameAssignment_1)
	{ after(grammarAccess.getMachineAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Machine__Group__2__Impl
	rule__Machine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Machine__Group__3__Impl
	rule__Machine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMachineAccess().getAlternatives_3()); }
	(rule__Machine__Alternatives_3)*
	{ after(grammarAccess.getMachineAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Machine__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getAlternatives_0()); }
	(rule__State__Alternatives_0)?
	{ after(grammarAccess.getStateAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'state'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_2()); }
	(rule__State__NameAssignment_2)
	{ after(grammarAccess.getStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_3()); }
	(rule__State__Group_3__0)?
	{ after(grammarAccess.getStateAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_4()); }
	(rule__State__Group_4__0)?
	{ after(grammarAccess.getStateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__0__Impl
	rule__State__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getSafetyKeyword_3_0()); }
	'safety'
	{ after(grammarAccess.getStateAccess().getSafetyKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__1__Impl
	rule__State__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getPropertiesKeyword_3_1()); }
	'properties'
	{ after(grammarAccess.getStateAccess().getPropertiesKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__2__Impl
	rule__State__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__3__Impl
	rule__State__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getPropertiesAssignment_3_3()); }
	(rule__State__PropertiesAssignment_3_3)*
	{ after(grammarAccess.getStateAccess().getPropertiesAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__0__Impl
	rule__State__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getWithKeyword_4_0()); }
	'with'
	{ after(grammarAccess.getStateAccess().getWithKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getMachineAssignment_4_1()); }
	(rule__State__MachineAssignment_4_1)
	{ after(grammarAccess.getStateAccess().getMachineAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getFromAssignment_0()); }
	(rule__Transition__FromAssignment_0)
	{ after(grammarAccess.getTransitionAccess().getFromAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getToAssignment_2()); }
	(rule__Transition__ToAssignment_2)
	{ after(grammarAccess.getTransitionAccess().getToAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_3()); }
	(rule__Transition__Group_3__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_4()); }
	(rule__Transition__Group_4__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_5()); }
	(rule__Transition__Group_5__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_6()); }
	(rule__Transition__Group_6__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_3__0__Impl
	rule__Transition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHasGuardAssignment_3_0()); }
	(rule__Transition__HasGuardAssignment_3_0)
	{ after(grammarAccess.getTransitionAccess().getHasGuardAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGuardAssignment_3_1()); }
	(rule__Transition__GuardAssignment_3_1)
	{ after(grammarAccess.getTransitionAccess().getGuardAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_4__0__Impl
	rule__Transition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHasWhenAssignment_4_0()); }
	(rule__Transition__HasWhenAssignment_4_0)
	{ after(grammarAccess.getTransitionAccess().getHasWhenAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getWhenAssignment_4_1()); }
	(rule__Transition__WhenAssignment_4_1)
	{ after(grammarAccess.getTransitionAccess().getWhenAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_5__0__Impl
	rule__Transition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTimeAssignment_5_0()); }
	(rule__Transition__TimeAssignment_5_0)
	{ after(grammarAccess.getTransitionAccess().getTimeAssignment_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTimeoutAssignment_5_1()); }
	(rule__Transition__TimeoutAssignment_5_1)
	{ after(grammarAccess.getTransitionAccess().getTimeoutAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_6__0__Impl
	rule__Transition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHasSignalAssignment_6_0()); }
	(rule__Transition__HasSignalAssignment_6_0)
	{ after(grammarAccess.getTransitionAccess().getHasSignalAssignment_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getSignalAssignment_6_1()); }
	(rule__Transition__SignalAssignment_6_1)
	{ after(grammarAccess.getTransitionAccess().getSignalAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SafetyProperty__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_0__0__Impl
	rule__SafetyProperty__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0()); }
	()
	{ after(grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_0__1__Impl
	rule__SafetyProperty__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1()); }
	'startup'
	{ after(grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_0__2__Impl
	rule__SafetyProperty__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2()); }
	'delay'
	{ after(grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_0_3()); }
	(rule__SafetyProperty__TimeAssignment_0_3)
	{ after(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SafetyProperty__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_1__0__Impl
	rule__SafetyProperty__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0()); }
	()
	{ after(grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_1__1__Impl
	rule__SafetyProperty__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1()); }
	'max'
	{ after(grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_1__2__Impl
	rule__SafetyProperty__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2()); }
	'execution'
	{ after(grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SafetyProperty__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_1_3()); }
	(rule__SafetyProperty__TimeAssignment_1_3)
	{ after(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Float__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Float__Group__0__Impl
	rule__Float__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Float__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatAccess().getGroup_1()); }
	(rule__Float__Group_1__0)?
	{ after(grammarAccess.getFloatAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Float__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Float__Group_1__0__Impl
	rule__Float__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Float__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); }
	RULE_INT
	{ after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Root__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__MachinesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_2_0()); }
		ruleMachine
		{ after(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__StatesAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_0_0()); }
		ruleState
		{ after(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Machine__TransitionsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); }
		ruleTransition
		{ after(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__FailAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); }
		(
			{ before(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); }
			'fail'
			{ after(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); }
		)
		{ after(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__EndAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); }
			'end'
			{ after(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__PropertiesAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0()); }
		ruleSafetyProperty
		{ after(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__MachineAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0()); }
		ruleMachine
		{ after(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__FromAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__ToAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__HasGuardAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); }
			'guard'
			{ after(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); }
		)
		{ after(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__GuardAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getGuardBooleanParserRuleCall_3_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getTransitionAccess().getGuardBooleanParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__HasWhenAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); }
			'when'
			{ after(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); }
		)
		{ after(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__WhenAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TimeAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); }
			'after'
			{ after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TimeoutAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0()); }
		ruleFloat
		{ after(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__HasSignalAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); }
			'signal'
			{ after(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); }
		)
		{ after(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__SignalAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__TimeAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_0_3_0()); }
		ruleFloat
		{ after(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SafetyProperty__TimeAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0()); }
		ruleFloat
		{ after(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
