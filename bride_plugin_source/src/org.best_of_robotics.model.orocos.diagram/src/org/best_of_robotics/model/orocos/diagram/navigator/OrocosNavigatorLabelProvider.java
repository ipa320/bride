package org.best_of_robotics.model.orocos.diagram.navigator;

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

/**
 * @generated
 */
public class OrocosNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem
				&& !isOwnView(((org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup group = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) element;
			return org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem navigatorItem = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) element;
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
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://orocos/1.0?Activity", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Activity_2002); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://orocos/1.0?InputPort", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.InputPort_3002); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://orocos/1.0?Package", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Package_1000); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://orocos/1.0?OutputPort", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.OutputPort_3001); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://orocos/1.0?TaskContext", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.TaskContext_2001); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://orocos/1.0?ConnectionPolicy", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://orocos/1.0?Property", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Property_3003); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://orocos/1.0?IActivity?taskContext", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002); //$NON-NLS-1$
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://orocos/1.0?Operation", org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Operation_3004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
						.isKnownElementType(elementType)) {
			image = org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
					.getImage(elementType);
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
		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup group = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem navigatorItem = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) element;
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
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2002Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_3002Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3003Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID:
			return getIActivityTaskContext_4002Text(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getActivity_2002Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Activity_2002,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_3002Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.InputPort_3002,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		org.best_of_robotics.model.orocos.Package domainModelElement = (org.best_of_robotics.model.orocos.Package) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPort_3001Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.OutputPort_3001,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskContext_2001Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.TaskContext_2001,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionPolicy_4001Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3003Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Property_3003,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3003); //$NON-NLS-1$
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
	private String getOperation_3004Text(View view) {
		IParser parser = org.best_of_robotics.model.orocos.diagram.providers.OrocosParserProvider
				.getParser(
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Operation_3004,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
								.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3004); //$NON-NLS-1$
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
		return org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
						.getModelID(view));
	}

}
