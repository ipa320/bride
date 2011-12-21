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
import org.ros.model.ros.diagram.edit.parts.PublisherNameEditPart;
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
	private IParser topicName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5001Parser() {
		if (topicName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5001Parser = parser;
		}
		return topicName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5002Parser() {
		if (nodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5002Parser = parser;
		}
		return nodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser subscriberName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSubscriberName_6001Parser() {
		if (subscriberName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getSubscriber_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subscriberName_6001Parser = parser;
		}
		return subscriberName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser publisherName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getPublisherName_6002Parser() {
		if (publisherName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { RosPackage.eINSTANCE
					.getPublisher_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			publisherName_6002Parser = parser;
		}
		return publisherName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5001Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5002Parser();
		case SubscriberNameEditPart.VISUAL_ID:
			return getSubscriberName_6001Parser();
		case PublisherNameEditPart.VISUAL_ID:
			return getPublisherName_6002Parser();
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
