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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.ConnectionPolicyLockPolicy;
import org.orocos.model.rtt.ConnectionPolicyType;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.PortType;
import org.orocos.model.rtt.Property;
import org.orocos.model.rtt.PropertyType;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.Scheduler;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RttFactoryImpl extends EFactoryImpl implements RttFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RttFactory init() {
		try {
			RttFactory theRttFactory = (RttFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://rtt/1.0");
			if (theRttFactory != null) {
				return theRttFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RttFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RttFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RttPackage.TASK_CONTEXT:
			return createTaskContext();
		case RttPackage.PACKAGE:
			return createPackage();
		case RttPackage.INPUT_PORT:
			return createInputPort();
		case RttPackage.OUTPUT_PORT:
			return createOutputPort();
		case RttPackage.CONNECTION_POLICY:
			return createConnectionPolicy();
		case RttPackage.ACTIVITY:
			return createActivity();
		case RttPackage.SLAVE:
			return createSlave();
		case RttPackage.PROPERTY:
			return createProperty();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RttPackage.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		case RttPackage.SCHEDULER:
			return createSchedulerFromString(eDataType, initialValue);
		case RttPackage.CONNECTION_POLICY_TYPE:
			return createConnectionPolicyTypeFromString(eDataType, initialValue);
		case RttPackage.CONNECTION_POLICY_LOCK_POLICY:
			return createConnectionPolicyLockPolicyFromString(eDataType,
					initialValue);
		case RttPackage.PROPERTY_TYPE:
			return createPropertyTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RttPackage.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		case RttPackage.SCHEDULER:
			return convertSchedulerToString(eDataType, instanceValue);
		case RttPackage.CONNECTION_POLICY_TYPE:
			return convertConnectionPolicyTypeToString(eDataType, instanceValue);
		case RttPackage.CONNECTION_POLICY_LOCK_POLICY:
			return convertConnectionPolicyLockPolicyToString(eDataType,
					instanceValue);
		case RttPackage.PROPERTY_TYPE:
			return convertPropertyTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext createTaskContext() {
		TaskContextImpl taskContext = new TaskContextImpl();
		return taskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.orocos.model.rtt.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy createConnectionPolicy() {
		ConnectionPolicyImpl connectionPolicy = new ConnectionPolicyImpl();
		return connectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slave createSlave() {
		SlaveImpl slave = new SlaveImpl();
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType,
			String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createSchedulerFromString(EDataType eDataType,
			String initialValue) {
		Scheduler result = Scheduler.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulerToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyType createConnectionPolicyTypeFromString(
			EDataType eDataType, String initialValue) {
		ConnectionPolicyType result = ConnectionPolicyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionPolicyTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyLockPolicy createConnectionPolicyLockPolicyFromString(
			EDataType eDataType, String initialValue) {
		ConnectionPolicyLockPolicy result = ConnectionPolicyLockPolicy
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionPolicyLockPolicyToString(
			EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType,
			String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RttPackage getRttPackage() {
		return (RttPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RttPackage getPackage() {
		return RttPackage.eINSTANCE;
	}

} //RttFactoryImpl
