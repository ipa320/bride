package org.best.of.robotics.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.best.of.robotics.services.SmachDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmachDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statemachine'", "'{'", "'}'", "'ActionClient'", "'aname:'", "','", "'atype:'", "'ServiceClient'", "'name:'", "'srv:'", "'actionstate'", "'client:'", "'=>'", "'succeeded'", "'preempted'", "'aborted'"
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
    public String getGrammarFileName() { return "../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g"; }



     	private SmachDSLGrammarAccess grammarAccess;
     	
        public InternalSmachDSLParser(TokenStream input, SmachDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PrimitivePackage";	
       	}
       	
       	@Override
       	protected SmachDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePrimitivePackage"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:67:1: entryRulePrimitivePackage returns [EObject current=null] : iv_rulePrimitivePackage= rulePrimitivePackage EOF ;
    public final EObject entryRulePrimitivePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePackage = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:68:2: (iv_rulePrimitivePackage= rulePrimitivePackage EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:69:2: iv_rulePrimitivePackage= rulePrimitivePackage EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePackageRule()); 
            pushFollow(FOLLOW_rulePrimitivePackage_in_entryRulePrimitivePackage75);
            iv_rulePrimitivePackage=rulePrimitivePackage();

            state._fsp--;

             current =iv_rulePrimitivePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitivePackage85); 

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
    // $ANTLR end "entryRulePrimitivePackage"


    // $ANTLR start "rulePrimitivePackage"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:76:1: rulePrimitivePackage returns [EObject current=null] : ( (lv_statemachines_0_0= ruleStateMachine ) )* ;
    public final EObject rulePrimitivePackage() throws RecognitionException {
        EObject current = null;

        EObject lv_statemachines_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:79:28: ( ( (lv_statemachines_0_0= ruleStateMachine ) )* )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:80:1: ( (lv_statemachines_0_0= ruleStateMachine ) )*
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:80:1: ( (lv_statemachines_0_0= ruleStateMachine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:81:1: (lv_statemachines_0_0= ruleStateMachine )
            	    {
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:81:1: (lv_statemachines_0_0= ruleStateMachine )
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:82:3: lv_statemachines_0_0= ruleStateMachine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimitivePackageAccess().getStatemachinesStateMachineParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateMachine_in_rulePrimitivePackage130);
            	    lv_statemachines_0_0=ruleStateMachine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrimitivePackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statemachines",
            	            		lv_statemachines_0_0, 
            	            		"StateMachine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulePrimitivePackage"


    // $ANTLR start "entryRuleStateMachine"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:108:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:109:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:110:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine168);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine178); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:117:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actionclients_3_0= ruleActionClient ) )* ( (lv_serviceclients_4_0= ruleServiceClient ) )* ( (lv_actionsstates_5_0= ruleActionState ) )* otherlv_6= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_actionclients_3_0 = null;

        EObject lv_serviceclients_4_0 = null;

        EObject lv_actionsstates_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:120:28: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actionclients_3_0= ruleActionClient ) )* ( (lv_serviceclients_4_0= ruleServiceClient ) )* ( (lv_actionsstates_5_0= ruleActionState ) )* otherlv_6= '}' ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:121:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actionclients_3_0= ruleActionClient ) )* ( (lv_serviceclients_4_0= ruleServiceClient ) )* ( (lv_actionsstates_5_0= ruleActionState ) )* otherlv_6= '}' )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:121:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actionclients_3_0= ruleActionClient ) )* ( (lv_serviceclients_4_0= ruleServiceClient ) )* ( (lv_actionsstates_5_0= ruleActionState ) )* otherlv_6= '}' )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:121:3: otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actionclients_3_0= ruleActionClient ) )* ( (lv_serviceclients_4_0= ruleServiceClient ) )* ( (lv_actionsstates_5_0= ruleActionState ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStateMachine215); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStatemachineKeyword_0());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:125:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:126:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:126:1: (lv_name_1_0= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:127:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateMachine232); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStateMachine249); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:147:1: ( (lv_actionclients_3_0= ruleActionClient ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:148:1: (lv_actionclients_3_0= ruleActionClient )
            	    {
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:148:1: (lv_actionclients_3_0= ruleActionClient )
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:149:3: lv_actionclients_3_0= ruleActionClient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getActionclientsActionClientParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionClient_in_ruleStateMachine270);
            	    lv_actionclients_3_0=ruleActionClient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actionclients",
            	            		lv_actionclients_3_0, 
            	            		"ActionClient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:165:3: ( (lv_serviceclients_4_0= ruleServiceClient ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:166:1: (lv_serviceclients_4_0= ruleServiceClient )
            	    {
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:166:1: (lv_serviceclients_4_0= ruleServiceClient )
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:167:3: lv_serviceclients_4_0= ruleServiceClient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getServiceclientsServiceClientParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceClient_in_ruleStateMachine292);
            	    lv_serviceclients_4_0=ruleServiceClient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceclients",
            	            		lv_serviceclients_4_0, 
            	            		"ServiceClient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:183:3: ( (lv_actionsstates_5_0= ruleActionState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:184:1: (lv_actionsstates_5_0= ruleActionState )
            	    {
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:184:1: (lv_actionsstates_5_0= ruleActionState )
            	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:185:3: lv_actionsstates_5_0= ruleActionState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getActionsstatesActionStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionState_in_ruleStateMachine314);
            	    lv_actionsstates_5_0=ruleActionState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actionsstates",
            	            		lv_actionsstates_5_0, 
            	            		"ActionState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleStateMachine327); 

                	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleActionClient"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:213:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:214:2: (iv_ruleActionClient= ruleActionClient EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:215:2: iv_ruleActionClient= ruleActionClient EOF
            {
             newCompositeNode(grammarAccess.getActionClientRule()); 
            pushFollow(FOLLOW_ruleActionClient_in_entryRuleActionClient363);
            iv_ruleActionClient=ruleActionClient();

            state._fsp--;

             current =iv_ruleActionClient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionClient373); 

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
    // $ANTLR end "entryRuleActionClient"


    // $ANTLR start "ruleActionClient"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:222:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'aname:' ( (lv_actionname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'atype:' ( (lv_actiontype_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_actionname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_actiontype_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:225:28: ( (otherlv_0= 'ActionClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'aname:' ( (lv_actionname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'atype:' ( (lv_actiontype_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:226:1: (otherlv_0= 'ActionClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'aname:' ( (lv_actionname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'atype:' ( (lv_actiontype_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:226:1: (otherlv_0= 'ActionClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'aname:' ( (lv_actionname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'atype:' ( (lv_actiontype_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:226:3: otherlv_0= 'ActionClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'aname:' ( (lv_actionname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'atype:' ( (lv_actiontype_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleActionClient410); 

                	newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:230:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:231:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:231:1: (lv_name_1_0= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionClient427); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionClientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActionClient444); 

                	newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleActionClient456); 

                	newLeafNode(otherlv_3, grammarAccess.getActionClientAccess().getAnameKeyword_3());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:256:1: ( (lv_actionname_4_0= RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:257:1: (lv_actionname_4_0= RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:257:1: (lv_actionname_4_0= RULE_STRING )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:258:3: lv_actionname_4_0= RULE_STRING
            {
            lv_actionname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionClient473); 

            			newLeafNode(lv_actionname_4_0, grammarAccess.getActionClientAccess().getActionnameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"actionname",
                    		lv_actionname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleActionClient490); 

                	newLeafNode(otherlv_5, grammarAccess.getActionClientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleActionClient502); 

                	newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getAtypeKeyword_6());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:282:1: ( (lv_actiontype_7_0= RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:283:1: (lv_actiontype_7_0= RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:283:1: (lv_actiontype_7_0= RULE_STRING )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:284:3: lv_actiontype_7_0= RULE_STRING
            {
            lv_actiontype_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionClient519); 

            			newLeafNode(lv_actiontype_7_0, grammarAccess.getActionClientAccess().getActiontypeSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"actiontype",
                    		lv_actiontype_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleActionClient536); 

                	newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleActionClient"


    // $ANTLR start "entryRuleServiceClient"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:312:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:313:2: (iv_ruleServiceClient= ruleServiceClient EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:314:2: iv_ruleServiceClient= ruleServiceClient EOF
            {
             newCompositeNode(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_ruleServiceClient_in_entryRuleServiceClient572);
            iv_ruleServiceClient=ruleServiceClient();

            state._fsp--;

             current =iv_ruleServiceClient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceClient582); 

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
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:321:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name:' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'srv:' ( (lv_servicesrv_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_servicename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_servicesrv_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:324:28: ( (otherlv_0= 'ServiceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name:' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'srv:' ( (lv_servicesrv_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:325:1: (otherlv_0= 'ServiceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name:' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'srv:' ( (lv_servicesrv_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:325:1: (otherlv_0= 'ServiceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name:' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'srv:' ( (lv_servicesrv_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:325:3: otherlv_0= 'ServiceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name:' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'srv:' ( (lv_servicesrv_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleServiceClient619); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:330:1: (lv_name_1_0= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceClient636); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceClientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleServiceClient653); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleServiceClient665); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceClientAccess().getNameKeyword_3());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:355:1: ( (lv_servicename_4_0= RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:356:1: (lv_servicename_4_0= RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:356:1: (lv_servicename_4_0= RULE_STRING )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:357:3: lv_servicename_4_0= RULE_STRING
            {
            lv_servicename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceClient682); 

            			newLeafNode(lv_servicename_4_0, grammarAccess.getServiceClientAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"servicename",
                    		lv_servicename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleServiceClient699); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceClientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleServiceClient711); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getSrvKeyword_6());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:381:1: ( (lv_servicesrv_7_0= RULE_STRING ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:382:1: (lv_servicesrv_7_0= RULE_STRING )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:382:1: (lv_servicesrv_7_0= RULE_STRING )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:383:3: lv_servicesrv_7_0= RULE_STRING
            {
            lv_servicesrv_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceClient728); 

            			newLeafNode(lv_servicesrv_7_0, grammarAccess.getServiceClientAccess().getServicesrvSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"servicesrv",
                    		lv_servicesrv_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleServiceClient745); 

                	newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleServiceClient"


    // $ANTLR start "entryRuleActionState"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:411:1: entryRuleActionState returns [EObject current=null] : iv_ruleActionState= ruleActionState EOF ;
    public final EObject entryRuleActionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionState = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:412:2: (iv_ruleActionState= ruleActionState EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:413:2: iv_ruleActionState= ruleActionState EOF
            {
             newCompositeNode(grammarAccess.getActionStateRule()); 
            pushFollow(FOLLOW_ruleActionState_in_entryRuleActionState781);
            iv_ruleActionState=ruleActionState();

            state._fsp--;

             current =iv_ruleActionState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionState791); 

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
    // $ANTLR end "entryRuleActionState"


    // $ANTLR start "ruleActionState"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:420:1: ruleActionState returns [EObject current=null] : (otherlv_0= 'actionstate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'client:' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )? otherlv_8= '}' ) ;
    public final EObject ruleActionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_transitions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:423:28: ( (otherlv_0= 'actionstate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'client:' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )? otherlv_8= '}' ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:424:1: (otherlv_0= 'actionstate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'client:' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )? otherlv_8= '}' )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:424:1: (otherlv_0= 'actionstate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'client:' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )? otherlv_8= '}' )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:424:3: otherlv_0= 'actionstate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'client:' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleActionState828); 

                	newLeafNode(otherlv_0, grammarAccess.getActionStateAccess().getActionstateKeyword_0());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:428:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:429:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:429:1: (lv_name_1_0= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:430:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionState845); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActionState862); 

                	newLeafNode(otherlv_2, grammarAccess.getActionStateAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleActionState874); 

                	newLeafNode(otherlv_3, grammarAccess.getActionStateAccess().getClientKeyword_3());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:454:1: ( (otherlv_4= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:455:1: (otherlv_4= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:455:1: (otherlv_4= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:456:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStateRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionState894); 

            		newLeafNode(otherlv_4, grammarAccess.getActionStateAccess().getClientnameActionClientCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleActionState906); 

                	newLeafNode(otherlv_5, grammarAccess.getActionStateAccess().getCommaKeyword_5());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:471:1: ( ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16||(LA6_0>=24 && LA6_0<=26)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:471:2: ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= ','
                    {
                    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:471:2: ( (lv_transitions_6_0= ruleTransition ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=24 && LA5_0<=26)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:472:1: (lv_transitions_6_0= ruleTransition )
                    	    {
                    	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:472:1: (lv_transitions_6_0= ruleTransition )
                    	    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:473:3: lv_transitions_6_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionStateAccess().getTransitionsTransitionParserRuleCall_6_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleActionState928);
                    	    lv_transitions_6_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_6_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleActionState941); 

                        	newLeafNode(otherlv_7, grammarAccess.getActionStateAccess().getCommaKeyword_6_1());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleActionState955); 

                	newLeafNode(otherlv_8, grammarAccess.getActionStateAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleActionState"


    // $ANTLR start "entryRuleTransition"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:507:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:508:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:509:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition993);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1003); 

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
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:516:1: ruleTransition returns [EObject current=null] : ( ( (lv_outcome_0_0= ruleOUTCOME ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_outcome_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:519:28: ( ( ( (lv_outcome_0_0= ruleOUTCOME ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:520:1: ( ( (lv_outcome_0_0= ruleOUTCOME ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:520:1: ( ( (lv_outcome_0_0= ruleOUTCOME ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:520:2: ( (lv_outcome_0_0= ruleOUTCOME ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:520:2: ( (lv_outcome_0_0= ruleOUTCOME ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:521:1: (lv_outcome_0_0= ruleOUTCOME )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:521:1: (lv_outcome_0_0= ruleOUTCOME )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:522:3: lv_outcome_0_0= ruleOUTCOME
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getOutcomeOUTCOMEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOUTCOME_in_ruleTransition1049);
            lv_outcome_0_0=ruleOUTCOME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"outcome",
                    		lv_outcome_0_0, 
                    		"OUTCOME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTransition1061); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:542:1: ( (otherlv_2= RULE_ID ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:543:1: (otherlv_2= RULE_ID )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:543:1: (otherlv_2= RULE_ID )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:544:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1081); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateActionStateCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleOUTCOME"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:563:1: entryRuleOUTCOME returns [String current=null] : iv_ruleOUTCOME= ruleOUTCOME EOF ;
    public final String entryRuleOUTCOME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOUTCOME = null;


        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:564:2: (iv_ruleOUTCOME= ruleOUTCOME EOF )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:565:2: iv_ruleOUTCOME= ruleOUTCOME EOF
            {
             newCompositeNode(grammarAccess.getOUTCOMERule()); 
            pushFollow(FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME1118);
            iv_ruleOUTCOME=ruleOUTCOME();

            state._fsp--;

             current =iv_ruleOUTCOME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUTCOME1129); 

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
    // $ANTLR end "entryRuleOUTCOME"


    // $ANTLR start "ruleOUTCOME"
    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:572:1: ruleOUTCOME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'succeeded' | kw= 'preempted' | kw= 'aborted' ) ;
    public final AntlrDatatypeRuleToken ruleOUTCOME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:575:28: ( (kw= 'succeeded' | kw= 'preempted' | kw= 'aborted' ) )
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:576:1: (kw= 'succeeded' | kw= 'preempted' | kw= 'aborted' )
            {
            // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:576:1: (kw= 'succeeded' | kw= 'preempted' | kw= 'aborted' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:577:2: kw= 'succeeded'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOUTCOME1167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOUTCOMEAccess().getSucceededKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:584:2: kw= 'preempted'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOUTCOME1186); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOUTCOMEAccess().getPreemptedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.best.of.robotics.dsl.smach/src-gen/org/best/of/robotics/parser/antlr/internal/InternalSmachDSL.g:591:2: kw= 'aborted'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOUTCOME1205); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOUTCOMEAccess().getAbortedKeyword_2()); 
                        

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
    // $ANTLR end "ruleOUTCOME"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePrimitivePackage_in_entryRulePrimitivePackage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitivePackage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_rulePrimitivePackage130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStateMachine215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateMachine232 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateMachine249 = new BitSet(new long[]{0x0000000000246000L});
    public static final BitSet FOLLOW_ruleActionClient_in_ruleStateMachine270 = new BitSet(new long[]{0x0000000000246000L});
    public static final BitSet FOLLOW_ruleServiceClient_in_ruleStateMachine292 = new BitSet(new long[]{0x0000000000242000L});
    public static final BitSet FOLLOW_ruleActionState_in_ruleStateMachine314 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleStateMachine327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionClient_in_entryRuleActionClient363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionClient373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActionClient410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionClient427 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActionClient444 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActionClient456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionClient473 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionClient490 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActionClient502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionClient519 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActionClient536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceClient_in_entryRuleServiceClient572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceClient582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleServiceClient619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceClient636 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceClient653 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleServiceClient665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceClient682 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleServiceClient699 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleServiceClient711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceClient728 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleServiceClient745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionState_in_entryRuleActionState781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionState791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActionState828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionState845 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActionState862 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActionState874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionState894 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionState906 = new BitSet(new long[]{0x0000000007012000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleActionState928 = new BitSet(new long[]{0x0000000007010000L});
    public static final BitSet FOLLOW_16_in_ruleActionState941 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActionState955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_ruleTransition1049 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransition1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUTCOME_in_entryRuleOUTCOME1118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUTCOME1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOUTCOME1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOUTCOME1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOUTCOME1205 = new BitSet(new long[]{0x0000000000000002L});

}