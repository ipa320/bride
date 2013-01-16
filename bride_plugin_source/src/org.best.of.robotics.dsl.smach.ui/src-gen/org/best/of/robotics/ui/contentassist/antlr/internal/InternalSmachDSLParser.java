package org.best.of.robotics.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.best.of.robotics.services.SmachDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmachDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'succeeded'", "'preempted'", "'aborted'", "'statemachine'", "'{'", "'}'", "'ActionClient'", "'name:'", "','", "'type:'", "'ServiceClient'", "'srv:'", "'actionstate'", "'client:'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSmachDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmachDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmachDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g"; }


     
     	private SmachDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmachDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePrimitivePackage"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:60:1: entryRulePrimitivePackage : rulePrimitivePackage EOF ;
    public final void entryRulePrimitivePackage() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:61:1: ( rulePrimitivePackage EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:62:1: rulePrimitivePackage EOF
            {
             before(grammarAccess.getPrimitivePackageRule()); 
            pushFollow(FOLLOW_rulePrimitivePackage_in_entryRulePrimitivePackage61);
            rulePrimitivePackage();

            state._fsp--;

             after(grammarAccess.getPrimitivePackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitivePackage68); 

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
    // $ANTLR end "entryRulePrimitivePackage"


    // $ANTLR start "rulePrimitivePackage"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:69:1: rulePrimitivePackage : ( ( rule__PrimitivePackage__StatemachinesAssignment )* ) ;
    public final void rulePrimitivePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:73:2: ( ( ( rule__PrimitivePackage__StatemachinesAssignment )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:74:1: ( ( rule__PrimitivePackage__StatemachinesAssignment )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:74:1: ( ( rule__PrimitivePackage__StatemachinesAssignment )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:75:1: ( rule__PrimitivePackage__StatemachinesAssignment )*
            {
             before(grammarAccess.getPrimitivePackageAccess().getStatemachinesAssignment()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:76:1: ( rule__PrimitivePackage__StatemachinesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:76:2: rule__PrimitivePackage__StatemachinesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__PrimitivePackage__StatemachinesAssignment_in_rulePrimitivePackage94);
            	    rule__PrimitivePackage__StatemachinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPrimitivePackageAccess().getStatemachinesAssignment()); 

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
    // $ANTLR end "rulePrimitivePackage"


    // $ANTLR start "entryRuleStateMachine"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:90:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:91:1: ( ruleStateMachine EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:92:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine124);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine131); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:99:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:103:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:104:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:104:1: ( ( rule__StateMachine__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:105:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:106:1: ( rule__StateMachine__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:106:2: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine157);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleActionClient"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:118:1: entryRuleActionClient : ruleActionClient EOF ;
    public final void entryRuleActionClient() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:119:1: ( ruleActionClient EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:120:1: ruleActionClient EOF
            {
             before(grammarAccess.getActionClientRule()); 
            pushFollow(FOLLOW_ruleActionClient_in_entryRuleActionClient184);
            ruleActionClient();

            state._fsp--;

             after(grammarAccess.getActionClientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionClient191); 

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
    // $ANTLR end "entryRuleActionClient"


    // $ANTLR start "ruleActionClient"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:127:1: ruleActionClient : ( ( rule__ActionClient__Group__0 ) ) ;
    public final void ruleActionClient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:131:2: ( ( ( rule__ActionClient__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:132:1: ( ( rule__ActionClient__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:132:1: ( ( rule__ActionClient__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:133:1: ( rule__ActionClient__Group__0 )
            {
             before(grammarAccess.getActionClientAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:134:1: ( rule__ActionClient__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:134:2: rule__ActionClient__Group__0
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__0_in_ruleActionClient217);
            rule__ActionClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getGroup()); 

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
    // $ANTLR end "ruleActionClient"


    // $ANTLR start "entryRuleServiceClient"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:146:1: entryRuleServiceClient : ruleServiceClient EOF ;
    public final void entryRuleServiceClient() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:147:1: ( ruleServiceClient EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:148:1: ruleServiceClient EOF
            {
             before(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_ruleServiceClient_in_entryRuleServiceClient244);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getServiceClientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceClient251); 

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
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:155:1: ruleServiceClient : ( ( rule__ServiceClient__Group__0 ) ) ;
    public final void ruleServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:159:2: ( ( ( rule__ServiceClient__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:160:1: ( ( rule__ServiceClient__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:160:1: ( ( rule__ServiceClient__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:161:1: ( rule__ServiceClient__Group__0 )
            {
             before(grammarAccess.getServiceClientAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:162:1: ( rule__ServiceClient__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:162:2: rule__ServiceClient__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__0_in_ruleServiceClient277);
            rule__ServiceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceClient"


    // $ANTLR start "entryRuleActionState"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:174:1: entryRuleActionState : ruleActionState EOF ;
    public final void entryRuleActionState() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:175:1: ( ruleActionState EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:176:1: ruleActionState EOF
            {
             before(grammarAccess.getActionStateRule()); 
            pushFollow(FOLLOW_ruleActionState_in_entryRuleActionState304);
            ruleActionState();

            state._fsp--;

             after(grammarAccess.getActionStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionState311); 

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
    // $ANTLR end "entryRuleActionState"


    // $ANTLR start "ruleActionState"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:183:1: ruleActionState : ( ( rule__ActionState__Group__0 ) ) ;
    public final void ruleActionState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:187:2: ( ( ( rule__ActionState__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:188:1: ( ( rule__ActionState__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:188:1: ( ( rule__ActionState__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:189:1: ( rule__ActionState__Group__0 )
            {
             before(grammarAccess.getActionStateAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:190:1: ( rule__ActionState__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:190:2: rule__ActionState__Group__0
            {
            pushFollow(FOLLOW_rule__ActionState__Group__0_in_ruleActionState337);
            rule__ActionState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStateAccess().getGroup()); 

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
    // $ANTLR end "ruleActionState"


    // $ANTLR start "entryRuleTransition"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:202:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:203:1: ( ruleTransition EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:204:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition364);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition371); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:211:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:215:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:216:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:216:1: ( ( rule__Transition__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:217:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:218:1: ( rule__Transition__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:218:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition397);
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


    // $ANTLR start "entryRuleOUTCOME"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:230:1: entryRuleOUTCOME : ruleOUTCOME EOF ;
    public final void entryRuleOUTCOME() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:231:1: ( ruleOUTCOME EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:232:1: ruleOUTCOME EOF
            {
             before(grammarAccess.getOUTCOMERule()); 
            pushFollow(FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME424);
            ruleOUTCOME();

            state._fsp--;

             after(grammarAccess.getOUTCOMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUTCOME431); 

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
    // $ANTLR end "entryRuleOUTCOME"


    // $ANTLR start "ruleOUTCOME"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:239:1: ruleOUTCOME : ( ( rule__OUTCOME__Alternatives ) ) ;
    public final void ruleOUTCOME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:243:2: ( ( ( rule__OUTCOME__Alternatives ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:244:1: ( ( rule__OUTCOME__Alternatives ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:244:1: ( ( rule__OUTCOME__Alternatives ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:245:1: ( rule__OUTCOME__Alternatives )
            {
             before(grammarAccess.getOUTCOMEAccess().getAlternatives()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:246:1: ( rule__OUTCOME__Alternatives )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:246:2: rule__OUTCOME__Alternatives
            {
            pushFollow(FOLLOW_rule__OUTCOME__Alternatives_in_ruleOUTCOME457);
            rule__OUTCOME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOUTCOMEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOUTCOME"


    // $ANTLR start "rule__OUTCOME__Alternatives"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:258:1: rule__OUTCOME__Alternatives : ( ( 'succeeded' ) | ( 'preempted' ) | ( 'aborted' ) );
    public final void rule__OUTCOME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:262:1: ( ( 'succeeded' ) | ( 'preempted' ) | ( 'aborted' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:263:1: ( 'succeeded' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:263:1: ( 'succeeded' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:264:1: 'succeeded'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getSucceededKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__OUTCOME__Alternatives494); 
                     after(grammarAccess.getOUTCOMEAccess().getSucceededKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:271:6: ( 'preempted' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:271:6: ( 'preempted' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:272:1: 'preempted'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getPreemptedKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__OUTCOME__Alternatives514); 
                     after(grammarAccess.getOUTCOMEAccess().getPreemptedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:279:6: ( 'aborted' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:279:6: ( 'aborted' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:280:1: 'aborted'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getAbortedKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__OUTCOME__Alternatives534); 
                     after(grammarAccess.getOUTCOMEAccess().getAbortedKeyword_2()); 

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
    // $ANTLR end "rule__OUTCOME__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:294:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:298:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:299:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0566);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0569);
            rule__StateMachine__Group__1();

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
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:306:1: rule__StateMachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:310:1: ( ( 'statemachine' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:311:1: ( 'statemachine' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:311:1: ( 'statemachine' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:312:1: 'statemachine'
            {
             before(grammarAccess.getStateMachineAccess().getStatemachineKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__StateMachine__Group__0__Impl597); 
             after(grammarAccess.getStateMachineAccess().getStatemachineKeyword_0()); 

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
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:325:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:329:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:330:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1628);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1631);
            rule__StateMachine__Group__2();

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
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:337:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:341:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:342:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:342:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:343:1: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:344:1: ( rule__StateMachine__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:344:2: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl658);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:354:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:358:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:359:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2688);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2691);
            rule__StateMachine__Group__3();

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
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:366:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:370:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:371:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:371:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:372:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__StateMachine__Group__2__Impl719); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:385:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:389:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:390:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3750);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3753);
            rule__StateMachine__Group__4();

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
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:397:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__ActionclientsAssignment_3 )* ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:401:1: ( ( ( rule__StateMachine__ActionclientsAssignment_3 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:402:1: ( ( rule__StateMachine__ActionclientsAssignment_3 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:402:1: ( ( rule__StateMachine__ActionclientsAssignment_3 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:403:1: ( rule__StateMachine__ActionclientsAssignment_3 )*
            {
             before(grammarAccess.getStateMachineAccess().getActionclientsAssignment_3()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:404:1: ( rule__StateMachine__ActionclientsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:404:2: rule__StateMachine__ActionclientsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ActionclientsAssignment_3_in_rule__StateMachine__Group__3__Impl780);
            	    rule__StateMachine__ActionclientsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getActionclientsAssignment_3()); 

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
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:414:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:418:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:419:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4811);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__4814);
            rule__StateMachine__Group__5();

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
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:426:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__ServiceclientsAssignment_4 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:430:1: ( ( ( rule__StateMachine__ServiceclientsAssignment_4 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:431:1: ( ( rule__StateMachine__ServiceclientsAssignment_4 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:431:1: ( ( rule__StateMachine__ServiceclientsAssignment_4 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:432:1: ( rule__StateMachine__ServiceclientsAssignment_4 )*
            {
             before(grammarAccess.getStateMachineAccess().getServiceclientsAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:433:1: ( rule__StateMachine__ServiceclientsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:433:2: rule__StateMachine__ServiceclientsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ServiceclientsAssignment_4_in_rule__StateMachine__Group__4__Impl841);
            	    rule__StateMachine__ServiceclientsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getServiceclientsAssignment_4()); 

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
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:443:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:447:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:448:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__5872);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__5875);
            rule__StateMachine__Group__6();

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
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:455:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__ActionsstatesAssignment_5 )* ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:459:1: ( ( ( rule__StateMachine__ActionsstatesAssignment_5 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:460:1: ( ( rule__StateMachine__ActionsstatesAssignment_5 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:460:1: ( ( rule__StateMachine__ActionsstatesAssignment_5 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:461:1: ( rule__StateMachine__ActionsstatesAssignment_5 )*
            {
             before(grammarAccess.getStateMachineAccess().getActionsstatesAssignment_5()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:462:1: ( rule__StateMachine__ActionsstatesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:462:2: rule__StateMachine__ActionsstatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ActionsstatesAssignment_5_in_rule__StateMachine__Group__5__Impl902);
            	    rule__StateMachine__ActionsstatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getActionsstatesAssignment_5()); 

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
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:472:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:476:1: ( rule__StateMachine__Group__6__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:477:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__6933);
            rule__StateMachine__Group__6__Impl();

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
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:483:1: rule__StateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:487:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:488:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:488:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:489:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__StateMachine__Group__6__Impl961); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__ActionClient__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:516:1: rule__ActionClient__Group__0 : rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1 ;
    public final void rule__ActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:520:1: ( rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:521:2: rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__0__Impl_in_rule__ActionClient__Group__01006);
            rule__ActionClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__1_in_rule__ActionClient__Group__01009);
            rule__ActionClient__Group__1();

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
    // $ANTLR end "rule__ActionClient__Group__0"


    // $ANTLR start "rule__ActionClient__Group__0__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:528:1: rule__ActionClient__Group__0__Impl : ( 'ActionClient' ) ;
    public final void rule__ActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:532:1: ( ( 'ActionClient' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:533:1: ( 'ActionClient' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:533:1: ( 'ActionClient' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:534:1: 'ActionClient'
            {
             before(grammarAccess.getActionClientAccess().getActionClientKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ActionClient__Group__0__Impl1037); 
             after(grammarAccess.getActionClientAccess().getActionClientKeyword_0()); 

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
    // $ANTLR end "rule__ActionClient__Group__0__Impl"


    // $ANTLR start "rule__ActionClient__Group__1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:547:1: rule__ActionClient__Group__1 : rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2 ;
    public final void rule__ActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:551:1: ( rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:552:2: rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__1__Impl_in_rule__ActionClient__Group__11068);
            rule__ActionClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__2_in_rule__ActionClient__Group__11071);
            rule__ActionClient__Group__2();

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
    // $ANTLR end "rule__ActionClient__Group__1"


    // $ANTLR start "rule__ActionClient__Group__1__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:559:1: rule__ActionClient__Group__1__Impl : ( ( rule__ActionClient__NameAssignment_1 ) ) ;
    public final void rule__ActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:563:1: ( ( ( rule__ActionClient__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:564:1: ( ( rule__ActionClient__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:564:1: ( ( rule__ActionClient__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:565:1: ( rule__ActionClient__NameAssignment_1 )
            {
             before(grammarAccess.getActionClientAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:566:1: ( rule__ActionClient__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:566:2: rule__ActionClient__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionClient__NameAssignment_1_in_rule__ActionClient__Group__1__Impl1098);
            rule__ActionClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ActionClient__Group__1__Impl"


    // $ANTLR start "rule__ActionClient__Group__2"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:576:1: rule__ActionClient__Group__2 : rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3 ;
    public final void rule__ActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:580:1: ( rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:581:2: rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__2__Impl_in_rule__ActionClient__Group__21128);
            rule__ActionClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__3_in_rule__ActionClient__Group__21131);
            rule__ActionClient__Group__3();

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
    // $ANTLR end "rule__ActionClient__Group__2"


    // $ANTLR start "rule__ActionClient__Group__2__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:588:1: rule__ActionClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:592:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:593:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:593:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:594:1: '{'
            {
             before(grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ActionClient__Group__2__Impl1159); 
             after(grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ActionClient__Group__2__Impl"


    // $ANTLR start "rule__ActionClient__Group__3"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:607:1: rule__ActionClient__Group__3 : rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4 ;
    public final void rule__ActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:611:1: ( rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:612:2: rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__3__Impl_in_rule__ActionClient__Group__31190);
            rule__ActionClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__4_in_rule__ActionClient__Group__31193);
            rule__ActionClient__Group__4();

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
    // $ANTLR end "rule__ActionClient__Group__3"


    // $ANTLR start "rule__ActionClient__Group__3__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:619:1: rule__ActionClient__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:623:1: ( ( 'name:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:624:1: ( 'name:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:624:1: ( 'name:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:625:1: 'name:'
            {
             before(grammarAccess.getActionClientAccess().getNameKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ActionClient__Group__3__Impl1221); 
             after(grammarAccess.getActionClientAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__ActionClient__Group__3__Impl"


    // $ANTLR start "rule__ActionClient__Group__4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:638:1: rule__ActionClient__Group__4 : rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5 ;
    public final void rule__ActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:642:1: ( rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:643:2: rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__4__Impl_in_rule__ActionClient__Group__41252);
            rule__ActionClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__5_in_rule__ActionClient__Group__41255);
            rule__ActionClient__Group__5();

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
    // $ANTLR end "rule__ActionClient__Group__4"


    // $ANTLR start "rule__ActionClient__Group__4__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:650:1: rule__ActionClient__Group__4__Impl : ( ( rule__ActionClient__ActionameAssignment_4 ) ) ;
    public final void rule__ActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:654:1: ( ( ( rule__ActionClient__ActionameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:655:1: ( ( rule__ActionClient__ActionameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:655:1: ( ( rule__ActionClient__ActionameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:656:1: ( rule__ActionClient__ActionameAssignment_4 )
            {
             before(grammarAccess.getActionClientAccess().getActionameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:657:1: ( rule__ActionClient__ActionameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:657:2: rule__ActionClient__ActionameAssignment_4
            {
            pushFollow(FOLLOW_rule__ActionClient__ActionameAssignment_4_in_rule__ActionClient__Group__4__Impl1282);
            rule__ActionClient__ActionameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getActionameAssignment_4()); 

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
    // $ANTLR end "rule__ActionClient__Group__4__Impl"


    // $ANTLR start "rule__ActionClient__Group__5"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:667:1: rule__ActionClient__Group__5 : rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6 ;
    public final void rule__ActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:671:1: ( rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:672:2: rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__5__Impl_in_rule__ActionClient__Group__51312);
            rule__ActionClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__6_in_rule__ActionClient__Group__51315);
            rule__ActionClient__Group__6();

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
    // $ANTLR end "rule__ActionClient__Group__5"


    // $ANTLR start "rule__ActionClient__Group__5__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:679:1: rule__ActionClient__Group__5__Impl : ( ',' ) ;
    public final void rule__ActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:683:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:684:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:684:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:685:1: ','
            {
             before(grammarAccess.getActionClientAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ActionClient__Group__5__Impl1343); 
             after(grammarAccess.getActionClientAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__ActionClient__Group__5__Impl"


    // $ANTLR start "rule__ActionClient__Group__6"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:698:1: rule__ActionClient__Group__6 : rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7 ;
    public final void rule__ActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:702:1: ( rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:703:2: rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__6__Impl_in_rule__ActionClient__Group__61374);
            rule__ActionClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__7_in_rule__ActionClient__Group__61377);
            rule__ActionClient__Group__7();

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
    // $ANTLR end "rule__ActionClient__Group__6"


    // $ANTLR start "rule__ActionClient__Group__6__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:710:1: rule__ActionClient__Group__6__Impl : ( 'type:' ) ;
    public final void rule__ActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:714:1: ( ( 'type:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:715:1: ( 'type:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:715:1: ( 'type:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:716:1: 'type:'
            {
             before(grammarAccess.getActionClientAccess().getTypeKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__ActionClient__Group__6__Impl1405); 
             after(grammarAccess.getActionClientAccess().getTypeKeyword_6()); 

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
    // $ANTLR end "rule__ActionClient__Group__6__Impl"


    // $ANTLR start "rule__ActionClient__Group__7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:729:1: rule__ActionClient__Group__7 : rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8 ;
    public final void rule__ActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:733:1: ( rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:734:2: rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__7__Impl_in_rule__ActionClient__Group__71436);
            rule__ActionClient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__8_in_rule__ActionClient__Group__71439);
            rule__ActionClient__Group__8();

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
    // $ANTLR end "rule__ActionClient__Group__7"


    // $ANTLR start "rule__ActionClient__Group__7__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:741:1: rule__ActionClient__Group__7__Impl : ( ( rule__ActionClient__ActiotypeAssignment_7 ) ) ;
    public final void rule__ActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:745:1: ( ( ( rule__ActionClient__ActiotypeAssignment_7 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:746:1: ( ( rule__ActionClient__ActiotypeAssignment_7 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:746:1: ( ( rule__ActionClient__ActiotypeAssignment_7 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:747:1: ( rule__ActionClient__ActiotypeAssignment_7 )
            {
             before(grammarAccess.getActionClientAccess().getActiotypeAssignment_7()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:748:1: ( rule__ActionClient__ActiotypeAssignment_7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:748:2: rule__ActionClient__ActiotypeAssignment_7
            {
            pushFollow(FOLLOW_rule__ActionClient__ActiotypeAssignment_7_in_rule__ActionClient__Group__7__Impl1466);
            rule__ActionClient__ActiotypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getActiotypeAssignment_7()); 

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
    // $ANTLR end "rule__ActionClient__Group__7__Impl"


    // $ANTLR start "rule__ActionClient__Group__8"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:758:1: rule__ActionClient__Group__8 : rule__ActionClient__Group__8__Impl ;
    public final void rule__ActionClient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:762:1: ( rule__ActionClient__Group__8__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:763:2: rule__ActionClient__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__8__Impl_in_rule__ActionClient__Group__81496);
            rule__ActionClient__Group__8__Impl();

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
    // $ANTLR end "rule__ActionClient__Group__8"


    // $ANTLR start "rule__ActionClient__Group__8__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:769:1: rule__ActionClient__Group__8__Impl : ( '}' ) ;
    public final void rule__ActionClient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:773:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:774:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:774:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:775:1: '}'
            {
             before(grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ActionClient__Group__8__Impl1524); 
             after(grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ActionClient__Group__8__Impl"


    // $ANTLR start "rule__ServiceClient__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:806:1: rule__ServiceClient__Group__0 : rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 ;
    public final void rule__ServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:810:1: ( rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:811:2: rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__0__Impl_in_rule__ServiceClient__Group__01573);
            rule__ServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__1_in_rule__ServiceClient__Group__01576);
            rule__ServiceClient__Group__1();

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
    // $ANTLR end "rule__ServiceClient__Group__0"


    // $ANTLR start "rule__ServiceClient__Group__0__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:818:1: rule__ServiceClient__Group__0__Impl : ( 'ServiceClient' ) ;
    public final void rule__ServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:822:1: ( ( 'ServiceClient' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:823:1: ( 'ServiceClient' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:823:1: ( 'ServiceClient' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:824:1: 'ServiceClient'
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ServiceClient__Group__0__Impl1604); 
             after(grammarAccess.getServiceClientAccess().getServiceClientKeyword_0()); 

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
    // $ANTLR end "rule__ServiceClient__Group__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group__1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:837:1: rule__ServiceClient__Group__1 : rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 ;
    public final void rule__ServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:841:1: ( rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:842:2: rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__1__Impl_in_rule__ServiceClient__Group__11635);
            rule__ServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__2_in_rule__ServiceClient__Group__11638);
            rule__ServiceClient__Group__2();

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
    // $ANTLR end "rule__ServiceClient__Group__1"


    // $ANTLR start "rule__ServiceClient__Group__1__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:849:1: rule__ServiceClient__Group__1__Impl : ( ( rule__ServiceClient__NameAssignment_1 ) ) ;
    public final void rule__ServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:853:1: ( ( ( rule__ServiceClient__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:854:1: ( ( rule__ServiceClient__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:854:1: ( ( rule__ServiceClient__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:855:1: ( rule__ServiceClient__NameAssignment_1 )
            {
             before(grammarAccess.getServiceClientAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:856:1: ( rule__ServiceClient__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:856:2: rule__ServiceClient__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceClient__NameAssignment_1_in_rule__ServiceClient__Group__1__Impl1665);
            rule__ServiceClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServiceClient__Group__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group__2"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:866:1: rule__ServiceClient__Group__2 : rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 ;
    public final void rule__ServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:870:1: ( rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:871:2: rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__2__Impl_in_rule__ServiceClient__Group__21695);
            rule__ServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__3_in_rule__ServiceClient__Group__21698);
            rule__ServiceClient__Group__3();

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
    // $ANTLR end "rule__ServiceClient__Group__2"


    // $ANTLR start "rule__ServiceClient__Group__2__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:878:1: rule__ServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:882:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:883:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:883:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:884:1: '{'
            {
             before(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ServiceClient__Group__2__Impl1726); 
             after(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServiceClient__Group__2__Impl"


    // $ANTLR start "rule__ServiceClient__Group__3"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:897:1: rule__ServiceClient__Group__3 : rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 ;
    public final void rule__ServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:901:1: ( rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:902:2: rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__3__Impl_in_rule__ServiceClient__Group__31757);
            rule__ServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__4_in_rule__ServiceClient__Group__31760);
            rule__ServiceClient__Group__4();

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
    // $ANTLR end "rule__ServiceClient__Group__3"


    // $ANTLR start "rule__ServiceClient__Group__3__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:909:1: rule__ServiceClient__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:913:1: ( ( 'name:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:914:1: ( 'name:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:914:1: ( 'name:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:915:1: 'name:'
            {
             before(grammarAccess.getServiceClientAccess().getNameKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ServiceClient__Group__3__Impl1788); 
             after(grammarAccess.getServiceClientAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__ServiceClient__Group__3__Impl"


    // $ANTLR start "rule__ServiceClient__Group__4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:928:1: rule__ServiceClient__Group__4 : rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 ;
    public final void rule__ServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:932:1: ( rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:933:2: rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__4__Impl_in_rule__ServiceClient__Group__41819);
            rule__ServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__5_in_rule__ServiceClient__Group__41822);
            rule__ServiceClient__Group__5();

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
    // $ANTLR end "rule__ServiceClient__Group__4"


    // $ANTLR start "rule__ServiceClient__Group__4__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:940:1: rule__ServiceClient__Group__4__Impl : ( ( rule__ServiceClient__ServicenameAssignment_4 ) ) ;
    public final void rule__ServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:944:1: ( ( ( rule__ServiceClient__ServicenameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:945:1: ( ( rule__ServiceClient__ServicenameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:945:1: ( ( rule__ServiceClient__ServicenameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:946:1: ( rule__ServiceClient__ServicenameAssignment_4 )
            {
             before(grammarAccess.getServiceClientAccess().getServicenameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:947:1: ( rule__ServiceClient__ServicenameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:947:2: rule__ServiceClient__ServicenameAssignment_4
            {
            pushFollow(FOLLOW_rule__ServiceClient__ServicenameAssignment_4_in_rule__ServiceClient__Group__4__Impl1849);
            rule__ServiceClient__ServicenameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getServicenameAssignment_4()); 

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
    // $ANTLR end "rule__ServiceClient__Group__4__Impl"


    // $ANTLR start "rule__ServiceClient__Group__5"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:957:1: rule__ServiceClient__Group__5 : rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 ;
    public final void rule__ServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:961:1: ( rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:962:2: rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__5__Impl_in_rule__ServiceClient__Group__51879);
            rule__ServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__6_in_rule__ServiceClient__Group__51882);
            rule__ServiceClient__Group__6();

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
    // $ANTLR end "rule__ServiceClient__Group__5"


    // $ANTLR start "rule__ServiceClient__Group__5__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:969:1: rule__ServiceClient__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:973:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:974:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:974:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:975:1: ','
            {
             before(grammarAccess.getServiceClientAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ServiceClient__Group__5__Impl1910); 
             after(grammarAccess.getServiceClientAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__ServiceClient__Group__5__Impl"


    // $ANTLR start "rule__ServiceClient__Group__6"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:988:1: rule__ServiceClient__Group__6 : rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7 ;
    public final void rule__ServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:992:1: ( rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:993:2: rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__6__Impl_in_rule__ServiceClient__Group__61941);
            rule__ServiceClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__7_in_rule__ServiceClient__Group__61944);
            rule__ServiceClient__Group__7();

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
    // $ANTLR end "rule__ServiceClient__Group__6"


    // $ANTLR start "rule__ServiceClient__Group__6__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1000:1: rule__ServiceClient__Group__6__Impl : ( 'srv:' ) ;
    public final void rule__ServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1004:1: ( ( 'srv:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1005:1: ( 'srv:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1005:1: ( 'srv:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1006:1: 'srv:'
            {
             before(grammarAccess.getServiceClientAccess().getSrvKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__ServiceClient__Group__6__Impl1972); 
             after(grammarAccess.getServiceClientAccess().getSrvKeyword_6()); 

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
    // $ANTLR end "rule__ServiceClient__Group__6__Impl"


    // $ANTLR start "rule__ServiceClient__Group__7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1019:1: rule__ServiceClient__Group__7 : rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8 ;
    public final void rule__ServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1023:1: ( rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1024:2: rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__7__Impl_in_rule__ServiceClient__Group__72003);
            rule__ServiceClient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__8_in_rule__ServiceClient__Group__72006);
            rule__ServiceClient__Group__8();

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
    // $ANTLR end "rule__ServiceClient__Group__7"


    // $ANTLR start "rule__ServiceClient__Group__7__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1031:1: rule__ServiceClient__Group__7__Impl : ( ( rule__ServiceClient__ServicesrvAssignment_7 ) ) ;
    public final void rule__ServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1035:1: ( ( ( rule__ServiceClient__ServicesrvAssignment_7 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1036:1: ( ( rule__ServiceClient__ServicesrvAssignment_7 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1036:1: ( ( rule__ServiceClient__ServicesrvAssignment_7 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1037:1: ( rule__ServiceClient__ServicesrvAssignment_7 )
            {
             before(grammarAccess.getServiceClientAccess().getServicesrvAssignment_7()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1038:1: ( rule__ServiceClient__ServicesrvAssignment_7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1038:2: rule__ServiceClient__ServicesrvAssignment_7
            {
            pushFollow(FOLLOW_rule__ServiceClient__ServicesrvAssignment_7_in_rule__ServiceClient__Group__7__Impl2033);
            rule__ServiceClient__ServicesrvAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getServicesrvAssignment_7()); 

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
    // $ANTLR end "rule__ServiceClient__Group__7__Impl"


    // $ANTLR start "rule__ServiceClient__Group__8"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1048:1: rule__ServiceClient__Group__8 : rule__ServiceClient__Group__8__Impl ;
    public final void rule__ServiceClient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1052:1: ( rule__ServiceClient__Group__8__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1053:2: rule__ServiceClient__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__8__Impl_in_rule__ServiceClient__Group__82063);
            rule__ServiceClient__Group__8__Impl();

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
    // $ANTLR end "rule__ServiceClient__Group__8"


    // $ANTLR start "rule__ServiceClient__Group__8__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1059:1: rule__ServiceClient__Group__8__Impl : ( '}' ) ;
    public final void rule__ServiceClient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1063:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1064:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1064:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1065:1: '}'
            {
             before(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ServiceClient__Group__8__Impl2091); 
             after(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ServiceClient__Group__8__Impl"


    // $ANTLR start "rule__ActionState__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1096:1: rule__ActionState__Group__0 : rule__ActionState__Group__0__Impl rule__ActionState__Group__1 ;
    public final void rule__ActionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1100:1: ( rule__ActionState__Group__0__Impl rule__ActionState__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1101:2: rule__ActionState__Group__0__Impl rule__ActionState__Group__1
            {
            pushFollow(FOLLOW_rule__ActionState__Group__0__Impl_in_rule__ActionState__Group__02140);
            rule__ActionState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__1_in_rule__ActionState__Group__02143);
            rule__ActionState__Group__1();

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
    // $ANTLR end "rule__ActionState__Group__0"


    // $ANTLR start "rule__ActionState__Group__0__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1108:1: rule__ActionState__Group__0__Impl : ( 'actionstate' ) ;
    public final void rule__ActionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1112:1: ( ( 'actionstate' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1113:1: ( 'actionstate' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1113:1: ( 'actionstate' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1114:1: 'actionstate'
            {
             before(grammarAccess.getActionStateAccess().getActionstateKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ActionState__Group__0__Impl2171); 
             after(grammarAccess.getActionStateAccess().getActionstateKeyword_0()); 

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
    // $ANTLR end "rule__ActionState__Group__0__Impl"


    // $ANTLR start "rule__ActionState__Group__1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1127:1: rule__ActionState__Group__1 : rule__ActionState__Group__1__Impl rule__ActionState__Group__2 ;
    public final void rule__ActionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1131:1: ( rule__ActionState__Group__1__Impl rule__ActionState__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1132:2: rule__ActionState__Group__1__Impl rule__ActionState__Group__2
            {
            pushFollow(FOLLOW_rule__ActionState__Group__1__Impl_in_rule__ActionState__Group__12202);
            rule__ActionState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__2_in_rule__ActionState__Group__12205);
            rule__ActionState__Group__2();

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
    // $ANTLR end "rule__ActionState__Group__1"


    // $ANTLR start "rule__ActionState__Group__1__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1139:1: rule__ActionState__Group__1__Impl : ( ( rule__ActionState__NameAssignment_1 ) ) ;
    public final void rule__ActionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1143:1: ( ( ( rule__ActionState__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1144:1: ( ( rule__ActionState__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1144:1: ( ( rule__ActionState__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1145:1: ( rule__ActionState__NameAssignment_1 )
            {
             before(grammarAccess.getActionStateAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1146:1: ( rule__ActionState__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1146:2: rule__ActionState__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionState__NameAssignment_1_in_rule__ActionState__Group__1__Impl2232);
            rule__ActionState__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ActionState__Group__1__Impl"


    // $ANTLR start "rule__ActionState__Group__2"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1156:1: rule__ActionState__Group__2 : rule__ActionState__Group__2__Impl rule__ActionState__Group__3 ;
    public final void rule__ActionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1160:1: ( rule__ActionState__Group__2__Impl rule__ActionState__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1161:2: rule__ActionState__Group__2__Impl rule__ActionState__Group__3
            {
            pushFollow(FOLLOW_rule__ActionState__Group__2__Impl_in_rule__ActionState__Group__22262);
            rule__ActionState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__3_in_rule__ActionState__Group__22265);
            rule__ActionState__Group__3();

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
    // $ANTLR end "rule__ActionState__Group__2"


    // $ANTLR start "rule__ActionState__Group__2__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1168:1: rule__ActionState__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1172:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1173:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1173:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1174:1: '{'
            {
             before(grammarAccess.getActionStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ActionState__Group__2__Impl2293); 
             after(grammarAccess.getActionStateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ActionState__Group__2__Impl"


    // $ANTLR start "rule__ActionState__Group__3"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1187:1: rule__ActionState__Group__3 : rule__ActionState__Group__3__Impl rule__ActionState__Group__4 ;
    public final void rule__ActionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1191:1: ( rule__ActionState__Group__3__Impl rule__ActionState__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1192:2: rule__ActionState__Group__3__Impl rule__ActionState__Group__4
            {
            pushFollow(FOLLOW_rule__ActionState__Group__3__Impl_in_rule__ActionState__Group__32324);
            rule__ActionState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__4_in_rule__ActionState__Group__32327);
            rule__ActionState__Group__4();

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
    // $ANTLR end "rule__ActionState__Group__3"


    // $ANTLR start "rule__ActionState__Group__3__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1199:1: rule__ActionState__Group__3__Impl : ( 'client:' ) ;
    public final void rule__ActionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1203:1: ( ( 'client:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1204:1: ( 'client:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1204:1: ( 'client:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1205:1: 'client:'
            {
             before(grammarAccess.getActionStateAccess().getClientKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ActionState__Group__3__Impl2355); 
             after(grammarAccess.getActionStateAccess().getClientKeyword_3()); 

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
    // $ANTLR end "rule__ActionState__Group__3__Impl"


    // $ANTLR start "rule__ActionState__Group__4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1218:1: rule__ActionState__Group__4 : rule__ActionState__Group__4__Impl rule__ActionState__Group__5 ;
    public final void rule__ActionState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1222:1: ( rule__ActionState__Group__4__Impl rule__ActionState__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1223:2: rule__ActionState__Group__4__Impl rule__ActionState__Group__5
            {
            pushFollow(FOLLOW_rule__ActionState__Group__4__Impl_in_rule__ActionState__Group__42386);
            rule__ActionState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__5_in_rule__ActionState__Group__42389);
            rule__ActionState__Group__5();

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
    // $ANTLR end "rule__ActionState__Group__4"


    // $ANTLR start "rule__ActionState__Group__4__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1230:1: rule__ActionState__Group__4__Impl : ( ( rule__ActionState__ClientnameAssignment_4 ) ) ;
    public final void rule__ActionState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1234:1: ( ( ( rule__ActionState__ClientnameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1235:1: ( ( rule__ActionState__ClientnameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1235:1: ( ( rule__ActionState__ClientnameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1236:1: ( rule__ActionState__ClientnameAssignment_4 )
            {
             before(grammarAccess.getActionStateAccess().getClientnameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1237:1: ( rule__ActionState__ClientnameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1237:2: rule__ActionState__ClientnameAssignment_4
            {
            pushFollow(FOLLOW_rule__ActionState__ClientnameAssignment_4_in_rule__ActionState__Group__4__Impl2416);
            rule__ActionState__ClientnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionStateAccess().getClientnameAssignment_4()); 

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
    // $ANTLR end "rule__ActionState__Group__4__Impl"


    // $ANTLR start "rule__ActionState__Group__5"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1247:1: rule__ActionState__Group__5 : rule__ActionState__Group__5__Impl rule__ActionState__Group__6 ;
    public final void rule__ActionState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1251:1: ( rule__ActionState__Group__5__Impl rule__ActionState__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1252:2: rule__ActionState__Group__5__Impl rule__ActionState__Group__6
            {
            pushFollow(FOLLOW_rule__ActionState__Group__5__Impl_in_rule__ActionState__Group__52446);
            rule__ActionState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__6_in_rule__ActionState__Group__52449);
            rule__ActionState__Group__6();

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
    // $ANTLR end "rule__ActionState__Group__5"


    // $ANTLR start "rule__ActionState__Group__5__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1259:1: rule__ActionState__Group__5__Impl : ( ',' ) ;
    public final void rule__ActionState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1263:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1264:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1264:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1265:1: ','
            {
             before(grammarAccess.getActionStateAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ActionState__Group__5__Impl2477); 
             after(grammarAccess.getActionStateAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__ActionState__Group__5__Impl"


    // $ANTLR start "rule__ActionState__Group__6"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1278:1: rule__ActionState__Group__6 : rule__ActionState__Group__6__Impl rule__ActionState__Group__7 ;
    public final void rule__ActionState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1282:1: ( rule__ActionState__Group__6__Impl rule__ActionState__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1283:2: rule__ActionState__Group__6__Impl rule__ActionState__Group__7
            {
            pushFollow(FOLLOW_rule__ActionState__Group__6__Impl_in_rule__ActionState__Group__62508);
            rule__ActionState__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__7_in_rule__ActionState__Group__62511);
            rule__ActionState__Group__7();

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
    // $ANTLR end "rule__ActionState__Group__6"


    // $ANTLR start "rule__ActionState__Group__6__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1290:1: rule__ActionState__Group__6__Impl : ( ( rule__ActionState__TransitionsAssignment_6 )* ) ;
    public final void rule__ActionState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1294:1: ( ( ( rule__ActionState__TransitionsAssignment_6 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1295:1: ( ( rule__ActionState__TransitionsAssignment_6 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1295:1: ( ( rule__ActionState__TransitionsAssignment_6 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1296:1: ( rule__ActionState__TransitionsAssignment_6 )*
            {
             before(grammarAccess.getActionStateAccess().getTransitionsAssignment_6()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1297:1: ( rule__ActionState__TransitionsAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1297:2: rule__ActionState__TransitionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ActionState__TransitionsAssignment_6_in_rule__ActionState__Group__6__Impl2538);
            	    rule__ActionState__TransitionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActionStateAccess().getTransitionsAssignment_6()); 

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
    // $ANTLR end "rule__ActionState__Group__6__Impl"


    // $ANTLR start "rule__ActionState__Group__7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1307:1: rule__ActionState__Group__7 : rule__ActionState__Group__7__Impl rule__ActionState__Group__8 ;
    public final void rule__ActionState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1311:1: ( rule__ActionState__Group__7__Impl rule__ActionState__Group__8 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1312:2: rule__ActionState__Group__7__Impl rule__ActionState__Group__8
            {
            pushFollow(FOLLOW_rule__ActionState__Group__7__Impl_in_rule__ActionState__Group__72569);
            rule__ActionState__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__8_in_rule__ActionState__Group__72572);
            rule__ActionState__Group__8();

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
    // $ANTLR end "rule__ActionState__Group__7"


    // $ANTLR start "rule__ActionState__Group__7__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1319:1: rule__ActionState__Group__7__Impl : ( ',' ) ;
    public final void rule__ActionState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1323:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1324:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1324:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1325:1: ','
            {
             before(grammarAccess.getActionStateAccess().getCommaKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__ActionState__Group__7__Impl2600); 
             after(grammarAccess.getActionStateAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__ActionState__Group__7__Impl"


    // $ANTLR start "rule__ActionState__Group__8"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1338:1: rule__ActionState__Group__8 : rule__ActionState__Group__8__Impl ;
    public final void rule__ActionState__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1342:1: ( rule__ActionState__Group__8__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1343:2: rule__ActionState__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ActionState__Group__8__Impl_in_rule__ActionState__Group__82631);
            rule__ActionState__Group__8__Impl();

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
    // $ANTLR end "rule__ActionState__Group__8"


    // $ANTLR start "rule__ActionState__Group__8__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1349:1: rule__ActionState__Group__8__Impl : ( '}' ) ;
    public final void rule__ActionState__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1353:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1354:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1354:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1355:1: '}'
            {
             before(grammarAccess.getActionStateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ActionState__Group__8__Impl2659); 
             after(grammarAccess.getActionStateAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ActionState__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1386:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1390:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1391:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02708);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02711);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1398:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__OutcomeAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1402:1: ( ( ( rule__Transition__OutcomeAssignment_0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1403:1: ( ( rule__Transition__OutcomeAssignment_0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1403:1: ( ( rule__Transition__OutcomeAssignment_0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1404:1: ( rule__Transition__OutcomeAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getOutcomeAssignment_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1405:1: ( rule__Transition__OutcomeAssignment_0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1405:2: rule__Transition__OutcomeAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__OutcomeAssignment_0_in_rule__Transition__Group__0__Impl2738);
            rule__Transition__OutcomeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutcomeAssignment_0()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1415:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1419:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1420:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12768);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12771);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1427:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1431:1: ( ( '=>' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1432:1: ( '=>' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1432:1: ( '=>' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1433:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Transition__Group__1__Impl2799); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1446:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1450:1: ( rule__Transition__Group__2__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1451:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22830);
            rule__Transition__Group__2__Impl();

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1457:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1461:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1462:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1462:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1463:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1464:1: ( rule__Transition__StateAssignment_2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1464:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2857);
            rule__Transition__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

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


    // $ANTLR start "rule__PrimitivePackage__StatemachinesAssignment"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1481:1: rule__PrimitivePackage__StatemachinesAssignment : ( ruleStateMachine ) ;
    public final void rule__PrimitivePackage__StatemachinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1485:1: ( ( ruleStateMachine ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1486:1: ( ruleStateMachine )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1486:1: ( ruleStateMachine )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1487:1: ruleStateMachine
            {
             before(grammarAccess.getPrimitivePackageAccess().getStatemachinesStateMachineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStateMachine_in_rule__PrimitivePackage__StatemachinesAssignment2898);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getPrimitivePackageAccess().getStatemachinesStateMachineParserRuleCall_0()); 

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
    // $ANTLR end "rule__PrimitivePackage__StatemachinesAssignment"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1497:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1501:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1502:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1502:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1503:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_12930); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__ActionclientsAssignment_3"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1512:1: rule__StateMachine__ActionclientsAssignment_3 : ( ruleActionClient ) ;
    public final void rule__StateMachine__ActionclientsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1516:1: ( ( ruleActionClient ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1517:1: ( ruleActionClient )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1517:1: ( ruleActionClient )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1518:1: ruleActionClient
            {
             before(grammarAccess.getStateMachineAccess().getActionclientsActionClientParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActionClient_in_rule__StateMachine__ActionclientsAssignment_32961);
            ruleActionClient();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getActionclientsActionClientParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StateMachine__ActionclientsAssignment_3"


    // $ANTLR start "rule__StateMachine__ServiceclientsAssignment_4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1527:1: rule__StateMachine__ServiceclientsAssignment_4 : ( ruleServiceClient ) ;
    public final void rule__StateMachine__ServiceclientsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1531:1: ( ( ruleServiceClient ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1532:1: ( ruleServiceClient )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1532:1: ( ruleServiceClient )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1533:1: ruleServiceClient
            {
             before(grammarAccess.getStateMachineAccess().getServiceclientsServiceClientParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleServiceClient_in_rule__StateMachine__ServiceclientsAssignment_42992);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getServiceclientsServiceClientParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StateMachine__ServiceclientsAssignment_4"


    // $ANTLR start "rule__StateMachine__ActionsstatesAssignment_5"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1542:1: rule__StateMachine__ActionsstatesAssignment_5 : ( ruleActionState ) ;
    public final void rule__StateMachine__ActionsstatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1546:1: ( ( ruleActionState ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1547:1: ( ruleActionState )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1547:1: ( ruleActionState )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1548:1: ruleActionState
            {
             before(grammarAccess.getStateMachineAccess().getActionsstatesActionStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleActionState_in_rule__StateMachine__ActionsstatesAssignment_53023);
            ruleActionState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getActionsstatesActionStateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__StateMachine__ActionsstatesAssignment_5"


    // $ANTLR start "rule__ActionClient__NameAssignment_1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1557:1: rule__ActionClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1561:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1562:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1562:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1563:1: RULE_ID
            {
             before(grammarAccess.getActionClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionClient__NameAssignment_13054); 
             after(grammarAccess.getActionClientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionClient__NameAssignment_1"


    // $ANTLR start "rule__ActionClient__ActionameAssignment_4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1572:1: rule__ActionClient__ActionameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ActionClient__ActionameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1576:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1577:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1577:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1578:1: RULE_STRING
            {
             before(grammarAccess.getActionClientAccess().getActionameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionClient__ActionameAssignment_43085); 
             after(grammarAccess.getActionClientAccess().getActionameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ActionClient__ActionameAssignment_4"


    // $ANTLR start "rule__ActionClient__ActiotypeAssignment_7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1587:1: rule__ActionClient__ActiotypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ActionClient__ActiotypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1591:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1592:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1592:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1593:1: RULE_STRING
            {
             before(grammarAccess.getActionClientAccess().getActiotypeSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionClient__ActiotypeAssignment_73116); 
             after(grammarAccess.getActionClientAccess().getActiotypeSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ActionClient__ActiotypeAssignment_7"


    // $ANTLR start "rule__ServiceClient__NameAssignment_1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1602:1: rule__ServiceClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1606:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1607:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1607:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1608:1: RULE_ID
            {
             before(grammarAccess.getServiceClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceClient__NameAssignment_13147); 
             after(grammarAccess.getServiceClientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServiceClient__NameAssignment_1"


    // $ANTLR start "rule__ServiceClient__ServicenameAssignment_4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1617:1: rule__ServiceClient__ServicenameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ServiceClient__ServicenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1621:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1622:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1622:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1623:1: RULE_STRING
            {
             before(grammarAccess.getServiceClientAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicenameAssignment_43178); 
             after(grammarAccess.getServiceClientAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ServiceClient__ServicenameAssignment_4"


    // $ANTLR start "rule__ServiceClient__ServicesrvAssignment_7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1632:1: rule__ServiceClient__ServicesrvAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ServiceClient__ServicesrvAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1636:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1637:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1637:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1638:1: RULE_STRING
            {
             before(grammarAccess.getServiceClientAccess().getServicesrvSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicesrvAssignment_73209); 
             after(grammarAccess.getServiceClientAccess().getServicesrvSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ServiceClient__ServicesrvAssignment_7"


    // $ANTLR start "rule__ActionState__NameAssignment_1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1647:1: rule__ActionState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1651:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1652:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1652:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1653:1: RULE_ID
            {
             before(grammarAccess.getActionStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionState__NameAssignment_13240); 
             after(grammarAccess.getActionStateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionState__NameAssignment_1"


    // $ANTLR start "rule__ActionState__ClientnameAssignment_4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1662:1: rule__ActionState__ClientnameAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ActionState__ClientnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1666:1: ( ( ( RULE_ID ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1667:1: ( ( RULE_ID ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1667:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1668:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStateAccess().getClientnameActionClientCrossReference_4_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1669:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1670:1: RULE_ID
            {
             before(grammarAccess.getActionStateAccess().getClientnameActionClientIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionState__ClientnameAssignment_43275); 
             after(grammarAccess.getActionStateAccess().getClientnameActionClientIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getActionStateAccess().getClientnameActionClientCrossReference_4_0()); 

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
    // $ANTLR end "rule__ActionState__ClientnameAssignment_4"


    // $ANTLR start "rule__ActionState__TransitionsAssignment_6"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1681:1: rule__ActionState__TransitionsAssignment_6 : ( ruleTransition ) ;
    public final void rule__ActionState__TransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1685:1: ( ( ruleTransition ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1686:1: ( ruleTransition )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1686:1: ( ruleTransition )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1687:1: ruleTransition
            {
             before(grammarAccess.getActionStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__ActionState__TransitionsAssignment_63310);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActionStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ActionState__TransitionsAssignment_6"


    // $ANTLR start "rule__Transition__OutcomeAssignment_0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1696:1: rule__Transition__OutcomeAssignment_0 : ( ruleOUTCOME ) ;
    public final void rule__Transition__OutcomeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1700:1: ( ( ruleOUTCOME ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1701:1: ( ruleOUTCOME )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1701:1: ( ruleOUTCOME )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1702:1: ruleOUTCOME
            {
             before(grammarAccess.getTransitionAccess().getOutcomeOUTCOMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOUTCOME_in_rule__Transition__OutcomeAssignment_03341);
            ruleOUTCOME();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutcomeOUTCOMEParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Transition__OutcomeAssignment_0"


    // $ANTLR start "rule__Transition__StateAssignment_2"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1711:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1715:1: ( ( ( RULE_ID ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1716:1: ( ( RULE_ID ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1716:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1717:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateActionStateCrossReference_2_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1718:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1719:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateActionStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23376); 
             after(grammarAccess.getTransitionAccess().getStateActionStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateActionStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Transition__StateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePrimitivePackage_in_entryRulePrimitivePackage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitivePackage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitivePackage__StatemachinesAssignment_in_rulePrimitivePackage94 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionClient_in_entryRuleActionClient184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionClient191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__0_in_ruleActionClient217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceClient_in_entryRuleServiceClient244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceClient251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__0_in_ruleServiceClient277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionState_in_entryRuleActionState304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionState311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__0_in_ruleActionState337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUTCOME431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUTCOME__Alternatives_in_ruleOUTCOME457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OUTCOME__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OUTCOME__Alternatives514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OUTCOME__Alternatives534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateMachine__Group__0__Impl597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2688 = new BitSet(new long[]{0x0000000000A30000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateMachine__Group__2__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3750 = new BitSet(new long[]{0x0000000000A30000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ActionclientsAssignment_3_in_rule__StateMachine__Group__3__Impl780 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4811 = new BitSet(new long[]{0x0000000000A30000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ServiceclientsAssignment_4_in_rule__StateMachine__Group__4__Impl841 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__5872 = new BitSet(new long[]{0x0000000000A30000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ActionsstatesAssignment_5_in_rule__StateMachine__Group__5__Impl902 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateMachine__Group__6__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__0__Impl_in_rule__ActionClient__Group__01006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__1_in_rule__ActionClient__Group__01009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ActionClient__Group__0__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__1__Impl_in_rule__ActionClient__Group__11068 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__2_in_rule__ActionClient__Group__11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__NameAssignment_1_in_rule__ActionClient__Group__1__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__2__Impl_in_rule__ActionClient__Group__21128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__3_in_rule__ActionClient__Group__21131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActionClient__Group__2__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__3__Impl_in_rule__ActionClient__Group__31190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__4_in_rule__ActionClient__Group__31193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ActionClient__Group__3__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__4__Impl_in_rule__ActionClient__Group__41252 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__5_in_rule__ActionClient__Group__41255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__ActionameAssignment_4_in_rule__ActionClient__Group__4__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__5__Impl_in_rule__ActionClient__Group__51312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__6_in_rule__ActionClient__Group__51315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionClient__Group__5__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__6__Impl_in_rule__ActionClient__Group__61374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__7_in_rule__ActionClient__Group__61377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ActionClient__Group__6__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__7__Impl_in_rule__ActionClient__Group__71436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__8_in_rule__ActionClient__Group__71439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__ActiotypeAssignment_7_in_rule__ActionClient__Group__7__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__8__Impl_in_rule__ActionClient__Group__81496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActionClient__Group__8__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__0__Impl_in_rule__ServiceClient__Group__01573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__1_in_rule__ServiceClient__Group__01576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceClient__Group__0__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__1__Impl_in_rule__ServiceClient__Group__11635 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__2_in_rule__ServiceClient__Group__11638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__NameAssignment_1_in_rule__ServiceClient__Group__1__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__2__Impl_in_rule__ServiceClient__Group__21695 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__3_in_rule__ServiceClient__Group__21698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ServiceClient__Group__2__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__3__Impl_in_rule__ServiceClient__Group__31757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__4_in_rule__ServiceClient__Group__31760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ServiceClient__Group__3__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__4__Impl_in_rule__ServiceClient__Group__41819 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__5_in_rule__ServiceClient__Group__41822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__ServicenameAssignment_4_in_rule__ServiceClient__Group__4__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__5__Impl_in_rule__ServiceClient__Group__51879 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__6_in_rule__ServiceClient__Group__51882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceClient__Group__5__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__6__Impl_in_rule__ServiceClient__Group__61941 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__7_in_rule__ServiceClient__Group__61944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ServiceClient__Group__6__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__7__Impl_in_rule__ServiceClient__Group__72003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__8_in_rule__ServiceClient__Group__72006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__ServicesrvAssignment_7_in_rule__ServiceClient__Group__7__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__8__Impl_in_rule__ServiceClient__Group__82063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ServiceClient__Group__8__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__0__Impl_in_rule__ActionState__Group__02140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionState__Group__1_in_rule__ActionState__Group__02143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ActionState__Group__0__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__1__Impl_in_rule__ActionState__Group__12202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__2_in_rule__ActionState__Group__12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__NameAssignment_1_in_rule__ActionState__Group__1__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__2__Impl_in_rule__ActionState__Group__22262 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__3_in_rule__ActionState__Group__22265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActionState__Group__2__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__3__Impl_in_rule__ActionState__Group__32324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionState__Group__4_in_rule__ActionState__Group__32327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActionState__Group__3__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__4__Impl_in_rule__ActionState__Group__42386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__5_in_rule__ActionState__Group__42389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__ClientnameAssignment_4_in_rule__ActionState__Group__4__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__5__Impl_in_rule__ActionState__Group__52446 = new BitSet(new long[]{0x0000000000083800L});
    public static final BitSet FOLLOW_rule__ActionState__Group__6_in_rule__ActionState__Group__52449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionState__Group__5__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__6__Impl_in_rule__ActionState__Group__62508 = new BitSet(new long[]{0x0000000000083800L});
    public static final BitSet FOLLOW_rule__ActionState__Group__7_in_rule__ActionState__Group__62511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__TransitionsAssignment_6_in_rule__ActionState__Group__6__Impl2538 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__ActionState__Group__7__Impl_in_rule__ActionState__Group__72569 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__8_in_rule__ActionState__Group__72572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionState__Group__7__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__8__Impl_in_rule__ActionState__Group__82631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActionState__Group__8__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02708 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__OutcomeAssignment_0_in_rule__Transition__Group__0__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transition__Group__1__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_rule__PrimitivePackage__StatemachinesAssignment2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_12930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionClient_in_rule__StateMachine__ActionclientsAssignment_32961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceClient_in_rule__StateMachine__ServiceclientsAssignment_42992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionState_in_rule__StateMachine__ActionsstatesAssignment_53023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionClient__NameAssignment_13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionClient__ActionameAssignment_43085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionClient__ActiotypeAssignment_73116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceClient__NameAssignment_13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicenameAssignment_43178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicesrvAssignment_73209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionState__NameAssignment_13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionState__ClientnameAssignment_43275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__ActionState__TransitionsAssignment_63310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_rule__Transition__OutcomeAssignment_03341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23376 = new BitSet(new long[]{0x0000000000000002L});

}