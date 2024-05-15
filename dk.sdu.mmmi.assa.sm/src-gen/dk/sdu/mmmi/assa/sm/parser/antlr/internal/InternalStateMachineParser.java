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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'machine'", "'{'", "'}'", "'fail'", "'end'", "'state'", "'safety'", "'properties'", "'with'", "'->'", "'guard'", "'when'", "'after'", "'signal'", "'startup'", "'delay'", "'max'", "'execution'", "'.'", "'true'", "'false'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalStateMachine.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machines_2_0= ruleMachine ) )* )? ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_machines_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machines_2_0= ruleMachine ) )* )? )
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machines_2_0= ruleMachine ) )* )?
            {
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machines_2_0= ruleMachine ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_machines_2_0= ruleMachine ) )*
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

                    // InternalStateMachine.g:101:3: ( (lv_machines_2_0= ruleMachine ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStateMachine.g:102:4: (lv_machines_2_0= ruleMachine )
                    	    {
                    	    // InternalStateMachine.g:102:4: (lv_machines_2_0= ruleMachine )
                    	    // InternalStateMachine.g:103:5: lv_machines_2_0= ruleMachine
                    	    {

                    	    					newCompositeNode(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_2_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_machines_2_0=ruleMachine();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getRootRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"machines",
                    	    						lv_machines_2_0,
                    	    						"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==RULE_ID) ) {
                    alt3=2;
                }


                switch (alt3) {
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
            	    break loop3;
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
    // InternalStateMachine.g:221:1: ruleState returns [EObject current=null] : ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_fail_0_0=null;
        Token lv_end_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_properties_7_0 = null;

        EObject lv_machine_10_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:227:2: ( ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) )
            // InternalStateMachine.g:228:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            {
            // InternalStateMachine.g:228:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            // InternalStateMachine.g:229:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            {
            // InternalStateMachine.g:229:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:230:4: ( (lv_fail_0_0= 'fail' ) )
                    {
                    // InternalStateMachine.g:230:4: ( (lv_fail_0_0= 'fail' ) )
                    // InternalStateMachine.g:231:5: (lv_fail_0_0= 'fail' )
                    {
                    // InternalStateMachine.g:231:5: (lv_fail_0_0= 'fail' )
                    // InternalStateMachine.g:232:6: lv_fail_0_0= 'fail'
                    {
                    lv_fail_0_0=(Token)match(input,15,FOLLOW_7); 

                    						newLeafNode(lv_fail_0_0, grammarAccess.getStateAccess().getFailFailKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "fail", lv_fail_0_0 != null, "fail");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:245:4: ( (lv_end_1_0= 'end' ) )
                    {
                    // InternalStateMachine.g:245:4: ( (lv_end_1_0= 'end' ) )
                    // InternalStateMachine.g:246:5: (lv_end_1_0= 'end' )
                    {
                    // InternalStateMachine.g:246:5: (lv_end_1_0= 'end' )
                    // InternalStateMachine.g:247:6: lv_end_1_0= 'end'
                    {
                    lv_end_1_0=(Token)match(input,16,FOLLOW_7); 

                    						newLeafNode(lv_end_1_0, grammarAccess.getStateAccess().getEndEndKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "end", lv_end_1_0 != null, "end");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachine.g:264:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStateMachine.g:265:4: (lv_name_3_0= RULE_ID )
            {
            // InternalStateMachine.g:265:4: (lv_name_3_0= RULE_ID )
            // InternalStateMachine.g:266:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:282:3: (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:283:4: otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getSafetyKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getPropertiesKeyword_3_1());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalStateMachine.g:295:4: ( (lv_properties_7_0= ruleSafetyProperty ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==26||LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachine.g:296:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    {
                    	    // InternalStateMachine.g:296:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    // InternalStateMachine.g:297:6: lv_properties_7_0= ruleSafetyProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_7_0=ruleSafetyProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_7_0,
                    	    							"dk.sdu.mmmi.assa.sm.StateMachine.SafetyProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:319:3: (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:320:4: otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getWithKeyword_4_0());
                    			
                    // InternalStateMachine.g:324:4: ( (lv_machine_10_0= ruleMachine ) )
                    // InternalStateMachine.g:325:5: (lv_machine_10_0= ruleMachine )
                    {
                    // InternalStateMachine.g:325:5: (lv_machine_10_0= ruleMachine )
                    // InternalStateMachine.g:326:6: lv_machine_10_0= ruleMachine
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_machine_10_0=ruleMachine();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						set(
                    							current,
                    							"machine",
                    							lv_machine_10_0,
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
    // InternalStateMachine.g:348:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:348:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:349:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateMachine.g:355:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hasGuard_3_0=null;
        Token lv_hasWhen_5_0=null;
        Token lv_when_6_0=null;
        Token lv_time_7_0=null;
        Token lv_hasSignal_9_0=null;
        Token lv_signal_10_0=null;
        AntlrDatatypeRuleToken lv_guard_4_0 = null;

        AntlrDatatypeRuleToken lv_timeout_8_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:361:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? ) )
            // InternalStateMachine.g:362:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? )
            {
            // InternalStateMachine.g:362:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? )
            // InternalStateMachine.g:363:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )?
            {
            // InternalStateMachine.g:363:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:364:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:364:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:365:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalStateMachine.g:380:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:381:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:381:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:382:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }

            // InternalStateMachine.g:393:3: ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:394:4: ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleBoolean ) )
                    {
                    // InternalStateMachine.g:394:4: ( (lv_hasGuard_3_0= 'guard' ) )
                    // InternalStateMachine.g:395:5: (lv_hasGuard_3_0= 'guard' )
                    {
                    // InternalStateMachine.g:395:5: (lv_hasGuard_3_0= 'guard' )
                    // InternalStateMachine.g:396:6: lv_hasGuard_3_0= 'guard'
                    {
                    lv_hasGuard_3_0=(Token)match(input,22,FOLLOW_15); 

                    						newLeafNode(lv_hasGuard_3_0, grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasGuard", lv_hasGuard_3_0 != null, "guard");
                    					

                    }


                    }

                    // InternalStateMachine.g:408:4: ( (lv_guard_4_0= ruleBoolean ) )
                    // InternalStateMachine.g:409:5: (lv_guard_4_0= ruleBoolean )
                    {
                    // InternalStateMachine.g:409:5: (lv_guard_4_0= ruleBoolean )
                    // InternalStateMachine.g:410:6: lv_guard_4_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getGuardBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_guard_4_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_4_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:428:3: ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:429:4: ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:429:4: ( (lv_hasWhen_5_0= 'when' ) )
                    // InternalStateMachine.g:430:5: (lv_hasWhen_5_0= 'when' )
                    {
                    // InternalStateMachine.g:430:5: (lv_hasWhen_5_0= 'when' )
                    // InternalStateMachine.g:431:6: lv_hasWhen_5_0= 'when'
                    {
                    lv_hasWhen_5_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_hasWhen_5_0, grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasWhen", lv_hasWhen_5_0 != null, "when");
                    					

                    }


                    }

                    // InternalStateMachine.g:443:4: ( (lv_when_6_0= RULE_ID ) )
                    // InternalStateMachine.g:444:5: (lv_when_6_0= RULE_ID )
                    {
                    // InternalStateMachine.g:444:5: (lv_when_6_0= RULE_ID )
                    // InternalStateMachine.g:445:6: lv_when_6_0= RULE_ID
                    {
                    lv_when_6_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_when_6_0, grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"when",
                    							lv_when_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:462:3: ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:463:4: ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:463:4: ( (lv_time_7_0= 'after' ) )
                    // InternalStateMachine.g:464:5: (lv_time_7_0= 'after' )
                    {
                    // InternalStateMachine.g:464:5: (lv_time_7_0= 'after' )
                    // InternalStateMachine.g:465:6: lv_time_7_0= 'after'
                    {
                    lv_time_7_0=(Token)match(input,24,FOLLOW_18); 

                    						newLeafNode(lv_time_7_0, grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "time", lv_time_7_0 != null, "after");
                    					

                    }


                    }

                    // InternalStateMachine.g:477:4: ( (lv_timeout_8_0= ruleFloat ) )
                    // InternalStateMachine.g:478:5: (lv_timeout_8_0= ruleFloat )
                    {
                    // InternalStateMachine.g:478:5: (lv_timeout_8_0= ruleFloat )
                    // InternalStateMachine.g:479:6: lv_timeout_8_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_timeout_8_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"timeout",
                    							lv_timeout_8_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:497:3: ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:498:4: ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:498:4: ( (lv_hasSignal_9_0= 'signal' ) )
                    // InternalStateMachine.g:499:5: (lv_hasSignal_9_0= 'signal' )
                    {
                    // InternalStateMachine.g:499:5: (lv_hasSignal_9_0= 'signal' )
                    // InternalStateMachine.g:500:6: lv_hasSignal_9_0= 'signal'
                    {
                    lv_hasSignal_9_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_hasSignal_9_0, grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasSignal", lv_hasSignal_9_0 != null, "signal");
                    					

                    }


                    }

                    // InternalStateMachine.g:512:4: ( (lv_signal_10_0= RULE_ID ) )
                    // InternalStateMachine.g:513:5: (lv_signal_10_0= RULE_ID )
                    {
                    // InternalStateMachine.g:513:5: (lv_signal_10_0= RULE_ID )
                    // InternalStateMachine.g:514:6: lv_signal_10_0= RULE_ID
                    {
                    lv_signal_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_signal_10_0, grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"signal",
                    							lv_signal_10_0,
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


    // $ANTLR start "entryRuleSafetyProperty"
    // InternalStateMachine.g:535:1: entryRuleSafetyProperty returns [EObject current=null] : iv_ruleSafetyProperty= ruleSafetyProperty EOF ;
    public final EObject entryRuleSafetyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyProperty = null;


        try {
            // InternalStateMachine.g:535:55: (iv_ruleSafetyProperty= ruleSafetyProperty EOF )
            // InternalStateMachine.g:536:2: iv_ruleSafetyProperty= ruleSafetyProperty EOF
            {
             newCompositeNode(grammarAccess.getSafetyPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyProperty=ruleSafetyProperty();

            state._fsp--;

             current =iv_ruleSafetyProperty; 
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
    // $ANTLR end "entryRuleSafetyProperty"


    // $ANTLR start "ruleSafetyProperty"
    // InternalStateMachine.g:542:1: ruleSafetyProperty returns [EObject current=null] : ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) ) ;
    public final EObject ruleSafetyProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;

        AntlrDatatypeRuleToken lv_time_7_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:548:2: ( ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) ) )
            // InternalStateMachine.g:549:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) )
            {
            // InternalStateMachine.g:549:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:550:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) )
                    {
                    // InternalStateMachine.g:550:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) )
                    // InternalStateMachine.g:551:4: () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:551:4: ()
                    // InternalStateMachine.g:552:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2());
                    			
                    // InternalStateMachine.g:566:4: ( (lv_time_3_0= ruleFloat ) )
                    // InternalStateMachine.g:567:5: (lv_time_3_0= ruleFloat )
                    {
                    // InternalStateMachine.g:567:5: (lv_time_3_0= ruleFloat )
                    // InternalStateMachine.g:568:6: lv_time_3_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_time_3_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_3_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:587:3: ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) )
                    {
                    // InternalStateMachine.g:587:3: ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) )
                    // InternalStateMachine.g:588:4: () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:588:4: ()
                    // InternalStateMachine.g:589:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2());
                    			
                    // InternalStateMachine.g:603:4: ( (lv_time_7_0= ruleFloat ) )
                    // InternalStateMachine.g:604:5: (lv_time_7_0= ruleFloat )
                    {
                    // InternalStateMachine.g:604:5: (lv_time_7_0= ruleFloat )
                    // InternalStateMachine.g:605:6: lv_time_7_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_time_7_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_7_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleSafetyProperty"


    // $ANTLR start "entryRuleFloat"
    // InternalStateMachine.g:627:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalStateMachine.g:627:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalStateMachine.g:628:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalStateMachine.g:634:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:640:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalStateMachine.g:641:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalStateMachine.g:641:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalStateMachine.g:642:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalStateMachine.g:649:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:650:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,30,FOLLOW_18); 

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


    // $ANTLR start "entryRuleBoolean"
    // InternalStateMachine.g:667:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalStateMachine.g:667:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalStateMachine.g:668:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalStateMachine.g:674:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:680:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalStateMachine.g:681:2: (kw= 'true' | kw= 'false' )
            {
            // InternalStateMachine.g:681:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:682:3: kw= 'true'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:688:3: kw= 'false'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000014004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});

}