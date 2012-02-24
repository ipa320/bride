/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.provider;


import java.util.Collection;
import java.util.List;

import org.best_of_robotics.model.datatypes.DatatypesFactory;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.TypesLibrary;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.best_of_robotics.model.datatypes.TypesLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesLibraryItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibraryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__TYPES);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__BOOL);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__CHAR);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__DOUBLE);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__FLOAT);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__INT);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__LONG);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__SHORT);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__STRING);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_CHAR);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_DOUBLE);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_FLOAT);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_INT);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_LONG);
			childrenFeatures.add(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_SHORT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TypesLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypesLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TypesLibrary_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TypesLibrary.class)) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
			case DatatypesPackage.TYPES_LIBRARY__INT:
			case DatatypesPackage.TYPES_LIBRARY__LONG:
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
			case DatatypesPackage.TYPES_LIBRARY__STRING:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__TYPES,
				 DatatypesFactory.eINSTANCE.createExistingType()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__TYPES,
				 DatatypesFactory.eINSTANCE.createGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__TYPES,
				 DatatypesFactory.eINSTANCE.createCustomType()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__BOOL,
				 DatatypesFactory.eINSTANCE.createBool()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__CHAR,
				 DatatypesFactory.eINSTANCE.createChar()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__DOUBLE,
				 DatatypesFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__FLOAT,
				 DatatypesFactory.eINSTANCE.createFloat()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__INT,
				 DatatypesFactory.eINSTANCE.createInt()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__LONG,
				 DatatypesFactory.eINSTANCE.createLong()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__SHORT,
				 DatatypesFactory.eINSTANCE.createShort()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__STRING,
				 DatatypesFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_CHAR,
				 DatatypesFactory.eINSTANCE.createUnsignedChar()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_DOUBLE,
				 DatatypesFactory.eINSTANCE.createUnsignedDouble()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_FLOAT,
				 DatatypesFactory.eINSTANCE.createUnsignedFloat()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_INT,
				 DatatypesFactory.eINSTANCE.createUnsignedInt()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_LONG,
				 DatatypesFactory.eINSTANCE.createUnsignedLong()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.TYPES_LIBRARY__UNSIGNED_SHORT,
				 DatatypesFactory.eINSTANCE.createUnsignedShort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataTypesEditPlugin.INSTANCE;
	}

}
