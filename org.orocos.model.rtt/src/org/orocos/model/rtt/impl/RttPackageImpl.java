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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.ConnectionPolicyLockPolicy;
import org.orocos.model.rtt.ConnectionPolicyType;
import org.orocos.model.rtt.IActivity;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.PortType;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.Scheduler;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RttPackageImpl extends EPackageImpl implements RttPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionPolicyLockPolicyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.orocos.model.rtt.RttPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RttPackageImpl() {
		super(eNS_URI, RttFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RttPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RttPackage init() {
		if (isInited)
			return (RttPackage) EPackage.Registry.INSTANCE
					.getEPackage(RttPackage.eNS_URI);

		// Obtain or create and register package
		RttPackageImpl theRttPackage = (RttPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RttPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RttPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRttPackage.createPackageContents();

		// Initialize created meta-data
		theRttPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRttPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RttPackage.eNS_URI, theRttPackage);
		return theRttPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskContext() {
		return taskContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Name() {
		return (EAttribute) taskContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Namespace() {
		return (EAttribute) taskContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Type() {
		return (EAttribute) taskContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_InputPort() {
		return (EReference) taskContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_OutputPort() {
		return (EReference) taskContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_TaskContext() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ConnectionPolicy() {
		return (EReference) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Activity() {
		return (EReference) packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPort_IsEventPort() {
		return (EAttribute) inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPort_Name() {
		return (EAttribute) inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPort_Type() {
		return (EAttribute) inputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InputConnectionPolicy() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPort_Name() {
		return (EAttribute) outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPort_Type() {
		return (EAttribute) outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_OutputConnectionPolicy() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPolicy() {
		return connectionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPolicy_InputPort() {
		return (EReference) connectionPolicyEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPolicy_OutputPort() {
		return (EReference) connectionPolicyEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_BufferSize() {
		return (EAttribute) connectionPolicyEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Name() {
		return (EAttribute) connectionPolicyEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_LockPolicy() {
		return (EAttribute) connectionPolicyEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Type() {
		return (EAttribute) connectionPolicyEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Slave() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_CpuAffinity() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Period() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Priority() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Scheduler() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlave() {
		return slaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlave_Master() {
		return (EReference) slaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIActivity() {
		return iActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIActivity_Name() {
		return (EAttribute) iActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIActivity_TaskContext() {
		return (EReference) iActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScheduler() {
		return schedulerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionPolicyType() {
		return connectionPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionPolicyLockPolicy() {
		return connectionPolicyLockPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RttFactory getRttFactory() {
		return (RttFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		taskContextEClass = createEClass(TASK_CONTEXT);
		createEAttribute(taskContextEClass, TASK_CONTEXT__NAME);
		createEAttribute(taskContextEClass, TASK_CONTEXT__NAMESPACE);
		createEAttribute(taskContextEClass, TASK_CONTEXT__TYPE);
		createEReference(taskContextEClass, TASK_CONTEXT__INPUT_PORT);
		createEReference(taskContextEClass, TASK_CONTEXT__OUTPUT_PORT);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEReference(packageEClass, PACKAGE__TASK_CONTEXT);
		createEReference(packageEClass, PACKAGE__CONNECTION_POLICY);
		createEReference(packageEClass, PACKAGE__ACTIVITY);

		inputPortEClass = createEClass(INPUT_PORT);
		createEAttribute(inputPortEClass, INPUT_PORT__IS_EVENT_PORT);
		createEAttribute(inputPortEClass, INPUT_PORT__NAME);
		createEAttribute(inputPortEClass, INPUT_PORT__TYPE);
		createEReference(inputPortEClass, INPUT_PORT__INPUT_CONNECTION_POLICY);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEAttribute(outputPortEClass, OUTPUT_PORT__NAME);
		createEAttribute(outputPortEClass, OUTPUT_PORT__TYPE);
		createEReference(outputPortEClass,
				OUTPUT_PORT__OUTPUT_CONNECTION_POLICY);

		connectionPolicyEClass = createEClass(CONNECTION_POLICY);
		createEReference(connectionPolicyEClass, CONNECTION_POLICY__INPUT_PORT);
		createEReference(connectionPolicyEClass, CONNECTION_POLICY__OUTPUT_PORT);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__BUFFER_SIZE);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__NAME);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__LOCK_POLICY);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__TYPE);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__SLAVE);
		createEAttribute(activityEClass, ACTIVITY__CPU_AFFINITY);
		createEAttribute(activityEClass, ACTIVITY__PERIOD);
		createEAttribute(activityEClass, ACTIVITY__PRIORITY);
		createEAttribute(activityEClass, ACTIVITY__SCHEDULER);

		slaveEClass = createEClass(SLAVE);
		createEReference(slaveEClass, SLAVE__MASTER);

		iActivityEClass = createEClass(IACTIVITY);
		createEAttribute(iActivityEClass, IACTIVITY__NAME);
		createEReference(iActivityEClass, IACTIVITY__TASK_CONTEXT);

		// Create enums
		portTypeEEnum = createEEnum(PORT_TYPE);
		schedulerEEnum = createEEnum(SCHEDULER);
		connectionPolicyTypeEEnum = createEEnum(CONNECTION_POLICY_TYPE);
		connectionPolicyLockPolicyEEnum = createEEnum(CONNECTION_POLICY_LOCK_POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getIActivity());
		slaveEClass.getESuperTypes().add(this.getIActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(taskContextEClass, TaskContext.class, "TaskContext",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskContext_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, TaskContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_Namespace(), ecorePackage.getEString(),
				"namespace", null, 1, 1, TaskContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_Type(), ecorePackage.getEString(),
				"type", "", 1, 1, TaskContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_InputPort(), this.getInputPort(), null,
				"inputPort", null, 0, -1, TaskContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_OutputPort(), this.getOutputPort(), null,
				"outputPort", null, 0, -1, TaskContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.orocos.model.rtt.Package.class,
				"Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, org.orocos.model.rtt.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_TaskContext(), this.getTaskContext(), null,
				"taskContext", null, 0, -1, org.orocos.model.rtt.Package.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPackage_ConnectionPolicy(),
				this.getConnectionPolicy(), null, "connectionPolicy", null, 0,
				-1, org.orocos.model.rtt.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Activity(), this.getIActivity(), null,
				"activity", null, 0, -1, org.orocos.model.rtt.Package.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPort_IsEventPort(),
				ecorePackage.getEBooleanObject(), "isEventPort", "false", 1, 1,
				InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputPort_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInputPort_Type(), this.getPortType(), "type", null,
				1, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getInputPort_InputConnectionPolicy(),
				this.getConnectionPolicy(),
				this.getConnectionPolicy_InputPort(), "inputConnectionPolicy",
				null, 1, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputPort_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutputPort_Type(), this.getPortType(), "type", null,
				1, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOutputPort_OutputConnectionPolicy(),
				this.getConnectionPolicy(),
				this.getConnectionPolicy_OutputPort(),
				"outputConnectionPolicy", null, 1, 1, OutputPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(connectionPolicyEClass, ConnectionPolicy.class,
				"ConnectionPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPolicy_InputPort(), this.getInputPort(),
				this.getInputPort_InputConnectionPolicy(), "inputPort", null,
				1, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPolicy_OutputPort(), this.getOutputPort(),
				this.getOutputPort_OutputConnectionPolicy(), "outputPort",
				null, 1, 1, ConnectionPolicy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_BufferSize(),
				ecorePackage.getEShort(), "bufferSize", null, 0, 1,
				ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConnectionPolicy_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, ConnectionPolicy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_LockPolicy(),
				this.getConnectionPolicyLockPolicy(), "lockPolicy",
				"LOCK_FREE", 0, 1, ConnectionPolicy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_Type(),
				this.getConnectionPolicyType(), "type", "DATA", 0, 1,
				ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Slave(), this.getSlave(),
				this.getSlave_Master(), "slave", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getActivity_CpuAffinity(), ecorePackage.getEString(),
				"cpuAffinity", "~0", 1, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Period(), ecorePackage.getEFloat(),
				"period", "0", 1, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Priority(), ecorePackage.getEInt(),
				"priority", "0", 1, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Scheduler(), this.getScheduler(),
				"scheduler", "ORO_SCHED_OTHER", 1, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slaveEClass, Slave.class, "Slave", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlave_Master(), this.getActivity(),
				this.getActivity_Slave(), "master", null, 0, 1, Slave.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(iActivityEClass, IActivity.class, "IActivity", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIActivity_Name(), ecorePackage.getEString(), "name",
				"Activity", 1, 1, IActivity.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIActivity_TaskContext(), this.getTaskContext(), null,
				"taskContext", null, 0, 1, IActivity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.CHAR);
		addEEnumLiteral(portTypeEEnum, PortType.INT);
		addEEnumLiteral(portTypeEEnum, PortType.FLOAT);
		addEEnumLiteral(portTypeEEnum, PortType.DOUBLE);
		addEEnumLiteral(portTypeEEnum, PortType.SHORT);
		addEEnumLiteral(portTypeEEnum, PortType.LONG);
		addEEnumLiteral(portTypeEEnum, PortType.STRING);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_CHAR);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_INT);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_FLOAT);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_DOUBLE);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_SHORT);
		addEEnumLiteral(portTypeEEnum, PortType.UNSIGNED_LONG);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_CHAR);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_INT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_FLOAT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_DOUBLE);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_SHORT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_LONG);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_CHAR);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_INT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_FLOAT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_DOUBLE);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_SHORT);
		addEEnumLiteral(portTypeEEnum, PortType.VECTOR_OF_UNSIGNED_LONG);

		initEEnum(schedulerEEnum, Scheduler.class, "Scheduler");
		addEEnumLiteral(schedulerEEnum, Scheduler.ORO_SCHED_OTHER);
		addEEnumLiteral(schedulerEEnum, Scheduler.ORO_SCHED_RT);

		initEEnum(connectionPolicyTypeEEnum, ConnectionPolicyType.class,
				"ConnectionPolicyType");
		addEEnumLiteral(connectionPolicyTypeEEnum, ConnectionPolicyType.DATA);
		addEEnumLiteral(connectionPolicyTypeEEnum, ConnectionPolicyType.BUFFER);

		initEEnum(connectionPolicyLockPolicyEEnum,
				ConnectionPolicyLockPolicy.class, "ConnectionPolicyLockPolicy");
		addEEnumLiteral(connectionPolicyLockPolicyEEnum,
				ConnectionPolicyLockPolicy.UNSYNC);
		addEEnumLiteral(connectionPolicyLockPolicyEEnum,
				ConnectionPolicyLockPolicy.LOCKED);
		addEEnumLiteral(connectionPolicyLockPolicyEEnum,
				ConnectionPolicyLockPolicy.LOCK_FREE);

		// Create resource
		createResource(eNS_URI);
	}

} //RttPackageImpl
