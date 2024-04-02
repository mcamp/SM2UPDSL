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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'machine'", "'{'", "'}'", "'fail'", "'state'", "'with'", "'->'", "'when'", "'after'", "'signal'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



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




    // $ANTLR start "entryRuleRoot"
    // InternalStateMachine.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalStateMachine.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalStateMachine.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalStateMachine.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machine_2_0= ruleMachine ) ) )? ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_machine_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machine_2_0= ruleMachine ) ) )? )
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machine_2_0= ruleMachine ) ) )?
            {
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machine_2_0= ruleMachine ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machine_2_0= ruleMachine ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getProjectKeyword_0());
                    		
                    // InternalStateMachine.g:83:3: ( (lv_name_1_0= RULE_ID ) )
                    // InternalStateMachine.g:84:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalStateMachine.g:84:4: (lv_name_1_0= RULE_ID )
                    // InternalStateMachine.g:85:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRootRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }

                    // InternalStateMachine.g:101:3: ( (lv_machine_2_0= ruleMachine ) )
                    // InternalStateMachine.g:102:4: (lv_machine_2_0= ruleMachine )
                    {
                    // InternalStateMachine.g:102:4: (lv_machine_2_0= ruleMachine )
                    // InternalStateMachine.g:103:5: lv_machine_2_0= ruleMachine
                    {

                    					newCompositeNode(grammarAccess.getRootAccess().getMachineMachineParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_machine_2_0=ruleMachine();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootRule());
                    					}
                    					set(
                    						current,
                    						"machine",
                    						lv_machine_2_0,
                    						"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleMachine"
    // InternalStateMachine.g:124:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalStateMachine.g:124:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalStateMachine.g:125:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStateMachine.g:131:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_states_3_0 = null;

        EObject lv_transitions_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:137:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' ) )
            // InternalStateMachine.g:138:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' )
            {
            // InternalStateMachine.g:138:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' )
            // InternalStateMachine.g:139:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalStateMachine.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:165:3: ( ( (lv_states_3_0= ruleState ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_ID) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachine.g:166:4: ( (lv_states_3_0= ruleState ) )
            	    {
            	    // InternalStateMachine.g:166:4: ( (lv_states_3_0= ruleState ) )
            	    // InternalStateMachine.g:167:5: (lv_states_3_0= ruleState )
            	    {
            	    // InternalStateMachine.g:167:5: (lv_states_3_0= ruleState )
            	    // InternalStateMachine.g:168:6: lv_states_3_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_3_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:186:4: ( (lv_transitions_4_0= ruleTransition ) )
            	    {
            	    // InternalStateMachine.g:186:4: ( (lv_transitions_4_0= ruleTransition ) )
            	    // InternalStateMachine.g:187:5: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:187:5: (lv_transitions_4_0= ruleTransition )
            	    // InternalStateMachine.g:188:6: lv_transitions_4_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_4_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:214:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:214:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:215:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:221:1: ruleState returns [EObject current=null] : ( ( (lv_fail_0_0= 'fail' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_fail_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_machine_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:227:2: ( ( ( (lv_fail_0_0= 'fail' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )? ) )
            // InternalStateMachine.g:228:2: ( ( (lv_fail_0_0= 'fail' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )? )
            {
            // InternalStateMachine.g:228:2: ( ( (lv_fail_0_0= 'fail' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )? )
            // InternalStateMachine.g:229:3: ( (lv_fail_0_0= 'fail' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )?
            {
            // InternalStateMachine.g:229:3: ( (lv_fail_0_0= 'fail' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:230:4: (lv_fail_0_0= 'fail' )
                    {
                    // InternalStateMachine.g:230:4: (lv_fail_0_0= 'fail' )
                    // InternalStateMachine.g:231:5: lv_fail_0_0= 'fail'
                    {
                    lv_fail_0_0=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(lv_fail_0_0, grammarAccess.getStateAccess().getFailFailKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "fail", lv_fail_0_0 != null, "fail");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachine.g:247:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStateMachine.g:248:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStateMachine.g:248:4: (lv_name_2_0= RULE_ID )
            // InternalStateMachine.g:249:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:265:3: (otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:266:4: otherlv_3= 'with' ( (lv_machine_4_0= ruleMachine ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getWithKeyword_3_0());
                    			
                    // InternalStateMachine.g:270:4: ( (lv_machine_4_0= ruleMachine ) )
                    // InternalStateMachine.g:271:5: (lv_machine_4_0= ruleMachine )
                    {
                    // InternalStateMachine.g:271:5: (lv_machine_4_0= ruleMachine )
                    // InternalStateMachine.g:272:6: lv_machine_4_0= ruleMachine
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_machine_4_0=ruleMachine();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						set(
                    							current,
                    							"machine",
                    							lv_machine_4_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:294:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:294:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:295:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:301:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )? ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )? (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_when_4_0=null;
        Token lv_time_5_0=null;
        Token otherlv_7=null;
        Token lv_signal_8_0=null;
        AntlrDatatypeRuleToken lv_timeout_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:307:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )? ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )? (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )? ) )
            // InternalStateMachine.g:308:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )? ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )? (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )? )
            {
            // InternalStateMachine.g:308:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )? ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )? (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )? )
            // InternalStateMachine.g:309:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )? ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )? (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )?
            {
            // InternalStateMachine.g:309:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:310:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:310:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:311:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalStateMachine.g:326:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:327:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:327:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:328:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }

            // InternalStateMachine.g:339:3: (otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:340:4: otherlv_3= 'when' ( (lv_when_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getWhenKeyword_3_0());
                    			
                    // InternalStateMachine.g:344:4: ( (lv_when_4_0= RULE_ID ) )
                    // InternalStateMachine.g:345:5: (lv_when_4_0= RULE_ID )
                    {
                    // InternalStateMachine.g:345:5: (lv_when_4_0= RULE_ID )
                    // InternalStateMachine.g:346:6: lv_when_4_0= RULE_ID
                    {
                    lv_when_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_when_4_0, grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"when",
                    							lv_when_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:363:3: ( ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:364:4: ( (lv_time_5_0= 'after' ) ) ( (lv_timeout_6_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:364:4: ( (lv_time_5_0= 'after' ) )
                    // InternalStateMachine.g:365:5: (lv_time_5_0= 'after' )
                    {
                    // InternalStateMachine.g:365:5: (lv_time_5_0= 'after' )
                    // InternalStateMachine.g:366:6: lv_time_5_0= 'after'
                    {
                    lv_time_5_0=(Token)match(input,20,FOLLOW_12); 

                    						newLeafNode(lv_time_5_0, grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "time", lv_time_5_0 != null, "after");
                    					

                    }


                    }

                    // InternalStateMachine.g:378:4: ( (lv_timeout_6_0= ruleFloat ) )
                    // InternalStateMachine.g:379:5: (lv_timeout_6_0= ruleFloat )
                    {
                    // InternalStateMachine.g:379:5: (lv_timeout_6_0= ruleFloat )
                    // InternalStateMachine.g:380:6: lv_timeout_6_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_timeout_6_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"timeout",
                    							lv_timeout_6_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:398:3: (otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:399:4: otherlv_7= 'signal' ( (lv_signal_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSignalKeyword_5_0());
                    			
                    // InternalStateMachine.g:403:4: ( (lv_signal_8_0= RULE_ID ) )
                    // InternalStateMachine.g:404:5: (lv_signal_8_0= RULE_ID )
                    {
                    // InternalStateMachine.g:404:5: (lv_signal_8_0= RULE_ID )
                    // InternalStateMachine.g:405:6: lv_signal_8_0= RULE_ID
                    {
                    lv_signal_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_signal_8_0, grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"signal",
                    							lv_signal_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleFloat"
    // InternalStateMachine.g:426:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalStateMachine.g:426:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalStateMachine.g:427:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalStateMachine.g:433:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:439:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalStateMachine.g:440:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalStateMachine.g:440:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalStateMachine.g:441:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalStateMachine.g:448:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:449:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,22,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});

}