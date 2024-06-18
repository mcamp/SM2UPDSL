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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'machine'", "'safety'", "'properties'", "'{'", "'}'", "'fail'", "'end'", "'state'", "'with'", "'->'", "'guard'", "'when'", "'after'", "'signal'", "'actions'", "'startup'", "'delay'", "'max'", "'execution'", "'from'", "'to'", "':='", "'<'", "'<='", "'>'", "'>='", "'=='", "'||'", "'&&'", "'!'", "'('", "')'", "'bool'", "'.'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalStateMachine.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVarDefinition ) )* ( (lv_machines_3_0= ruleMachine ) )* )? ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_vars_2_0 = null;

        EObject lv_machines_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVarDefinition ) )* ( (lv_machines_3_0= ruleMachine ) )* )? )
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVarDefinition ) )* ( (lv_machines_3_0= ruleMachine ) )* )?
            {
            // InternalStateMachine.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVarDefinition ) )* ( (lv_machines_3_0= ruleMachine ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVarDefinition ) )* ( (lv_machines_3_0= ruleMachine ) )*
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

                    // InternalStateMachine.g:101:3: ( (lv_vars_2_0= ruleVarDefinition ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==44) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStateMachine.g:102:4: (lv_vars_2_0= ruleVarDefinition )
                    	    {
                    	    // InternalStateMachine.g:102:4: (lv_vars_2_0= ruleVarDefinition )
                    	    // InternalStateMachine.g:103:5: lv_vars_2_0= ruleVarDefinition
                    	    {

                    	    					newCompositeNode(grammarAccess.getRootAccess().getVarsVarDefinitionParserRuleCall_2_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_vars_2_0=ruleVarDefinition();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getRootRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"vars",
                    	    						lv_vars_2_0,
                    	    						"dk.sdu.mmmi.assa.sm.StateMachine.VarDefinition");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalStateMachine.g:120:3: ( (lv_machines_3_0= ruleMachine ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalStateMachine.g:121:4: (lv_machines_3_0= ruleMachine )
                    	    {
                    	    // InternalStateMachine.g:121:4: (lv_machines_3_0= ruleMachine )
                    	    // InternalStateMachine.g:122:5: lv_machines_3_0= ruleMachine
                    	    {

                    	    					newCompositeNode(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_3_0());
                    	    				
                    	    pushFollow(FOLLOW_5);
                    	    lv_machines_3_0=ruleMachine();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getRootRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"machines",
                    	    						lv_machines_3_0,
                    	    						"dk.sdu.mmmi.assa.sm.StateMachine.Machine");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
    // InternalStateMachine.g:143:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalStateMachine.g:143:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalStateMachine.g:144:2: iv_ruleMachine= ruleMachine EOF
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
    // InternalStateMachine.g:150:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )? otherlv_7= '{' ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_properties_5_0 = null;

        EObject lv_vars_8_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_transitions_10_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:156:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )? otherlv_7= '{' ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )* otherlv_11= '}' ) )
            // InternalStateMachine.g:157:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )? otherlv_7= '{' ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )* otherlv_11= '}' )
            {
            // InternalStateMachine.g:157:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )? otherlv_7= '{' ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )* otherlv_11= '}' )
            // InternalStateMachine.g:158:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )? otherlv_7= '{' ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalStateMachine.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalStateMachine.g:180:3: (otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:181:4: otherlv_2= 'safety' otherlv_3= 'properties' otherlv_4= '{' ( (lv_properties_5_0= ruleSafetyProperty ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getSafetyKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getPropertiesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalStateMachine.g:193:4: ( (lv_properties_5_0= ruleSafetyProperty ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27||LA4_0==29) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalStateMachine.g:194:5: (lv_properties_5_0= ruleSafetyProperty )
                    	    {
                    	    // InternalStateMachine.g:194:5: (lv_properties_5_0= ruleSafetyProperty )
                    	    // InternalStateMachine.g:195:6: lv_properties_5_0= ruleSafetyProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getPropertiesSafetyPropertyParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_5_0=ruleSafetyProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_5_0,
                    	    							"dk.sdu.mmmi.assa.sm.StateMachine.SafetyProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStateMachine.g:221:3: ( ( (lv_vars_8_0= ruleVarDefinition ) ) | ( (lv_states_9_0= ruleState ) ) | ( (lv_transitions_10_0= ruleTransition ) ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt6=1;
                    }
                    break;
                case 17:
                case 18:
                case 19:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalStateMachine.g:222:4: ( (lv_vars_8_0= ruleVarDefinition ) )
            	    {
            	    // InternalStateMachine.g:222:4: ( (lv_vars_8_0= ruleVarDefinition ) )
            	    // InternalStateMachine.g:223:5: (lv_vars_8_0= ruleVarDefinition )
            	    {
            	    // InternalStateMachine.g:223:5: (lv_vars_8_0= ruleVarDefinition )
            	    // InternalStateMachine.g:224:6: lv_vars_8_0= ruleVarDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getVarsVarDefinitionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_vars_8_0=ruleVarDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_8_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.VarDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:242:4: ( (lv_states_9_0= ruleState ) )
            	    {
            	    // InternalStateMachine.g:242:4: ( (lv_states_9_0= ruleState ) )
            	    // InternalStateMachine.g:243:5: (lv_states_9_0= ruleState )
            	    {
            	    // InternalStateMachine.g:243:5: (lv_states_9_0= ruleState )
            	    // InternalStateMachine.g:244:6: lv_states_9_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_states_9_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_9_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateMachine.g:262:4: ( (lv_transitions_10_0= ruleTransition ) )
            	    {
            	    // InternalStateMachine.g:262:4: ( (lv_transitions_10_0= ruleTransition ) )
            	    // InternalStateMachine.g:263:5: (lv_transitions_10_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:263:5: (lv_transitions_10_0= ruleTransition )
            	    // InternalStateMachine.g:264:6: lv_transitions_10_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_transitions_10_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_10_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalStateMachine.g:290:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:290:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:291:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachine.g:297:1: ruleState returns [EObject current=null] : ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) ;
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
            // InternalStateMachine.g:303:2: ( ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? ) )
            // InternalStateMachine.g:304:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            {
            // InternalStateMachine.g:304:2: ( ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )? )
            // InternalStateMachine.g:305:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )? (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            {
            // InternalStateMachine.g:305:3: ( ( (lv_fail_0_0= 'fail' ) ) | ( (lv_end_1_0= 'end' ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:306:4: ( (lv_fail_0_0= 'fail' ) )
                    {
                    // InternalStateMachine.g:306:4: ( (lv_fail_0_0= 'fail' ) )
                    // InternalStateMachine.g:307:5: (lv_fail_0_0= 'fail' )
                    {
                    // InternalStateMachine.g:307:5: (lv_fail_0_0= 'fail' )
                    // InternalStateMachine.g:308:6: lv_fail_0_0= 'fail'
                    {
                    lv_fail_0_0=(Token)match(input,17,FOLLOW_11); 

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
                    // InternalStateMachine.g:321:4: ( (lv_end_1_0= 'end' ) )
                    {
                    // InternalStateMachine.g:321:4: ( (lv_end_1_0= 'end' ) )
                    // InternalStateMachine.g:322:5: (lv_end_1_0= 'end' )
                    {
                    // InternalStateMachine.g:322:5: (lv_end_1_0= 'end' )
                    // InternalStateMachine.g:323:6: lv_end_1_0= 'end'
                    {
                    lv_end_1_0=(Token)match(input,18,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachine.g:340:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStateMachine.g:341:4: (lv_name_3_0= RULE_ID )
            {
            // InternalStateMachine.g:341:4: (lv_name_3_0= RULE_ID )
            // InternalStateMachine.g:342:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalStateMachine.g:358:3: (otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:359:4: otherlv_4= 'safety' otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleSafetyProperty ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getSafetyKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getPropertiesKeyword_3_1());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalStateMachine.g:371:4: ( (lv_properties_7_0= ruleSafetyProperty ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27||LA8_0==29) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalStateMachine.g:372:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    {
                    	    // InternalStateMachine.g:372:5: (lv_properties_7_0= ruleSafetyProperty )
                    	    // InternalStateMachine.g:373:6: lv_properties_7_0= ruleSafetyProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:395:3: (otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:396:4: otherlv_9= 'with' ( (lv_machine_10_0= ruleMachine ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getWithKeyword_4_0());
                    			
                    // InternalStateMachine.g:400:4: ( (lv_machine_10_0= ruleMachine ) )
                    // InternalStateMachine.g:401:5: (lv_machine_10_0= ruleMachine )
                    {
                    // InternalStateMachine.g:401:5: (lv_machine_10_0= ruleMachine )
                    // InternalStateMachine.g:402:6: lv_machine_10_0= ruleMachine
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
    // InternalStateMachine.g:424:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:424:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:425:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateMachine.g:431:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? ) ;
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
            // InternalStateMachine.g:437:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? ) )
            // InternalStateMachine.g:438:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? )
            {
            // InternalStateMachine.g:438:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )? )
            // InternalStateMachine.g:439:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )? ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )? ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )? ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )? (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )?
            {
            // InternalStateMachine.g:439:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:440:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:440:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:441:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalStateMachine.g:456:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:457:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:457:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:458:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }

            // InternalStateMachine.g:469:3: ( ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:470:4: ( (lv_hasGuard_3_0= 'guard' ) ) ( (lv_guard_4_0= ruleExpression ) )
                    {
                    // InternalStateMachine.g:470:4: ( (lv_hasGuard_3_0= 'guard' ) )
                    // InternalStateMachine.g:471:5: (lv_hasGuard_3_0= 'guard' )
                    {
                    // InternalStateMachine.g:471:5: (lv_hasGuard_3_0= 'guard' )
                    // InternalStateMachine.g:472:6: lv_hasGuard_3_0= 'guard'
                    {
                    lv_hasGuard_3_0=(Token)match(input,22,FOLLOW_17); 

                    						newLeafNode(lv_hasGuard_3_0, grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasGuard", lv_hasGuard_3_0 != null, "guard");
                    					

                    }


                    }

                    // InternalStateMachine.g:484:4: ( (lv_guard_4_0= ruleExpression ) )
                    // InternalStateMachine.g:485:5: (lv_guard_4_0= ruleExpression )
                    {
                    // InternalStateMachine.g:485:5: (lv_guard_4_0= ruleExpression )
                    // InternalStateMachine.g:486:6: lv_guard_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalStateMachine.g:504:3: ( ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:505:4: ( (lv_hasWhen_5_0= 'when' ) ) ( (lv_when_6_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:505:4: ( (lv_hasWhen_5_0= 'when' ) )
                    // InternalStateMachine.g:506:5: (lv_hasWhen_5_0= 'when' )
                    {
                    // InternalStateMachine.g:506:5: (lv_hasWhen_5_0= 'when' )
                    // InternalStateMachine.g:507:6: lv_hasWhen_5_0= 'when'
                    {
                    lv_hasWhen_5_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_hasWhen_5_0, grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasWhen", lv_hasWhen_5_0 != null, "when");
                    					

                    }


                    }

                    // InternalStateMachine.g:519:4: ( (lv_when_6_0= RULE_ID ) )
                    // InternalStateMachine.g:520:5: (lv_when_6_0= RULE_ID )
                    {
                    // InternalStateMachine.g:520:5: (lv_when_6_0= RULE_ID )
                    // InternalStateMachine.g:521:6: lv_when_6_0= RULE_ID
                    {
                    lv_when_6_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalStateMachine.g:538:3: ( ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:539:4: ( (lv_time_7_0= 'after' ) ) ( (lv_timeout_8_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:539:4: ( (lv_time_7_0= 'after' ) )
                    // InternalStateMachine.g:540:5: (lv_time_7_0= 'after' )
                    {
                    // InternalStateMachine.g:540:5: (lv_time_7_0= 'after' )
                    // InternalStateMachine.g:541:6: lv_time_7_0= 'after'
                    {
                    lv_time_7_0=(Token)match(input,24,FOLLOW_20); 

                    						newLeafNode(lv_time_7_0, grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "time", lv_time_7_0 != null, "after");
                    					

                    }


                    }

                    // InternalStateMachine.g:553:4: ( (lv_timeout_8_0= ruleFloat ) )
                    // InternalStateMachine.g:554:5: (lv_timeout_8_0= ruleFloat )
                    {
                    // InternalStateMachine.g:554:5: (lv_timeout_8_0= ruleFloat )
                    // InternalStateMachine.g:555:6: lv_timeout_8_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalStateMachine.g:573:3: ( ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:574:4: ( (lv_hasSignal_9_0= 'signal' ) ) ( (lv_signal_10_0= RULE_ID ) )
                    {
                    // InternalStateMachine.g:574:4: ( (lv_hasSignal_9_0= 'signal' ) )
                    // InternalStateMachine.g:575:5: (lv_hasSignal_9_0= 'signal' )
                    {
                    // InternalStateMachine.g:575:5: (lv_hasSignal_9_0= 'signal' )
                    // InternalStateMachine.g:576:6: lv_hasSignal_9_0= 'signal'
                    {
                    lv_hasSignal_9_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_hasSignal_9_0, grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "hasSignal", lv_hasSignal_9_0 != null, "signal");
                    					

                    }


                    }

                    // InternalStateMachine.g:588:4: ( (lv_signal_10_0= RULE_ID ) )
                    // InternalStateMachine.g:589:5: (lv_signal_10_0= RULE_ID )
                    {
                    // InternalStateMachine.g:589:5: (lv_signal_10_0= RULE_ID )
                    // InternalStateMachine.g:590:6: lv_signal_10_0= RULE_ID
                    {
                    lv_signal_10_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalStateMachine.g:607:3: (otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStateMachine.g:608:4: otherlv_11= 'actions' otherlv_12= '{' ( (lv_actions_13_0= ruleStatement ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getActionsKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalStateMachine.g:616:4: ( (lv_actions_13_0= ruleStatement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalStateMachine.g:617:5: (lv_actions_13_0= ruleStatement )
                    	    {
                    	    // InternalStateMachine.g:617:5: (lv_actions_13_0= ruleStatement )
                    	    // InternalStateMachine.g:618:6: lv_actions_13_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransitionAccess().getActionsStatementParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_2); 

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
    // InternalStateMachine.g:644:1: entryRuleSafetyProperty returns [EObject current=null] : iv_ruleSafetyProperty= ruleSafetyProperty EOF ;
    public final EObject entryRuleSafetyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyProperty = null;


        try {
            // InternalStateMachine.g:644:55: (iv_ruleSafetyProperty= ruleSafetyProperty EOF )
            // InternalStateMachine.g:645:2: iv_ruleSafetyProperty= ruleSafetyProperty EOF
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
    // InternalStateMachine.g:651:1: ruleSafetyProperty returns [EObject current=null] : ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? ) | ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) ) ) ;
    public final EObject ruleSafetyProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_time_3_0 = null;

        EObject lv_statements_5_0 = null;

        AntlrDatatypeRuleToken lv_time_10_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:657:2: ( ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? ) | ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) ) ) )
            // InternalStateMachine.g:658:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? ) | ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) ) )
            {
            // InternalStateMachine.g:658:2: ( ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? ) | ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalStateMachine.g:659:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? )
                    {
                    // InternalStateMachine.g:659:3: ( () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )? )
                    // InternalStateMachine.g:660:4: () otherlv_1= 'startup' otherlv_2= 'delay' ( (lv_time_3_0= ruleTimeOrRange ) ) (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )?
                    {
                    // InternalStateMachine.g:660:4: ()
                    // InternalStateMachine.g:661:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2());
                    			
                    // InternalStateMachine.g:675:4: ( (lv_time_3_0= ruleTimeOrRange ) )
                    // InternalStateMachine.g:676:5: (lv_time_3_0= ruleTimeOrRange )
                    {
                    // InternalStateMachine.g:676:5: (lv_time_3_0= ruleTimeOrRange )
                    // InternalStateMachine.g:677:6: lv_time_3_0= ruleTimeOrRange
                    {

                    						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeTimeOrRangeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_time_3_0=ruleTimeOrRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_3_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.TimeOrRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:694:4: (otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==15) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalStateMachine.g:695:5: otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_23); 

                            					newLeafNode(otherlv_4, grammarAccess.getSafetyPropertyAccess().getLeftCurlyBracketKeyword_0_4_0());
                            				
                            // InternalStateMachine.g:699:5: ( (lv_statements_5_0= ruleStatement ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_ID) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalStateMachine.g:700:6: (lv_statements_5_0= ruleStatement )
                            	    {
                            	    // InternalStateMachine.g:700:6: (lv_statements_5_0= ruleStatement )
                            	    // InternalStateMachine.g:701:7: lv_statements_5_0= ruleStatement
                            	    {

                            	    							newCompositeNode(grammarAccess.getSafetyPropertyAccess().getStatementsStatementParserRuleCall_0_4_1_0());
                            	    						
                            	    pushFollow(FOLLOW_23);
                            	    lv_statements_5_0=ruleStatement();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"statements",
                            	    								lv_statements_5_0,
                            	    								"dk.sdu.mmmi.assa.sm.StateMachine.Statement");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getSafetyPropertyAccess().getRightCurlyBracketKeyword_0_4_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:725:3: ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) )
                    {
                    // InternalStateMachine.g:725:3: ( () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) ) )
                    // InternalStateMachine.g:726:4: () otherlv_8= 'max' otherlv_9= 'execution' ( (lv_time_10_0= ruleFloat ) )
                    {
                    // InternalStateMachine.g:726:4: ()
                    // InternalStateMachine.g:727:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2());
                    			
                    // InternalStateMachine.g:741:4: ( (lv_time_10_0= ruleFloat ) )
                    // InternalStateMachine.g:742:5: (lv_time_10_0= ruleFloat )
                    {
                    // InternalStateMachine.g:742:5: (lv_time_10_0= ruleFloat )
                    // InternalStateMachine.g:743:6: lv_time_10_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_time_10_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyPropertyRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_10_0,
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


    // $ANTLR start "entryRuleTimeOrRange"
    // InternalStateMachine.g:765:1: entryRuleTimeOrRange returns [EObject current=null] : iv_ruleTimeOrRange= ruleTimeOrRange EOF ;
    public final EObject entryRuleTimeOrRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeOrRange = null;


        try {
            // InternalStateMachine.g:765:52: (iv_ruleTimeOrRange= ruleTimeOrRange EOF )
            // InternalStateMachine.g:766:2: iv_ruleTimeOrRange= ruleTimeOrRange EOF
            {
             newCompositeNode(grammarAccess.getTimeOrRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeOrRange=ruleTimeOrRange();

            state._fsp--;

             current =iv_ruleTimeOrRange; 
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
    // $ANTLR end "entryRuleTimeOrRange"


    // $ANTLR start "ruleTimeOrRange"
    // InternalStateMachine.g:772:1: ruleTimeOrRange returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) ) ) ;
    public final EObject ruleTimeOrRange() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token lv_from_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:778:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) ) ) )
            // InternalStateMachine.g:779:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) ) )
            {
            // InternalStateMachine.g:779:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalStateMachine.g:780:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalStateMachine.g:780:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalStateMachine.g:781:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalStateMachine.g:781:4: ()
                    // InternalStateMachine.g:782:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeOrRangeAccess().getTimeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:788:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalStateMachine.g:789:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalStateMachine.g:789:5: (lv_value_1_0= RULE_INT )
                    // InternalStateMachine.g:790:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getTimeOrRangeAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeOrRangeRule());
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
                    // InternalStateMachine.g:808:3: ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) )
                    {
                    // InternalStateMachine.g:808:3: ( () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) ) )
                    // InternalStateMachine.g:809:4: () otherlv_3= 'from' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_INT ) )
                    {
                    // InternalStateMachine.g:809:4: ()
                    // InternalStateMachine.g:810:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeOrRangeAccess().getRangeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeOrRangeAccess().getFromKeyword_1_1());
                    			
                    // InternalStateMachine.g:820:4: ( (lv_from_4_0= RULE_INT ) )
                    // InternalStateMachine.g:821:5: (lv_from_4_0= RULE_INT )
                    {
                    // InternalStateMachine.g:821:5: (lv_from_4_0= RULE_INT )
                    // InternalStateMachine.g:822:6: lv_from_4_0= RULE_INT
                    {
                    lv_from_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_from_4_0, grammarAccess.getTimeOrRangeAccess().getFromINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeOrRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"from",
                    							lv_from_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeOrRangeAccess().getToKeyword_1_3());
                    			
                    // InternalStateMachine.g:842:4: ( (lv_to_6_0= RULE_INT ) )
                    // InternalStateMachine.g:843:5: (lv_to_6_0= RULE_INT )
                    {
                    // InternalStateMachine.g:843:5: (lv_to_6_0= RULE_INT )
                    // InternalStateMachine.g:844:6: lv_to_6_0= RULE_INT
                    {
                    lv_to_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_to_6_0, grammarAccess.getTimeOrRangeAccess().getToINTTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeOrRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"to",
                    							lv_to_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleTimeOrRange"


    // $ANTLR start "entryRuleVarDefinition"
    // InternalStateMachine.g:865:1: entryRuleVarDefinition returns [EObject current=null] : iv_ruleVarDefinition= ruleVarDefinition EOF ;
    public final EObject entryRuleVarDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDefinition = null;


        try {
            // InternalStateMachine.g:865:54: (iv_ruleVarDefinition= ruleVarDefinition EOF )
            // InternalStateMachine.g:866:2: iv_ruleVarDefinition= ruleVarDefinition EOF
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
    // InternalStateMachine.g:872:1: ruleVarDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVarDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:878:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalStateMachine.g:879:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalStateMachine.g:879:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalStateMachine.g:880:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalStateMachine.g:880:3: ( (lv_type_0_0= ruleType ) )
            // InternalStateMachine.g:881:4: (lv_type_0_0= ruleType )
            {
            // InternalStateMachine.g:881:4: (lv_type_0_0= ruleType )
            // InternalStateMachine.g:882:5: lv_type_0_0= ruleType
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

            // InternalStateMachine.g:899:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:900:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:900:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:901:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDefinitionAccess().getColonEqualsSignKeyword_2());
            		
            // InternalStateMachine.g:921:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalStateMachine.g:922:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalStateMachine.g:922:4: (lv_expression_3_0= ruleExpression )
            // InternalStateMachine.g:923:5: lv_expression_3_0= ruleExpression
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
    // InternalStateMachine.g:944:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalStateMachine.g:944:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalStateMachine.g:945:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalStateMachine.g:951:1: ruleStatement returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:957:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalStateMachine.g:958:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalStateMachine.g:958:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalStateMachine.g:959:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalStateMachine.g:959:3: ()
            // InternalStateMachine.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatementAccess().getVarAssignationAction_0(),
            					current);
            			

            }

            // InternalStateMachine.g:966:3: ( (otherlv_1= RULE_ID ) )
            // InternalStateMachine.g:967:4: (otherlv_1= RULE_ID )
            {
            // InternalStateMachine.g:967:4: (otherlv_1= RULE_ID )
            // InternalStateMachine.g:968:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getVariableVarDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_2());
            		
            // InternalStateMachine.g:983:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalStateMachine.g:984:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalStateMachine.g:984:4: (lv_expression_3_0= ruleExpression )
            // InternalStateMachine.g:985:5: lv_expression_3_0= ruleExpression
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
    // InternalStateMachine.g:1006:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalStateMachine.g:1006:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalStateMachine.g:1007:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalStateMachine.g:1013:1: ruleExpression returns [EObject current=null] : this_Equality_0= ruleEquality ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1019:2: (this_Equality_0= ruleEquality )
            // InternalStateMachine.g:1020:2: this_Equality_0= ruleEquality
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
    // InternalStateMachine.g:1031:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalStateMachine.g:1031:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalStateMachine.g:1032:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalStateMachine.g:1038:1: ruleEquality returns [EObject current=null] : (this_BoolExp_0= ruleBoolExp ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        EObject this_BoolExp_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1044:2: ( (this_BoolExp_0= ruleBoolExp ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )* ) )
            // InternalStateMachine.g:1045:2: (this_BoolExp_0= ruleBoolExp ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )* )
            {
            // InternalStateMachine.g:1045:2: (this_BoolExp_0= ruleBoolExp ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )* )
            // InternalStateMachine.g:1046:3: this_BoolExp_0= ruleBoolExp ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getBoolExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_BoolExp_0=ruleBoolExp();

            state._fsp--;


            			current = this_BoolExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1054:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=34 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStateMachine.g:1055:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) ) ( (lv_right_3_0= ruleBoolExp ) )
            	    {
            	    // InternalStateMachine.g:1055:4: ()
            	    // InternalStateMachine.g:1056:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateMachine.g:1062:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) ) )
            	    // InternalStateMachine.g:1063:5: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) )
            	    {
            	    // InternalStateMachine.g:1063:5: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' ) )
            	    // InternalStateMachine.g:1064:6: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' )
            	    {
            	    // InternalStateMachine.g:1064:6: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' )
            	    int alt21=5;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalStateMachine.g:1065:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateMachine.g:1076:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalStateMachine.g:1087:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getEqualityAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalStateMachine.g:1098:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getEqualityAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalStateMachine.g:1109:7: lv_op_2_5= '=='
            	            {
            	            lv_op_2_5=(Token)match(input,38,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalStateMachine.g:1122:4: ( (lv_right_3_0= ruleBoolExp ) )
            	    // InternalStateMachine.g:1123:5: (lv_right_3_0= ruleBoolExp )
            	    {
            	    // InternalStateMachine.g:1123:5: (lv_right_3_0= ruleBoolExp )
            	    // InternalStateMachine.g:1124:6: lv_right_3_0= ruleBoolExp
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightBoolExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleBoolExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.assa.sm.StateMachine.BoolExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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


    // $ANTLR start "entryRuleBoolExp"
    // InternalStateMachine.g:1146:1: entryRuleBoolExp returns [EObject current=null] : iv_ruleBoolExp= ruleBoolExp EOF ;
    public final EObject entryRuleBoolExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExp = null;


        try {
            // InternalStateMachine.g:1146:48: (iv_ruleBoolExp= ruleBoolExp EOF )
            // InternalStateMachine.g:1147:2: iv_ruleBoolExp= ruleBoolExp EOF
            {
             newCompositeNode(grammarAccess.getBoolExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolExp=ruleBoolExp();

            state._fsp--;

             current =iv_ruleBoolExp; 
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
    // $ANTLR end "entryRuleBoolExp"


    // $ANTLR start "ruleBoolExp"
    // InternalStateMachine.g:1153:1: ruleBoolExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleBoolExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1159:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalStateMachine.g:1160:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalStateMachine.g:1160:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalStateMachine.g:1161:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getBoolExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1169:3: ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalStateMachine.g:1170:4: () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalStateMachine.g:1170:4: ()
            	    // InternalStateMachine.g:1171:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBoolExpAccess().getBoolExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalStateMachine.g:1177:4: ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) )
            	    // InternalStateMachine.g:1178:5: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    {
            	    // InternalStateMachine.g:1178:5: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    // InternalStateMachine.g:1179:6: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    {
            	    // InternalStateMachine.g:1179:6: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==39) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==40) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalStateMachine.g:1180:7: lv_op_2_1= '||'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getBoolExpAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBoolExpRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateMachine.g:1191:7: lv_op_2_2= '&&'
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getBoolExpAccess().getOpAmpersandAmpersandKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBoolExpRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalStateMachine.g:1204:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalStateMachine.g:1205:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalStateMachine.g:1205:5: (lv_right_3_0= rulePrimary )
            	    // InternalStateMachine.g:1206:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getBoolExpAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoolExpRule());
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
            	    break loop24;
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
    // $ANTLR end "ruleBoolExp"


    // $ANTLR start "entryRulePrimary"
    // InternalStateMachine.g:1228:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalStateMachine.g:1228:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalStateMachine.g:1229:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalStateMachine.g:1235:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) ) | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_exp_8_0 = null;

        EObject this_Expression_10 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1241:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) ) | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) ) )
            // InternalStateMachine.g:1242:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) ) | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) )
            {
            // InternalStateMachine.g:1242:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= ruleBoolean ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) ) | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case 46:
            case 47:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            case 42:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalStateMachine.g:1243:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalStateMachine.g:1243:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalStateMachine.g:1244:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalStateMachine.g:1244:4: ()
                    // InternalStateMachine.g:1245:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getSMNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:1251:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalStateMachine.g:1252:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalStateMachine.g:1252:5: (lv_value_1_0= RULE_INT )
                    // InternalStateMachine.g:1253:6: lv_value_1_0= RULE_INT
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
                    // InternalStateMachine.g:1271:3: ( () ( (lv_value_3_0= ruleBoolean ) ) )
                    {
                    // InternalStateMachine.g:1271:3: ( () ( (lv_value_3_0= ruleBoolean ) ) )
                    // InternalStateMachine.g:1272:4: () ( (lv_value_3_0= ruleBoolean ) )
                    {
                    // InternalStateMachine.g:1272:4: ()
                    // InternalStateMachine.g:1273:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getSMBoolAction_1_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:1279:4: ( (lv_value_3_0= ruleBoolean ) )
                    // InternalStateMachine.g:1280:5: (lv_value_3_0= ruleBoolean )
                    {
                    // InternalStateMachine.g:1280:5: (lv_value_3_0= ruleBoolean )
                    // InternalStateMachine.g:1281:6: lv_value_3_0= ruleBoolean
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
                case 3 :
                    // InternalStateMachine.g:1300:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalStateMachine.g:1300:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    // InternalStateMachine.g:1301:4: () ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalStateMachine.g:1301:4: ()
                    // InternalStateMachine.g:1302:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVarReferenceAction_2_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:1308:4: ( (otherlv_5= RULE_ID ) )
                    // InternalStateMachine.g:1309:5: (otherlv_5= RULE_ID )
                    {
                    // InternalStateMachine.g:1309:5: (otherlv_5= RULE_ID )
                    // InternalStateMachine.g:1310:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getVariableVarDefinitionCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:1323:3: ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) )
                    {
                    // InternalStateMachine.g:1323:3: ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) ) )
                    // InternalStateMachine.g:1324:4: () otherlv_7= '!' ( (lv_exp_8_0= rulePrimary ) )
                    {
                    // InternalStateMachine.g:1324:4: ()
                    // InternalStateMachine.g:1325:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_3_1());
                    			
                    // InternalStateMachine.g:1335:4: ( (lv_exp_8_0= rulePrimary ) )
                    // InternalStateMachine.g:1336:5: (lv_exp_8_0= rulePrimary )
                    {
                    // InternalStateMachine.g:1336:5: (lv_exp_8_0= rulePrimary )
                    // InternalStateMachine.g:1337:6: lv_exp_8_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpPrimaryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_8_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_8_0,
                    							"dk.sdu.mmmi.assa.sm.StateMachine.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalStateMachine.g:1356:3: (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' )
                    {
                    // InternalStateMachine.g:1356:3: (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' )
                    // InternalStateMachine.g:1357:4: otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_32);
                    this_Expression_10=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // InternalStateMachine.g:1378:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalStateMachine.g:1378:44: (iv_ruleType= ruleType EOF )
            // InternalStateMachine.g:1379:2: iv_ruleType= ruleType EOF
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
    // InternalStateMachine.g:1385:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'bool' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1391:2: (kw= 'bool' )
            // InternalStateMachine.g:1392:2: kw= 'bool'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalStateMachine.g:1400:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalStateMachine.g:1400:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalStateMachine.g:1401:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalStateMachine.g:1407:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1413:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalStateMachine.g:1414:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalStateMachine.g:1414:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalStateMachine.g:1415:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalStateMachine.g:1422:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStateMachine.g:1423:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,45,FOLLOW_20); 

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
    // InternalStateMachine.g:1440:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalStateMachine.g:1440:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalStateMachine.g:1441:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalStateMachine.g:1447:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1453:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalStateMachine.g:1454:2: (kw= 'true' | kw= 'false' )
            {
            // InternalStateMachine.g:1454:2: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            else if ( (LA27_0==47) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalStateMachine.g:1455:3: kw= 'true'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1461:3: kw= 'false'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001000000F0010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000C60000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000002L});

}