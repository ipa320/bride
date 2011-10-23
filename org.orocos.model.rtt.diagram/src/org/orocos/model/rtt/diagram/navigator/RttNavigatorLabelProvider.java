package org.orocos.model.rtt.diagram.navigator;

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
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.diagram.edit.parts.ActivityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.IActivityTaskContextEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PropertyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextNameEditPart;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorPlugin;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;
import org.orocos.model.rtt.diagram.providers.RttParserProvider;

/**
 * @generated
 */
public class RttNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RttDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RttDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RttNavigatorItem
				&& !isOwnView(((RttNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RttNavigatorGroup) {
			RttNavigatorGroup group = (RttNavigatorGroup) element;
			return RttDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RttNavigatorItem) {
			RttNavigatorItem navigatorItem = (RttNavigatorItem) element;
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
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://rtt/1.0?Property", RttElementTypes.Property_3003); //$NON-NLS-1$
		case InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://rtt/1.0?InputPort", RttElementTypes.InputPort_3002); //$NON-NLS-1$
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rtt/1.0?ConnectionPolicy", RttElementTypes.ConnectionPolicy_4001); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://rtt/1.0?Package", RttElementTypes.Package_1000); //$NON-NLS-1$
		case SlaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://rtt/1.0?Slave", RttElementTypes.Slave_3004); //$NON-NLS-1$
		case TaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rtt/1.0?TaskContext", RttElementTypes.TaskContext_2001); //$NON-NLS-1$
		case IActivityTaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rtt/1.0?IActivity?taskContext", RttElementTypes.IActivityTaskContext_4002); //$NON-NLS-1$
		case OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://rtt/1.0?OutputPort", RttElementTypes.OutputPort_3001); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rtt/1.0?Activity", RttElementTypes.Activity_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RttDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RttElementTypes.isKnownElementType(elementType)) {
			image = RttElementTypes.getImage(elementType);
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
		if (element instanceof RttNavigatorGroup) {
			RttNavigatorGroup group = (RttNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RttNavigatorItem) {
			RttNavigatorItem navigatorItem = (RttNavigatorItem) element;
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
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3002Text(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case SlaveEditPart.VISUAL_ID:
			return getSlave_3004Text(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001Text(view);
		case IActivityTaskContextEditPart.VISUAL_ID:
			return getIActivityTaskContext_4002Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProperty_3003Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.Property_3003,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_3002Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.InputPort_3002,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(InputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionPolicy_4001Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.ConnectionPolicy_4001,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry
						.getType(ConnectionPolicyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
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
			RttDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSlave_3004Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.Slave_3004,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(SlaveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskContext_2001Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.TaskContext_2001,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(TaskContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIActivityTaskContext_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputPort_3001Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.OutputPort_3001,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(OutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_2002Text(View view) {
		IParser parser = RttParserProvider.getParser(
				RttElementTypes.Activity_2002,
				view.getElement() != null ? view.getElement() : view,
				RttVisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RttDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
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
		return PackageEditPart.MODEL_ID.equals(RttVisualIDRegistry
				.getModelID(view));
	}

}
