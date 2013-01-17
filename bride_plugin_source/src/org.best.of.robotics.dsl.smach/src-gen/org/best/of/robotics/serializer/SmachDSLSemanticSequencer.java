package org.best.of.robotics.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.best.of.robotics.services.SmachDSLGrammarAccess;
import org.best.of.robotics.smachDSL.ActionClient;
import org.best.of.robotics.smachDSL.ActionState;
import org.best.of.robotics.smachDSL.PrimitivePackage;
import org.best.of.robotics.smachDSL.ServiceClient;
import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.StateMachine;
import org.best.of.robotics.smachDSL.Test;
import org.best.of.robotics.smachDSL.Transition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SmachDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmachDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmachDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmachDSLPackage.ACTION_CLIENT:
				if(context == grammarAccess.getActionClientRule()) {
					sequence_ActionClient(context, (ActionClient) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.ACTION_STATE:
				if(context == grammarAccess.getActionStateRule()) {
					sequence_ActionState(context, (ActionState) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.PRIMITIVE_PACKAGE:
				if(context == grammarAccess.getPrimitivePackageRule()) {
					sequence_PrimitivePackage(context, (PrimitivePackage) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.SERVICE_CLIENT:
				if(context == grammarAccess.getServiceClientRule()) {
					sequence_ServiceClient(context, (ServiceClient) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.STATE_MACHINE:
				if(context == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (StateMachine) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.TEST:
				if(context == grammarAccess.getTestRule()) {
					sequence_Test(context, (Test) semanticObject); 
					return; 
				}
				else break;
			case SmachDSLPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID actionname=STRING actiontype=STRING)
	 */
	protected void sequence_ActionClient(EObject context, ActionClient semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__ACTIONNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__ACTIONNAME));
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__ACTIONTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.ACTION_CLIENT__ACTIONTYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionClientAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionClientAccess().getActionnameSTRINGTerminalRuleCall_4_0(), semanticObject.getActionname());
		feeder.accept(grammarAccess.getActionClientAccess().getActiontypeSTRINGTerminalRuleCall_7_0(), semanticObject.getActiontype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID clientname=[ActionClient|ID] transitions+=Transition*)
	 */
	protected void sequence_ActionState(EObject context, ActionState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statemachines+=StateMachine*
	 */
	protected void sequence_PrimitivePackage(EObject context, PrimitivePackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID servicename=STRING servicesrv=STRING)
	 */
	protected void sequence_ServiceClient(EObject context, ServiceClient semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__SERVICENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__SERVICENAME));
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__SERVICESRV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.SERVICE_CLIENT__SERVICESRV));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServiceClientAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServiceClientAccess().getServicenameSTRINGTerminalRuleCall_4_0(), semanticObject.getServicename());
		feeder.accept(grammarAccess.getServiceClientAccess().getServicesrvSTRINGTerminalRuleCall_7_0(), semanticObject.getServicesrv());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID actionclients+=ActionClient* serviceclients+=ServiceClient* actionsstates+=ActionState*)
	 */
	protected void sequence_StateMachine(EObject context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ros=STRING
	 */
	protected void sequence_Test(EObject context, Test semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.TEST__ROS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.TEST__ROS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestAccess().getRosSTRINGTerminalRuleCall_0(), semanticObject.getRos());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (outcome=OUTCOME state=[ActionState|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.TRANSITION__OUTCOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.TRANSITION__OUTCOME));
			if(transientValues.isValueTransient(semanticObject, SmachDSLPackage.Literals.TRANSITION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmachDSLPackage.Literals.TRANSITION__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getOutcomeOUTCOMEParserRuleCall_0_0(), semanticObject.getOutcome());
		feeder.accept(grammarAccess.getTransitionAccess().getStateActionStateIDTerminalRuleCall_2_0_1(), semanticObject.getState());
		feeder.finish();
	}
}
