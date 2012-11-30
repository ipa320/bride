/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import java.lang.String;

import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.RosIDLReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros IDL Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl#getRosPackage <em>Ros Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RosIDLReferenceImpl extends IDLReferenceImpl implements RosIDLReference {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRosPackage() <em>Ros Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String ROS_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRosPackage() <em>Ros Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosPackage()
	 * @generated
	 * @ordered
	 */
	protected String rosPackage = ROS_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosIDLReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ROS_IDL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ROS_IDL_REFERENCE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRosPackage() {
		return rosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosPackage(String newRosPackage) {
		String oldRosPackage = rosPackage;
		rosPackage = newRosPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ROS_IDL_REFERENCE__ROS_PACKAGE, oldRosPackage, rosPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.ROS_IDL_REFERENCE__NAMESPACE:
				return getNamespace();
			case DatatypesPackage.ROS_IDL_REFERENCE__ROS_PACKAGE:
				return getRosPackage();
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
			case DatatypesPackage.ROS_IDL_REFERENCE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case DatatypesPackage.ROS_IDL_REFERENCE__ROS_PACKAGE:
				setRosPackage((String)newValue);
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
			case DatatypesPackage.ROS_IDL_REFERENCE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case DatatypesPackage.ROS_IDL_REFERENCE__ROS_PACKAGE:
				setRosPackage(ROS_PACKAGE_EDEFAULT);
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
			case DatatypesPackage.ROS_IDL_REFERENCE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case DatatypesPackage.ROS_IDL_REFERENCE__ROS_PACKAGE:
				return ROS_PACKAGE_EDEFAULT == null ? rosPackage != null : !ROS_PACKAGE_EDEFAULT.equals(rosPackage);
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", rosPackage: ");
		result.append(rosPackage);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel(){
		String label = name;
		if( namespace !=null && namespace.length()>0 )
			label = namespace + "::" + label;
		return label;
	}

} //RosIDLReferenceImpl
