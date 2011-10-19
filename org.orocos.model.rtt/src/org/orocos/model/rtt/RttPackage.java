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
package org.orocos.model.rtt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.orocos.model.rtt.RttFactory
 * @model kind="package"
 * @generated
 */
public interface RttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rtt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rtt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RttPackage eINSTANCE = org.orocos.model.rtt.impl.RttPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.TaskContextImpl <em>Task Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.TaskContextImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getTaskContext()
	 * @generated
	 */
	int TASK_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__INPUT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__OUTPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Task Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.PackageImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TASK_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Connection Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTION_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ACTIVITY = 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.InputPortImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Is Event Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IS_EVENT_PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Input Connection Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__INPUT_CONNECTION_POLICY = 3;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.OutputPortImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Output Connection Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__OUTPUT_CONNECTION_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.ConnectionPolicyImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicy()
	 * @generated
	 */
	int CONNECTION_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__INPUT_PORT = 0;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__OUTPUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__BUFFER_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Lock Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__LOCK_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Connection Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.IActivity <em>IActivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.IActivity
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getIActivity()
	 * @generated
	 */
	int IACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTIVITY__TASK_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>IActivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.ActivityImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = IACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASK_CONTEXT = IACTIVITY__TASK_CONTEXT;

	/**
	 * The feature id for the '<em><b>Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SLAVE = IACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCHEDULER = IACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CPU_AFFINITY = IACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERIOD = IACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRIORITY = IACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.SlaveImpl <em>Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.SlaveImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getSlave()
	 * @generated
	 */
	int SLAVE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__NAME = IACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__TASK_CONTEXT = IACTIVITY__TASK_CONTEXT;

	/**
	 * The feature id for the '<em><b>Master</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__MASTER = IACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_FEATURE_COUNT = IACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.impl.PropertyImpl
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.PortType
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.Scheduler <em>Scheduler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.Scheduler
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 10;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.ConnectionPolicyType <em>Connection Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicyType()
	 * @generated
	 */
	int CONNECTION_POLICY_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicyLockPolicy()
	 * @generated
	 */
	int CONNECTION_POLICY_LOCK_POLICY = 12;

	/**
	 * The meta object id for the '{@link org.orocos.model.rtt.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orocos.model.rtt.PropertyType
	 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.TaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Context</em>'.
	 * @see org.orocos.model.rtt.TaskContext
	 * @generated
	 */
	EClass getTaskContext();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.TaskContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getName()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.TaskContext#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getNamespace()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.TaskContext#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getType()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.TaskContext#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Port</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getInputPort()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.TaskContext#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Port</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getOutputPort()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_OutputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.TaskContext#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.orocos.model.rtt.TaskContext#getProperty()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_Property();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.orocos.model.rtt.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.Package#getTaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Context</em>'.
	 * @see org.orocos.model.rtt.Package#getTaskContext()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_TaskContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.Package#getConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Policy</em>'.
	 * @see org.orocos.model.rtt.Package#getConnectionPolicy()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ConnectionPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.Package#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.orocos.model.rtt.Package#getActivity()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Activity();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see org.orocos.model.rtt.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.InputPort#getIsEventPort <em>Is Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Event Port</em>'.
	 * @see org.orocos.model.rtt.InputPort#getIsEventPort()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_IsEventPort();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.InputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.InputPort#getName()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.InputPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.orocos.model.rtt.InputPort#getType()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Type();

	/**
	 * Returns the meta object for the reference '{@link org.orocos.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Connection Policy</em>'.
	 * @see org.orocos.model.rtt.InputPort#getInputConnectionPolicy()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_InputConnectionPolicy();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see org.orocos.model.rtt.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.OutputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.OutputPort#getName()
	 * @see #getOutputPort()
	 * @generated
	 */
	EAttribute getOutputPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.OutputPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.orocos.model.rtt.OutputPort#getType()
	 * @see #getOutputPort()
	 * @generated
	 */
	EAttribute getOutputPort_Type();

	/**
	 * Returns the meta object for the reference '{@link org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Connection Policy</em>'.
	 * @see org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_OutputConnectionPolicy();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.ConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Policy</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy
	 * @generated
	 */
	EClass getConnectionPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.orocos.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getInputPort()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_InputPort();

	/**
	 * Returns the meta object for the reference '{@link org.orocos.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getOutputPort()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_OutputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getBufferSize()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.ConnectionPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getName()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getLockPolicy()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.ConnectionPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicy#getType()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Type();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.orocos.model.rtt.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orocos.model.rtt.Activity#getSlave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slave</em>'.
	 * @see org.orocos.model.rtt.Activity#getSlave()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Slave();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Activity#getCpuAffinity <em>Cpu Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Affinity</em>'.
	 * @see org.orocos.model.rtt.Activity#getCpuAffinity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_CpuAffinity();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Activity#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.orocos.model.rtt.Activity#getPeriod()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Activity#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.orocos.model.rtt.Activity#getPriority()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Activity#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler</em>'.
	 * @see org.orocos.model.rtt.Activity#getScheduler()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Scheduler();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.Slave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slave</em>'.
	 * @see org.orocos.model.rtt.Slave
	 * @generated
	 */
	EClass getSlave();

	/**
	 * Returns the meta object for the container reference '{@link org.orocos.model.rtt.Slave#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Master</em>'.
	 * @see org.orocos.model.rtt.Slave#getMaster()
	 * @see #getSlave()
	 * @generated
	 */
	EReference getSlave_Master();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.IActivity <em>IActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IActivity</em>'.
	 * @see org.orocos.model.rtt.IActivity
	 * @generated
	 */
	EClass getIActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.IActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.IActivity#getName()
	 * @see #getIActivity()
	 * @generated
	 */
	EAttribute getIActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.orocos.model.rtt.IActivity#getTaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Context</em>'.
	 * @see org.orocos.model.rtt.IActivity#getTaskContext()
	 * @see #getIActivity()
	 * @generated
	 */
	EReference getIActivity_TaskContext();

	/**
	 * Returns the meta object for class '{@link org.orocos.model.rtt.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.orocos.model.rtt.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.orocos.model.rtt.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.orocos.model.rtt.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.orocos.model.rtt.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.orocos.model.rtt.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.orocos.model.rtt.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for enum '{@link org.orocos.model.rtt.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see org.orocos.model.rtt.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link org.orocos.model.rtt.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduler</em>'.
	 * @see org.orocos.model.rtt.Scheduler
	 * @generated
	 */
	EEnum getScheduler();

	/**
	 * Returns the meta object for enum '{@link org.orocos.model.rtt.ConnectionPolicyType <em>Connection Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Policy Type</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @generated
	 */
	EEnum getConnectionPolicyType();

	/**
	 * Returns the meta object for enum '{@link org.orocos.model.rtt.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Policy Lock Policy</em>'.
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @generated
	 */
	EEnum getConnectionPolicyLockPolicy();

	/**
	 * Returns the meta object for enum '{@link org.orocos.model.rtt.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see org.orocos.model.rtt.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RttFactory getRttFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.TaskContextImpl <em>Task Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.TaskContextImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getTaskContext()
		 * @generated
		 */
		EClass TASK_CONTEXT = eINSTANCE.getTaskContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__NAME = eINSTANCE.getTaskContext_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__NAMESPACE = eINSTANCE
				.getTaskContext_Namespace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__TYPE = eINSTANCE.getTaskContext_Type();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__INPUT_PORT = eINSTANCE
				.getTaskContext_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OUTPUT_PORT = eINSTANCE
				.getTaskContext_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__PROPERTY = eINSTANCE.getTaskContext_Property();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.PackageImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Task Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TASK_CONTEXT = eINSTANCE.getPackage_TaskContext();

		/**
		 * The meta object literal for the '<em><b>Connection Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONNECTION_POLICY = eINSTANCE
				.getPackage_ConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTIVITY = eINSTANCE.getPackage_Activity();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.InputPortImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Is Event Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__IS_EVENT_PORT = eINSTANCE
				.getInputPort_IsEventPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__NAME = eINSTANCE.getInputPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__TYPE = eINSTANCE.getInputPort_Type();

		/**
		 * The meta object literal for the '<em><b>Input Connection Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__INPUT_CONNECTION_POLICY = eINSTANCE
				.getInputPort_InputConnectionPolicy();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.OutputPortImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PORT__NAME = eINSTANCE.getOutputPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PORT__TYPE = eINSTANCE.getOutputPort_Type();

		/**
		 * The meta object literal for the '<em><b>Output Connection Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__OUTPUT_CONNECTION_POLICY = eINSTANCE
				.getOutputPort_OutputConnectionPolicy();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.ConnectionPolicyImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicy()
		 * @generated
		 */
		EClass CONNECTION_POLICY = eINSTANCE.getConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__INPUT_PORT = eINSTANCE
				.getConnectionPolicy_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__OUTPUT_PORT = eINSTANCE
				.getConnectionPolicy_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__BUFFER_SIZE = eINSTANCE
				.getConnectionPolicy_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__NAME = eINSTANCE
				.getConnectionPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__LOCK_POLICY = eINSTANCE
				.getConnectionPolicy_LockPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__TYPE = eINSTANCE
				.getConnectionPolicy_Type();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.ActivityImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SLAVE = eINSTANCE.getActivity_Slave();

		/**
		 * The meta object literal for the '<em><b>Cpu Affinity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CPU_AFFINITY = eINSTANCE.getActivity_CpuAffinity();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PERIOD = eINSTANCE.getActivity_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PRIORITY = eINSTANCE.getActivity_Priority();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SCHEDULER = eINSTANCE.getActivity_Scheduler();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.SlaveImpl <em>Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.SlaveImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getSlave()
		 * @generated
		 */
		EClass SLAVE = eINSTANCE.getSlave();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLAVE__MASTER = eINSTANCE.getSlave_Master();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.IActivity <em>IActivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.IActivity
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getIActivity()
		 * @generated
		 */
		EClass IACTIVITY = eINSTANCE.getIActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IACTIVITY__NAME = eINSTANCE.getIActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Task Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IACTIVITY__TASK_CONTEXT = eINSTANCE
				.getIActivity_TaskContext();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.impl.PropertyImpl
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.PortType
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.Scheduler <em>Scheduler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.Scheduler
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getScheduler()
		 * @generated
		 */
		EEnum SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.ConnectionPolicyType <em>Connection Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.ConnectionPolicyType
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicyType()
		 * @generated
		 */
		EEnum CONNECTION_POLICY_TYPE = eINSTANCE.getConnectionPolicyType();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getConnectionPolicyLockPolicy()
		 * @generated
		 */
		EEnum CONNECTION_POLICY_LOCK_POLICY = eINSTANCE
				.getConnectionPolicyLockPolicy();

		/**
		 * The meta object literal for the '{@link org.orocos.model.rtt.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orocos.model.rtt.PropertyType
		 * @see org.orocos.model.rtt.impl.RttPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

	}

} //RttPackage
