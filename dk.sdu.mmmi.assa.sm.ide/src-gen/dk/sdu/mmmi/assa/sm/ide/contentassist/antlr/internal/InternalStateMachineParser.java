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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'machine'", "'{'", "'}'", "'state'", "'with'", "'->'", "'when'", "'signal'", "'.'", "'fail'", "'after'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

            if ( (LA1_0==11) ) {
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


    // $ANTLR start "entryRuleFloat"
    // InternalStateMachine.g:153:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalStateMachine.g:154:1: ( ruleFloat EOF )
            // InternalStateMachine.g:155:1: ruleFloat EOF
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
    // InternalStateMachine.g:162:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:166:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalStateMachine.g:167:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalStateMachine.g:167:2: ( ( rule__Float__Group__0 ) )
            // InternalStateMachine.g:168:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalStateMachine.g:169:3: ( rule__Float__Group__0 )
            // InternalStateMachine.g:169:4: rule__Float__Group__0
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


    // $ANTLR start "rule__Machine__Alternatives_3"
    // InternalStateMachine.g:177:1: rule__Machine__Alternatives_3 : ( ( ( rule__Machine__StatesAssignment_3_0 ) ) | ( ( rule__Machine__TransitionsAssignment_3_1 ) ) );
    public final void rule__Machine__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:181:1: ( ( ( rule__Machine__StatesAssignment_3_0 ) ) | ( ( rule__Machine__TransitionsAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15||LA2_0==21) ) {
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
                    // InternalStateMachine.g:182:2: ( ( rule__Machine__StatesAssignment_3_0 ) )
                    {
                    // InternalStateMachine.g:182:2: ( ( rule__Machine__StatesAssignment_3_0 ) )
                    // InternalStateMachine.g:183:3: ( rule__Machine__StatesAssignment_3_0 )
                    {
                     before(grammarAccess.getMachineAccess().getStatesAssignment_3_0()); 
                    // InternalStateMachine.g:184:3: ( rule__Machine__StatesAssignment_3_0 )
                    // InternalStateMachine.g:184:4: rule__Machine__StatesAssignment_3_0
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
                    // InternalStateMachine.g:188:2: ( ( rule__Machine__TransitionsAssignment_3_1 ) )
                    {
                    // InternalStateMachine.g:188:2: ( ( rule__Machine__TransitionsAssignment_3_1 ) )
                    // InternalStateMachine.g:189:3: ( rule__Machine__TransitionsAssignment_3_1 )
                    {
                     before(grammarAccess.getMachineAccess().getTransitionsAssignment_3_1()); 
                    // InternalStateMachine.g:190:3: ( rule__Machine__TransitionsAssignment_3_1 )
                    // InternalStateMachine.g:190:4: rule__Machine__TransitionsAssignment_3_1
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


    // $ANTLR start "rule__Root__Group__0"
    // InternalStateMachine.g:198:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:202:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalStateMachine.g:203:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalStateMachine.g:210:1: rule__Root__Group__0__Impl : ( 'project' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:214:1: ( ( 'project' ) )
            // InternalStateMachine.g:215:1: ( 'project' )
            {
            // InternalStateMachine.g:215:1: ( 'project' )
            // InternalStateMachine.g:216:2: 'project'
            {
             before(grammarAccess.getRootAccess().getProjectKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalStateMachine.g:225:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:229:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalStateMachine.g:230:2: rule__Root__Group__1__Impl rule__Root__Group__2
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
    // InternalStateMachine.g:237:1: rule__Root__Group__1__Impl : ( ( rule__Root__NameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:241:1: ( ( ( rule__Root__NameAssignment_1 ) ) )
            // InternalStateMachine.g:242:1: ( ( rule__Root__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:242:1: ( ( rule__Root__NameAssignment_1 ) )
            // InternalStateMachine.g:243:2: ( rule__Root__NameAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:244:2: ( rule__Root__NameAssignment_1 )
            // InternalStateMachine.g:244:3: rule__Root__NameAssignment_1
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
    // InternalStateMachine.g:252:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:256:1: ( rule__Root__Group__2__Impl )
            // InternalStateMachine.g:257:2: rule__Root__Group__2__Impl
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
    // InternalStateMachine.g:263:1: rule__Root__Group__2__Impl : ( ( rule__Root__MachineAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:267:1: ( ( ( rule__Root__MachineAssignment_2 ) ) )
            // InternalStateMachine.g:268:1: ( ( rule__Root__MachineAssignment_2 ) )
            {
            // InternalStateMachine.g:268:1: ( ( rule__Root__MachineAssignment_2 ) )
            // InternalStateMachine.g:269:2: ( rule__Root__MachineAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getMachineAssignment_2()); 
            // InternalStateMachine.g:270:2: ( rule__Root__MachineAssignment_2 )
            // InternalStateMachine.g:270:3: rule__Root__MachineAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__MachineAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getMachineAssignment_2()); 

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
    // InternalStateMachine.g:279:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:283:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalStateMachine.g:284:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalStateMachine.g:291:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:295:1: ( ( 'machine' ) )
            // InternalStateMachine.g:296:1: ( 'machine' )
            {
            // InternalStateMachine.g:296:1: ( 'machine' )
            // InternalStateMachine.g:297:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalStateMachine.g:306:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:310:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalStateMachine.g:311:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalStateMachine.g:318:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:322:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalStateMachine.g:323:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:323:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalStateMachine.g:324:2: ( rule__Machine__NameAssignment_1 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:325:2: ( rule__Machine__NameAssignment_1 )
            // InternalStateMachine.g:325:3: rule__Machine__NameAssignment_1
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
    // InternalStateMachine.g:333:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:337:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalStateMachine.g:338:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalStateMachine.g:345:1: rule__Machine__Group__2__Impl : ( '{' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:349:1: ( ( '{' ) )
            // InternalStateMachine.g:350:1: ( '{' )
            {
            // InternalStateMachine.g:350:1: ( '{' )
            // InternalStateMachine.g:351:2: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalStateMachine.g:360:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:364:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalStateMachine.g:365:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalStateMachine.g:372:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Alternatives_3 )* ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:376:1: ( ( ( rule__Machine__Alternatives_3 )* ) )
            // InternalStateMachine.g:377:1: ( ( rule__Machine__Alternatives_3 )* )
            {
            // InternalStateMachine.g:377:1: ( ( rule__Machine__Alternatives_3 )* )
            // InternalStateMachine.g:378:2: ( rule__Machine__Alternatives_3 )*
            {
             before(grammarAccess.getMachineAccess().getAlternatives_3()); 
            // InternalStateMachine.g:379:2: ( rule__Machine__Alternatives_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:379:3: rule__Machine__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalStateMachine.g:387:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:391:1: ( rule__Machine__Group__4__Impl )
            // InternalStateMachine.g:392:2: rule__Machine__Group__4__Impl
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
    // InternalStateMachine.g:398:1: rule__Machine__Group__4__Impl : ( '}' ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:402:1: ( ( '}' ) )
            // InternalStateMachine.g:403:1: ( '}' )
            {
            // InternalStateMachine.g:403:1: ( '}' )
            // InternalStateMachine.g:404:2: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalStateMachine.g:414:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:418:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateMachine.g:419:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalStateMachine.g:426:1: rule__State__Group__0__Impl : ( ( rule__State__FailAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:430:1: ( ( ( rule__State__FailAssignment_0 )? ) )
            // InternalStateMachine.g:431:1: ( ( rule__State__FailAssignment_0 )? )
            {
            // InternalStateMachine.g:431:1: ( ( rule__State__FailAssignment_0 )? )
            // InternalStateMachine.g:432:2: ( rule__State__FailAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getFailAssignment_0()); 
            // InternalStateMachine.g:433:2: ( rule__State__FailAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:433:3: rule__State__FailAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__FailAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getFailAssignment_0()); 

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
    // InternalStateMachine.g:441:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:445:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalStateMachine.g:446:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalStateMachine.g:453:1: rule__State__Group__1__Impl : ( 'state' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:457:1: ( ( 'state' ) )
            // InternalStateMachine.g:458:1: ( 'state' )
            {
            // InternalStateMachine.g:458:1: ( 'state' )
            // InternalStateMachine.g:459:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalStateMachine.g:468:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:472:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalStateMachine.g:473:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalStateMachine.g:480:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:484:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalStateMachine.g:485:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalStateMachine.g:485:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalStateMachine.g:486:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalStateMachine.g:487:2: ( rule__State__NameAssignment_2 )
            // InternalStateMachine.g:487:3: rule__State__NameAssignment_2
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
    // InternalStateMachine.g:495:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:499:1: ( rule__State__Group__3__Impl )
            // InternalStateMachine.g:500:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__3__Impl();

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
    // InternalStateMachine.g:506:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:510:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalStateMachine.g:511:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalStateMachine.g:511:1: ( ( rule__State__Group_3__0 )? )
            // InternalStateMachine.g:512:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalStateMachine.g:513:2: ( rule__State__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:513:3: rule__State__Group_3__0
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


    // $ANTLR start "rule__State__Group_3__0"
    // InternalStateMachine.g:522:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:526:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalStateMachine.g:527:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalStateMachine.g:534:1: rule__State__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:538:1: ( ( 'with' ) )
            // InternalStateMachine.g:539:1: ( 'with' )
            {
            // InternalStateMachine.g:539:1: ( 'with' )
            // InternalStateMachine.g:540:2: 'with'
            {
             before(grammarAccess.getStateAccess().getWithKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getWithKeyword_3_0()); 

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
    // InternalStateMachine.g:549:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:553:1: ( rule__State__Group_3__1__Impl )
            // InternalStateMachine.g:554:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__1__Impl();

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
    // InternalStateMachine.g:560:1: rule__State__Group_3__1__Impl : ( ( rule__State__MachineAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:564:1: ( ( ( rule__State__MachineAssignment_3_1 ) ) )
            // InternalStateMachine.g:565:1: ( ( rule__State__MachineAssignment_3_1 ) )
            {
            // InternalStateMachine.g:565:1: ( ( rule__State__MachineAssignment_3_1 ) )
            // InternalStateMachine.g:566:2: ( rule__State__MachineAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getMachineAssignment_3_1()); 
            // InternalStateMachine.g:567:2: ( rule__State__MachineAssignment_3_1 )
            // InternalStateMachine.g:567:3: rule__State__MachineAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__MachineAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getMachineAssignment_3_1()); 

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


    // $ANTLR start "rule__Transition__Group__0"
    // InternalStateMachine.g:576:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:580:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStateMachine.g:581:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalStateMachine.g:588:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__FromAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:592:1: ( ( ( rule__Transition__FromAssignment_0 ) ) )
            // InternalStateMachine.g:593:1: ( ( rule__Transition__FromAssignment_0 ) )
            {
            // InternalStateMachine.g:593:1: ( ( rule__Transition__FromAssignment_0 ) )
            // InternalStateMachine.g:594:2: ( rule__Transition__FromAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_0()); 
            // InternalStateMachine.g:595:2: ( rule__Transition__FromAssignment_0 )
            // InternalStateMachine.g:595:3: rule__Transition__FromAssignment_0
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
    // InternalStateMachine.g:603:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:607:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStateMachine.g:608:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalStateMachine.g:615:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:619:1: ( ( '->' ) )
            // InternalStateMachine.g:620:1: ( '->' )
            {
            // InternalStateMachine.g:620:1: ( '->' )
            // InternalStateMachine.g:621:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalStateMachine.g:630:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:634:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStateMachine.g:635:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalStateMachine.g:642:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ToAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:646:1: ( ( ( rule__Transition__ToAssignment_2 ) ) )
            // InternalStateMachine.g:647:1: ( ( rule__Transition__ToAssignment_2 ) )
            {
            // InternalStateMachine.g:647:1: ( ( rule__Transition__ToAssignment_2 ) )
            // InternalStateMachine.g:648:2: ( rule__Transition__ToAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_2()); 
            // InternalStateMachine.g:649:2: ( rule__Transition__ToAssignment_2 )
            // InternalStateMachine.g:649:3: rule__Transition__ToAssignment_2
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
    // InternalStateMachine.g:657:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:661:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalStateMachine.g:662:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalStateMachine.g:669:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:673:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalStateMachine.g:674:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalStateMachine.g:674:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalStateMachine.g:675:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalStateMachine.g:676:2: ( rule__Transition__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:676:3: rule__Transition__Group_3__0
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
    // InternalStateMachine.g:684:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:688:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalStateMachine.g:689:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalStateMachine.g:696:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:700:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalStateMachine.g:701:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalStateMachine.g:701:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalStateMachine.g:702:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalStateMachine.g:703:2: ( rule__Transition__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:703:3: rule__Transition__Group_4__0
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
    // InternalStateMachine.g:711:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:715:1: ( rule__Transition__Group__5__Impl )
            // InternalStateMachine.g:716:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

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
    // InternalStateMachine.g:722:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:726:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalStateMachine.g:727:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalStateMachine.g:727:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalStateMachine.g:728:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalStateMachine.g:729:2: ( rule__Transition__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:729:3: rule__Transition__Group_5__0
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


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalStateMachine.g:738:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:742:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalStateMachine.g:743:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalStateMachine.g:750:1: rule__Transition__Group_3__0__Impl : ( 'when' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:754:1: ( ( 'when' ) )
            // InternalStateMachine.g:755:1: ( 'when' )
            {
            // InternalStateMachine.g:755:1: ( 'when' )
            // InternalStateMachine.g:756:2: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWhenKeyword_3_0()); 

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
    // InternalStateMachine.g:765:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:769:1: ( rule__Transition__Group_3__1__Impl )
            // InternalStateMachine.g:770:2: rule__Transition__Group_3__1__Impl
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
    // InternalStateMachine.g:776:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__WhenAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:780:1: ( ( ( rule__Transition__WhenAssignment_3_1 ) ) )
            // InternalStateMachine.g:781:1: ( ( rule__Transition__WhenAssignment_3_1 ) )
            {
            // InternalStateMachine.g:781:1: ( ( rule__Transition__WhenAssignment_3_1 ) )
            // InternalStateMachine.g:782:2: ( rule__Transition__WhenAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getWhenAssignment_3_1()); 
            // InternalStateMachine.g:783:2: ( rule__Transition__WhenAssignment_3_1 )
            // InternalStateMachine.g:783:3: rule__Transition__WhenAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__WhenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getWhenAssignment_3_1()); 

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
    // InternalStateMachine.g:792:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:796:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalStateMachine.g:797:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalStateMachine.g:804:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__TimeAssignment_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:808:1: ( ( ( rule__Transition__TimeAssignment_4_0 ) ) )
            // InternalStateMachine.g:809:1: ( ( rule__Transition__TimeAssignment_4_0 ) )
            {
            // InternalStateMachine.g:809:1: ( ( rule__Transition__TimeAssignment_4_0 ) )
            // InternalStateMachine.g:810:2: ( rule__Transition__TimeAssignment_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getTimeAssignment_4_0()); 
            // InternalStateMachine.g:811:2: ( rule__Transition__TimeAssignment_4_0 )
            // InternalStateMachine.g:811:3: rule__Transition__TimeAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeAssignment_4_0()); 

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
    // InternalStateMachine.g:819:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:823:1: ( rule__Transition__Group_4__1__Impl )
            // InternalStateMachine.g:824:2: rule__Transition__Group_4__1__Impl
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
    // InternalStateMachine.g:830:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__TimeoutAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:834:1: ( ( ( rule__Transition__TimeoutAssignment_4_1 ) ) )
            // InternalStateMachine.g:835:1: ( ( rule__Transition__TimeoutAssignment_4_1 ) )
            {
            // InternalStateMachine.g:835:1: ( ( rule__Transition__TimeoutAssignment_4_1 ) )
            // InternalStateMachine.g:836:2: ( rule__Transition__TimeoutAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getTimeoutAssignment_4_1()); 
            // InternalStateMachine.g:837:2: ( rule__Transition__TimeoutAssignment_4_1 )
            // InternalStateMachine.g:837:3: rule__Transition__TimeoutAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeoutAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeoutAssignment_4_1()); 

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
    // InternalStateMachine.g:846:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:850:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalStateMachine.g:851:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalStateMachine.g:858:1: rule__Transition__Group_5__0__Impl : ( 'signal' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:862:1: ( ( 'signal' ) )
            // InternalStateMachine.g:863:1: ( 'signal' )
            {
            // InternalStateMachine.g:863:1: ( 'signal' )
            // InternalStateMachine.g:864:2: 'signal'
            {
             before(grammarAccess.getTransitionAccess().getSignalKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSignalKeyword_5_0()); 

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
    // InternalStateMachine.g:873:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:877:1: ( rule__Transition__Group_5__1__Impl )
            // InternalStateMachine.g:878:2: rule__Transition__Group_5__1__Impl
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
    // InternalStateMachine.g:884:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__SignalAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:888:1: ( ( ( rule__Transition__SignalAssignment_5_1 ) ) )
            // InternalStateMachine.g:889:1: ( ( rule__Transition__SignalAssignment_5_1 ) )
            {
            // InternalStateMachine.g:889:1: ( ( rule__Transition__SignalAssignment_5_1 ) )
            // InternalStateMachine.g:890:2: ( rule__Transition__SignalAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getSignalAssignment_5_1()); 
            // InternalStateMachine.g:891:2: ( rule__Transition__SignalAssignment_5_1 )
            // InternalStateMachine.g:891:3: rule__Transition__SignalAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SignalAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSignalAssignment_5_1()); 

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


    // $ANTLR start "rule__Float__Group__0"
    // InternalStateMachine.g:900:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:904:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalStateMachine.g:905:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalStateMachine.g:912:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:916:1: ( ( RULE_INT ) )
            // InternalStateMachine.g:917:1: ( RULE_INT )
            {
            // InternalStateMachine.g:917:1: ( RULE_INT )
            // InternalStateMachine.g:918:2: RULE_INT
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
    // InternalStateMachine.g:927:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:931:1: ( rule__Float__Group__1__Impl )
            // InternalStateMachine.g:932:2: rule__Float__Group__1__Impl
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
    // InternalStateMachine.g:938:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:942:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalStateMachine.g:943:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalStateMachine.g:943:1: ( ( rule__Float__Group_1__0 )? )
            // InternalStateMachine.g:944:2: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalStateMachine.g:945:2: ( rule__Float__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:945:3: rule__Float__Group_1__0
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
    // InternalStateMachine.g:954:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:958:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalStateMachine.g:959:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalStateMachine.g:966:1: rule__Float__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:970:1: ( ( '.' ) )
            // InternalStateMachine.g:971:1: ( '.' )
            {
            // InternalStateMachine.g:971:1: ( '.' )
            // InternalStateMachine.g:972:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalStateMachine.g:981:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:985:1: ( rule__Float__Group_1__1__Impl )
            // InternalStateMachine.g:986:2: rule__Float__Group_1__1__Impl
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
    // InternalStateMachine.g:992:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:996:1: ( ( RULE_INT ) )
            // InternalStateMachine.g:997:1: ( RULE_INT )
            {
            // InternalStateMachine.g:997:1: ( RULE_INT )
            // InternalStateMachine.g:998:2: RULE_INT
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
    // InternalStateMachine.g:1008:1: rule__Root__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Root__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1012:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1013:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1013:2: ( RULE_ID )
            // InternalStateMachine.g:1014:3: RULE_ID
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


    // $ANTLR start "rule__Root__MachineAssignment_2"
    // InternalStateMachine.g:1023:1: rule__Root__MachineAssignment_2 : ( ruleMachine ) ;
    public final void rule__Root__MachineAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1027:1: ( ( ruleMachine ) )
            // InternalStateMachine.g:1028:2: ( ruleMachine )
            {
            // InternalStateMachine.g:1028:2: ( ruleMachine )
            // InternalStateMachine.g:1029:3: ruleMachine
            {
             before(grammarAccess.getRootAccess().getMachineMachineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMachineMachineParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__MachineAssignment_2"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalStateMachine.g:1038:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1042:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1043:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1043:2: ( RULE_ID )
            // InternalStateMachine.g:1044:3: RULE_ID
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
    // InternalStateMachine.g:1053:1: rule__Machine__StatesAssignment_3_0 : ( ruleState ) ;
    public final void rule__Machine__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1057:1: ( ( ruleState ) )
            // InternalStateMachine.g:1058:2: ( ruleState )
            {
            // InternalStateMachine.g:1058:2: ( ruleState )
            // InternalStateMachine.g:1059:3: ruleState
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
    // InternalStateMachine.g:1068:1: rule__Machine__TransitionsAssignment_3_1 : ( ruleTransition ) ;
    public final void rule__Machine__TransitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1072:1: ( ( ruleTransition ) )
            // InternalStateMachine.g:1073:2: ( ruleTransition )
            {
            // InternalStateMachine.g:1073:2: ( ruleTransition )
            // InternalStateMachine.g:1074:3: ruleTransition
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


    // $ANTLR start "rule__State__FailAssignment_0"
    // InternalStateMachine.g:1083:1: rule__State__FailAssignment_0 : ( ( 'fail' ) ) ;
    public final void rule__State__FailAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1087:1: ( ( ( 'fail' ) ) )
            // InternalStateMachine.g:1088:2: ( ( 'fail' ) )
            {
            // InternalStateMachine.g:1088:2: ( ( 'fail' ) )
            // InternalStateMachine.g:1089:3: ( 'fail' )
            {
             before(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); 
            // InternalStateMachine.g:1090:3: ( 'fail' )
            // InternalStateMachine.g:1091:4: 'fail'
            {
             before(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); 

            }

             after(grammarAccess.getStateAccess().getFailFailKeyword_0_0()); 

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
    // $ANTLR end "rule__State__FailAssignment_0"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalStateMachine.g:1102:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1106:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1107:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1107:2: ( RULE_ID )
            // InternalStateMachine.g:1108:3: RULE_ID
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


    // $ANTLR start "rule__State__MachineAssignment_3_1"
    // InternalStateMachine.g:1117:1: rule__State__MachineAssignment_3_1 : ( ruleMachine ) ;
    public final void rule__State__MachineAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1121:1: ( ( ruleMachine ) )
            // InternalStateMachine.g:1122:2: ( ruleMachine )
            {
            // InternalStateMachine.g:1122:2: ( ruleMachine )
            // InternalStateMachine.g:1123:3: ruleMachine
            {
             before(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getMachineMachineParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__State__MachineAssignment_3_1"


    // $ANTLR start "rule__Transition__FromAssignment_0"
    // InternalStateMachine.g:1132:1: rule__Transition__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1136:1: ( ( ( RULE_ID ) ) )
            // InternalStateMachine.g:1137:2: ( ( RULE_ID ) )
            {
            // InternalStateMachine.g:1137:2: ( ( RULE_ID ) )
            // InternalStateMachine.g:1138:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 
            // InternalStateMachine.g:1139:3: ( RULE_ID )
            // InternalStateMachine.g:1140:4: RULE_ID
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
    // InternalStateMachine.g:1151:1: rule__Transition__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1155:1: ( ( ( RULE_ID ) ) )
            // InternalStateMachine.g:1156:2: ( ( RULE_ID ) )
            {
            // InternalStateMachine.g:1156:2: ( ( RULE_ID ) )
            // InternalStateMachine.g:1157:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 
            // InternalStateMachine.g:1158:3: ( RULE_ID )
            // InternalStateMachine.g:1159:4: RULE_ID
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


    // $ANTLR start "rule__Transition__WhenAssignment_3_1"
    // InternalStateMachine.g:1170:1: rule__Transition__WhenAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Transition__WhenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1174:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1175:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1175:2: ( RULE_ID )
            // InternalStateMachine.g:1176:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWhenIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Transition__WhenAssignment_3_1"


    // $ANTLR start "rule__Transition__TimeAssignment_4_0"
    // InternalStateMachine.g:1185:1: rule__Transition__TimeAssignment_4_0 : ( ( 'after' ) ) ;
    public final void rule__Transition__TimeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1189:1: ( ( ( 'after' ) ) )
            // InternalStateMachine.g:1190:2: ( ( 'after' ) )
            {
            // InternalStateMachine.g:1190:2: ( ( 'after' ) )
            // InternalStateMachine.g:1191:3: ( 'after' )
            {
             before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); 
            // InternalStateMachine.g:1192:3: ( 'after' )
            // InternalStateMachine.g:1193:4: 'after'
            {
             before(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getTimeAfterKeyword_4_0_0()); 

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
    // $ANTLR end "rule__Transition__TimeAssignment_4_0"


    // $ANTLR start "rule__Transition__TimeoutAssignment_4_1"
    // InternalStateMachine.g:1204:1: rule__Transition__TimeoutAssignment_4_1 : ( ruleFloat ) ;
    public final void rule__Transition__TimeoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1208:1: ( ( ruleFloat ) )
            // InternalStateMachine.g:1209:2: ( ruleFloat )
            {
            // InternalStateMachine.g:1209:2: ( ruleFloat )
            // InternalStateMachine.g:1210:3: ruleFloat
            {
             before(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTimeoutFloatParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Transition__TimeoutAssignment_4_1"


    // $ANTLR start "rule__Transition__SignalAssignment_5_1"
    // InternalStateMachine.g:1219:1: rule__Transition__SignalAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Transition__SignalAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:1223:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:1224:2: ( RULE_ID )
            {
            // InternalStateMachine.g:1224:2: ( RULE_ID )
            // InternalStateMachine.g:1225:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSignalIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Transition__SignalAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000020C020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000208022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}