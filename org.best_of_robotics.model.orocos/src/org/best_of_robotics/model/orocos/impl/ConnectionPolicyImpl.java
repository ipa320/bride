/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos.impl;

import org.best_of_robotics.model.orocos.ConnectionPolicy;
import org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy;
import org.best_of_robotics.model.orocos.ConnectionPolicyType;
import org.best_of_robotics.model.orocos.InputPort;
import org.best_of_robotics.model.orocos.OrocosPackage;
import org.best_of_robotics.model.orocos.OutputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPolicyImpl extends EObjectImpl implements ConnectionPolicy {
	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outputPort;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final short BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected short bufferSize = BUFFER_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionPolicyLockPolicy LOCK_POLICY_EDEFAULT = ConnectionPolicyLockPolicy.LOCK_FREE;

	/**
	 * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicyLockPolicy lockPolicy = LOCK_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionPolicyType TYPE_EDEFAULT = ConnectionPolicyType.DATA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicyType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrocosPackage.Literals.CONNECTION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject)inputPort;
			inputPort = (InputPort)eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPort(InputPort newInputPort, NotificationChain msgs) {
		InputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, oldInputPort, newInputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(InputPort newInputPort) {
		if (newInputPort != inputPort) {
			NotificationChain msgs = null;
			if (inputPort != null)
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, InputPort.class, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, InputPort.class, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutputPort() {
		if (outputPort != null && outputPort.eIsProxy()) {
			InternalEObject oldOutputPort = (InternalEObject)outputPort;
			outputPort = (OutputPort)eResolveProxy(oldOutputPort);
			if (outputPort != oldOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, outputPort));
			}
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPort(OutputPort newOutputPort, NotificationChain msgs) {
		OutputPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, newOutputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(OutputPort newOutputPort) {
		if (newOutputPort != outputPort) {
			NotificationChain msgs = null;
			if (outputPort != null)
				msgs = ((InternalEObject)outputPort).eInverseRemove(this, OrocosPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, OutputPort.class, msgs);
			if (newOutputPort != null)
				msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, OrocosPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, OutputPort.class, msgs);
			msgs = basicSetOutputPort(newOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT, newOutputPort, newOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(short newBufferSize) {
		short oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__BUFFER_SIZE, oldBufferSize, bufferSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyLockPolicy getLockPolicy() {
		return lockPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockPolicy(ConnectionPolicyLockPolicy newLockPolicy) {
		ConnectionPolicyLockPolicy oldLockPolicy = lockPolicy;
		lockPolicy = newLockPolicy == null ? LOCK_POLICY_EDEFAULT : newLockPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__LOCK_POLICY, oldLockPolicy, lockPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectionPolicyType newType) {
		ConnectionPolicyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.CONNECTION_POLICY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				if (inputPort != null)
					msgs = ((InternalEObject)inputPort).eInverseRemove(this, OrocosPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, InputPort.class, msgs);
				return basicSetInputPort((InputPort)otherEnd, msgs);
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				if (outputPort != null)
					msgs = ((InternalEObject)outputPort).eInverseRemove(this, OrocosPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, OutputPort.class, msgs);
				return basicSetOutputPort((OutputPort)otherEnd, msgs);
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
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				return basicSetInputPort(null, msgs);
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				return basicSetOutputPort(null, msgs);
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
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				if (resolve) return getInputPort();
				return basicGetInputPort();
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				if (resolve) return getOutputPort();
				return basicGetOutputPort();
			case OrocosPackage.CONNECTION_POLICY__BUFFER_SIZE:
				return getBufferSize();
			case OrocosPackage.CONNECTION_POLICY__NAME:
				return getName();
			case OrocosPackage.CONNECTION_POLICY__LOCK_POLICY:
				return getLockPolicy();
			case OrocosPackage.CONNECTION_POLICY__TYPE:
				return getType();
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
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				setInputPort((InputPort)newValue);
				return;
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				setOutputPort((OutputPort)newValue);
				return;
			case OrocosPackage.CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize((Short)newValue);
				return;
			case OrocosPackage.CONNECTION_POLICY__NAME:
				setName((String)newValue);
				return;
			case OrocosPackage.CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy((ConnectionPolicyLockPolicy)newValue);
				return;
			case OrocosPackage.CONNECTION_POLICY__TYPE:
				setType((ConnectionPolicyType)newValue);
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
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				setInputPort((InputPort)null);
				return;
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				setOutputPort((OutputPort)null);
				return;
			case OrocosPackage.CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case OrocosPackage.CONNECTION_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrocosPackage.CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy(LOCK_POLICY_EDEFAULT);
				return;
			case OrocosPackage.CONNECTION_POLICY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OrocosPackage.CONNECTION_POLICY__INPUT_PORT:
				return inputPort != null;
			case OrocosPackage.CONNECTION_POLICY__OUTPUT_PORT:
				return outputPort != null;
			case OrocosPackage.CONNECTION_POLICY__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case OrocosPackage.CONNECTION_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrocosPackage.CONNECTION_POLICY__LOCK_POLICY:
				return lockPolicy != LOCK_POLICY_EDEFAULT;
			case OrocosPackage.CONNECTION_POLICY__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (bufferSize: ");
		result.append(bufferSize);
		result.append(", name: ");
		result.append(name);
		result.append(", lockPolicy: ");
		result.append(lockPolicy);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConnectionPolicyImpl
