/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos.impl;

import org.best_of_robotics.model.datatypes.DataType;

import org.best_of_robotics.model.orocos.ConnectionPolicy;
import org.best_of_robotics.model.orocos.InputPort;
import org.best_of_robotics.model.orocos.OrocosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.InputPortImpl#getIsEventPort <em>Is Event Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.InputPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.InputPortImpl#getInputConnectionPolicy <em>Input Connection Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.InputPortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPortImpl extends EObjectImpl implements InputPort {
	/**
	 * The default value of the '{@link #getIsEventPort() <em>Is Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEventPort()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EVENT_PORT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsEventPort() <em>Is Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEventPort()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEventPort = IS_EVENT_PORT_EDEFAULT;

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
	 * The cached value of the '{@link #getInputConnectionPolicy() <em>Input Connection Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnectionPolicy()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicy inputConnectionPolicy;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrocosPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEventPort() {
		return isEventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEventPort(Boolean newIsEventPort) {
		Boolean oldIsEventPort = isEventPort;
		isEventPort = newIsEventPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.INPUT_PORT__IS_EVENT_PORT, oldIsEventPort, isEventPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.INPUT_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy getInputConnectionPolicy() {
		if (inputConnectionPolicy != null && inputConnectionPolicy.eIsProxy()) {
			InternalEObject oldInputConnectionPolicy = (InternalEObject)inputConnectionPolicy;
			inputConnectionPolicy = (ConnectionPolicy)eResolveProxy(oldInputConnectionPolicy);
			if (inputConnectionPolicy != oldInputConnectionPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, oldInputConnectionPolicy, inputConnectionPolicy));
			}
		}
		return inputConnectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy basicGetInputConnectionPolicy() {
		return inputConnectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnectionPolicy(ConnectionPolicy newInputConnectionPolicy, NotificationChain msgs) {
		ConnectionPolicy oldInputConnectionPolicy = inputConnectionPolicy;
		inputConnectionPolicy = newInputConnectionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, oldInputConnectionPolicy, newInputConnectionPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnectionPolicy(ConnectionPolicy newInputConnectionPolicy) {
		if (newInputConnectionPolicy != inputConnectionPolicy) {
			NotificationChain msgs = null;
			if (inputConnectionPolicy != null)
				msgs = ((InternalEObject)inputConnectionPolicy).eInverseRemove(this, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
			if (newInputConnectionPolicy != null)
				msgs = ((InternalEObject)newInputConnectionPolicy).eInverseAdd(this, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
			msgs = basicSetInputConnectionPolicy(newInputConnectionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, newInputConnectionPolicy, newInputConnectionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrocosPackage.INPUT_PORT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.INPUT_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				if (inputConnectionPolicy != null)
					msgs = ((InternalEObject)inputConnectionPolicy).eInverseRemove(this, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
				return basicSetInputConnectionPolicy((ConnectionPolicy)otherEnd, msgs);
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
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				return basicSetInputConnectionPolicy(null, msgs);
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
			case OrocosPackage.INPUT_PORT__IS_EVENT_PORT:
				return getIsEventPort();
			case OrocosPackage.INPUT_PORT__NAME:
				return getName();
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				if (resolve) return getInputConnectionPolicy();
				return basicGetInputConnectionPolicy();
			case OrocosPackage.INPUT_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case OrocosPackage.INPUT_PORT__IS_EVENT_PORT:
				setIsEventPort((Boolean)newValue);
				return;
			case OrocosPackage.INPUT_PORT__NAME:
				setName((String)newValue);
				return;
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				setInputConnectionPolicy((ConnectionPolicy)newValue);
				return;
			case OrocosPackage.INPUT_PORT__TYPE:
				setType((DataType)newValue);
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
			case OrocosPackage.INPUT_PORT__IS_EVENT_PORT:
				setIsEventPort(IS_EVENT_PORT_EDEFAULT);
				return;
			case OrocosPackage.INPUT_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				setInputConnectionPolicy((ConnectionPolicy)null);
				return;
			case OrocosPackage.INPUT_PORT__TYPE:
				setType((DataType)null);
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
			case OrocosPackage.INPUT_PORT__IS_EVENT_PORT:
				return IS_EVENT_PORT_EDEFAULT == null ? isEventPort != null : !IS_EVENT_PORT_EDEFAULT.equals(isEventPort);
			case OrocosPackage.INPUT_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
				return inputConnectionPolicy != null;
			case OrocosPackage.INPUT_PORT__TYPE:
				return type != null;
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
		result.append(" (isEventPort: ");
		result.append(isEventPort);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InputPortImpl
