package org.best_of_robotics.model.orocos.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OrocosParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser taskContextName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTaskContextName_5006Parser() {
		if (taskContextName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getTaskContext_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			taskContextName_5006Parser = parser;
		}
		return taskContextName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskContextNamespace_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTaskContextNamespace_5007Parser() {
		if (taskContextNamespace_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getTaskContext_Namespace() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			taskContextNamespace_5007Parser = parser;
		}
		return taskContextNamespace_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskContextType_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTaskContextType_5008Parser() {
		if (taskContextType_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getTaskContext_Type() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			taskContextType_5008Parser = parser;
		}
		return taskContextType_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5009Parser() {
		if (activityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getIActivity_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			activityName_5009Parser = parser;
		}
		return activityName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPortName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPortName_5001Parser() {
		if (outputPortName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getOutputPort_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			outputPortName_5001Parser = parser;
		}
		return outputPortName_5001Parser;
	}

	/**
	 * @generated
	 */
	private org.best_of_robotics.model.orocos.diagram.parsers.OutputPortLabelExpressionLabelParser outputPortLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPortLabel_5002Parser() {
		if (outputPortLabel_5002Parser == null) {
			outputPortLabel_5002Parser = new org.best_of_robotics.model.orocos.diagram.parsers.OutputPortLabelExpressionLabelParser();
		}
		return outputPortLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPortName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortName_5003Parser() {
		if (inputPortName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getInputPort_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			inputPortName_5003Parser = parser;
		}
		return inputPortName_5003Parser;
	}

	/**
	 * @generated
	 */
	private org.best_of_robotics.model.orocos.diagram.parsers.InputPortLabelExpressionLabelParser inputPortLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortLabel_5004Parser() {
		if (inputPortLabel_5004Parser == null) {
			inputPortLabel_5004Parser = new org.best_of_robotics.model.orocos.diagram.parsers.InputPortLabelExpressionLabelParser();
		}
		return inputPortLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3003Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3003Parser() {
		if (property_3003Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getProperty_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			property_3003Parser = parser;
		}
		return property_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3004Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3004Parser() {
		if (operation_3004Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getOperation_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			operation_3004Parser = parser;
		}
		return operation_3004Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPolicyName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPolicyName_6001Parser() {
		if (connectionPolicyName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getConnectionPolicy_Name() };
			org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.orocos.diagram.parsers.MessageFormatParser(
					features);
			connectionPolicyName_6001Parser = parser;
		}
		return connectionPolicyName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNameEditPart.VISUAL_ID:
			return getTaskContextName_5006Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNamespaceEditPart.VISUAL_ID:
			return getTaskContextNamespace_5007Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextTypeEditPart.VISUAL_ID:
			return getTaskContextType_5008Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5009Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID:
			return getOutputPortName_5001Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getOutputPortLabel_5002Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID:
			return getInputPortName_5003Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getInputPortLabel_5004Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3003Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3004Parser();
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyNameEditPart.VISUAL_ID:
			return getConnectionPolicyName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
