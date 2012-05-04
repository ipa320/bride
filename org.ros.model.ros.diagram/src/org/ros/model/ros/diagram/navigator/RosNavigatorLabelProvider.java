package org.ros.model.ros.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.ros.model.ros.Package;
import org.ros.model.ros.diagram.edit.parts.NodeEditPart;
import org.ros.model.ros.diagram.edit.parts.NodeNameEditPart;
import org.ros.model.ros.diagram.edit.parts.PackageEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerNameEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberNameEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicNameEditPart;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;
import org.ros.model.ros.diagram.part.RosVisualIDRegistry;
import org.ros.model.ros.diagram.providers.RosElementTypes;
import org.ros.model.ros.diagram.providers.RosParserProvider;

/**
 * @generated
 */
public class RosNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RosNavigatorItem
				&& !isOwnView(((RosNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RosNavigatorGroup) {
			RosNavigatorGroup group = (RosNavigatorGroup) element;
			return RosDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RosNavigatorItem) {
			RosNavigatorItem navigatorItem = (RosNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case SubscriberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ros/1.0?Subscriber", RosElementTypes.Subscriber_4002); //$NON-NLS-1$
		case ServiceServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ros/1.0?ServiceServer", RosElementTypes.ServiceServer_4003); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ros/1.0?Topic", RosElementTypes.Topic_2002); //$NON-NLS-1$
		case ServiceClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ros/1.0?ServiceClient", RosElementTypes.ServiceClient_4001); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ros/1.0?Parameter", RosElementTypes.Parameter_3001); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ros/1.0?Node", RosElementTypes.Node_2001); //$NON-NLS-1$
		case PublisherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ros/1.0?Publisher", RosElementTypes.Publisher_4004); //$NON-NLS-1$
		case ServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ros/1.0?Service", RosElementTypes.Service_2003); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ros/1.0?Package", RosElementTypes.Package_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RosDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RosElementTypes.isKnownElementType(elementType)) {
			image = RosElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RosNavigatorGroup) {
			RosNavigatorGroup group = (RosNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RosNavigatorItem) {
			RosNavigatorItem navigatorItem = (RosNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case SubscriberEditPart.VISUAL_ID:
			return getSubscriber_4002Text(view);
		case ServiceServerEditPart.VISUAL_ID:
			return getServiceServer_4003Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2002Text(view);
		case ServiceClientEditPart.VISUAL_ID:
			return getServiceClient_4001Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case PublisherEditPart.VISUAL_ID:
			return getPublisher_4004Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2003Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSubscriber_4002Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.Subscriber_4002,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(SubscriberNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceServer_4003Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.ServiceServer_4003,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry
						.getType(ServiceServerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_2002Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.Topic_2002,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(TopicNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceClient_4001Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.ServiceClient_4001,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry
						.getType(ServiceClientNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3001Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.Parameter_3001,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = RosParserProvider.getParser(RosElementTypes.Node_2001,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPublisher_4004Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.Publisher_4004,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(PublisherNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_2003Text(View view) {
		IParser parser = RosParserProvider.getParser(
				RosElementTypes.Service_2003,
				view.getElement() != null ? view.getElement() : view,
				RosVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		Package domainModelElement = (Package) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PackageEditPart.MODEL_ID.equals(RosVisualIDRegistry
				.getModelID(view));
	}

}
