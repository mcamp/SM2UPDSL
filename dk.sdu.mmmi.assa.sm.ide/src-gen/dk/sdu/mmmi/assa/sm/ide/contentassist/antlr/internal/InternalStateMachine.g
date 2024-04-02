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
	{ before(grammarAccess.getRootAccess().getMachineAssignment_2()); }
	(rule__Root__MachineAssignment_2)
	{ after(grammarAccess.getRootAccess().getMachineAssignment_2()); }
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
	{ before(grammarAccess.getStateAccess().getFailAssignment_0()); }
	(rule__State__FailAssignment_0)?
	{ after(grammarAccess.getStateAccess().getFailAssignment_0()); }
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
	{ before(grammarAccess.getStateAccess().getWithKeyword_3_0()); }
	'with'
	{ after(grammarAccess.getStateAccess().getWithKeyword_3_0()); }
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
	{ before(grammarAccess.getStateAccess().getMachineAssignment_3_1()); }
	(rule__State__MachineAssignment_3_1)
	{ after(grammarAccess.getStateAccess().getMachineAssignment_3_1()); }
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
	{ before(grammarAccess.getTransitionAccess().getWhenKeyword_3_0()); }
	'when'
	{ after(grammarAccess.getTransitionAccess().getWhenKeyword_3_0()); }
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
	{ before(grammarAccess.getTransitionAccess().getWhenAssignment_3_1()); }
	(rule__Transition__WhenAssignment_3_1)
	{ after(grammarAccess.getTransitionAccess().getWhenAssignment_3_1()); }
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
	{ before(grammarAccess.getTransitionAccess().getTimeAssignment_4_0()); }
	(rule__Transition__TimeAssignment_4_0)
	{ after(grammarAccess.getTransitionAccess().getTimeAssignment_4_0()); }
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
	{ before(grammarAccess.getTransitionAccess().getTimeoutAssignment_4_1()); }
	(rule__Transition__TimeoutAssignment_4_1)
	{ after(grammarAccess.getTransitionAccess().getTimeoutAssignment_4_1()); }
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
	{ before(grammarAccess.getTransitionAccess().getSignalKeyword_5_0()); }
	'signal'
	{ after(grammarAccess.getTransitionAccess().getSignalKeyword_5_0()); }
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
	{ before(grammarAccess.getTransitionAccess().getSignalAssignment_5_1()); }
	(rule__Transition__SignalAssignment_5_1)
	{ after(grammarAccess.getTransitionAccess().getSignalAssignment_5_1()); }
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

rule__Root__MachineAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getMachineMachineParserRuleCall_2_0()); }
		ruleMachine
		{ after(grammarAccess.getRootAccess().getMachineMachineParserRuleCall_2_0()); }
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

rule__State__FailAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); }
		(
			{ before(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); }
			'fail'
			{ after(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); }
		)
		{ after(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); }
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

rule__State__MachineAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_3_1_0()); }
		ruleMachine
		{ after(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_3_1_0()); }
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

rule__Transition__WhenAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TimeAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); }
			'after'
			{ after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TimeoutAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_4_1_0()); }
		ruleFloat
		{ after(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__SignalAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_5_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_5_1_0()); }
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
