/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import java.lang.String;

import org.best_of_robotics.model.datatypes.ComplexType;
import org.best_of_robotics.model.datatypes.DataType;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.SimpleType;
import org.best_of_robotics.model.datatypes.VectorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.VectorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.VectorTypeImpl#getTypesLibrary <em>Types Library</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.VectorTypeImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VectorTypeImpl extends EObjectImpl implements VectorType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected DataType template;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.VECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.VECTOR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibrary getTypesLibrary() {
		if (eContainerFeatureID() != DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY) return null;
		return (TypesLibrary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypesLibrary(TypesLibrary newTypesLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypesLibrary, DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesLibrary(TypesLibrary newTypesLibrary) {
		if (newTypesLibrary != eInternalContainer() || (eContainerFeatureID() != DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY && newTypesLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newTypesLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypesLibrary != null)
				msgs = ((InternalEObject)newTypesLibrary).eInverseAdd(this, DatatypesPackage.TYPES_LIBRARY__TYPES, TypesLibrary.class, msgs);
			msgs = basicSetTypesLibrary(newTypesLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY, newTypesLibrary, newTypesLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (DataType)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.VECTOR_TYPE__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(DataType newTemplate) {
		DataType oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.VECTOR_TYPE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel(){
		String label = name;
		if(template instanceof ComplexType){
			label += "<" + ((ComplexType)template).getLabel() + ">";
		}else if (template instanceof SimpleType){
			label += "<" + template.getName() + ">";
		}
		return "std::" + label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypesLibrary((TypesLibrary)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				return basicSetTypesLibrary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				return eInternalContainer().eInverseRemove(this, DatatypesPackage.TYPES_LIBRARY__TYPES, TypesLibrary.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__NAME:
				return getName();
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				return getTypesLibrary();
			case DatatypesPackage.VECTOR_TYPE__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				setTypesLibrary((TypesLibrary)newValue);
				return;
			case DatatypesPackage.VECTOR_TYPE__TEMPLATE:
				setTemplate((DataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				setTypesLibrary((TypesLibrary)null);
				return;
			case DatatypesPackage.VECTOR_TYPE__TEMPLATE:
				setTemplate((DataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.VECTOR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.VECTOR_TYPE__TYPES_LIBRARY:
				return getTypesLibrary() != null;
			case DatatypesPackage.VECTOR_TYPE__TEMPLATE:
				return template != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VectorTypeImpl
