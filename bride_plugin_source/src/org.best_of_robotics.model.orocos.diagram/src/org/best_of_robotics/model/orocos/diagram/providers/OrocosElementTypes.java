package org.best_of_robotics.model.orocos.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class OrocosElementTypes {

	/**
	 * @generated
	 */
	private OrocosElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.best_of_robotics.model.orocos.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskContext_2001 = getElementType("org.best_of_robotics.model.orocos.diagram.TaskContext_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2002 = getElementType("org.best_of_robotics.model.orocos.diagram.Activity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_3001 = getElementType("org.best_of_robotics.model.orocos.diagram.OutputPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_3002 = getElementType("org.best_of_robotics.model.orocos.diagram.InputPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3003 = getElementType("org.best_of_robotics.model.orocos.diagram.Property_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3004 = getElementType("org.best_of_robotics.model.orocos.diagram.Operation_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionPolicy_4001 = getElementType("org.best_of_robotics.model.orocos.diagram.ConnectionPolicy_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IActivityTaskContext_4002 = getElementType("org.best_of_robotics.model.orocos.diagram.IActivityTaskContext_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getPackage());

			elements.put(TaskContext_2001,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getTaskContext());

			elements.put(Activity_2002,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getActivity());

			elements.put(OutputPort_3001,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getOutputPort());

			elements.put(InputPort_3002,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getInputPort());

			elements.put(Property_3003,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getProperty());

			elements.put(Operation_3004,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getOperation());

			elements.put(ConnectionPolicy_4001,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getConnectionPolicy());

			elements.put(IActivityTaskContext_4002,
					org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
							.getIActivity_TaskContext());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(TaskContext_2001);
			KNOWN_ELEMENT_TYPES.add(Activity_2002);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3001);
			KNOWN_ELEMENT_TYPES.add(InputPort_3002);
			KNOWN_ELEMENT_TYPES.add(Property_3003);
			KNOWN_ELEMENT_TYPES.add(Operation_3004);
			KNOWN_ELEMENT_TYPES.add(ConnectionPolicy_4001);
			KNOWN_ELEMENT_TYPES.add(IActivityTaskContext_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return Package_1000;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return TaskContext_2001;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return Activity_2002;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return OutputPort_3001;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return InputPort_3002;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return Property_3003;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return Operation_3004;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return ConnectionPolicy_4001;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID:
			return IActivityTaskContext_4002;
		}
		return null;
	}

}
