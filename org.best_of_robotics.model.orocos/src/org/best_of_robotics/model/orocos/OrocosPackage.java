/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

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
 * @see org.best_of_robotics.model.orocos.OrocosFactory
 * @model kind="package"
 * @generated
 */
public interface OrocosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orocos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://orocos/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orocos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrocosPackage eINSTANCE = org.best_of_robotics.model.orocos.impl.OrocosPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.TaskContextImpl <em>Task Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.TaskContextImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getTaskContext()
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
	 * The feature id for the '<em><b>Operacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__OPERACION = 6;

	/**
	 * The number of structural features of the '<em>Task Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.PackageImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getPackage()
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
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.InputPortImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getInputPort()
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
	 * The feature id for the '<em><b>Input Connection Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__INPUT_CONNECTION_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.OutputPortImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOutputPort()
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
	 * The feature id for the '<em><b>Output Connection Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__OUTPUT_CONNECTION_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicy()
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
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.IActivity <em>IActivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.IActivity
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getIActivity()
	 * @generated
	 */
	int IACTIVITY = 6;

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
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.ActivityImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getActivity()
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
	 * The feature id for the '<em><b>Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCHEDULER = IACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpu Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CPU_AFFINITY = IACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERIOD = IACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRIORITY = IACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.PropertyImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

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
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.impl.OperationImpl
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.Scheduler <em>Scheduler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.Scheduler
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 9;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.ConnectionPolicyType <em>Connection Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyType
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicyType()
	 * @generated
	 */
	int CONNECTION_POLICY_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicyLockPolicy()
	 * @generated
	 */
	int CONNECTION_POLICY_LOCK_POLICY = 11;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.PropertyType
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.orocos.OperationReturnType <em>Operation Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.orocos.OperationReturnType
	 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOperationReturnType()
	 * @generated
	 */
	int OPERATION_RETURN_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.TaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Context</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext
	 * @generated
	 */
	EClass getTaskContext();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.TaskContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getName()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.TaskContext#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getNamespace()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.TaskContext#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getType()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.TaskContext#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Port</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getInputPort()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.TaskContext#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Port</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getOutputPort()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_OutputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.TaskContext#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getProperty()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.TaskContext#getOperacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operacion</em>'.
	 * @see org.best_of_robotics.model.orocos.TaskContext#getOperacion()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_Operacion();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.best_of_robotics.model.orocos.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.Package#getTaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Context</em>'.
	 * @see org.best_of_robotics.model.orocos.Package#getTaskContext()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_TaskContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.Package#getConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.Package#getConnectionPolicy()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ConnectionPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.orocos.Package#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.best_of_robotics.model.orocos.Package#getActivity()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Activity();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see org.best_of_robotics.model.orocos.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.InputPort#getIsEventPort <em>Is Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Event Port</em>'.
	 * @see org.best_of_robotics.model.orocos.InputPort#getIsEventPort()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_IsEventPort();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.InputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.InputPort#getName()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Name();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Connection Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.InputPort#getInputConnectionPolicy()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_InputConnectionPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.InputPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.best_of_robotics.model.orocos.InputPort#getType()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see org.best_of_robotics.model.orocos.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.OutputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.OutputPort#getName()
	 * @see #getOutputPort()
	 * @generated
	 */
	EAttribute getOutputPort_Name();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Connection Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_OutputConnectionPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.OutputPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.best_of_robotics.model.orocos.OutputPort#getType()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.ConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy
	 * @generated
	 */
	EClass getConnectionPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getInputPort()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_InputPort();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_OutputPort();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getBufferSize()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getName()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getLockPolicy()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getType()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.best_of_robotics.model.orocos.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Activity#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler</em>'.
	 * @see org.best_of_robotics.model.orocos.Activity#getScheduler()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Scheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Activity#getCpuAffinity <em>Cpu Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Affinity</em>'.
	 * @see org.best_of_robotics.model.orocos.Activity#getCpuAffinity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_CpuAffinity();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Activity#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.best_of_robotics.model.orocos.Activity#getPeriod()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Activity#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.best_of_robotics.model.orocos.Activity#getPriority()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Priority();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.IActivity <em>IActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IActivity</em>'.
	 * @see org.best_of_robotics.model.orocos.IActivity
	 * @generated
	 */
	EClass getIActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.IActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.IActivity#getName()
	 * @see #getIActivity()
	 * @generated
	 */
	EAttribute getIActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.orocos.IActivity#getTaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Context</em>'.
	 * @see org.best_of_robotics.model.orocos.IActivity#getTaskContext()
	 * @see #getIActivity()
	 * @generated
	 */
	EReference getIActivity_TaskContext();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.best_of_robotics.model.orocos.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.best_of_robotics.model.orocos.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.orocos.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.best_of_robotics.model.orocos.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.orocos.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.best_of_robotics.model.orocos.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.orocos.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.best_of_robotics.model.orocos.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.orocos.Operation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.best_of_robotics.model.orocos.Operation#getDocumentation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Documentation();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.orocos.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduler</em>'.
	 * @see org.best_of_robotics.model.orocos.Scheduler
	 * @generated
	 */
	EEnum getScheduler();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.orocos.ConnectionPolicyType <em>Connection Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Policy Type</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyType
	 * @generated
	 */
	EEnum getConnectionPolicyType();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Policy Lock Policy</em>'.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy
	 * @generated
	 */
	EEnum getConnectionPolicyLockPolicy();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.orocos.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see org.best_of_robotics.model.orocos.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.orocos.OperationReturnType <em>Operation Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Return Type</em>'.
	 * @see org.best_of_robotics.model.orocos.OperationReturnType
	 * @generated
	 */
	EEnum getOperationReturnType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrocosFactory getOrocosFactory();

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
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.TaskContextImpl <em>Task Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.TaskContextImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getTaskContext()
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
		EAttribute TASK_CONTEXT__NAMESPACE = eINSTANCE.getTaskContext_Namespace();

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
		EReference TASK_CONTEXT__INPUT_PORT = eINSTANCE.getTaskContext_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OUTPUT_PORT = eINSTANCE.getTaskContext_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__PROPERTY = eINSTANCE.getTaskContext_Property();

		/**
		 * The meta object literal for the '<em><b>Operacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OPERACION = eINSTANCE.getTaskContext_Operacion();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.PackageImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getPackage()
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
		EReference PACKAGE__CONNECTION_POLICY = eINSTANCE.getPackage_ConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTIVITY = eINSTANCE.getPackage_Activity();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.InputPortImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Is Event Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__IS_EVENT_PORT = eINSTANCE.getInputPort_IsEventPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__NAME = eINSTANCE.getInputPort_Name();

		/**
		 * The meta object literal for the '<em><b>Input Connection Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__INPUT_CONNECTION_POLICY = eINSTANCE.getInputPort_InputConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__TYPE = eINSTANCE.getInputPort_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.OutputPortImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOutputPort()
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
		 * The meta object literal for the '<em><b>Output Connection Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__OUTPUT_CONNECTION_POLICY = eINSTANCE.getOutputPort_OutputConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__TYPE = eINSTANCE.getOutputPort_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.ConnectionPolicyImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicy()
		 * @generated
		 */
		EClass CONNECTION_POLICY = eINSTANCE.getConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__INPUT_PORT = eINSTANCE.getConnectionPolicy_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__OUTPUT_PORT = eINSTANCE.getConnectionPolicy_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__BUFFER_SIZE = eINSTANCE.getConnectionPolicy_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__NAME = eINSTANCE.getConnectionPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__LOCK_POLICY = eINSTANCE.getConnectionPolicy_LockPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__TYPE = eINSTANCE.getConnectionPolicy_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.ActivityImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SCHEDULER = eINSTANCE.getActivity_Scheduler();

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
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.IActivity <em>IActivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.IActivity
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getIActivity()
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
		EReference IACTIVITY__TASK_CONTEXT = eINSTANCE.getIActivity_TaskContext();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.PropertyImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.impl.OperationImpl
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DOCUMENTATION = eINSTANCE.getOperation_Documentation();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.Scheduler <em>Scheduler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.Scheduler
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getScheduler()
		 * @generated
		 */
		EEnum SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.ConnectionPolicyType <em>Connection Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.ConnectionPolicyType
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicyType()
		 * @generated
		 */
		EEnum CONNECTION_POLICY_TYPE = eINSTANCE.getConnectionPolicyType();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy <em>Connection Policy Lock Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getConnectionPolicyLockPolicy()
		 * @generated
		 */
		EEnum CONNECTION_POLICY_LOCK_POLICY = eINSTANCE.getConnectionPolicyLockPolicy();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.PropertyType
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.orocos.OperationReturnType <em>Operation Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.orocos.OperationReturnType
		 * @see org.best_of_robotics.model.orocos.impl.OrocosPackageImpl#getOperationReturnType()
		 * @generated
		 */
		EEnum OPERATION_RETURN_TYPE = eINSTANCE.getOperationReturnType();

	}

} //OrocosPackage
