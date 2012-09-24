/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.best_of_robotics.model.Cpf.provider;

import java.util.Collection;
import java.util.List;

import org.best_of_robotics.model.Cpf.CpfFactory;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.model.Cpf.DocumentRoot;

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
 * This is the item provider adapter for a {@link org.best_of_robotics.model.Cpf.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__CHOICE);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__CHOICES);
			childrenFeatures
					.add(CpfPackage.Literals.DOCUMENT_ROOT__DEFAULTVALUE);
			childrenFeatures
					.add(CpfPackage.Literals.DOCUMENT_ROOT__DESCRIPTION);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__PROPERTIES);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__SEQUENCE);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__SIMPLE);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__STRUCT);
			childrenFeatures.add(CpfPackage.Literals.DOCUMENT_ROOT__VALUE);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICE,
				CpfFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICES,
				CpfFactory.eINSTANCE.createChoices()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__DEFAULTVALUE,
				CpfFactory.eINSTANCE.createDefaultvalue()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
				CpfFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__PROPERTIES,
				CpfFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
				CpfFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__SIMPLE,
				CpfFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__STRUCT,
				CpfFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add(createChildParameter(
				CpfPackage.Literals.DOCUMENT_ROOT__VALUE,
				CpfFactory.eINSTANCE.createValue()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CpfEditPlugin.INSTANCE;
	}

}
