package org.ros.model.ros.diagram.providers;

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
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.diagram.edit.parts.NodeNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerNameEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberNameEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicNameEditPart;
import org.ros.model.ros.diagram.parsers.MessageFormatParser;
import org.ros.model.ros.diagram.part.RosVisualIDRegistry;

/**
 * @generated
 */
public class RosParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5001Parser() {
		if (nodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5001Parser = parser;
		}
		return nodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5002Parser() {
		if (topicName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5002Parser = parser;
		}
		return topicName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_5003Parser() {
		if (serviceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getService_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_5003Parser = parser;
		}
		return serviceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser parameter_3001Parser;

	/**
	 * @generated
	 */
	private IParser getParameter_3001Parser() {
		if (parameter_3001Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameter_3001Parser = parser;
		}
		return parameter_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceClientName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getServiceClientName_6001Parser() {
		if (serviceClientName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getServiceClient_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceClientName_6001Parser = parser;
		}
		return serviceClientName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser subscriberName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getSubscriberName_6002Parser() {
		if (subscriberName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getSubscriber_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subscriberName_6002Parser = parser;
		}
		return subscriberName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceServerName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getServiceServerName_6003Parser() {
		if (serviceServerName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getServiceServer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceServerName_6003Parser = parser;
		}
		return serviceServerName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser publisherName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getPublisherName_6004Parser() {
		if (publisherName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getPublisher_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			publisherName_6004Parser = parser;
		}
		return publisherName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5001Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5002Parser();
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5003Parser();
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001Parser();
		case ServiceClientNameEditPart.VISUAL_ID:
			return getServiceClientName_6001Parser();
		case SubscriberNameEditPart.VISUAL_ID:
			return getSubscriberName_6002Parser();
		case ServiceServerNameEditPart.VISUAL_ID:
			return getServiceServerName_6003Parser();
		case PublisherNameEditPart.VISUAL_ID:
			return getPublisherName_6004Parser();
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
			return getParser(RosVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RosVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RosElementTypes.getElement(hint) == null) {
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
