/*
 * generated by Xtext 2.25.0
 */
grammar InternalStateMachine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.assa.sm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.assa.sm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.assa.sm.services.StateMachineGrammarAccess;

}

@parser::members {

 	private StateMachineGrammarAccess grammarAccess;

    public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected StateMachineGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='project'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getProjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getVarsVarDefinitionParserRuleCall_2_0());
				}
				lv_vars_2_0=ruleVarDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					add(
						$current,
						"vars",
						lv_vars_2_0,
						"dk.sdu.mmmi.assa.sm.StateMachine.VarDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_3_0());
				}
				lv_machines_3_0=ruleMachine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					add(
						$current,
						"machines",
						lv_machines_3_0,
						"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)?
;

// Entry rule entryRuleMachine
entryRuleMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMachineRule()); }
	iv_ruleMachine=ruleMachine
	{ $current=$iv_ruleMachine.current; }
	EOF;

// Rule Machine
ruleMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='machine'
		{
			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMachineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='safety'
			{
				newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getSafetyKeyword_2_0());
			}
			otherlv_3='properties'
			{
				newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getPropertiesKeyword_2_1());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMachineAccess().getPropertiesSafetyPropertyParserRuleCall_2_3_0());
					}
					lv_properties_5_0=ruleSafetyProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMachineRule());
						}
						add(
							$current,
							"properties",
							lv_properties_5_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.SafetyProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_2_4());
			}
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMachineAccess().getVarsVarDefinitionParserRuleCall_4_0_0());
					}
					lv_vars_8_0=ruleVarDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMachineRule());
						}
						add(
							$current,
							"vars",
							lv_vars_8_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.VarDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_1_0());
					}
					lv_states_9_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMachineRule());
						}
						add(
							$current,
							"states",
							lv_states_9_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_4_2_0());
					}
					lv_transitions_10_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMachineRule());
						}
						add(
							$current,
							"transitions",
							lv_transitions_10_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_fail_0_0='fail'
					{
						newLeafNode(lv_fail_0_0, grammarAccess.getStateAccess().getFailFailKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
						setWithLastConsumed($current, "fail", lv_fail_0_0 != null, "fail");
					}
				)
			)
			    |
			(
				(
					lv_end_1_0='end'
					{
						newLeafNode(lv_end_1_0, grammarAccess.getStateAccess().getEndEndKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
						setWithLastConsumed($current, "end", lv_end_1_0 != null, "end");
					}
				)
			)
		)?
		otherlv_2='state'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='safety'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getSafetyKeyword_3_0());
			}
			otherlv_5='properties'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getPropertiesKeyword_3_1());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0());
					}
					lv_properties_7_0=ruleSafetyProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"properties",
							lv_properties_7_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.SafetyProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='with'
			{
				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getWithKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0());
					}
					lv_machine_10_0=ruleMachine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						set(
							$current,
							"machine",
							lv_machine_10_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0());
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
				}
			)
		)
		(
			(
				(
					lv_hasGuard_3_0='guard'
					{
						newLeafNode(lv_hasGuard_3_0, grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed($current, "hasGuard", lv_hasGuard_3_0 != null, "guard");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_3_1_0());
					}
					lv_guard_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_4_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				(
					lv_hasWhen_5_0='when'
					{
						newLeafNode(lv_hasWhen_5_0, grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed($current, "hasWhen", lv_hasWhen_5_0 != null, "when");
					}
				)
			)
			(
				(
					lv_when_6_0=RULE_ID
					{
						newLeafNode(lv_when_6_0, grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed(
							$current,
							"when",
							lv_when_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			(
				(
					lv_time_7_0='after'
					{
						newLeafNode(lv_time_7_0, grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed($current, "time", lv_time_7_0 != null, "after");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0());
					}
					lv_timeout_8_0=ruleFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"timeout",
							lv_timeout_8_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				(
					lv_hasSignal_9_0='signal'
					{
						newLeafNode(lv_hasSignal_9_0, grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed($current, "hasSignal", lv_hasSignal_9_0 != null, "signal");
					}
				)
			)
			(
				(
					lv_signal_10_0=RULE_ID
					{
						newLeafNode(lv_signal_10_0, grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed(
							$current,
							"signal",
							lv_signal_10_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_11='actions'
			{
				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getActionsKeyword_7_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getActionsStatementParserRuleCall_7_2_0());
					}
					lv_actions_13_0=ruleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						add(
							$current,
							"actions",
							lv_actions_13_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Statement");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
	)
;

// Entry rule entryRuleSafetyProperty
entryRuleSafetyProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSafetyPropertyRule()); }
	iv_ruleSafetyProperty=ruleSafetyProperty
	{ $current=$iv_ruleSafetyProperty.current; }
	EOF;

// Rule SafetyProperty
ruleSafetyProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0(),
						$current);
				}
			)
			otherlv_1='startup'
			{
				newLeafNode(otherlv_1, grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1());
			}
			otherlv_2='delay'
			{
				newLeafNode(otherlv_2, grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeTimeOrRangeParserRuleCall_0_3_0());
					}
					lv_time_3_0=ruleTimeOrRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
						}
						set(
							$current,
							"time",
							lv_time_3_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.TimeOrRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4='{'
				{
					newLeafNode(otherlv_4, grammarAccess.getSafetyPropertyAccess().getLeftCurlyBracketKeyword_0_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSafetyPropertyAccess().getStatementsStatementParserRuleCall_0_4_1_0());
						}
						lv_statements_5_0=ruleStatement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
							}
							add(
								$current,
								"statements",
								lv_statements_5_0,
								"dk.sdu.mmmi.assa.sm.StateMachine.Statement");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_6='}'
				{
					newLeafNode(otherlv_6, grammarAccess.getSafetyPropertyAccess().getRightCurlyBracketKeyword_0_4_2());
				}
			)?
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0(),
						$current);
				}
			)
			otherlv_8='max'
			{
				newLeafNode(otherlv_8, grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1());
			}
			otherlv_9='execution'
			{
				newLeafNode(otherlv_9, grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0());
					}
					lv_time_10_0=ruleFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
						}
						set(
							$current,
							"time",
							lv_time_10_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTimeOrRange
entryRuleTimeOrRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeOrRangeRule()); }
	iv_ruleTimeOrRange=ruleTimeOrRange
	{ $current=$iv_ruleTimeOrRange.current; }
	EOF;

// Rule TimeOrRange
ruleTimeOrRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTimeOrRangeAccess().getTimeAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getTimeOrRangeAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeOrRangeRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTimeOrRangeAccess().getRangeAction_1_0(),
						$current);
				}
			)
			otherlv_3='from'
			{
				newLeafNode(otherlv_3, grammarAccess.getTimeOrRangeAccess().getFromKeyword_1_1());
			}
			(
				(
					lv_from_4_0=RULE_INT
					{
						newLeafNode(lv_from_4_0, grammarAccess.getTimeOrRangeAccess().getFromINTTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeOrRangeRule());
						}
						setWithLastConsumed(
							$current,
							"from",
							lv_from_4_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_5='to'
			{
				newLeafNode(otherlv_5, grammarAccess.getTimeOrRangeAccess().getToKeyword_1_3());
			}
			(
				(
					lv_to_6_0=RULE_INT
					{
						newLeafNode(lv_to_6_0, grammarAccess.getTimeOrRangeAccess().getToINTTerminalRuleCall_1_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeOrRangeRule());
						}
						setWithLastConsumed(
							$current,
							"to",
							lv_to_6_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleVarDefinition
entryRuleVarDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDefinitionRule()); }
	iv_ruleVarDefinition=ruleVarDefinition
	{ $current=$iv_ruleVarDefinition.current; }
	EOF;

// Rule VarDefinition
ruleVarDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDefinitionAccess().getTypeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDefinitionRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"dk.sdu.mmmi.assa.sm.StateMachine.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVarDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':='
		{
			newLeafNode(otherlv_2, grammarAccess.getVarDefinitionAccess().getColonEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDefinitionAccess().getExpressionExpressionParserRuleCall_3_0());
				}
				lv_expression_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDefinitionRule());
					}
					set(
						$current,
						"expression",
						lv_expression_3_0,
						"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatementAccess().getVarAssignationAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStatementRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getVariableVarDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2=':='
		{
			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_3_0());
				}
				lv_expression_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"expression",
						lv_expression_3_0,
						"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getEqualityParserRuleCall());
	}
	this_Equality_0=ruleEquality
	{
		$current = $this_Equality_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	iv_ruleEquality=ruleEquality
	{ $current=$iv_ruleEquality.current; }
	EOF;

// Rule Equality
ruleEquality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualityAccess().getBoolExpParserRuleCall_0());
		}
		this_BoolExp_0=ruleBoolExp
		{
			$current = $this_BoolExp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1='<'
						{
							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpLessThanSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='<='
						{
							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
						    |
						lv_op_2_3='>'
						{
							newLeafNode(lv_op_2_3, grammarAccess.getEqualityAccess().getOpGreaterThanSignKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_3, null);
						}
						    |
						lv_op_2_4='>='
						{
							newLeafNode(lv_op_2_4, grammarAccess.getEqualityAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_4, null);
						}
						    |
						lv_op_2_5='=='
						{
							newLeafNode(lv_op_2_5, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_5, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualityAccess().getRightBoolExpParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleBoolExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualityRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.BoolExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleBoolExp
entryRuleBoolExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolExpRule()); }
	iv_ruleBoolExp=ruleBoolExp
	{ $current=$iv_ruleBoolExp.current; }
	EOF;

// Rule BoolExp
ruleBoolExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBoolExpAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getBoolExpAccess().getBoolExpLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1='||'
						{
							newLeafNode(lv_op_2_1, grammarAccess.getBoolExpAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoolExpRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='&&'
						{
							newLeafNode(lv_op_2_2, grammarAccess.getBoolExpAccess().getOpAmpersandAmpersandKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBoolExpRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBoolExpAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBoolExpRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getSMNumberAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getSMBoolAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getValueBooleanParserRuleCall_1_1_0());
					}
					lv_value_3_0=ruleBoolean
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Boolean");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getVarReferenceAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getVariableVarDefinitionCrossReference_2_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNegationAction_3_0(),
						$current);
				}
			)
			otherlv_7='!'
			{
				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getExpPrimaryParserRuleCall_3_2_0());
					}
					lv_exp_8_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"exp",
							lv_exp_8_0,
							"dk.sdu.mmmi.assa.sm.StateMachine.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_9='('
			{
				newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_4_1());
			}
			this_Expression_10=ruleExpression
			{
				$current = $this_Expression_10.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2());
			}
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='bool'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword());
	}
;

// Entry rule entryRuleFloat
entryRuleFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFloatRule()); }
	iv_ruleFloat=ruleFloat
	{ $current=$iv_ruleFloat.current.getText(); }
	EOF;

// Rule Float
ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
