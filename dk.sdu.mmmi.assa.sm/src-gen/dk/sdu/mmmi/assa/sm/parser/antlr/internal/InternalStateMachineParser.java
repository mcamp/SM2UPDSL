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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'machine'", "'{'", "'}'", "'fail'", "'end'", "'state'", "'safety'", "'properties'", "'with'", "'->'", "'guard'", "'when'", "'after'", "'signal'", "'actions'", "'startup'", "'delay'", "'max'", "'execution'", "':='", "'<'", "'<='", "'>'", "'>='", "'bool'", "'.'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    // InternalStateMachine.g:131:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_vars_3_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:137:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' ) )
            // InternalStateMachine.g:138:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            {
            // InternalStateMachine.g:138:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            // InternalStateMachine.g:139:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}'
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
            		
            // InternalStateMachine.g:165:3: ( ( (lv_vars_3_0= ruleVarDefinition ) ) | ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                case 16:
                case 17:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:166:4: ( (lv_vars_3_0= ruleVarDefinition ) )
            	    {
            	    // InternalStateMachine.g:166:4: ( (lv_vars_3_0= ruleVarDefinition ) )
            	    // InternalStateMachine.g:167:5: (lv_vars_3_0= ruleVarDefinition )
            	    {
            	    // InternalStateMachine.g:167:5: (lv_vars_3_0= ruleVarDefinition )
            	    // InternalStateMachine.g:168:6: lv_vars_3_0= ruleVarDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getVarsVarDefinitionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_vars_3_0=ruleVarDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_3_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.VarDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:186:4: ( (lv_states_4_0= ruleState ) )
            	    {
            	    // InternalStateMachine.g:186:4: ( (lv_states_4_0= ruleState ) )
            	    // InternalStateMachine.g:187:5: (lv_states_4_0= ruleState )
            	    {
            	    // InternalStateMachine.g:187:5: (lv_states_4_0= ruleState )
            	    // InternalStateMachine.g:188:6: lv_states_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_4_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateMachine.g:206:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    {
            	    // InternalStateMachine.g:206:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    // InternalStateMachine.g:207:5: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:207:5: (lv_transitions_5_0= ruleTransition )
            	    // InternalStateMachine.g:208:6: lv_transitions_5_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_5_0,
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalStateMachine.g:234:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:234:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:235:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachine.g:241:1: ruleState returns [EObject current=null] : ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) ;
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
            // InternalStateMachine.g:247:2: ( ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) )
            // InternalStateMachine.g:248:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            {
            // InternalStateMachine.g:248:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            // InternalStateMachine.g:249:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            {
            // InternalStateMachine.g:249:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )?
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
                    // InternalStateMachine.g:250:4: ( (lv_fail_0_0= 'fail' ) )
                    {
                    // InternalStateMachine.g:250:4: ( (lv_fail_0_0= 'fail' ) )
                    // InternalStateMachine.g:251:5: (lv_fail_0_0= 'fail' )
                    {
                    // InternalStateMachine.g:251:5: (lv_fail_0_0= 'fail' )
                    // InternalStateMachine.g:252:6: lv_fail_0_0= 'fail'
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
                    // InternalStateMachine.g:265:4: ( (lv_end_1_0= 'end' ) )
                    {
                    // InternalStateMachine.g:265:4: ( (lv_end_1_0= 'end' ) )
                    // InternalStateMachine.g:266:5: (lv_end_1_0= 'end' )
                    {
                    // InternalStateMachine.g:266:5: (lv_end_1_0= 'end' )
                    // InternalStateMachine.g:267:6: lv_end_1_0= 'end'
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
            		
            // InternalStateMachine.g:284:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStateMachine.g:285:4: (lv_name_3_0= RULE_ID )
            {
            // InternalStateMachine.g:285:4: (lv_name_3_0= RULE_ID )
            // InternalStateMachine.g:286:5: lv_name_3_0= RULE_ID
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

            // InternalStateMachine.g:302:3: (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:303:4: otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getSafetyKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getPropertiesKeyword_3_1());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalStateMachine.g:315:4: ( (lv_properties_7_0= ruleSafetyProperty ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==27||LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachine.g:316:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    {
                    	    // InternalStateMachine.g:316:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    // InternalStateMachine.g:317:6: lv_properties_7_0= ruleSafetyProperty
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

            // InternalStateMachine.g:339:3: (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:340:4: otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getWithKeyword_4_0());
                    			
                    // InternalStateMachine.g:344:4: ( (lv_machine_10_0= ruleMachine ) )
                    // InternalStateMachine.g:345:5: (lv_machine_10_0= ruleMachine )
                    {
                    // InternalStateMachine.g:345:5: (lv_machine_10_0= ruleMachine )
                    // InternalStateMachine.g:346:6: lv_machine_10_0= ruleMachine
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
    // InternalStateMachine.g:368:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:368:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:369:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateMachine.g:375:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_guard_4_0 = null;

        AntlrDatatypeRuleToken lv_timeout_8_0 = null;

        EObject lv_actions_13_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:381:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? ) )
            // InternalStateMachine.g:382:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? )
            {
            // InternalStateMachine.g:382:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? )
            // InternalStateMachine.g:383:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )?
            {
            // InternalStateMachine.g:383:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:384:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:384:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:385:5: otherlv_0= RULE_ID
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
            		
            // InternalStateMachine.g:400:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:401:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:401:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:402:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }

            // InternalStateMachine.g:413:3: ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:414:4: ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) )
                    {
                    // InternalStateMachine.g:414:4: ( (lv_hasGuard_3_0= 'guard' ) )
                    // InternalStateMachine.g:415:5: (lv_hasGuard_3_0= 'guard' )
                    {
                    // InternalStateMachine.g:415:5: (lv_hasGuard_3_0= 'guard' )
                    // InternalStateMachine.g:416:6: lv_hasGuard_3_0= 'guard'
                    {
                    lv_hasGuard_3_0=(Token)match(input,22,FOLLOW_15); 

                    						newLeafNode(lv_hasGuard_3_0, grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasGuard", lv_hasGuard_3_0 != null, "guard");
                    					

                    }


                    }

                    // InternalStateMachine.g:428:4: ( (lv_guard_4_0= ruleExpression ) )
                    // InternalStateMachine.g:429:5: (lv_guard_4_0= ruleExpression )
                    {
                    // InternalStateMachine.g:429:5: (lv_guard_4_0= ruleExpression )
                    // InternalStateMachine.g:430:6: lv_guard_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_guard_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_4_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:448:3: ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:449:4: ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:449:4: ( (lv_hasWhen_5_0= 'when' ) )
                    // InternalStateMachine.g:450:5: (lv_hasWhen_5_0= 'when' )
                    {
                    // InternalStateMachine.g:450:5: (lv_hasWhen_5_0= 'when' )
                    // InternalStateMachine.g:451:6: lv_hasWhen_5_0= 'when'
                    {
                    lv_hasWhen_5_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_hasWhen_5_0, grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasWhen", lv_hasWhen_5_0 != null, "when");
                    					

                    }


                    }

                    // InternalStateMachine.g:463:4: ( (lv_when_6_0= RULE_ID ) )
                    // InternalStateMachine.g:464:5: (lv_when_6_0= RULE_ID )
                    {
                    // InternalStateMachine.g:464:5: (lv_when_6_0= RULE_ID )
                    // InternalStateMachine.g:465:6: lv_when_6_0= RULE_ID
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

            // InternalStateMachine.g:482:3: ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:483:4: ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:483:4: ( (lv_time_7_0= 'after' ) )
                    // InternalStateMachine.g:484:5: (lv_time_7_0= 'after' )
                    {
                    // InternalStateMachine.g:484:5: (lv_time_7_0= 'after' )
                    // InternalStateMachine.g:485:6: lv_time_7_0= 'after'
                    {
                    lv_time_7_0=(Token)match(input,24,FOLLOW_18); 

                    						newLeafNode(lv_time_7_0, grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "time", lv_time_7_0 != null, "after");
                    					

                    }


                    }

                    // InternalStateMachine.g:497:4: ( (lv_timeout_8_0= ruleFloat ) )
                    // InternalStateMachine.g:498:5: (lv_timeout_8_0= ruleFloat )
                    {
                    // InternalStateMachine.g:498:5: (lv_timeout_8_0= ruleFloat )
                    // InternalStateMachine.g:499:6: lv_timeout_8_0= ruleFloat
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

            // InternalStateMachine.g:517:3: ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:518:4: ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:518:4: ( (lv_hasSignal_9_0= 'signal' ) )
                    // InternalStateMachine.g:519:5: (lv_hasSignal_9_0= 'signal' )
                    {
                    // InternalStateMachine.g:519:5: (lv_hasSignal_9_0= 'signal' )
                    // InternalStateMachine.g:520:6: lv_hasSignal_9_0= 'signal'
                    {
                    lv_hasSignal_9_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_hasSignal_9_0, grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasSignal", lv_hasSignal_9_0 != null, "signal");
                    					

                    }


                    }

                    // InternalStateMachine.g:532:4: ( (lv_signal_10_0= RULE_ID ) )
                    // InternalStateMachine.g:533:5: (lv_signal_10_0= RULE_ID )
                    {
                    // InternalStateMachine.g:533:5: (lv_signal_10_0= RULE_ID )
                    // InternalStateMachine.g:534:6: lv_signal_10_0= RULE_ID
                    {
                    lv_signal_10_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalStateMachine.g:551:3: (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:552:4: otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getActionsKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalStateMachine.g:560:4: ( (lv_actions_13_0= ruleStatement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalStateMachine.g:561:5: (lv_actions_13_0= ruleStatement )
                    	    {
                    	    // InternalStateMachine.g:561:5: (lv_actions_13_0= ruleStatement )
                    	    // InternalStateMachine.g:562:6: lv_actions_13_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransitionAccess().getActionsStatementParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_actions_13_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_13_0,
                    	    							"dk.sdu.mmmi.assa.sm.StateMachine.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // InternalStateMachine.g:588:1: entryRuleSafetyProperty returns [EObject current=null] : iv_ruleSafetyProperty= ruleSafetyProperty EOF ;
    public final EObject entryRuleSafetyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyProperty = null;


        try {
            // InternalStateMachine.g:588:55: (iv_ruleSafetyProperty= ruleSafetyProperty EOF )
            // InternalStateMachine.g:589:2: iv_ruleSafetyProperty= ruleSafetyProperty EOF
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
    // InternalStateMachine.g:595:1: ruleSafetyProperty returns [EObject current=null] : ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) ) ;
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
            // InternalStateMachine.g:601:2: ( ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) ) )
            // InternalStateMachine.g:602:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) )
            {
            // InternalStateMachine.g:602:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) ) | ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:603:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) )
                    {
                    // InternalStateMachine.g:603:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) ) )
                    // InternalStateMachine.g:604:4: () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:604:4: ()
                    // InternalStateMachine.g:605:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2());
                    			
                    // InternalStateMachine.g:619:4: ( (lv_time_3_0= ruleFloat ) )
                    // InternalStateMachine.g:620:5: (lv_time_3_0= ruleFloat )
                    {
                    // InternalStateMachine.g:620:5: (lv_time_3_0= ruleFloat )
                    // InternalStateMachine.g:621:6: lv_time_3_0= ruleFloat
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
                    // InternalStateMachine.g:640:3: ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) )
                    {
                    // InternalStateMachine.g:640:3: ( () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) ) )
                    // InternalStateMachine.g:641:4: () otherlv_5= 'max' otherlv_6= 'execution' ( (lv_time_7_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:641:4: ()
                    // InternalStateMachine.g:642:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2());
                    			
                    // InternalStateMachine.g:656:4: ( (lv_time_7_0= ruleFloat ) )
                    // InternalStateMachine.g:657:5: (lv_time_7_0= ruleFloat )
                    {
                    // InternalStateMachine.g:657:5: (lv_time_7_0= ruleFloat )
                    // InternalStateMachine.g:658:6: lv_time_7_0= ruleFloat
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


    // $ANTLR start "entryRuleVarDefinition"
    // InternalStateMachine.g:680:1: entryRuleVarDefinition returns [EObject current=null] : iv_ruleVarDefinition= ruleVarDefinition EOF ;
    public final EObject entryRuleVarDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDefinition = null;


        try {
            // InternalStateMachine.g:680:54: (iv_ruleVarDefinition= ruleVarDefinition EOF )
            // InternalStateMachine.g:681:2: iv_ruleVarDefinition= ruleVarDefinition EOF
            {
             newCompositeNode(grammarAccess.getVarDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDefinition=ruleVarDefinition();

            state._fsp--;

             current =iv_ruleVarDefinition; 
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
    // $ANTLR end "entryRuleVarDefinition"


    // $ANTLR start "ruleVarDefinition"
    // InternalStateMachine.g:687:1: ruleVarDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVarDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:693:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalStateMachine.g:694:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalStateMachine.g:694:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalStateMachine.g:695:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalStateMachine.g:695:3: ( (lv_type_0_0= ruleType ) )
            // InternalStateMachine.g:696:4: (lv_type_0_0= ruleType )
            {
            // InternalStateMachine.g:696:4: (lv_type_0_0= ruleType )
            // InternalStateMachine.g:697:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVarDefinitionAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"dk.sdu.mmmi.assa.sm.StateMachine.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:714:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:715:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:715:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:716:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDefinitionAccess().getColonEqualsSignKeyword_2());
            		
            // InternalStateMachine.g:736:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalStateMachine.g:737:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalStateMachine.g:737:4: (lv_expression_3_0= ruleExpression )
            // InternalStateMachine.g:738:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVarDefinitionAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDefinitionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleVarDefinition"


    // $ANTLR start "entryRuleStatement"
    // InternalStateMachine.g:759:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalStateMachine.g:759:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalStateMachine.g:760:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalStateMachine.g:766:1: ruleStatement returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:772:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalStateMachine.g:773:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalStateMachine.g:773:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalStateMachine.g:774:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalStateMachine.g:774:3: ()
            // InternalStateMachine.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatementAccess().getVarAssignationAction_0(),
            					current);
            			

            }

            // InternalStateMachine.g:781:3: ( (otherlv_1= RULE_ID ) )
            // InternalStateMachine.g:782:4: (otherlv_1= RULE_ID )
            {
            // InternalStateMachine.g:782:4: (otherlv_1= RULE_ID )
            // InternalStateMachine.g:783:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getVariableVarDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_2());
            		
            // InternalStateMachine.g:798:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalStateMachine.g:799:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalStateMachine.g:799:4: (lv_expression_3_0= ruleExpression )
            // InternalStateMachine.g:800:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.assa.sm.StateMachine.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalStateMachine.g:821:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalStateMachine.g:821:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalStateMachine.g:822:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalStateMachine.g:828:1: ruleExpression returns [EObject current=null] : this_Equality_0= ruleEquality ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:834:2: (this_Equality_0= ruleEquality )
            // InternalStateMachine.g:835:2: this_Equality_0= ruleEquality
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getEqualityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Equality_0=ruleEquality();

            state._fsp--;


            		current = this_Equality_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEquality"
    // InternalStateMachine.g:846:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalStateMachine.g:846:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalStateMachine.g:847:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalStateMachine.g:853:1: ruleEquality returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:859:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalStateMachine.g:860:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalStateMachine.g:860:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalStateMachine.g:861:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:869:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStateMachine.g:870:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalStateMachine.g:870:4: ()
            	    // InternalStateMachine.g:871:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateMachine.g:877:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // InternalStateMachine.g:878:5: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalStateMachine.g:878:5: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // InternalStateMachine.g:879:6: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // InternalStateMachine.g:879:6: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalStateMachine.g:880:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateMachine.g:891:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalStateMachine.g:902:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,34,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getEqualityAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalStateMachine.g:913:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,35,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getEqualityAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalStateMachine.g:926:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalStateMachine.g:927:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalStateMachine.g:927:5: (lv_right_3_0= rulePrimary )
            	    // InternalStateMachine.g:928:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRulePrimary"
    // InternalStateMachine.g:950:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalStateMachine.g:950:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalStateMachine.g:951:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalStateMachine.g:957:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:963:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) ) )
            // InternalStateMachine.g:964:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) )
            {
            // InternalStateMachine.g:964:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalStateMachine.g:965:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalStateMachine.g:965:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalStateMachine.g:966:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalStateMachine.g:966:4: ()
                    // InternalStateMachine.g:967:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getSMNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:973:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalStateMachine.g:974:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalStateMachine.g:974:5: (lv_value_1_0= RULE_INT )
                    // InternalStateMachine.g:975:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:993:3: ( () ( (lv_value_3_0= ruleBoolean ) ) )
                    {
                    // InternalStateMachine.g:993:3: ( () ( (lv_value_3_0= ruleBoolean ) ) )
                    // InternalStateMachine.g:994:4: () ( (lv_value_3_0= ruleBoolean ) )
                    {
                    // InternalStateMachine.g:994:4: ()
                    // InternalStateMachine.g:995:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getSMBoolAction_1_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:1001:4: ( (lv_value_3_0= ruleBoolean ) )
                    // InternalStateMachine.g:1002:5: (lv_value_3_0= ruleBoolean )
                    {
                    // InternalStateMachine.g:1002:5: (lv_value_3_0= ruleBoolean )
                    // InternalStateMachine.g:1003:6: lv_value_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getValueBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Boolean");
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleType"
    // InternalStateMachine.g:1025:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalStateMachine.g:1025:44: (iv_ruleType= ruleType EOF )
            // InternalStateMachine.g:1026:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalStateMachine.g:1032:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'bool' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1038:2: (kw= 'bool' )
            // InternalStateMachine.g:1039:2: kw= 'bool'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword());
            	

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFloat"
    // InternalStateMachine.g:1047:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalStateMachine.g:1047:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalStateMachine.g:1048:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalStateMachine.g:1054:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1060:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalStateMachine.g:1061:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalStateMachine.g:1061:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalStateMachine.g:1062:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalStateMachine.g:1069:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStateMachine.g:1070:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,37,FOLLOW_18); 

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
    // InternalStateMachine.g:1087:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalStateMachine.g:1087:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalStateMachine.g:1088:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalStateMachine.g:1094:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1100:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalStateMachine.g:1101:2: (kw= 'true' | kw= 'false' )
            {
            // InternalStateMachine.g:1101:2: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalStateMachine.g:1102:3: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1108:3: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000100003C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000028004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});

}