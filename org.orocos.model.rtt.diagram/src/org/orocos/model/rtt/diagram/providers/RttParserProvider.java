package org.orocos.model.rtt.diagram.providers;

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
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.diagram.edit.parts.ActivityCpuAffinityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityPeriodEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityPriorityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivitySchedulerEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortIsEventPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortTypeEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OperationEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortTypeEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PropertyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextNamespaceEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextTypeEditPart;
import org.orocos.model.rtt.diagram.parsers.MessageFormatParser;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;

/**
 * @generated
 */
public class RttParserProvider extends AbstractProvider implements
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getTaskContext_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getTaskContext_Namespace() };
			MessageFormatParser parser = new MessageFormatParser(features);
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getTaskContext_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskContextType_5008Parser = parser;
		}
		return taskContextType_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5010Parser() {
		if (activityName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getIActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5010Parser = parser;
		}
		return activityName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityCpuAffinity_5011Parser;

	/**
	 * @generated
	 */
	private IParser getActivityCpuAffinity_5011Parser() {
		if (activityCpuAffinity_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getActivity_CpuAffinity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityCpuAffinity_5011Parser = parser;
		}
		return activityCpuAffinity_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPeriod_5012Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPeriod_5012Parser() {
		if (activityPeriod_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getActivity_Period() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityPeriod_5012Parser = parser;
		}
		return activityPeriod_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPriority_5013Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPriority_5013Parser() {
		if (activityPriority_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getActivity_Priority() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityPriority_5013Parser = parser;
		}
		return activityPriority_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityScheduler_5014Parser;

	/**
	 * @generated
	 */
	private IParser getActivityScheduler_5014Parser() {
		if (activityScheduler_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getActivity_Scheduler() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityScheduler_5014Parser = parser;
		}
		return activityScheduler_5014Parser;
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getOutputPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputPortName_5001Parser = parser;
		}
		return outputPortName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPortType_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPortType_5002Parser() {
		if (outputPortType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getOutputPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputPortType_5002Parser = parser;
		}
		return outputPortType_5002Parser;
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getInputPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputPortName_5003Parser = parser;
		}
		return inputPortName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPortType_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortType_5004Parser() {
		if (inputPortType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getInputPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputPortType_5004Parser = parser;
		}
		return inputPortType_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPortIsEventPort_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortIsEventPort_5005Parser() {
		if (inputPortIsEventPort_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getInputPort_IsEventPort() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputPortIsEventPort_5005Parser = parser;
		}
		return inputPortIsEventPort_5005Parser;
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			property_3003Parser = parser;
		}
		return property_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3006Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3006Parser() {
		if (operation_3006Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_3006Parser = parser;
		}
		return operation_3006Parser;
	}

	/**
	 * @generated
	 */
	private IParser slaveName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getSlaveName_5009Parser() {
		if (slaveName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getIActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			slaveName_5009Parser = parser;
		}
		return slaveName_5009Parser;
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
			EAttribute[] features = new EAttribute[] { RttPackage.eINSTANCE
					.getConnectionPolicy_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionPolicyName_6001Parser = parser;
		}
		return connectionPolicyName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TaskContextNameEditPart.VISUAL_ID:
			return getTaskContextName_5006Parser();
		case TaskContextNamespaceEditPart.VISUAL_ID:
			return getTaskContextNamespace_5007Parser();
		case TaskContextTypeEditPart.VISUAL_ID:
			return getTaskContextType_5008Parser();
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5010Parser();
		case ActivityCpuAffinityEditPart.VISUAL_ID:
			return getActivityCpuAffinity_5011Parser();
		case ActivityPeriodEditPart.VISUAL_ID:
			return getActivityPeriod_5012Parser();
		case ActivityPriorityEditPart.VISUAL_ID:
			return getActivityPriority_5013Parser();
		case ActivitySchedulerEditPart.VISUAL_ID:
			return getActivityScheduler_5014Parser();
		case OutputPortNameEditPart.VISUAL_ID:
			return getOutputPortName_5001Parser();
		case OutputPortTypeEditPart.VISUAL_ID:
			return getOutputPortType_5002Parser();
		case InputPortNameEditPart.VISUAL_ID:
			return getInputPortName_5003Parser();
		case InputPortTypeEditPart.VISUAL_ID:
			return getInputPortType_5004Parser();
		case InputPortIsEventPortEditPart.VISUAL_ID:
			return getInputPortIsEventPort_5005Parser();
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperation_3006Parser();
		case SlaveNameEditPart.VISUAL_ID:
			return getSlaveName_5009Parser();
		case ConnectionPolicyNameEditPart.VISUAL_ID:
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
			return getParser(RttVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RttVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RttElementTypes.getElement(hint) == null) {
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
