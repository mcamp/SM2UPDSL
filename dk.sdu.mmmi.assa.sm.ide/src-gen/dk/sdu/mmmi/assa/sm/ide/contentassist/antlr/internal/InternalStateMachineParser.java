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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'project'", "'machine'", "'{'", "'}'", "'state'", "'safety'", "'properties'", "'with'", "'->'", "'startup'", "'delay'", "'max'", "'execution'", "'.'", "'fail'", "'end'", "'guard'", "'when'", "'after'", "'signal'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleRoot"
    // InternalStateMachine.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalStateMachine.g:54:1: ( ruleRoot EOF )
            // InternalStateMachine.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalStateMachine.g:62:1: ruleRoot : ( ( rule__Root__Group__0 )? ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:66:2: ( ( ( rule__Root__Group__0 )? ) )
            // InternalStateMachine.g:67:2: ( ( rule__Root__Group__0 )? )
            {
            // InternalStateMachine.g:67:2: ( ( rule__Root__Group__0 )? )
            // InternalStateMachine.g:68:3: ( rule__Root__Group__0 )?
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalStateMachine.g:69:3: ( rule__Root__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:69:4: rule__Root__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleMachine"
    // InternalStateMachine.g:78:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalStateMachine.g:79:1: ( ruleMachine EOF )
            // InternalStateMachine.g:80:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStateMachine.g:87:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:91:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalStateMachine.g:92:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalStateMachine.g:92:2: ( ( rule__Machine__Group__0 ) )
            // InternalStateMachine.g:93:3: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalStateMachine.g:94:3: ( rule__Machine__Group__0 )
            // InternalStateMachine.g:94:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateMachine.g:104:1: ( ruleState EOF )
            // InternalStateMachine.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateMachine.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateMachine.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalStateMachine.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStateMachine.g:119:3: ( rule__State__Group__0 )
            // InternalStateMachine.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalStateMachine.g:129:1: ( ruleTransition EOF )
            // InternalStateMachine.g:130:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalStateMachine.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalStateMachine.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalStateMachine.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalStateMachine.g:144:3: ( rule__Transition__Group__0 )
            // InternalStateMachine.g:144:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSafetyProperty"
    // InternalStateMachine.g:153:1: entryRuleSafetyProperty : ruleSafetyProperty EOF ;
    public final void entryRuleSafetyProperty() throws RecognitionException {
        try {
            // InternalStateMachine.g:154:1: ( ruleSafetyProperty EOF )
            // InternalStateMachine.g:155:1: ruleSafetyProperty EOF
            {
             before(grammarAccess.getSafetyPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyProperty();

            state._fsp--;

             after(grammarAccess.getSafetyPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSafetyProperty"


    // $ANTLR start "ruleSafetyProperty"
    // InternalStateMachine.g:162:1: ruleSafetyProperty : ( ( rule__SafetyProperty__Alternatives ) ) ;
    public final void ruleSafetyProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:166:2: ( ( ( rule__SafetyProperty__Alternatives ) ) )
            // InternalStateMachine.g:167:2: ( ( rule__SafetyProperty__Alternatives ) )
            {
            // InternalStateMachine.g:167:2: ( ( rule__SafetyProperty__Alternatives ) )
            // InternalStateMachine.g:168:3: ( rule__SafetyProperty__Alternatives )
            {
             before(grammarAccess.getSafetyPropertyAccess().getAlternatives()); 
            // InternalStateMachine.g:169:3: ( rule__SafetyProperty__Alternatives )
            // InternalStateMachine.g:169:4: rule__SafetyProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSafetyPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyProperty"


    // $ANTLR start "entryRuleFloat"
    // InternalStateMachine.g:178:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalStateMachine.g:179:1: ( ruleFloat EOF )
            // InternalStateMachine.g:180:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalStateMachine.g:187:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:191:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalStateMachine.g:192:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalStateMachine.g:192:2: ( ( rule__Float__Group__0 ) )
            // InternalStateMachine.g:193:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalStateMachine.g:194:3: ( rule__Float__Group__0 )
            // InternalStateMachine.g:194:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleBoolean"
    // InternalStateMachine.g:203:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalStateMachine.g:204:1: ( ruleBoolean EOF )
            // InternalStateMachine.g:205:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalStateMachine.g:212:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:216:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalStateMachine.g:217:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalStateMachine.g:217:2: ( ( rule__Boolean__Alternatives ) )
            // InternalStateMachine.g:218:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalStateMachine.g:219:3: ( rule__Boolean__Alternatives )
            // InternalStateMachine.g:219:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__Machine__Alternatives_3"
    // InternalStateMachine.g:227:1: rule__Machine__Alternatives_3 : ( ( ( rule__Machine__StatesAssignment_3_0 ) ) | ( ( rule__Machine__TransitionsAssignment_3_1 ) ) );
    public final void rule__Machine__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:231:1: ( ( ( rule__Machine__StatesAssignment_3_0 ) ) | ( ( rule__Machine__TransitionsAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17||(LA2_0>=27 && LA2_0<=28)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:232:2: ( ( rule__Machine__StatesAssignment_3_0 ) )
                    {
                    // InternalStateMachine.g:232:2: ( ( rule__Machine__StatesAssignment_3_0 ) )
                    // InternalStateMachine.g:233:3: ( rule__Machine__StatesAssignment_3_0 )
                    {
                     before(grammarAccess.getMachineAccess().getStatesAssignment_3_0()); 
                    // InternalStateMachine.g:234:3: ( rule__Machine__StatesAssignment_3_0 )
                    // InternalStateMachine.g:234:4: rule__Machine__StatesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__StatesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMachineAccess().getStatesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:238:2: ( ( rule__Machine__TransitionsAssignment_3_1 ) )
                    {
                    // InternalStateMachine.g:238:2: ( ( rule__Machine__TransitionsAssignment_3_1 ) )
                    // InternalStateMachine.g:239:3: ( rule__Machine__TransitionsAssignment_3_1 )
                    {
                     before(grammarAccess.getMachineAccess().getTransitionsAssignment_3_1()); 
                    // InternalStateMachine.g:240:3: ( rule__Machine__TransitionsAssignment_3_1 )
                    // InternalStateMachine.g:240:4: rule__Machine__TransitionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__TransitionsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMachineAccess().getTransitionsAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Alternatives_3"


    // $ANTLR start "rule__State__Alternatives_0"
    // InternalStateMachine.g:248:1: rule__State__Alternatives_0 : ( ( ( rule__State__FailAssignment_0_0 ) ) | ( ( rule__State__EndAssignment_0_1 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:252:1: ( ( ( rule__State__FailAssignment_0_0 ) ) | ( ( rule__State__EndAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:253:2: ( ( rule__State__FailAssignment_0_0 ) )
                    {
                    // InternalStateMachine.g:253:2: ( ( rule__State__FailAssignment_0_0 ) )
                    // InternalStateMachine.g:254:3: ( rule__State__FailAssignment_0_0 )
                    {
                     before(grammarAccess.getStateAccess().getFailAssignment_0_0()); 
                    // InternalStateMachine.g:255:3: ( rule__State__FailAssignment_0_0 )
                    // InternalStateMachine.g:255:4: rule__State__FailAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__FailAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getFailAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:259:2: ( ( rule__State__EndAssignment_0_1 ) )
                    {
                    // InternalStateMachine.g:259:2: ( ( rule__State__EndAssignment_0_1 ) )
                    // InternalStateMachine.g:260:3: ( rule__State__EndAssignment_0_1 )
                    {
                     before(grammarAccess.getStateAccess().getEndAssignment_0_1()); 
                    // InternalStateMachine.g:261:3: ( rule__State__EndAssignment_0_1 )
                    // InternalStateMachine.g:261:4: rule__State__EndAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__EndAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getEndAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives_0"


    // $ANTLR start "rule__SafetyProperty__Alternatives"
    // InternalStateMachine.g:269:1: rule__SafetyProperty__Alternatives : ( ( ( rule__SafetyProperty__Group_0__0 ) ) | ( ( rule__SafetyProperty__Group_1__0 ) ) );
    public final void rule__SafetyProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:273:1: ( ( ( rule__SafetyProperty__Group_0__0 ) ) | ( ( rule__SafetyProperty__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:274:2: ( ( rule__SafetyProperty__Group_0__0 ) )
                    {
                    // InternalStateMachine.g:274:2: ( ( rule__SafetyProperty__Group_0__0 ) )
                    // InternalStateMachine.g:275:3: ( rule__SafetyProperty__Group_0__0 )
                    {
                     before(grammarAccess.getSafetyPropertyAccess().getGroup_0()); 
                    // InternalStateMachine.g:276:3: ( rule__SafetyProperty__Group_0__0 )
                    // InternalStateMachine.g:276:4: rule__SafetyProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSafetyPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:280:2: ( ( rule__SafetyProperty__Group_1__0 ) )
                    {
                    // InternalStateMachine.g:280:2: ( ( rule__SafetyProperty__Group_1__0 ) )
                    // InternalStateMachine.g:281:3: ( rule__SafetyProperty__Group_1__0 )
                    {
                     before(grammarAccess.getSafetyPropertyAccess().getGroup_1()); 
                    // InternalStateMachine.g:282:3: ( rule__SafetyProperty__Group_1__0 )
                    // InternalStateMachine.g:282:4: rule__SafetyProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSafetyPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalStateMachine.g:290:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:294:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:295:2: ( 'true' )
                    {
                    // InternalStateMachine.g:295:2: ( 'true' )
                    // InternalStateMachine.g:296:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:301:2: ( 'false' )
                    {
                    // InternalStateMachine.g:301:2: ( 'false' )
                    // InternalStateMachine.g:302:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalStateMachine.g:311:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:315:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalStateMachine.g:316:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalStateMachine.g:323:1: rule__Root__Group__0__Impl : ( 'project' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:327:1: ( ( 'project' ) )
            // InternalStateMachine.g:328:1: ( 'project' )
            {
            // InternalStateMachine.g:328:1: ( 'project' )
            // InternalStateMachine.g:329:2: 'project'
            {
             before(grammarAccess.getRootAccess().getProjectKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalStateMachine.g:338:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:342:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalStateMachine.g:343:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalStateMachine.g:350:1: rule__Root__Group__1__Impl : ( ( rule__Root__NameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:354:1: ( ( ( rule__Root__NameAssignment_1 ) ) )
            // InternalStateMachine.g:355:1: ( ( rule__Root__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:355:1: ( ( rule__Root__NameAssignment_1 ) )
            // InternalStateMachine.g:356:2: ( rule__Root__NameAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:357:2: ( rule__Root__NameAssignment_1 )
            // InternalStateMachine.g:357:3: rule__Root__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalStateMachine.g:365:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:369:1: ( rule__Root__Group__2__Impl )
            // InternalStateMachine.g:370:2: rule__Root__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalStateMachine.g:376:1: rule__Root__Group__2__Impl : ( ( rule__Root__MachinesAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:380:1: ( ( ( rule__Root__MachinesAssignment_2 )* ) )
            // InternalStateMachine.g:381:1: ( ( rule__Root__MachinesAssignment_2 )* )
            {
            // InternalStateMachine.g:381:1: ( ( rule__Root__MachinesAssignment_2 )* )
            // InternalStateMachine.g:382:2: ( rule__Root__MachinesAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getMachinesAssignment_2()); 
            // InternalStateMachine.g:383:2: ( rule__Root__MachinesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateMachine.g:383:3: rule__Root__MachinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Root__MachinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getMachinesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalStateMachine.g:392:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:396:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalStateMachine.g:397:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalStateMachine.g:404:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:408:1: ( ( 'machine' ) )
            // InternalStateMachine.g:409:1: ( 'machine' )
            {
            // InternalStateMachine.g:409:1: ( 'machine' )
            // InternalStateMachine.g:410:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalStateMachine.g:419:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:423:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalStateMachine.g:424:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalStateMachine.g:431:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:435:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalStateMachine.g:436:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:436:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalStateMachine.g:437:2: ( rule__Machine__NameAssignment_1 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:438:2: ( rule__Machine__NameAssignment_1 )
            // InternalStateMachine.g:438:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalStateMachine.g:446:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:450:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalStateMachine.g:451:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalStateMachine.g:458:1: rule__Machine__Group__2__Impl : ( '{' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:462:1: ( ( '{' ) )
            // InternalStateMachine.g:463:1: ( '{' )
            {
            // InternalStateMachine.g:463:1: ( '{' )
            // InternalStateMachine.g:464:2: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalStateMachine.g:473:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:477:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalStateMachine.g:478:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalStateMachine.g:485:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Alternatives_3 )* ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:489:1: ( ( ( rule__Machine__Alternatives_3 )* ) )
            // InternalStateMachine.g:490:1: ( ( rule__Machine__Alternatives_3 )* )
            {
            // InternalStateMachine.g:490:1: ( ( rule__Machine__Alternatives_3 )* )
            // InternalStateMachine.g:491:2: ( rule__Machine__Alternatives_3 )*
            {
             before(grammarAccess.getMachineAccess().getAlternatives_3()); 
            // InternalStateMachine.g:492:2: ( rule__Machine__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==17||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateMachine.g:492:3: rule__Machine__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalStateMachine.g:500:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:504:1: ( rule__Machine__Group__4__Impl )
            // InternalStateMachine.g:505:2: rule__Machine__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalStateMachine.g:511:1: rule__Machine__Group__4__Impl : ( '}' ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:515:1: ( ( '}' ) )
            // InternalStateMachine.g:516:1: ( '}' )
            {
            // InternalStateMachine.g:516:1: ( '}' )
            // InternalStateMachine.g:517:2: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStateMachine.g:527:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:531:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateMachine.g:532:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStateMachine.g:539:1: rule__State__Group__0__Impl : ( ( rule__State__Alternatives_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:543:1: ( ( ( rule__State__Alternatives_0 )? ) )
            // InternalStateMachine.g:544:1: ( ( rule__State__Alternatives_0 )? )
            {
            // InternalStateMachine.g:544:1: ( ( rule__State__Alternatives_0 )? )
            // InternalStateMachine.g:545:2: ( rule__State__Alternatives_0 )?
            {
             before(grammarAccess.getStateAccess().getAlternatives_0()); 
            // InternalStateMachine.g:546:2: ( rule__State__Alternatives_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:546:3: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStateMachine.g:554:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:558:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalStateMachine.g:559:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStateMachine.g:566:1: rule__State__Group__1__Impl : ( 'state' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:570:1: ( ( 'state' ) )
            // InternalStateMachine.g:571:1: ( 'state' )
            {
            // InternalStateMachine.g:571:1: ( 'state' )
            // InternalStateMachine.g:572:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalStateMachine.g:581:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:585:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalStateMachine.g:586:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalStateMachine.g:593:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:597:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalStateMachine.g:598:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalStateMachine.g:598:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalStateMachine.g:599:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalStateMachine.g:600:2: ( rule__State__NameAssignment_2 )
            // InternalStateMachine.g:600:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalStateMachine.g:608:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:612:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalStateMachine.g:613:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalStateMachine.g:620:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:624:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalStateMachine.g:625:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalStateMachine.g:625:1: ( ( rule__State__Group_3__0 )? )
            // InternalStateMachine.g:626:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalStateMachine.g:627:2: ( rule__State__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:627:3: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalStateMachine.g:635:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:639:1: ( rule__State__Group__4__Impl )
            // InternalStateMachine.g:640:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalStateMachine.g:646:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:650:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalStateMachine.g:651:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalStateMachine.g:651:1: ( ( rule__State__Group_4__0 )? )
            // InternalStateMachine.g:652:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalStateMachine.g:653:2: ( rule__State__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:653:3: rule__State__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalStateMachine.g:662:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:666:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalStateMachine.g:667:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalStateMachine.g:674:1: rule__State__Group_3__0__Impl : ( 'safety' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:678:1: ( ( 'safety' ) )
            // InternalStateMachine.g:679:1: ( 'safety' )
            {
            // InternalStateMachine.g:679:1: ( 'safety' )
            // InternalStateMachine.g:680:2: 'safety'
            {
             before(grammarAccess.getStateAccess().getSafetyKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getSafetyKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalStateMachine.g:689:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:693:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalStateMachine.g:694:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalStateMachine.g:701:1: rule__State__Group_3__1__Impl : ( 'properties' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:705:1: ( ( 'properties' ) )
            // InternalStateMachine.g:706:1: ( 'properties' )
            {
            // InternalStateMachine.g:706:1: ( 'properties' )
            // InternalStateMachine.g:707:2: 'properties'
            {
             before(grammarAccess.getStateAccess().getPropertiesKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getPropertiesKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_3__2"
    // InternalStateMachine.g:716:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:720:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalStateMachine.g:721:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // InternalStateMachine.g:728:1: rule__State__Group_3__2__Impl : ( '{' ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:732:1: ( ( '{' ) )
            // InternalStateMachine.g:733:1: ( '{' )
            {
            // InternalStateMachine.g:733:1: ( '{' )
            // InternalStateMachine.g:734:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__State__Group_3__3"
    // InternalStateMachine.g:743:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl rule__State__Group_3__4 ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:747:1: ( rule__State__Group_3__3__Impl rule__State__Group_3__4 )
            // InternalStateMachine.g:748:2: rule__State__Group_3__3__Impl rule__State__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__State__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3"


    // $ANTLR start "rule__State__Group_3__3__Impl"
    // InternalStateMachine.g:755:1: rule__State__Group_3__3__Impl : ( ( rule__State__PropertiesAssignment_3_3 )* ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:759:1: ( ( ( rule__State__PropertiesAssignment_3_3 )* ) )
            // InternalStateMachine.g:760:1: ( ( rule__State__PropertiesAssignment_3_3 )* )
            {
            // InternalStateMachine.g:760:1: ( ( rule__State__PropertiesAssignment_3_3 )* )
            // InternalStateMachine.g:761:2: ( rule__State__PropertiesAssignment_3_3 )*
            {
             before(grammarAccess.getStateAccess().getPropertiesAssignment_3_3()); 
            // InternalStateMachine.g:762:2: ( rule__State__PropertiesAssignment_3_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateMachine.g:762:3: rule__State__PropertiesAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__State__PropertiesAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getPropertiesAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3__Impl"


    // $ANTLR start "rule__State__Group_3__4"
    // InternalStateMachine.g:770:1: rule__State__Group_3__4 : rule__State__Group_3__4__Impl ;
    public final void rule__State__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:774:1: ( rule__State__Group_3__4__Impl )
            // InternalStateMachine.g:775:2: rule__State__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__4"


    // $ANTLR start "rule__State__Group_3__4__Impl"
    // InternalStateMachine.g:781:1: rule__State__Group_3__4__Impl : ( '}' ) ;
    public final void rule__State__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:785:1: ( ( '}' ) )
            // InternalStateMachine.g:786:1: ( '}' )
            {
            // InternalStateMachine.g:786:1: ( '}' )
            // InternalStateMachine.g:787:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__4__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // InternalStateMachine.g:797:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:801:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalStateMachine.g:802:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // InternalStateMachine.g:809:1: rule__State__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:813:1: ( ( 'with' ) )
            // InternalStateMachine.g:814:1: ( 'with' )
            {
            // InternalStateMachine.g:814:1: ( 'with' )
            // InternalStateMachine.g:815:2: 'with'
            {
             before(grammarAccess.getStateAccess().getWithKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getWithKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // InternalStateMachine.g:824:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:828:1: ( rule__State__Group_4__1__Impl )
            // InternalStateMachine.g:829:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // InternalStateMachine.g:835:1: rule__State__Group_4__1__Impl : ( ( rule__State__MachineAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:839:1: ( ( ( rule__State__MachineAssignment_4_1 ) ) )
            // InternalStateMachine.g:840:1: ( ( rule__State__MachineAssignment_4_1 ) )
            {
            // InternalStateMachine.g:840:1: ( ( rule__State__MachineAssignment_4_1 ) )
            // InternalStateMachine.g:841:2: ( rule__State__MachineAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getMachineAssignment_4_1()); 
            // InternalStateMachine.g:842:2: ( rule__State__MachineAssignment_4_1 )
            // InternalStateMachine.g:842:3: rule__State__MachineAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__State__MachineAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getMachineAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalStateMachine.g:851:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:855:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStateMachine.g:856:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalStateMachine.g:863:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__FromAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:867:1: ( ( ( rule__Transition__FromAssignment_0 ) ) )
            // InternalStateMachine.g:868:1: ( ( rule__Transition__FromAssignment_0 ) )
            {
            // InternalStateMachine.g:868:1: ( ( rule__Transition__FromAssignment_0 ) )
            // InternalStateMachine.g:869:2: ( rule__Transition__FromAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_0()); 
            // InternalStateMachine.g:870:2: ( rule__Transition__FromAssignment_0 )
            // InternalStateMachine.g:870:3: rule__Transition__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalStateMachine.g:878:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:882:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStateMachine.g:883:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalStateMachine.g:890:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:894:1: ( ( '->' ) )
            // InternalStateMachine.g:895:1: ( '->' )
            {
            // InternalStateMachine.g:895:1: ( '->' )
            // InternalStateMachine.g:896:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalStateMachine.g:905:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:909:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStateMachine.g:910:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalStateMachine.g:917:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ToAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:921:1: ( ( ( rule__Transition__ToAssignment_2 ) ) )
            // InternalStateMachine.g:922:1: ( ( rule__Transition__ToAssignment_2 ) )
            {
            // InternalStateMachine.g:922:1: ( ( rule__Transition__ToAssignment_2 ) )
            // InternalStateMachine.g:923:2: ( rule__Transition__ToAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_2()); 
            // InternalStateMachine.g:924:2: ( rule__Transition__ToAssignment_2 )
            // InternalStateMachine.g:924:3: rule__Transition__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalStateMachine.g:932:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:936:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalStateMachine.g:937:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalStateMachine.g:944:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:948:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalStateMachine.g:949:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalStateMachine.g:949:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalStateMachine.g:950:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalStateMachine.g:951:2: ( rule__Transition__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:951:3: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalStateMachine.g:959:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:963:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalStateMachine.g:964:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalStateMachine.g:971:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:975:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalStateMachine.g:976:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalStateMachine.g:976:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalStateMachine.g:977:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalStateMachine.g:978:2: ( rule__Transition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:978:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalStateMachine.g:986:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:990:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalStateMachine.g:991:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalStateMachine.g:998:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1002:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalStateMachine.g:1003:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalStateMachine.g:1003:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalStateMachine.g:1004:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalStateMachine.g:1005:2: ( rule__Transition__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:1005:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalStateMachine.g:1013:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1017:1: ( rule__Transition__Group__6__Impl )
            // InternalStateMachine.g:1018:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalStateMachine.g:1024:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1028:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // InternalStateMachine.g:1029:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // InternalStateMachine.g:1029:1: ( ( rule__Transition__Group_6__0 )? )
            // InternalStateMachine.g:1030:2: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalStateMachine.g:1031:2: ( rule__Transition__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStateMachine.g:1031:3: rule__Transition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalStateMachine.g:1040:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1044:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalStateMachine.g:1045:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalStateMachine.g:1052:1: rule__Transition__Group_3__0__Impl : ( ( rule__Transition__HasGuardAssignment_3_0 ) ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1056:1: ( ( ( rule__Transition__HasGuardAssignment_3_0 ) ) )
            // InternalStateMachine.g:1057:1: ( ( rule__Transition__HasGuardAssignment_3_0 ) )
            {
            // InternalStateMachine.g:1057:1: ( ( rule__Transition__HasGuardAssignment_3_0 ) )
            // InternalStateMachine.g:1058:2: ( rule__Transition__HasGuardAssignment_3_0 )
            {
             before(grammarAccess.getTransitionAccess().getHasGuardAssignment_3_0()); 
            // InternalStateMachine.g:1059:2: ( rule__Transition__HasGuardAssignment_3_0 )
            // InternalStateMachine.g:1059:3: rule__Transition__HasGuardAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HasGuardAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHasGuardAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalStateMachine.g:1067:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1071:1: ( rule__Transition__Group_3__1__Impl )
            // InternalStateMachine.g:1072:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalStateMachine.g:1078:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__GuardAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1082:1: ( ( ( rule__Transition__GuardAssignment_3_1 ) ) )
            // InternalStateMachine.g:1083:1: ( ( rule__Transition__GuardAssignment_3_1 ) )
            {
            // InternalStateMachine.g:1083:1: ( ( rule__Transition__GuardAssignment_3_1 ) )
            // InternalStateMachine.g:1084:2: ( rule__Transition__GuardAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_3_1()); 
            // InternalStateMachine.g:1085:2: ( rule__Transition__GuardAssignment_3_1 )
            // InternalStateMachine.g:1085:3: rule__Transition__GuardAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__GuardAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalStateMachine.g:1094:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1098:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalStateMachine.g:1099:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalStateMachine.g:1106:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__HasWhenAssignment_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1110:1: ( ( ( rule__Transition__HasWhenAssignment_4_0 ) ) )
            // InternalStateMachine.g:1111:1: ( ( rule__Transition__HasWhenAssignment_4_0 ) )
            {
            // InternalStateMachine.g:1111:1: ( ( rule__Transition__HasWhenAssignment_4_0 ) )
            // InternalStateMachine.g:1112:2: ( rule__Transition__HasWhenAssignment_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getHasWhenAssignment_4_0()); 
            // InternalStateMachine.g:1113:2: ( rule__Transition__HasWhenAssignment_4_0 )
            // InternalStateMachine.g:1113:3: rule__Transition__HasWhenAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HasWhenAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHasWhenAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalStateMachine.g:1121:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1125:1: ( rule__Transition__Group_4__1__Impl )
            // InternalStateMachine.g:1126:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalStateMachine.g:1132:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__WhenAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1136:1: ( ( ( rule__Transition__WhenAssignment_4_1 ) ) )
            // InternalStateMachine.g:1137:1: ( ( rule__Transition__WhenAssignment_4_1 ) )
            {
            // InternalStateMachine.g:1137:1: ( ( rule__Transition__WhenAssignment_4_1 ) )
            // InternalStateMachine.g:1138:2: ( rule__Transition__WhenAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getWhenAssignment_4_1()); 
            // InternalStateMachine.g:1139:2: ( rule__Transition__WhenAssignment_4_1 )
            // InternalStateMachine.g:1139:3: rule__Transition__WhenAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__WhenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getWhenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalStateMachine.g:1148:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1152:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalStateMachine.g:1153:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalStateMachine.g:1160:1: rule__Transition__Group_5__0__Impl : ( ( rule__Transition__TimeAssignment_5_0 ) ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1164:1: ( ( ( rule__Transition__TimeAssignment_5_0 ) ) )
            // InternalStateMachine.g:1165:1: ( ( rule__Transition__TimeAssignment_5_0 ) )
            {
            // InternalStateMachine.g:1165:1: ( ( rule__Transition__TimeAssignment_5_0 ) )
            // InternalStateMachine.g:1166:2: ( rule__Transition__TimeAssignment_5_0 )
            {
             before(grammarAccess.getTransitionAccess().getTimeAssignment_5_0()); 
            // InternalStateMachine.g:1167:2: ( rule__Transition__TimeAssignment_5_0 )
            // InternalStateMachine.g:1167:3: rule__Transition__TimeAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalStateMachine.g:1175:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1179:1: ( rule__Transition__Group_5__1__Impl )
            // InternalStateMachine.g:1180:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalStateMachine.g:1186:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__TimeoutAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1190:1: ( ( ( rule__Transition__TimeoutAssignment_5_1 ) ) )
            // InternalStateMachine.g:1191:1: ( ( rule__Transition__TimeoutAssignment_5_1 ) )
            {
            // InternalStateMachine.g:1191:1: ( ( rule__Transition__TimeoutAssignment_5_1 ) )
            // InternalStateMachine.g:1192:2: ( rule__Transition__TimeoutAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getTimeoutAssignment_5_1()); 
            // InternalStateMachine.g:1193:2: ( rule__Transition__TimeoutAssignment_5_1 )
            // InternalStateMachine.g:1193:3: rule__Transition__TimeoutAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeoutAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeoutAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_6__0"
    // InternalStateMachine.g:1202:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1206:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalStateMachine.g:1207:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0"


    // $ANTLR start "rule__Transition__Group_6__0__Impl"
    // InternalStateMachine.g:1214:1: rule__Transition__Group_6__0__Impl : ( ( rule__Transition__HasSignalAssignment_6_0 ) ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1218:1: ( ( ( rule__Transition__HasSignalAssignment_6_0 ) ) )
            // InternalStateMachine.g:1219:1: ( ( rule__Transition__HasSignalAssignment_6_0 ) )
            {
            // InternalStateMachine.g:1219:1: ( ( rule__Transition__HasSignalAssignment_6_0 ) )
            // InternalStateMachine.g:1220:2: ( rule__Transition__HasSignalAssignment_6_0 )
            {
             before(grammarAccess.getTransitionAccess().getHasSignalAssignment_6_0()); 
            // InternalStateMachine.g:1221:2: ( rule__Transition__HasSignalAssignment_6_0 )
            // InternalStateMachine.g:1221:3: rule__Transition__HasSignalAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HasSignalAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHasSignalAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0__Impl"


    // $ANTLR start "rule__Transition__Group_6__1"
    // InternalStateMachine.g:1229:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1233:1: ( rule__Transition__Group_6__1__Impl )
            // InternalStateMachine.g:1234:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1"


    // $ANTLR start "rule__Transition__Group_6__1__Impl"
    // InternalStateMachine.g:1240:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SignalAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1244:1: ( ( ( rule__Transition__SignalAssignment_6_1 ) ) )
            // InternalStateMachine.g:1245:1: ( ( rule__Transition__SignalAssignment_6_1 ) )
            {
            // InternalStateMachine.g:1245:1: ( ( rule__Transition__SignalAssignment_6_1 ) )
            // InternalStateMachine.g:1246:2: ( rule__Transition__SignalAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSignalAssignment_6_1()); 
            // InternalStateMachine.g:1247:2: ( rule__Transition__SignalAssignment_6_1 )
            // InternalStateMachine.g:1247:3: rule__Transition__SignalAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SignalAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSignalAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_0__0"
    // InternalStateMachine.g:1256:1: rule__SafetyProperty__Group_0__0 : rule__SafetyProperty__Group_0__0__Impl rule__SafetyProperty__Group_0__1 ;
    public final void rule__SafetyProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1260:1: ( rule__SafetyProperty__Group_0__0__Impl rule__SafetyProperty__Group_0__1 )
            // InternalStateMachine.g:1261:2: rule__SafetyProperty__Group_0__0__Impl rule__SafetyProperty__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__SafetyProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__0"


    // $ANTLR start "rule__SafetyProperty__Group_0__0__Impl"
    // InternalStateMachine.g:1268:1: rule__SafetyProperty__Group_0__0__Impl : ( () ) ;
    public final void rule__SafetyProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1272:1: ( ( () ) )
            // InternalStateMachine.g:1273:1: ( () )
            {
            // InternalStateMachine.g:1273:1: ( () )
            // InternalStateMachine.g:1274:2: ()
            {
             before(grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0()); 
            // InternalStateMachine.g:1275:2: ()
            // InternalStateMachine.g:1275:3: 
            {
            }

             after(grammarAccess.getSafetyPropertyAccess().getDelayAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__0__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_0__1"
    // InternalStateMachine.g:1283:1: rule__SafetyProperty__Group_0__1 : rule__SafetyProperty__Group_0__1__Impl rule__SafetyProperty__Group_0__2 ;
    public final void rule__SafetyProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1287:1: ( rule__SafetyProperty__Group_0__1__Impl rule__SafetyProperty__Group_0__2 )
            // InternalStateMachine.g:1288:2: rule__SafetyProperty__Group_0__1__Impl rule__SafetyProperty__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__SafetyProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__1"


    // $ANTLR start "rule__SafetyProperty__Group_0__1__Impl"
    // InternalStateMachine.g:1295:1: rule__SafetyProperty__Group_0__1__Impl : ( 'startup' ) ;
    public final void rule__SafetyProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1299:1: ( ( 'startup' ) )
            // InternalStateMachine.g:1300:1: ( 'startup' )
            {
            // InternalStateMachine.g:1300:1: ( 'startup' )
            // InternalStateMachine.g:1301:2: 'startup'
            {
             before(grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSafetyPropertyAccess().getStartupKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__1__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_0__2"
    // InternalStateMachine.g:1310:1: rule__SafetyProperty__Group_0__2 : rule__SafetyProperty__Group_0__2__Impl rule__SafetyProperty__Group_0__3 ;
    public final void rule__SafetyProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1314:1: ( rule__SafetyProperty__Group_0__2__Impl rule__SafetyProperty__Group_0__3 )
            // InternalStateMachine.g:1315:2: rule__SafetyProperty__Group_0__2__Impl rule__SafetyProperty__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__SafetyProperty__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__2"


    // $ANTLR start "rule__SafetyProperty__Group_0__2__Impl"
    // InternalStateMachine.g:1322:1: rule__SafetyProperty__Group_0__2__Impl : ( 'delay' ) ;
    public final void rule__SafetyProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1326:1: ( ( 'delay' ) )
            // InternalStateMachine.g:1327:1: ( 'delay' )
            {
            // InternalStateMachine.g:1327:1: ( 'delay' )
            // InternalStateMachine.g:1328:2: 'delay'
            {
             before(grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSafetyPropertyAccess().getDelayKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__2__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_0__3"
    // InternalStateMachine.g:1337:1: rule__SafetyProperty__Group_0__3 : rule__SafetyProperty__Group_0__3__Impl ;
    public final void rule__SafetyProperty__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1341:1: ( rule__SafetyProperty__Group_0__3__Impl )
            // InternalStateMachine.g:1342:2: rule__SafetyProperty__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__3"


    // $ANTLR start "rule__SafetyProperty__Group_0__3__Impl"
    // InternalStateMachine.g:1348:1: rule__SafetyProperty__Group_0__3__Impl : ( ( rule__SafetyProperty__TimeAssignment_0_3 ) ) ;
    public final void rule__SafetyProperty__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1352:1: ( ( ( rule__SafetyProperty__TimeAssignment_0_3 ) ) )
            // InternalStateMachine.g:1353:1: ( ( rule__SafetyProperty__TimeAssignment_0_3 ) )
            {
            // InternalStateMachine.g:1353:1: ( ( rule__SafetyProperty__TimeAssignment_0_3 ) )
            // InternalStateMachine.g:1354:2: ( rule__SafetyProperty__TimeAssignment_0_3 )
            {
             before(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_0_3()); 
            // InternalStateMachine.g:1355:2: ( rule__SafetyProperty__TimeAssignment_0_3 )
            // InternalStateMachine.g:1355:3: rule__SafetyProperty__TimeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SafetyProperty__TimeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_0__3__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_1__0"
    // InternalStateMachine.g:1364:1: rule__SafetyProperty__Group_1__0 : rule__SafetyProperty__Group_1__0__Impl rule__SafetyProperty__Group_1__1 ;
    public final void rule__SafetyProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1368:1: ( rule__SafetyProperty__Group_1__0__Impl rule__SafetyProperty__Group_1__1 )
            // InternalStateMachine.g:1369:2: rule__SafetyProperty__Group_1__0__Impl rule__SafetyProperty__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__SafetyProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__0"


    // $ANTLR start "rule__SafetyProperty__Group_1__0__Impl"
    // InternalStateMachine.g:1376:1: rule__SafetyProperty__Group_1__0__Impl : ( () ) ;
    public final void rule__SafetyProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1380:1: ( ( () ) )
            // InternalStateMachine.g:1381:1: ( () )
            {
            // InternalStateMachine.g:1381:1: ( () )
            // InternalStateMachine.g:1382:2: ()
            {
             before(grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0()); 
            // InternalStateMachine.g:1383:2: ()
            // InternalStateMachine.g:1383:3: 
            {
            }

             after(grammarAccess.getSafetyPropertyAccess().getMaxExecutionTimeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__0__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_1__1"
    // InternalStateMachine.g:1391:1: rule__SafetyProperty__Group_1__1 : rule__SafetyProperty__Group_1__1__Impl rule__SafetyProperty__Group_1__2 ;
    public final void rule__SafetyProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1395:1: ( rule__SafetyProperty__Group_1__1__Impl rule__SafetyProperty__Group_1__2 )
            // InternalStateMachine.g:1396:2: rule__SafetyProperty__Group_1__1__Impl rule__SafetyProperty__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__SafetyProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__1"


    // $ANTLR start "rule__SafetyProperty__Group_1__1__Impl"
    // InternalStateMachine.g:1403:1: rule__SafetyProperty__Group_1__1__Impl : ( 'max' ) ;
    public final void rule__SafetyProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1407:1: ( ( 'max' ) )
            // InternalStateMachine.g:1408:1: ( 'max' )
            {
            // InternalStateMachine.g:1408:1: ( 'max' )
            // InternalStateMachine.g:1409:2: 'max'
            {
             before(grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSafetyPropertyAccess().getMaxKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__1__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_1__2"
    // InternalStateMachine.g:1418:1: rule__SafetyProperty__Group_1__2 : rule__SafetyProperty__Group_1__2__Impl rule__SafetyProperty__Group_1__3 ;
    public final void rule__SafetyProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1422:1: ( rule__SafetyProperty__Group_1__2__Impl rule__SafetyProperty__Group_1__3 )
            // InternalStateMachine.g:1423:2: rule__SafetyProperty__Group_1__2__Impl rule__SafetyProperty__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__SafetyProperty__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__2"


    // $ANTLR start "rule__SafetyProperty__Group_1__2__Impl"
    // InternalStateMachine.g:1430:1: rule__SafetyProperty__Group_1__2__Impl : ( 'execution' ) ;
    public final void rule__SafetyProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1434:1: ( ( 'execution' ) )
            // InternalStateMachine.g:1435:1: ( 'execution' )
            {
            // InternalStateMachine.g:1435:1: ( 'execution' )
            // InternalStateMachine.g:1436:2: 'execution'
            {
             before(grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSafetyPropertyAccess().getExecutionKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__2__Impl"


    // $ANTLR start "rule__SafetyProperty__Group_1__3"
    // InternalStateMachine.g:1445:1: rule__SafetyProperty__Group_1__3 : rule__SafetyProperty__Group_1__3__Impl ;
    public final void rule__SafetyProperty__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1449:1: ( rule__SafetyProperty__Group_1__3__Impl )
            // InternalStateMachine.g:1450:2: rule__SafetyProperty__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyProperty__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__3"


    // $ANTLR start "rule__SafetyProperty__Group_1__3__Impl"
    // InternalStateMachine.g:1456:1: rule__SafetyProperty__Group_1__3__Impl : ( ( rule__SafetyProperty__TimeAssignment_1_3 ) ) ;
    public final void rule__SafetyProperty__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1460:1: ( ( ( rule__SafetyProperty__TimeAssignment_1_3 ) ) )
            // InternalStateMachine.g:1461:1: ( ( rule__SafetyProperty__TimeAssignment_1_3 ) )
            {
            // InternalStateMachine.g:1461:1: ( ( rule__SafetyProperty__TimeAssignment_1_3 ) )
            // InternalStateMachine.g:1462:2: ( rule__SafetyProperty__TimeAssignment_1_3 )
            {
             before(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_1_3()); 
            // InternalStateMachine.g:1463:2: ( rule__SafetyProperty__TimeAssignment_1_3 )
            // InternalStateMachine.g:1463:3: rule__SafetyProperty__TimeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SafetyProperty__TimeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSafetyPropertyAccess().getTimeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__Group_1__3__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalStateMachine.g:1472:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1476:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalStateMachine.g:1477:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalStateMachine.g:1484:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1488:1: ( ( RULE_INT ) )
            // InternalStateMachine.g:1489:1: ( RULE_INT )
            {
            // InternalStateMachine.g:1489:1: ( RULE_INT )
            // InternalStateMachine.g:1490:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalStateMachine.g:1499:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1503:1: ( rule__Float__Group__1__Impl )
            // InternalStateMachine.g:1504:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalStateMachine.g:1510:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1514:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalStateMachine.g:1515:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalStateMachine.g:1515:1: ( ( rule__Float__Group_1__0 )? )
            // InternalStateMachine.g:1516:2: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalStateMachine.g:1517:2: ( rule__Float__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStateMachine.g:1517:3: rule__Float__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group_1__0"
    // InternalStateMachine.g:1526:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1530:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalStateMachine.g:1531:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Float__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0"


    // $ANTLR start "rule__Float__Group_1__0__Impl"
    // InternalStateMachine.g:1538:1: rule__Float__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1542:1: ( ( '.' ) )
            // InternalStateMachine.g:1543:1: ( '.' )
            {
            // InternalStateMachine.g:1543:1: ( '.' )
            // InternalStateMachine.g:1544:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0__Impl"


    // $ANTLR start "rule__Float__Group_1__1"
    // InternalStateMachine.g:1553:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1557:1: ( rule__Float__Group_1__1__Impl )
            // InternalStateMachine.g:1558:2: rule__Float__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1"


    // $ANTLR start "rule__Float__Group_1__1__Impl"
    // InternalStateMachine.g:1564:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1568:1: ( ( RULE_INT ) )
            // InternalStateMachine.g:1569:1: ( RULE_INT )
            {
            // InternalStateMachine.g:1569:1: ( RULE_INT )
            // InternalStateMachine.g:1570:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1__Impl"


    // $ANTLR start "rule__Root__NameAssignment_1"
    // InternalStateMachine.g:1580:1: rule__Root__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Root__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1584:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1585:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1585:2: ( RULE_ID )
            // InternalStateMachine.g:1586:3: RULE_ID
            {
             before(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NameAssignment_1"


    // $ANTLR start "rule__Root__MachinesAssignment_2"
    // InternalStateMachine.g:1595:1: rule__Root__MachinesAssignment_2 : ( ruleMachine ) ;
    public final void rule__Root__MachinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1599:1: ( ( ruleMachine ) )
            // InternalStateMachine.g:1600:2: ( ruleMachine )
            {
            // InternalStateMachine.g:1600:2: ( ruleMachine )
            // InternalStateMachine.g:1601:3: ruleMachine
            {
             before(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMachinesMachineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__MachinesAssignment_2"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalStateMachine.g:1610:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1614:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1615:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1615:2: ( RULE_ID )
            // InternalStateMachine.g:1616:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Machine__StatesAssignment_3_0"
    // InternalStateMachine.g:1625:1: rule__Machine__StatesAssignment_3_0 : ( ruleState ) ;
    public final void rule__Machine__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1629:1: ( ( ruleState ) )
            // InternalStateMachine.g:1630:2: ( ruleState )
            {
            // InternalStateMachine.g:1630:2: ( ruleState )
            // InternalStateMachine.g:1631:3: ruleState
            {
             before(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__StatesAssignment_3_0"


    // $ANTLR start "rule__Machine__TransitionsAssignment_3_1"
    // InternalStateMachine.g:1640:1: rule__Machine__TransitionsAssignment_3_1 : ( ruleTransition ) ;
    public final void rule__Machine__TransitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1644:1: ( ( ruleTransition ) )
            // InternalStateMachine.g:1645:2: ( ruleTransition )
            {
            // InternalStateMachine.g:1645:2: ( ruleTransition )
            // InternalStateMachine.g:1646:3: ruleTransition
            {
             before(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__TransitionsAssignment_3_1"


    // $ANTLR start "rule__State__FailAssignment_0_0"
    // InternalStateMachine.g:1655:1: rule__State__FailAssignment_0_0 : ( ( 'fail' ) ) ;
    public final void rule__State__FailAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1659:1: ( ( ( 'fail' ) ) )
            // InternalStateMachine.g:1660:2: ( ( 'fail' ) )
            {
            // InternalStateMachine.g:1660:2: ( ( 'fail' ) )
            // InternalStateMachine.g:1661:3: ( 'fail' )
            {
             before(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); 
            // InternalStateMachine.g:1662:3: ( 'fail' )
            // InternalStateMachine.g:1663:4: 'fail'
            {
             before(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); 

            }

             after(grammarAccess.getStateAccess().getFailFailKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__FailAssignment_0_0"


    // $ANTLR start "rule__State__EndAssignment_0_1"
    // InternalStateMachine.g:1674:1: rule__State__EndAssignment_0_1 : ( ( 'end' ) ) ;
    public final void rule__State__EndAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1678:1: ( ( ( 'end' ) ) )
            // InternalStateMachine.g:1679:2: ( ( 'end' ) )
            {
            // InternalStateMachine.g:1679:2: ( ( 'end' ) )
            // InternalStateMachine.g:1680:3: ( 'end' )
            {
             before(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); 
            // InternalStateMachine.g:1681:3: ( 'end' )
            // InternalStateMachine.g:1682:4: 'end'
            {
             before(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); 

            }

             after(grammarAccess.getStateAccess().getEndEndKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__EndAssignment_0_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalStateMachine.g:1693:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1697:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1698:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1698:2: ( RULE_ID )
            // InternalStateMachine.g:1699:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__PropertiesAssignment_3_3"
    // InternalStateMachine.g:1708:1: rule__State__PropertiesAssignment_3_3 : ( ruleSafetyProperty ) ;
    public final void rule__State__PropertiesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1712:1: ( ( ruleSafetyProperty ) )
            // InternalStateMachine.g:1713:2: ( ruleSafetyProperty )
            {
            // InternalStateMachine.g:1713:2: ( ruleSafetyProperty )
            // InternalStateMachine.g:1714:3: ruleSafetyProperty
            {
             before(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyProperty();

            state._fsp--;

             after(grammarAccess.getStateAccess().getPropertiesSafetyPropertyParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__PropertiesAssignment_3_3"


    // $ANTLR start "rule__State__MachineAssignment_4_1"
    // InternalStateMachine.g:1723:1: rule__State__MachineAssignment_4_1 : ( ruleMachine ) ;
    public final void rule__State__MachineAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1727:1: ( ( ruleMachine ) )
            // InternalStateMachine.g:1728:2: ( ruleMachine )
            {
            // InternalStateMachine.g:1728:2: ( ruleMachine )
            // InternalStateMachine.g:1729:3: ruleMachine
            {
             before(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__MachineAssignment_4_1"


    // $ANTLR start "rule__Transition__FromAssignment_0"
    // InternalStateMachine.g:1738:1: rule__Transition__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1742:1: ( ( ( RULE_ID ) ) )
            // InternalStateMachine.g:1743:2: ( ( RULE_ID ) )
            {
            // InternalStateMachine.g:1743:2: ( ( RULE_ID ) )
            // InternalStateMachine.g:1744:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 
            // InternalStateMachine.g:1745:3: ( RULE_ID )
            // InternalStateMachine.g:1746:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromAssignment_0"


    // $ANTLR start "rule__Transition__ToAssignment_2"
    // InternalStateMachine.g:1757:1: rule__Transition__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1761:1: ( ( ( RULE_ID ) ) )
            // InternalStateMachine.g:1762:2: ( ( RULE_ID ) )
            {
            // InternalStateMachine.g:1762:2: ( ( RULE_ID ) )
            // InternalStateMachine.g:1763:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 
            // InternalStateMachine.g:1764:3: ( RULE_ID )
            // InternalStateMachine.g:1765:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_2"


    // $ANTLR start "rule__Transition__HasGuardAssignment_3_0"
    // InternalStateMachine.g:1776:1: rule__Transition__HasGuardAssignment_3_0 : ( ( 'guard' ) ) ;
    public final void rule__Transition__HasGuardAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1780:1: ( ( ( 'guard' ) ) )
            // InternalStateMachine.g:1781:2: ( ( 'guard' ) )
            {
            // InternalStateMachine.g:1781:2: ( ( 'guard' ) )
            // InternalStateMachine.g:1782:3: ( 'guard' )
            {
             before(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); 
            // InternalStateMachine.g:1783:3: ( 'guard' )
            // InternalStateMachine.g:1784:4: 'guard'
            {
             before(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getHasGuardGuardKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HasGuardAssignment_3_0"


    // $ANTLR start "rule__Transition__GuardAssignment_3_1"
    // InternalStateMachine.g:1795:1: rule__Transition__GuardAssignment_3_1 : ( ruleBoolean ) ;
    public final void rule__Transition__GuardAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1799:1: ( ( ruleBoolean ) )
            // InternalStateMachine.g:1800:2: ( ruleBoolean )
            {
            // InternalStateMachine.g:1800:2: ( ruleBoolean )
            // InternalStateMachine.g:1801:3: ruleBoolean
            {
             before(grammarAccess.getTransitionAccess().getGuardBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardAssignment_3_1"


    // $ANTLR start "rule__Transition__HasWhenAssignment_4_0"
    // InternalStateMachine.g:1810:1: rule__Transition__HasWhenAssignment_4_0 : ( ( 'when' ) ) ;
    public final void rule__Transition__HasWhenAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1814:1: ( ( ( 'when' ) ) )
            // InternalStateMachine.g:1815:2: ( ( 'when' ) )
            {
            // InternalStateMachine.g:1815:2: ( ( 'when' ) )
            // InternalStateMachine.g:1816:3: ( 'when' )
            {
             before(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); 
            // InternalStateMachine.g:1817:3: ( 'when' )
            // InternalStateMachine.g:1818:4: 'when'
            {
             before(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getHasWhenWhenKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HasWhenAssignment_4_0"


    // $ANTLR start "rule__Transition__WhenAssignment_4_1"
    // InternalStateMachine.g:1829:1: rule__Transition__WhenAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Transition__WhenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1833:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1834:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1834:2: ( RULE_ID )
            // InternalStateMachine.g:1835:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__WhenAssignment_4_1"


    // $ANTLR start "rule__Transition__TimeAssignment_5_0"
    // InternalStateMachine.g:1844:1: rule__Transition__TimeAssignment_5_0 : ( ( 'after' ) ) ;
    public final void rule__Transition__TimeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1848:1: ( ( ( 'after' ) ) )
            // InternalStateMachine.g:1849:2: ( ( 'after' ) )
            {
            // InternalStateMachine.g:1849:2: ( ( 'after' ) )
            // InternalStateMachine.g:1850:3: ( 'after' )
            {
             before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); 
            // InternalStateMachine.g:1851:3: ( 'after' )
            // InternalStateMachine.g:1852:4: 'after'
            {
             before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimeAssignment_5_0"


    // $ANTLR start "rule__Transition__TimeoutAssignment_5_1"
    // InternalStateMachine.g:1863:1: rule__Transition__TimeoutAssignment_5_1 : ( ruleFloat ) ;
    public final void rule__Transition__TimeoutAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1867:1: ( ( ruleFloat ) )
            // InternalStateMachine.g:1868:2: ( ruleFloat )
            {
            // InternalStateMachine.g:1868:2: ( ruleFloat )
            // InternalStateMachine.g:1869:3: ruleFloat
            {
             before(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimeoutAssignment_5_1"


    // $ANTLR start "rule__Transition__HasSignalAssignment_6_0"
    // InternalStateMachine.g:1878:1: rule__Transition__HasSignalAssignment_6_0 : ( ( 'signal' ) ) ;
    public final void rule__Transition__HasSignalAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1882:1: ( ( ( 'signal' ) ) )
            // InternalStateMachine.g:1883:2: ( ( 'signal' ) )
            {
            // InternalStateMachine.g:1883:2: ( ( 'signal' ) )
            // InternalStateMachine.g:1884:3: ( 'signal' )
            {
             before(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); 
            // InternalStateMachine.g:1885:3: ( 'signal' )
            // InternalStateMachine.g:1886:4: 'signal'
            {
             before(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getHasSignalSignalKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HasSignalAssignment_6_0"


    // $ANTLR start "rule__Transition__SignalAssignment_6_1"
    // InternalStateMachine.g:1897:1: rule__Transition__SignalAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Transition__SignalAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1901:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1902:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1902:2: ( RULE_ID )
            // InternalStateMachine.g:1903:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SignalAssignment_6_1"


    // $ANTLR start "rule__SafetyProperty__TimeAssignment_0_3"
    // InternalStateMachine.g:1912:1: rule__SafetyProperty__TimeAssignment_0_3 : ( ruleFloat ) ;
    public final void rule__SafetyProperty__TimeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1916:1: ( ( ruleFloat ) )
            // InternalStateMachine.g:1917:2: ( ruleFloat )
            {
            // InternalStateMachine.g:1917:2: ( ruleFloat )
            // InternalStateMachine.g:1918:3: ruleFloat
            {
             before(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__TimeAssignment_0_3"


    // $ANTLR start "rule__SafetyProperty__TimeAssignment_1_3"
    // InternalStateMachine.g:1927:1: rule__SafetyProperty__TimeAssignment_1_3 : ( ruleFloat ) ;
    public final void rule__SafetyProperty__TimeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1931:1: ( ( ruleFloat ) )
            // InternalStateMachine.g:1932:2: ( ruleFloat )
            {
            // InternalStateMachine.g:1932:2: ( ruleFloat )
            // InternalStateMachine.g:1933:3: ruleFloat
            {
             before(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getSafetyPropertyAccess().getTimeFloatParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyProperty__TimeAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000018030020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018020022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001410000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}