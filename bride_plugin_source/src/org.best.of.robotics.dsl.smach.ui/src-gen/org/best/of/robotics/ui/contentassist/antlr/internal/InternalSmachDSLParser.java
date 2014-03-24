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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'succeeded'", "'preempted'", "'aborted'", "'statemachine'", "'{'", "'}'", "'ActionClient'", "'aname:'", "','", "'atype:'", "'ServiceClient'", "'name:'", "'srv:'", "'actionstate'", "'client:'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:204:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:205:1: ( ruleTransition EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:206:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition366);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition373); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:213:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:217:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:218:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:218:1: ( ( rule__Transition__Group__0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:219:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:220:1: ( rule__Transition__Group__0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:220:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition399);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:232:1: entryRuleOUTCOME : ruleOUTCOME EOF ;
    public final void entryRuleOUTCOME() throws RecognitionException {
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:233:1: ( ruleOUTCOME EOF )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:234:1: ruleOUTCOME EOF
            {
             before(grammarAccess.getOUTCOMERule()); 
            pushFollow(FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME426);
            ruleOUTCOME();

            state._fsp--;

             after(grammarAccess.getOUTCOMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUTCOME433); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:241:1: ruleOUTCOME : ( ( rule__OUTCOME__Alternatives ) ) ;
    public final void ruleOUTCOME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:245:2: ( ( ( rule__OUTCOME__Alternatives ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:246:1: ( ( rule__OUTCOME__Alternatives ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:246:1: ( ( rule__OUTCOME__Alternatives ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:247:1: ( rule__OUTCOME__Alternatives )
            {
             before(grammarAccess.getOUTCOMEAccess().getAlternatives()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:248:1: ( rule__OUTCOME__Alternatives )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:248:2: rule__OUTCOME__Alternatives
            {
            pushFollow(FOLLOW_rule__OUTCOME__Alternatives_in_ruleOUTCOME459);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:260:1: rule__OUTCOME__Alternatives : ( ( 'succeeded' ) | ( 'preempted' ) | ( 'aborted' ) );
    public final void rule__OUTCOME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:264:1: ( ( 'succeeded' ) | ( 'preempted' ) | ( 'aborted' ) )
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
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:265:1: ( 'succeeded' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:265:1: ( 'succeeded' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:266:1: 'succeeded'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getSucceededKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__OUTCOME__Alternatives496); 
                     after(grammarAccess.getOUTCOMEAccess().getSucceededKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:273:6: ( 'preempted' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:273:6: ( 'preempted' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:274:1: 'preempted'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getPreemptedKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__OUTCOME__Alternatives516); 
                     after(grammarAccess.getOUTCOMEAccess().getPreemptedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:281:6: ( 'aborted' )
                    {
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:281:6: ( 'aborted' )
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:282:1: 'aborted'
                    {
                     before(grammarAccess.getOUTCOMEAccess().getAbortedKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__OUTCOME__Alternatives536); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:296:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:300:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:301:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0568);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0571);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:308:1: rule__StateMachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:312:1: ( ( 'statemachine' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:313:1: ( 'statemachine' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:313:1: ( 'statemachine' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:314:1: 'statemachine'
            {
             before(grammarAccess.getStateMachineAccess().getStatemachineKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__StateMachine__Group__0__Impl599); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:327:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:331:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:332:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1630);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1633);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:339:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:343:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:344:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:344:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:345:1: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:346:1: ( rule__StateMachine__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:346:2: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl660);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:356:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:360:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:361:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2690);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2693);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:368:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:372:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:373:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:373:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:374:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__StateMachine__Group__2__Impl721); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:387:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:391:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:392:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3752);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3755);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:399:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__ActionclientsAssignment_3 )* ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:403:1: ( ( ( rule__StateMachine__ActionclientsAssignment_3 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:404:1: ( ( rule__StateMachine__ActionclientsAssignment_3 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:404:1: ( ( rule__StateMachine__ActionclientsAssignment_3 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:405:1: ( rule__StateMachine__ActionclientsAssignment_3 )*
            {
             before(grammarAccess.getStateMachineAccess().getActionclientsAssignment_3()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:406:1: ( rule__StateMachine__ActionclientsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:406:2: rule__StateMachine__ActionclientsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ActionclientsAssignment_3_in_rule__StateMachine__Group__3__Impl782);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:416:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:420:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:421:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4813);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__4816);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:428:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__ServiceclientsAssignment_4 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:432:1: ( ( ( rule__StateMachine__ServiceclientsAssignment_4 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:433:1: ( ( rule__StateMachine__ServiceclientsAssignment_4 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:433:1: ( ( rule__StateMachine__ServiceclientsAssignment_4 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:434:1: ( rule__StateMachine__ServiceclientsAssignment_4 )*
            {
             before(grammarAccess.getStateMachineAccess().getServiceclientsAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:435:1: ( rule__StateMachine__ServiceclientsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:435:2: rule__StateMachine__ServiceclientsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ServiceclientsAssignment_4_in_rule__StateMachine__Group__4__Impl843);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:445:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:449:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:450:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__5874);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__5877);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:457:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__ActionsstatesAssignment_5 )* ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:461:1: ( ( ( rule__StateMachine__ActionsstatesAssignment_5 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:462:1: ( ( rule__StateMachine__ActionsstatesAssignment_5 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:462:1: ( ( rule__StateMachine__ActionsstatesAssignment_5 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:463:1: ( rule__StateMachine__ActionsstatesAssignment_5 )*
            {
             before(grammarAccess.getStateMachineAccess().getActionsstatesAssignment_5()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:464:1: ( rule__StateMachine__ActionsstatesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:464:2: rule__StateMachine__ActionsstatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ActionsstatesAssignment_5_in_rule__StateMachine__Group__5__Impl904);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:474:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:478:1: ( rule__StateMachine__Group__6__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:479:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__6935);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:485:1: rule__StateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:489:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:490:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:490:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:491:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__StateMachine__Group__6__Impl963); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:518:1: rule__ActionClient__Group__0 : rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1 ;
    public final void rule__ActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:522:1: ( rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:523:2: rule__ActionClient__Group__0__Impl rule__ActionClient__Group__1
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__0__Impl_in_rule__ActionClient__Group__01008);
            rule__ActionClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__1_in_rule__ActionClient__Group__01011);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:530:1: rule__ActionClient__Group__0__Impl : ( 'ActionClient' ) ;
    public final void rule__ActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:534:1: ( ( 'ActionClient' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:535:1: ( 'ActionClient' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:535:1: ( 'ActionClient' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:536:1: 'ActionClient'
            {
             before(grammarAccess.getActionClientAccess().getActionClientKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ActionClient__Group__0__Impl1039); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:549:1: rule__ActionClient__Group__1 : rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2 ;
    public final void rule__ActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:553:1: ( rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:554:2: rule__ActionClient__Group__1__Impl rule__ActionClient__Group__2
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__1__Impl_in_rule__ActionClient__Group__11070);
            rule__ActionClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__2_in_rule__ActionClient__Group__11073);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:561:1: rule__ActionClient__Group__1__Impl : ( ( rule__ActionClient__NameAssignment_1 ) ) ;
    public final void rule__ActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:565:1: ( ( ( rule__ActionClient__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:566:1: ( ( rule__ActionClient__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:566:1: ( ( rule__ActionClient__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:567:1: ( rule__ActionClient__NameAssignment_1 )
            {
             before(grammarAccess.getActionClientAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:568:1: ( rule__ActionClient__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:568:2: rule__ActionClient__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionClient__NameAssignment_1_in_rule__ActionClient__Group__1__Impl1100);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:578:1: rule__ActionClient__Group__2 : rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3 ;
    public final void rule__ActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:582:1: ( rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:583:2: rule__ActionClient__Group__2__Impl rule__ActionClient__Group__3
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__2__Impl_in_rule__ActionClient__Group__21130);
            rule__ActionClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__3_in_rule__ActionClient__Group__21133);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:590:1: rule__ActionClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:594:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:595:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:595:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:596:1: '{'
            {
             before(grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ActionClient__Group__2__Impl1161); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:609:1: rule__ActionClient__Group__3 : rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4 ;
    public final void rule__ActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:613:1: ( rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:614:2: rule__ActionClient__Group__3__Impl rule__ActionClient__Group__4
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__3__Impl_in_rule__ActionClient__Group__31192);
            rule__ActionClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__4_in_rule__ActionClient__Group__31195);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:621:1: rule__ActionClient__Group__3__Impl : ( 'aname:' ) ;
    public final void rule__ActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:625:1: ( ( 'aname:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:626:1: ( 'aname:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:626:1: ( 'aname:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:627:1: 'aname:'
            {
             before(grammarAccess.getActionClientAccess().getAnameKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ActionClient__Group__3__Impl1223); 
             after(grammarAccess.getActionClientAccess().getAnameKeyword_3()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:640:1: rule__ActionClient__Group__4 : rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5 ;
    public final void rule__ActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:644:1: ( rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:645:2: rule__ActionClient__Group__4__Impl rule__ActionClient__Group__5
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__4__Impl_in_rule__ActionClient__Group__41254);
            rule__ActionClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__5_in_rule__ActionClient__Group__41257);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:652:1: rule__ActionClient__Group__4__Impl : ( ( rule__ActionClient__ActionnameAssignment_4 ) ) ;
    public final void rule__ActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:656:1: ( ( ( rule__ActionClient__ActionnameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:657:1: ( ( rule__ActionClient__ActionnameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:657:1: ( ( rule__ActionClient__ActionnameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:658:1: ( rule__ActionClient__ActionnameAssignment_4 )
            {
             before(grammarAccess.getActionClientAccess().getActionnameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:659:1: ( rule__ActionClient__ActionnameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:659:2: rule__ActionClient__ActionnameAssignment_4
            {
            pushFollow(FOLLOW_rule__ActionClient__ActionnameAssignment_4_in_rule__ActionClient__Group__4__Impl1284);
            rule__ActionClient__ActionnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getActionnameAssignment_4()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:669:1: rule__ActionClient__Group__5 : rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6 ;
    public final void rule__ActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:673:1: ( rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:674:2: rule__ActionClient__Group__5__Impl rule__ActionClient__Group__6
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__5__Impl_in_rule__ActionClient__Group__51314);
            rule__ActionClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__6_in_rule__ActionClient__Group__51317);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:681:1: rule__ActionClient__Group__5__Impl : ( ',' ) ;
    public final void rule__ActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:685:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:686:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:686:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:687:1: ','
            {
             before(grammarAccess.getActionClientAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ActionClient__Group__5__Impl1345); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:700:1: rule__ActionClient__Group__6 : rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7 ;
    public final void rule__ActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:704:1: ( rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:705:2: rule__ActionClient__Group__6__Impl rule__ActionClient__Group__7
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__6__Impl_in_rule__ActionClient__Group__61376);
            rule__ActionClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__7_in_rule__ActionClient__Group__61379);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:712:1: rule__ActionClient__Group__6__Impl : ( 'atype:' ) ;
    public final void rule__ActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:716:1: ( ( 'atype:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:717:1: ( 'atype:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:717:1: ( 'atype:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:718:1: 'atype:'
            {
             before(grammarAccess.getActionClientAccess().getAtypeKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__ActionClient__Group__6__Impl1407); 
             after(grammarAccess.getActionClientAccess().getAtypeKeyword_6()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:731:1: rule__ActionClient__Group__7 : rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8 ;
    public final void rule__ActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:735:1: ( rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:736:2: rule__ActionClient__Group__7__Impl rule__ActionClient__Group__8
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__7__Impl_in_rule__ActionClient__Group__71438);
            rule__ActionClient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionClient__Group__8_in_rule__ActionClient__Group__71441);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:743:1: rule__ActionClient__Group__7__Impl : ( ( rule__ActionClient__ActiontypeAssignment_7 ) ) ;
    public final void rule__ActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:747:1: ( ( ( rule__ActionClient__ActiontypeAssignment_7 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:748:1: ( ( rule__ActionClient__ActiontypeAssignment_7 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:748:1: ( ( rule__ActionClient__ActiontypeAssignment_7 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:749:1: ( rule__ActionClient__ActiontypeAssignment_7 )
            {
             before(grammarAccess.getActionClientAccess().getActiontypeAssignment_7()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:750:1: ( rule__ActionClient__ActiontypeAssignment_7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:750:2: rule__ActionClient__ActiontypeAssignment_7
            {
            pushFollow(FOLLOW_rule__ActionClient__ActiontypeAssignment_7_in_rule__ActionClient__Group__7__Impl1468);
            rule__ActionClient__ActiontypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActionClientAccess().getActiontypeAssignment_7()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:760:1: rule__ActionClient__Group__8 : rule__ActionClient__Group__8__Impl ;
    public final void rule__ActionClient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:764:1: ( rule__ActionClient__Group__8__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:765:2: rule__ActionClient__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ActionClient__Group__8__Impl_in_rule__ActionClient__Group__81498);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:771:1: rule__ActionClient__Group__8__Impl : ( '}' ) ;
    public final void rule__ActionClient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:775:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:776:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:776:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:777:1: '}'
            {
             before(grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ActionClient__Group__8__Impl1526); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:808:1: rule__ServiceClient__Group__0 : rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 ;
    public final void rule__ServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:812:1: ( rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:813:2: rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__0__Impl_in_rule__ServiceClient__Group__01575);
            rule__ServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__1_in_rule__ServiceClient__Group__01578);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:820:1: rule__ServiceClient__Group__0__Impl : ( 'ServiceClient' ) ;
    public final void rule__ServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:824:1: ( ( 'ServiceClient' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:825:1: ( 'ServiceClient' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:825:1: ( 'ServiceClient' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:826:1: 'ServiceClient'
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ServiceClient__Group__0__Impl1606); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:839:1: rule__ServiceClient__Group__1 : rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 ;
    public final void rule__ServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:843:1: ( rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:844:2: rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__1__Impl_in_rule__ServiceClient__Group__11637);
            rule__ServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__2_in_rule__ServiceClient__Group__11640);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:851:1: rule__ServiceClient__Group__1__Impl : ( ( rule__ServiceClient__NameAssignment_1 ) ) ;
    public final void rule__ServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:855:1: ( ( ( rule__ServiceClient__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:856:1: ( ( rule__ServiceClient__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:856:1: ( ( rule__ServiceClient__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:857:1: ( rule__ServiceClient__NameAssignment_1 )
            {
             before(grammarAccess.getServiceClientAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:858:1: ( rule__ServiceClient__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:858:2: rule__ServiceClient__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceClient__NameAssignment_1_in_rule__ServiceClient__Group__1__Impl1667);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:868:1: rule__ServiceClient__Group__2 : rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 ;
    public final void rule__ServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:872:1: ( rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:873:2: rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__2__Impl_in_rule__ServiceClient__Group__21697);
            rule__ServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__3_in_rule__ServiceClient__Group__21700);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:880:1: rule__ServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:884:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:885:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:885:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:886:1: '{'
            {
             before(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ServiceClient__Group__2__Impl1728); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:899:1: rule__ServiceClient__Group__3 : rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 ;
    public final void rule__ServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:903:1: ( rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:904:2: rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__3__Impl_in_rule__ServiceClient__Group__31759);
            rule__ServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__4_in_rule__ServiceClient__Group__31762);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:911:1: rule__ServiceClient__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:915:1: ( ( 'name:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:916:1: ( 'name:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:916:1: ( 'name:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:917:1: 'name:'
            {
             before(grammarAccess.getServiceClientAccess().getNameKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ServiceClient__Group__3__Impl1790); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:930:1: rule__ServiceClient__Group__4 : rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 ;
    public final void rule__ServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:934:1: ( rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:935:2: rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__4__Impl_in_rule__ServiceClient__Group__41821);
            rule__ServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__5_in_rule__ServiceClient__Group__41824);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:942:1: rule__ServiceClient__Group__4__Impl : ( ( rule__ServiceClient__ServicenameAssignment_4 ) ) ;
    public final void rule__ServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:946:1: ( ( ( rule__ServiceClient__ServicenameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:947:1: ( ( rule__ServiceClient__ServicenameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:947:1: ( ( rule__ServiceClient__ServicenameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:948:1: ( rule__ServiceClient__ServicenameAssignment_4 )
            {
             before(grammarAccess.getServiceClientAccess().getServicenameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:949:1: ( rule__ServiceClient__ServicenameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:949:2: rule__ServiceClient__ServicenameAssignment_4
            {
            pushFollow(FOLLOW_rule__ServiceClient__ServicenameAssignment_4_in_rule__ServiceClient__Group__4__Impl1851);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:959:1: rule__ServiceClient__Group__5 : rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 ;
    public final void rule__ServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:963:1: ( rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:964:2: rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__5__Impl_in_rule__ServiceClient__Group__51881);
            rule__ServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__6_in_rule__ServiceClient__Group__51884);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:971:1: rule__ServiceClient__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:975:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:976:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:976:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:977:1: ','
            {
             before(grammarAccess.getServiceClientAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ServiceClient__Group__5__Impl1912); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:990:1: rule__ServiceClient__Group__6 : rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7 ;
    public final void rule__ServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:994:1: ( rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:995:2: rule__ServiceClient__Group__6__Impl rule__ServiceClient__Group__7
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__6__Impl_in_rule__ServiceClient__Group__61943);
            rule__ServiceClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__7_in_rule__ServiceClient__Group__61946);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1002:1: rule__ServiceClient__Group__6__Impl : ( 'srv:' ) ;
    public final void rule__ServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1006:1: ( ( 'srv:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1007:1: ( 'srv:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1007:1: ( 'srv:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1008:1: 'srv:'
            {
             before(grammarAccess.getServiceClientAccess().getSrvKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__ServiceClient__Group__6__Impl1974); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1021:1: rule__ServiceClient__Group__7 : rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8 ;
    public final void rule__ServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1025:1: ( rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1026:2: rule__ServiceClient__Group__7__Impl rule__ServiceClient__Group__8
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__7__Impl_in_rule__ServiceClient__Group__72005);
            rule__ServiceClient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceClient__Group__8_in_rule__ServiceClient__Group__72008);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1033:1: rule__ServiceClient__Group__7__Impl : ( ( rule__ServiceClient__ServicesrvAssignment_7 ) ) ;
    public final void rule__ServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1037:1: ( ( ( rule__ServiceClient__ServicesrvAssignment_7 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1038:1: ( ( rule__ServiceClient__ServicesrvAssignment_7 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1038:1: ( ( rule__ServiceClient__ServicesrvAssignment_7 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1039:1: ( rule__ServiceClient__ServicesrvAssignment_7 )
            {
             before(grammarAccess.getServiceClientAccess().getServicesrvAssignment_7()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1040:1: ( rule__ServiceClient__ServicesrvAssignment_7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1040:2: rule__ServiceClient__ServicesrvAssignment_7
            {
            pushFollow(FOLLOW_rule__ServiceClient__ServicesrvAssignment_7_in_rule__ServiceClient__Group__7__Impl2035);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1050:1: rule__ServiceClient__Group__8 : rule__ServiceClient__Group__8__Impl ;
    public final void rule__ServiceClient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1054:1: ( rule__ServiceClient__Group__8__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1055:2: rule__ServiceClient__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ServiceClient__Group__8__Impl_in_rule__ServiceClient__Group__82065);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1061:1: rule__ServiceClient__Group__8__Impl : ( '}' ) ;
    public final void rule__ServiceClient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1065:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1066:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1066:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1067:1: '}'
            {
             before(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ServiceClient__Group__8__Impl2093); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1098:1: rule__ActionState__Group__0 : rule__ActionState__Group__0__Impl rule__ActionState__Group__1 ;
    public final void rule__ActionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1102:1: ( rule__ActionState__Group__0__Impl rule__ActionState__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1103:2: rule__ActionState__Group__0__Impl rule__ActionState__Group__1
            {
            pushFollow(FOLLOW_rule__ActionState__Group__0__Impl_in_rule__ActionState__Group__02142);
            rule__ActionState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__1_in_rule__ActionState__Group__02145);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1110:1: rule__ActionState__Group__0__Impl : ( 'actionstate' ) ;
    public final void rule__ActionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1114:1: ( ( 'actionstate' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1115:1: ( 'actionstate' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1115:1: ( 'actionstate' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1116:1: 'actionstate'
            {
             before(grammarAccess.getActionStateAccess().getActionstateKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ActionState__Group__0__Impl2173); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1129:1: rule__ActionState__Group__1 : rule__ActionState__Group__1__Impl rule__ActionState__Group__2 ;
    public final void rule__ActionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1133:1: ( rule__ActionState__Group__1__Impl rule__ActionState__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1134:2: rule__ActionState__Group__1__Impl rule__ActionState__Group__2
            {
            pushFollow(FOLLOW_rule__ActionState__Group__1__Impl_in_rule__ActionState__Group__12204);
            rule__ActionState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__2_in_rule__ActionState__Group__12207);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1141:1: rule__ActionState__Group__1__Impl : ( ( rule__ActionState__NameAssignment_1 ) ) ;
    public final void rule__ActionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1145:1: ( ( ( rule__ActionState__NameAssignment_1 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1146:1: ( ( rule__ActionState__NameAssignment_1 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1146:1: ( ( rule__ActionState__NameAssignment_1 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1147:1: ( rule__ActionState__NameAssignment_1 )
            {
             before(grammarAccess.getActionStateAccess().getNameAssignment_1()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1148:1: ( rule__ActionState__NameAssignment_1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1148:2: rule__ActionState__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionState__NameAssignment_1_in_rule__ActionState__Group__1__Impl2234);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1158:1: rule__ActionState__Group__2 : rule__ActionState__Group__2__Impl rule__ActionState__Group__3 ;
    public final void rule__ActionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1162:1: ( rule__ActionState__Group__2__Impl rule__ActionState__Group__3 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1163:2: rule__ActionState__Group__2__Impl rule__ActionState__Group__3
            {
            pushFollow(FOLLOW_rule__ActionState__Group__2__Impl_in_rule__ActionState__Group__22264);
            rule__ActionState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__3_in_rule__ActionState__Group__22267);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1170:1: rule__ActionState__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1174:1: ( ( '{' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1175:1: ( '{' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1175:1: ( '{' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1176:1: '{'
            {
             before(grammarAccess.getActionStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ActionState__Group__2__Impl2295); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1189:1: rule__ActionState__Group__3 : rule__ActionState__Group__3__Impl rule__ActionState__Group__4 ;
    public final void rule__ActionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1193:1: ( rule__ActionState__Group__3__Impl rule__ActionState__Group__4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1194:2: rule__ActionState__Group__3__Impl rule__ActionState__Group__4
            {
            pushFollow(FOLLOW_rule__ActionState__Group__3__Impl_in_rule__ActionState__Group__32326);
            rule__ActionState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__4_in_rule__ActionState__Group__32329);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1201:1: rule__ActionState__Group__3__Impl : ( 'client:' ) ;
    public final void rule__ActionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1205:1: ( ( 'client:' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1206:1: ( 'client:' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1206:1: ( 'client:' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1207:1: 'client:'
            {
             before(grammarAccess.getActionStateAccess().getClientKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ActionState__Group__3__Impl2357); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1220:1: rule__ActionState__Group__4 : rule__ActionState__Group__4__Impl rule__ActionState__Group__5 ;
    public final void rule__ActionState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1224:1: ( rule__ActionState__Group__4__Impl rule__ActionState__Group__5 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1225:2: rule__ActionState__Group__4__Impl rule__ActionState__Group__5
            {
            pushFollow(FOLLOW_rule__ActionState__Group__4__Impl_in_rule__ActionState__Group__42388);
            rule__ActionState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__5_in_rule__ActionState__Group__42391);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1232:1: rule__ActionState__Group__4__Impl : ( ( rule__ActionState__ClientnameAssignment_4 ) ) ;
    public final void rule__ActionState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1236:1: ( ( ( rule__ActionState__ClientnameAssignment_4 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1237:1: ( ( rule__ActionState__ClientnameAssignment_4 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1237:1: ( ( rule__ActionState__ClientnameAssignment_4 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1238:1: ( rule__ActionState__ClientnameAssignment_4 )
            {
             before(grammarAccess.getActionStateAccess().getClientnameAssignment_4()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1239:1: ( rule__ActionState__ClientnameAssignment_4 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1239:2: rule__ActionState__ClientnameAssignment_4
            {
            pushFollow(FOLLOW_rule__ActionState__ClientnameAssignment_4_in_rule__ActionState__Group__4__Impl2418);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1249:1: rule__ActionState__Group__5 : rule__ActionState__Group__5__Impl rule__ActionState__Group__6 ;
    public final void rule__ActionState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1253:1: ( rule__ActionState__Group__5__Impl rule__ActionState__Group__6 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1254:2: rule__ActionState__Group__5__Impl rule__ActionState__Group__6
            {
            pushFollow(FOLLOW_rule__ActionState__Group__5__Impl_in_rule__ActionState__Group__52448);
            rule__ActionState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__6_in_rule__ActionState__Group__52451);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1261:1: rule__ActionState__Group__5__Impl : ( ',' ) ;
    public final void rule__ActionState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1265:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1266:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1266:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1267:1: ','
            {
             before(grammarAccess.getActionStateAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ActionState__Group__5__Impl2479); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1280:1: rule__ActionState__Group__6 : rule__ActionState__Group__6__Impl rule__ActionState__Group__7 ;
    public final void rule__ActionState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1284:1: ( rule__ActionState__Group__6__Impl rule__ActionState__Group__7 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1285:2: rule__ActionState__Group__6__Impl rule__ActionState__Group__7
            {
            pushFollow(FOLLOW_rule__ActionState__Group__6__Impl_in_rule__ActionState__Group__62510);
            rule__ActionState__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group__7_in_rule__ActionState__Group__62513);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1292:1: rule__ActionState__Group__6__Impl : ( ( rule__ActionState__Group_6__0 )? ) ;
    public final void rule__ActionState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1296:1: ( ( ( rule__ActionState__Group_6__0 )? ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1297:1: ( ( rule__ActionState__Group_6__0 )? )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1297:1: ( ( rule__ActionState__Group_6__0 )? )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1298:1: ( rule__ActionState__Group_6__0 )?
            {
             before(grammarAccess.getActionStateAccess().getGroup_6()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1299:1: ( rule__ActionState__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=13)||LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1299:2: rule__ActionState__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ActionState__Group_6__0_in_rule__ActionState__Group__6__Impl2540);
                    rule__ActionState__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionStateAccess().getGroup_6()); 

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1309:1: rule__ActionState__Group__7 : rule__ActionState__Group__7__Impl ;
    public final void rule__ActionState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1313:1: ( rule__ActionState__Group__7__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1314:2: rule__ActionState__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ActionState__Group__7__Impl_in_rule__ActionState__Group__72571);
            rule__ActionState__Group__7__Impl();

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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1320:1: rule__ActionState__Group__7__Impl : ( '}' ) ;
    public final void rule__ActionState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1324:1: ( ( '}' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1325:1: ( '}' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1325:1: ( '}' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1326:1: '}'
            {
             before(grammarAccess.getActionStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__ActionState__Group__7__Impl2599); 
             after(grammarAccess.getActionStateAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__ActionState__Group_6__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1355:1: rule__ActionState__Group_6__0 : rule__ActionState__Group_6__0__Impl rule__ActionState__Group_6__1 ;
    public final void rule__ActionState__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1359:1: ( rule__ActionState__Group_6__0__Impl rule__ActionState__Group_6__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1360:2: rule__ActionState__Group_6__0__Impl rule__ActionState__Group_6__1
            {
            pushFollow(FOLLOW_rule__ActionState__Group_6__0__Impl_in_rule__ActionState__Group_6__02646);
            rule__ActionState__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionState__Group_6__1_in_rule__ActionState__Group_6__02649);
            rule__ActionState__Group_6__1();

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
    // $ANTLR end "rule__ActionState__Group_6__0"


    // $ANTLR start "rule__ActionState__Group_6__0__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1367:1: rule__ActionState__Group_6__0__Impl : ( ( rule__ActionState__TransitionsAssignment_6_0 )* ) ;
    public final void rule__ActionState__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1371:1: ( ( ( rule__ActionState__TransitionsAssignment_6_0 )* ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1372:1: ( ( rule__ActionState__TransitionsAssignment_6_0 )* )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1372:1: ( ( rule__ActionState__TransitionsAssignment_6_0 )* )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1373:1: ( rule__ActionState__TransitionsAssignment_6_0 )*
            {
             before(grammarAccess.getActionStateAccess().getTransitionsAssignment_6_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1374:1: ( rule__ActionState__TransitionsAssignment_6_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=13)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1374:2: rule__ActionState__TransitionsAssignment_6_0
            	    {
            	    pushFollow(FOLLOW_rule__ActionState__TransitionsAssignment_6_0_in_rule__ActionState__Group_6__0__Impl2676);
            	    rule__ActionState__TransitionsAssignment_6_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getActionStateAccess().getTransitionsAssignment_6_0()); 

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
    // $ANTLR end "rule__ActionState__Group_6__0__Impl"


    // $ANTLR start "rule__ActionState__Group_6__1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1384:1: rule__ActionState__Group_6__1 : rule__ActionState__Group_6__1__Impl ;
    public final void rule__ActionState__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1388:1: ( rule__ActionState__Group_6__1__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1389:2: rule__ActionState__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionState__Group_6__1__Impl_in_rule__ActionState__Group_6__12707);
            rule__ActionState__Group_6__1__Impl();

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
    // $ANTLR end "rule__ActionState__Group_6__1"


    // $ANTLR start "rule__ActionState__Group_6__1__Impl"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1395:1: rule__ActionState__Group_6__1__Impl : ( ',' ) ;
    public final void rule__ActionState__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1399:1: ( ( ',' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1400:1: ( ',' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1400:1: ( ',' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1401:1: ','
            {
             before(grammarAccess.getActionStateAccess().getCommaKeyword_6_1()); 
            match(input,19,FOLLOW_19_in_rule__ActionState__Group_6__1__Impl2735); 
             after(grammarAccess.getActionStateAccess().getCommaKeyword_6_1()); 

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
    // $ANTLR end "rule__ActionState__Group_6__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1418:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1422:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1423:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02770);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02773);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1430:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__OutcomeAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1434:1: ( ( ( rule__Transition__OutcomeAssignment_0 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1435:1: ( ( rule__Transition__OutcomeAssignment_0 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1435:1: ( ( rule__Transition__OutcomeAssignment_0 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1436:1: ( rule__Transition__OutcomeAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getOutcomeAssignment_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1437:1: ( rule__Transition__OutcomeAssignment_0 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1437:2: rule__Transition__OutcomeAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__OutcomeAssignment_0_in_rule__Transition__Group__0__Impl2800);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1447:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1451:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1452:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12830);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12833);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1459:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1463:1: ( ( '=>' ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1464:1: ( '=>' )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1464:1: ( '=>' )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1465:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Transition__Group__1__Impl2861); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1478:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1482:1: ( rule__Transition__Group__2__Impl )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1483:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22892);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1489:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1493:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1494:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1494:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1495:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1496:1: ( rule__Transition__StateAssignment_2 )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1496:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2919);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1513:1: rule__PrimitivePackage__StatemachinesAssignment : ( ruleStateMachine ) ;
    public final void rule__PrimitivePackage__StatemachinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1517:1: ( ( ruleStateMachine ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1518:1: ( ruleStateMachine )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1518:1: ( ruleStateMachine )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1519:1: ruleStateMachine
            {
             before(grammarAccess.getPrimitivePackageAccess().getStatemachinesStateMachineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStateMachine_in_rule__PrimitivePackage__StatemachinesAssignment2960);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1529:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1533:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1534:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1534:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1535:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_12992); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1544:1: rule__StateMachine__ActionclientsAssignment_3 : ( ruleActionClient ) ;
    public final void rule__StateMachine__ActionclientsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1548:1: ( ( ruleActionClient ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1549:1: ( ruleActionClient )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1549:1: ( ruleActionClient )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1550:1: ruleActionClient
            {
             before(grammarAccess.getStateMachineAccess().getActionclientsActionClientParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActionClient_in_rule__StateMachine__ActionclientsAssignment_33023);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1559:1: rule__StateMachine__ServiceclientsAssignment_4 : ( ruleServiceClient ) ;
    public final void rule__StateMachine__ServiceclientsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1563:1: ( ( ruleServiceClient ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1564:1: ( ruleServiceClient )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1564:1: ( ruleServiceClient )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1565:1: ruleServiceClient
            {
             before(grammarAccess.getStateMachineAccess().getServiceclientsServiceClientParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleServiceClient_in_rule__StateMachine__ServiceclientsAssignment_43054);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1574:1: rule__StateMachine__ActionsstatesAssignment_5 : ( ruleActionState ) ;
    public final void rule__StateMachine__ActionsstatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1578:1: ( ( ruleActionState ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1579:1: ( ruleActionState )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1579:1: ( ruleActionState )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1580:1: ruleActionState
            {
             before(grammarAccess.getStateMachineAccess().getActionsstatesActionStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleActionState_in_rule__StateMachine__ActionsstatesAssignment_53085);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1589:1: rule__ActionClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1593:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1594:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1594:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1595:1: RULE_ID
            {
             before(grammarAccess.getActionClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionClient__NameAssignment_13116); 
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


    // $ANTLR start "rule__ActionClient__ActionnameAssignment_4"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1604:1: rule__ActionClient__ActionnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ActionClient__ActionnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1608:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1609:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1609:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1610:1: RULE_STRING
            {
             before(grammarAccess.getActionClientAccess().getActionnameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionClient__ActionnameAssignment_43147); 
             after(grammarAccess.getActionClientAccess().getActionnameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ActionClient__ActionnameAssignment_4"


    // $ANTLR start "rule__ActionClient__ActiontypeAssignment_7"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1619:1: rule__ActionClient__ActiontypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ActionClient__ActiontypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1623:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1624:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1624:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1625:1: RULE_STRING
            {
             before(grammarAccess.getActionClientAccess().getActiontypeSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionClient__ActiontypeAssignment_73178); 
             after(grammarAccess.getActionClientAccess().getActiontypeSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ActionClient__ActiontypeAssignment_7"


    // $ANTLR start "rule__ServiceClient__NameAssignment_1"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1634:1: rule__ServiceClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1638:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1639:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1639:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1640:1: RULE_ID
            {
             before(grammarAccess.getServiceClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceClient__NameAssignment_13209); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1649:1: rule__ServiceClient__ServicenameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ServiceClient__ServicenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1653:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1654:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1654:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1655:1: RULE_STRING
            {
             before(grammarAccess.getServiceClientAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicenameAssignment_43240); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1664:1: rule__ServiceClient__ServicesrvAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ServiceClient__ServicesrvAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1668:1: ( ( RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1669:1: ( RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1669:1: ( RULE_STRING )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1670:1: RULE_STRING
            {
             before(grammarAccess.getServiceClientAccess().getServicesrvSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicesrvAssignment_73271); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1679:1: rule__ActionState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1683:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1684:1: ( RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1684:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1685:1: RULE_ID
            {
             before(grammarAccess.getActionStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionState__NameAssignment_13302); 
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1694:1: rule__ActionState__ClientnameAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ActionState__ClientnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1698:1: ( ( ( RULE_ID ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1699:1: ( ( RULE_ID ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1699:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1700:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStateAccess().getClientnameActionClientCrossReference_4_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1701:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1702:1: RULE_ID
            {
             before(grammarAccess.getActionStateAccess().getClientnameActionClientIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionState__ClientnameAssignment_43337); 
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


    // $ANTLR start "rule__ActionState__TransitionsAssignment_6_0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1713:1: rule__ActionState__TransitionsAssignment_6_0 : ( ruleTransition ) ;
    public final void rule__ActionState__TransitionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1717:1: ( ( ruleTransition ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1718:1: ( ruleTransition )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1718:1: ( ruleTransition )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1719:1: ruleTransition
            {
             before(grammarAccess.getActionStateAccess().getTransitionsTransitionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__ActionState__TransitionsAssignment_6_03372);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActionStateAccess().getTransitionsTransitionParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__ActionState__TransitionsAssignment_6_0"


    // $ANTLR start "rule__Transition__OutcomeAssignment_0"
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1728:1: rule__Transition__OutcomeAssignment_0 : ( ruleOUTCOME ) ;
    public final void rule__Transition__OutcomeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1732:1: ( ( ruleOUTCOME ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1733:1: ( ruleOUTCOME )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1733:1: ( ruleOUTCOME )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1734:1: ruleOUTCOME
            {
             before(grammarAccess.getTransitionAccess().getOutcomeOUTCOMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOUTCOME_in_rule__Transition__OutcomeAssignment_03403);
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
    // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1743:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1747:1: ( ( ( RULE_ID ) ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1748:1: ( ( RULE_ID ) )
            {
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1748:1: ( ( RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1749:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateActionStateCrossReference_2_0()); 
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1750:1: ( RULE_ID )
            // ../org.best.of.robotics.dsl.smach.ui/src-gen/org/best/of/robotics/ui/contentassist/antlr/internal/InternalSmachDSL.g:1751:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateActionStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23438); 
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
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUTCOME433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUTCOME__Alternatives_in_ruleOUTCOME459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OUTCOME__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OUTCOME__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OUTCOME__Alternatives536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateMachine__Group__0__Impl599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2690 = new BitSet(new long[]{0x0000000001230000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateMachine__Group__2__Impl721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3752 = new BitSet(new long[]{0x0000000001230000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ActionclientsAssignment_3_in_rule__StateMachine__Group__3__Impl782 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4813 = new BitSet(new long[]{0x0000000001230000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ServiceclientsAssignment_4_in_rule__StateMachine__Group__4__Impl843 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__5874 = new BitSet(new long[]{0x0000000001230000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ActionsstatesAssignment_5_in_rule__StateMachine__Group__5__Impl904 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateMachine__Group__6__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__0__Impl_in_rule__ActionClient__Group__01008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__1_in_rule__ActionClient__Group__01011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ActionClient__Group__0__Impl1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__1__Impl_in_rule__ActionClient__Group__11070 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__2_in_rule__ActionClient__Group__11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__NameAssignment_1_in_rule__ActionClient__Group__1__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__2__Impl_in_rule__ActionClient__Group__21130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__3_in_rule__ActionClient__Group__21133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActionClient__Group__2__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__3__Impl_in_rule__ActionClient__Group__31192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__4_in_rule__ActionClient__Group__31195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ActionClient__Group__3__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__4__Impl_in_rule__ActionClient__Group__41254 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__5_in_rule__ActionClient__Group__41257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__ActionnameAssignment_4_in_rule__ActionClient__Group__4__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__5__Impl_in_rule__ActionClient__Group__51314 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__6_in_rule__ActionClient__Group__51317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionClient__Group__5__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__6__Impl_in_rule__ActionClient__Group__61376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__7_in_rule__ActionClient__Group__61379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ActionClient__Group__6__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__7__Impl_in_rule__ActionClient__Group__71438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__8_in_rule__ActionClient__Group__71441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__ActiontypeAssignment_7_in_rule__ActionClient__Group__7__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionClient__Group__8__Impl_in_rule__ActionClient__Group__81498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActionClient__Group__8__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__0__Impl_in_rule__ServiceClient__Group__01575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__1_in_rule__ServiceClient__Group__01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceClient__Group__0__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__1__Impl_in_rule__ServiceClient__Group__11637 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__2_in_rule__ServiceClient__Group__11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__NameAssignment_1_in_rule__ServiceClient__Group__1__Impl1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__2__Impl_in_rule__ServiceClient__Group__21697 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__3_in_rule__ServiceClient__Group__21700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ServiceClient__Group__2__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__3__Impl_in_rule__ServiceClient__Group__31759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__4_in_rule__ServiceClient__Group__31762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ServiceClient__Group__3__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__4__Impl_in_rule__ServiceClient__Group__41821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__5_in_rule__ServiceClient__Group__41824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__ServicenameAssignment_4_in_rule__ServiceClient__Group__4__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__5__Impl_in_rule__ServiceClient__Group__51881 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__6_in_rule__ServiceClient__Group__51884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceClient__Group__5__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__6__Impl_in_rule__ServiceClient__Group__61943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__7_in_rule__ServiceClient__Group__61946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ServiceClient__Group__6__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__7__Impl_in_rule__ServiceClient__Group__72005 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__8_in_rule__ServiceClient__Group__72008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__ServicesrvAssignment_7_in_rule__ServiceClient__Group__7__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceClient__Group__8__Impl_in_rule__ServiceClient__Group__82065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ServiceClient__Group__8__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__0__Impl_in_rule__ActionState__Group__02142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionState__Group__1_in_rule__ActionState__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActionState__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__1__Impl_in_rule__ActionState__Group__12204 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__2_in_rule__ActionState__Group__12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__NameAssignment_1_in_rule__ActionState__Group__1__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__2__Impl_in_rule__ActionState__Group__22264 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__3_in_rule__ActionState__Group__22267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActionState__Group__2__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__3__Impl_in_rule__ActionState__Group__32326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionState__Group__4_in_rule__ActionState__Group__32329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActionState__Group__3__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__4__Impl_in_rule__ActionState__Group__42388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ActionState__Group__5_in_rule__ActionState__Group__42391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__ClientnameAssignment_4_in_rule__ActionState__Group__4__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__5__Impl_in_rule__ActionState__Group__52448 = new BitSet(new long[]{0x0000000000093800L});
    public static final BitSet FOLLOW_rule__ActionState__Group__6_in_rule__ActionState__Group__52451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionState__Group__5__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__6__Impl_in_rule__ActionState__Group__62510 = new BitSet(new long[]{0x0000000000093800L});
    public static final BitSet FOLLOW_rule__ActionState__Group__7_in_rule__ActionState__Group__62513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group_6__0_in_rule__ActionState__Group__6__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group__7__Impl_in_rule__ActionState__Group__72571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActionState__Group__7__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__Group_6__0__Impl_in_rule__ActionState__Group_6__02646 = new BitSet(new long[]{0x0000000000083800L});
    public static final BitSet FOLLOW_rule__ActionState__Group_6__1_in_rule__ActionState__Group_6__02649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionState__TransitionsAssignment_6_0_in_rule__ActionState__Group_6__0__Impl2676 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__ActionState__Group_6__1__Impl_in_rule__ActionState__Group_6__12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActionState__Group_6__1__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02770 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__OutcomeAssignment_0_in_rule__Transition__Group__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Transition__Group__1__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_rule__PrimitivePackage__StatemachinesAssignment2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionClient_in_rule__StateMachine__ActionclientsAssignment_33023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceClient_in_rule__StateMachine__ServiceclientsAssignment_43054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionState_in_rule__StateMachine__ActionsstatesAssignment_53085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionClient__NameAssignment_13116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionClient__ActionnameAssignment_43147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionClient__ActiontypeAssignment_73178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceClient__NameAssignment_13209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicenameAssignment_43240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceClient__ServicesrvAssignment_73271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionState__NameAssignment_13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionState__ClientnameAssignment_43337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__ActionState__TransitionsAssignment_6_03372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_rule__Transition__OutcomeAssignment_03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23438 = new BitSet(new long[]{0x0000000000000002L});

}