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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.Operation;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.Property;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.TaskContextImpl#getOperacion <em>Operacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskContextImpl extends EObjectImpl implements TaskContext {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputPort;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getOperacion() <em>Operacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RttPackage.Literals.TASK_CONTEXT;
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
					RttPackage.TASK_CONTEXT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.TASK_CONTEXT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.TASK_CONTEXT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputPort() {
		if (inputPort == null) {
			inputPort = new EObjectContainmentEList<InputPort>(InputPort.class,
					this, RttPackage.TASK_CONTEXT__INPUT_PORT);
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOutputPort() {
		if (outputPort == null) {
			outputPort = new EObjectContainmentEList<OutputPort>(
					OutputPort.class, this,
					RttPackage.TASK_CONTEXT__OUTPUT_PORT);
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class,
					this, RttPackage.TASK_CONTEXT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperacion() {
		if (operacion == null) {
			operacion = new EObjectContainmentEList<Operation>(Operation.class,
					this, RttPackage.TASK_CONTEXT__OPERACION);
		}
		return operacion;
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
		case RttPackage.TASK_CONTEXT__INPUT_PORT:
			return ((InternalEList<?>) getInputPort()).basicRemove(otherEnd,
					msgs);
		case RttPackage.TASK_CONTEXT__OUTPUT_PORT:
			return ((InternalEList<?>) getOutputPort()).basicRemove(otherEnd,
					msgs);
		case RttPackage.TASK_CONTEXT__PROPERTY:
			return ((InternalEList<?>) getProperty()).basicRemove(otherEnd,
					msgs);
		case RttPackage.TASK_CONTEXT__OPERACION:
			return ((InternalEList<?>) getOperacion()).basicRemove(otherEnd,
					msgs);
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
		case RttPackage.TASK_CONTEXT__NAME:
			return getName();
		case RttPackage.TASK_CONTEXT__NAMESPACE:
			return getNamespace();
		case RttPackage.TASK_CONTEXT__TYPE:
			return getType();
		case RttPackage.TASK_CONTEXT__INPUT_PORT:
			return getInputPort();
		case RttPackage.TASK_CONTEXT__OUTPUT_PORT:
			return getOutputPort();
		case RttPackage.TASK_CONTEXT__PROPERTY:
			return getProperty();
		case RttPackage.TASK_CONTEXT__OPERACION:
			return getOperacion();
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
		case RttPackage.TASK_CONTEXT__NAME:
			setName((String) newValue);
			return;
		case RttPackage.TASK_CONTEXT__NAMESPACE:
			setNamespace((String) newValue);
			return;
		case RttPackage.TASK_CONTEXT__TYPE:
			setType((String) newValue);
			return;
		case RttPackage.TASK_CONTEXT__INPUT_PORT:
			getInputPort().clear();
			getInputPort().addAll((Collection<? extends InputPort>) newValue);
			return;
		case RttPackage.TASK_CONTEXT__OUTPUT_PORT:
			getOutputPort().clear();
			getOutputPort().addAll((Collection<? extends OutputPort>) newValue);
			return;
		case RttPackage.TASK_CONTEXT__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
			return;
		case RttPackage.TASK_CONTEXT__OPERACION:
			getOperacion().clear();
			getOperacion().addAll((Collection<? extends Operation>) newValue);
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
		case RttPackage.TASK_CONTEXT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RttPackage.TASK_CONTEXT__NAMESPACE:
			setNamespace(NAMESPACE_EDEFAULT);
			return;
		case RttPackage.TASK_CONTEXT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RttPackage.TASK_CONTEXT__INPUT_PORT:
			getInputPort().clear();
			return;
		case RttPackage.TASK_CONTEXT__OUTPUT_PORT:
			getOutputPort().clear();
			return;
		case RttPackage.TASK_CONTEXT__PROPERTY:
			getProperty().clear();
			return;
		case RttPackage.TASK_CONTEXT__OPERACION:
			getOperacion().clear();
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
		case RttPackage.TASK_CONTEXT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case RttPackage.TASK_CONTEXT__NAMESPACE:
			return NAMESPACE_EDEFAULT == null ? namespace != null
					: !NAMESPACE_EDEFAULT.equals(namespace);
		case RttPackage.TASK_CONTEXT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case RttPackage.TASK_CONTEXT__INPUT_PORT:
			return inputPort != null && !inputPort.isEmpty();
		case RttPackage.TASK_CONTEXT__OUTPUT_PORT:
			return outputPort != null && !outputPort.isEmpty();
		case RttPackage.TASK_CONTEXT__PROPERTY:
			return property != null && !property.isEmpty();
		case RttPackage.TASK_CONTEXT__OPERACION:
			return operacion != null && !operacion.isEmpty();
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TaskContextImpl
