/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import java.lang.String;
import java.util.Collection;

import org.best_of_robotics.model.datatypes.DataType;
import org.best_of_robotics.model.datatypes.Bool;
import org.best_of_robotics.model.datatypes.Char;
import org.best_of_robotics.model.datatypes.ComplexType;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.Int;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.UnsignedChar;
import org.best_of_robotics.model.datatypes.UnsignedInt;
import org.best_of_robotics.model.datatypes.UnsignedLong;
import org.best_of_robotics.model.datatypes.UnsignedShort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesLibraryImpl extends EObjectImpl implements TypesLibrary {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> types;

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
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypesLibrary> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.TYPES_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<DataType>(DataType.class, this, DatatypesPackage.TYPES_LIBRARY__TYPES, DatatypesPackage.DATA_TYPE__TYPES_LIBRARY);
		}
		return types;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypesLibrary> getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList<TypesLibrary>(TypesLibrary.class, this, DatatypesPackage.TYPES_LIBRARY__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
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
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return getTypes();
			case DatatypesPackage.TYPES_LIBRARY__NAME:
				return getName();
			case DatatypesPackage.TYPES_LIBRARY__INCLUDES:
				return getIncludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends TypesLibrary>)newValue);
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
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				getTypes().clear();
				return;
			case DatatypesPackage.TYPES_LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.TYPES_LIBRARY__INCLUDES:
				getIncludes().clear();
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
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return types != null && !types.isEmpty();
			case DatatypesPackage.TYPES_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.TYPES_LIBRARY__INCLUDES:
				return includes != null && !includes.isEmpty();
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

} //TypesLibraryImpl
