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
package org.orocos.model.rtt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.PortType;
import org.orocos.model.rtt.RttPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.impl.OutputPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.OutputPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.OutputPortImpl#getOutputConnectionPolicy <em>Output Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPortImpl extends EObjectImpl implements OutputPort {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PortType TYPE_EDEFAULT = PortType.CHAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PortType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputConnectionPolicy() <em>Output Connection Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnectionPolicy()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicy outputConnectionPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RttPackage.Literals.OUTPUT_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.OUTPUT_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PortType newType) {
		PortType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.OUTPUT_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy getOutputConnectionPolicy() {
		if (outputConnectionPolicy != null && outputConnectionPolicy.eIsProxy()) {
			InternalEObject oldOutputConnectionPolicy = (InternalEObject) outputConnectionPolicy;
			outputConnectionPolicy = (ConnectionPolicy) eResolveProxy(oldOutputConnectionPolicy);
			if (outputConnectionPolicy != oldOutputConnectionPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY,
							oldOutputConnectionPolicy, outputConnectionPolicy));
			}
		}
		return outputConnectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy basicGetOutputConnectionPolicy() {
		return outputConnectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnectionPolicy(
			ConnectionPolicy newOutputConnectionPolicy, NotificationChain msgs) {
		ConnectionPolicy oldOutputConnectionPolicy = outputConnectionPolicy;
		outputConnectionPolicy = newOutputConnectionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY,
					oldOutputConnectionPolicy, newOutputConnectionPolicy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnectionPolicy(
			ConnectionPolicy newOutputConnectionPolicy) {
		if (newOutputConnectionPolicy != outputConnectionPolicy) {
			NotificationChain msgs = null;
			if (outputConnectionPolicy != null)
				msgs = ((InternalEObject) outputConnectionPolicy)
						.eInverseRemove(this,
								RttPackage.CONNECTION_POLICY__OUTPUT_PORT,
								ConnectionPolicy.class, msgs);
			if (newOutputConnectionPolicy != null)
				msgs = ((InternalEObject) newOutputConnectionPolicy)
						.eInverseAdd(this,
								RttPackage.CONNECTION_POLICY__OUTPUT_PORT,
								ConnectionPolicy.class, msgs);
			msgs = basicSetOutputConnectionPolicy(newOutputConnectionPolicy,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY,
					newOutputConnectionPolicy, newOutputConnectionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			if (outputConnectionPolicy != null)
				msgs = ((InternalEObject) outputConnectionPolicy)
						.eInverseRemove(this,
								RttPackage.CONNECTION_POLICY__OUTPUT_PORT,
								ConnectionPolicy.class, msgs);
			return basicSetOutputConnectionPolicy((ConnectionPolicy) otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			return basicSetOutputConnectionPolicy(null, msgs);
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
		case RttPackage.OUTPUT_PORT__NAME:
			return getName();
		case RttPackage.OUTPUT_PORT__TYPE:
			return getType();
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			if (resolve)
				return getOutputConnectionPolicy();
			return basicGetOutputConnectionPolicy();
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
		case RttPackage.OUTPUT_PORT__NAME:
			setName((String) newValue);
			return;
		case RttPackage.OUTPUT_PORT__TYPE:
			setType((PortType) newValue);
			return;
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			setOutputConnectionPolicy((ConnectionPolicy) newValue);
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
		case RttPackage.OUTPUT_PORT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RttPackage.OUTPUT_PORT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			setOutputConnectionPolicy((ConnectionPolicy) null);
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
		case RttPackage.OUTPUT_PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case RttPackage.OUTPUT_PORT__TYPE:
			return type != TYPE_EDEFAULT;
		case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
			return outputConnectionPolicy != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OutputPortImpl
