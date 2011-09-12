package org.best_of_robotics.model.bcm.diagram.navigator;

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
public class BcmNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem
				&& !isOwnView(((org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) element)
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
		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup) {
			org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup group = (org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup) element;
			return org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) {
			org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem navigatorItem = (org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) element;
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
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://bcm/1.0?Port", org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Port_3001); //$NON-NLS-1$
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bcm/1.0?Connection", org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001); //$NON-NLS-1$
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bcm/1.0?Component", org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Component_2002); //$NON-NLS-1$
		case org.best_of_robotics.model.bcm.diagram.edit.parts.BundleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bcm/1.0?Bundle", org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Bundle_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
						.isKnownElementType(elementType)) {
			image = org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
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
		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup) {
			org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup group = (org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) {
			org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem navigatorItem = (org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) element;
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
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001Text(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002Text(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.BundleEditPart.VISUAL_ID:
			return getBundle_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPort_3001Text(View view) {
		IParser parser = org.best_of_robotics.model.bcm.diagram.providers.BcmParserProvider
				.getParser(
						org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Port_3001,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
								.getType(org.best_of_robotics.model.bcm.diagram.edit.parts.PortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_4001Text(View view) {
		IParser parser = org.best_of_robotics.model.bcm.diagram.providers.BcmParserProvider
				.getParser(
						org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
								.getType(org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2002Text(View view) {
		IParser parser = org.best_of_robotics.model.bcm.diagram.providers.BcmParserProvider
				.getParser(
						org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Component_2002,
						view.getElement() != null ? view.getElement() : view,
						org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
								.getType(org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBundle_1000Text(View view) {
		org.best_of_robotics.model.bcm.Bundle domainModelElement = (org.best_of_robotics.model.bcm.Bundle) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance()
					.logError(
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
		return org.best_of_robotics.model.bcm.diagram.edit.parts.BundleEditPart.MODEL_ID
				.equals(org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
						.getModelID(view));
	}

}
