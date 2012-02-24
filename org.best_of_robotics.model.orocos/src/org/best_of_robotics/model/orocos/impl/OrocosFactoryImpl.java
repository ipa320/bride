/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos.impl;

import org.best_of_robotics.model.orocos.Activity;
import org.best_of_robotics.model.orocos.ConnectionPolicy;
import org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy;
import org.best_of_robotics.model.orocos.ConnectionPolicyType;
import org.best_of_robotics.model.orocos.InputPort;
import org.best_of_robotics.model.orocos.Operation;
import org.best_of_robotics.model.orocos.OperationReturnType;
import org.best_of_robotics.model.orocos.OrocosFactory;
import org.best_of_robotics.model.orocos.OrocosPackage;
import org.best_of_robotics.model.orocos.OutputPort;
import org.best_of_robotics.model.orocos.PortType;
import org.best_of_robotics.model.orocos.Property;
import org.best_of_robotics.model.orocos.PropertyType;
import org.best_of_robotics.model.orocos.Scheduler;
import org.best_of_robotics.model.orocos.TaskContext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrocosFactoryImpl extends EFactoryImpl implements OrocosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrocosFactory init() {
		try {
			OrocosFactory theOrocosFactory = (OrocosFactory)EPackage.Registry.INSTANCE.getEFactory("http://orocos/1.0"); 
			if (theOrocosFactory != null) {
				return theOrocosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrocosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosFactoryImpl() {
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
			case OrocosPackage.TASK_CONTEXT: return createTaskContext();
			case OrocosPackage.PACKAGE: return createPackage();
			case OrocosPackage.INPUT_PORT: return createInputPort();
			case OrocosPackage.OUTPUT_PORT: return createOutputPort();
			case OrocosPackage.CONNECTION_POLICY: return createConnectionPolicy();
			case OrocosPackage.ACTIVITY: return createActivity();
			case OrocosPackage.PROPERTY: return createProperty();
			case OrocosPackage.OPERATION: return createOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
			case OrocosPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case OrocosPackage.SCHEDULER:
				return createSchedulerFromString(eDataType, initialValue);
			case OrocosPackage.CONNECTION_POLICY_TYPE:
				return createConnectionPolicyTypeFromString(eDataType, initialValue);
			case OrocosPackage.CONNECTION_POLICY_LOCK_POLICY:
				return createConnectionPolicyLockPolicyFromString(eDataType, initialValue);
			case OrocosPackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case OrocosPackage.OPERATION_RETURN_TYPE:
				return createOperationReturnTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
			case OrocosPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case OrocosPackage.SCHEDULER:
				return convertSchedulerToString(eDataType, instanceValue);
			case OrocosPackage.CONNECTION_POLICY_TYPE:
				return convertConnectionPolicyTypeToString(eDataType, instanceValue);
			case OrocosPackage.CONNECTION_POLICY_LOCK_POLICY:
				return convertConnectionPolicyLockPolicyToString(eDataType, instanceValue);
			case OrocosPackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case OrocosPackage.OPERATION_RETURN_TYPE:
				return convertOperationReturnTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public org.best_of_robotics.model.orocos.Package createPackage() {
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createSchedulerFromString(EDataType eDataType, String initialValue) {
		Scheduler result = Scheduler.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyType createConnectionPolicyTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionPolicyType result = ConnectionPolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyLockPolicy createConnectionPolicyLockPolicyFromString(EDataType eDataType, String initialValue) {
		ConnectionPolicyLockPolicy result = ConnectionPolicyLockPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionPolicyLockPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationReturnType createOperationReturnTypeFromString(EDataType eDataType, String initialValue) {
		OperationReturnType result = OperationReturnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationReturnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosPackage getOrocosPackage() {
		return (OrocosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrocosPackage getPackage() {
		return OrocosPackage.eINSTANCE;
	}

} //OrocosFactoryImpl
