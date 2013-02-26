/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.best.of.robotics.smachDSL.SmachDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SmachDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smachDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.best.org/of/robotics/SmachDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smachDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmachDSLPackage eINSTANCE = org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.PrimitivePackageImpl <em>Primitive Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.PrimitivePackageImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getPrimitivePackage()
   * @generated
   */
  int PRIMITIVE_PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Statemachines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_PACKAGE__STATEMACHINES = 0;

  /**
   * The number of structural features of the '<em>Primitive Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.TestImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getTest()
   * @generated
   */
  int TEST = 1;

  /**
   * The feature id for the '<em><b>Ros</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__ROS = 0;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.StateMachineImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actionclients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__ACTIONCLIENTS = 1;

  /**
   * The feature id for the '<em><b>Serviceclients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__SERVICECLIENTS = 2;

  /**
   * The feature id for the '<em><b>Actionsstates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__ACTIONSSTATES = 3;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl <em>Action Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.ActionClientImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getActionClient()
   * @generated
   */
  int ACTION_CLIENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Actionname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLIENT__ACTIONNAME = 1;

  /**
   * The feature id for the '<em><b>Actiontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLIENT__ACTIONTYPE = 2;

  /**
   * The number of structural features of the '<em>Action Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLIENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.ServiceClientImpl <em>Service Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.ServiceClientImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getServiceClient()
   * @generated
   */
  int SERVICE_CLIENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_CLIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Servicename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_CLIENT__SERVICENAME = 1;

  /**
   * The feature id for the '<em><b>Servicesrv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_CLIENT__SERVICESRV = 2;

  /**
   * The number of structural features of the '<em>Service Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_CLIENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.ActionStateImpl <em>Action State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.ActionStateImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getActionState()
   * @generated
   */
  int ACTION_STATE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Clientname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATE__CLIENTNAME = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>Action State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.best.of.robotics.smachDSL.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.best.of.robotics.smachDSL.impl.TransitionImpl
   * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 6;

  /**
   * The feature id for the '<em><b>Outcome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OUTCOME = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.PrimitivePackage <em>Primitive Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Package</em>'.
   * @see org.best.of.robotics.smachDSL.PrimitivePackage
   * @generated
   */
  EClass getPrimitivePackage();

  /**
   * Returns the meta object for the containment reference list '{@link org.best.of.robotics.smachDSL.PrimitivePackage#getStatemachines <em>Statemachines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemachines</em>'.
   * @see org.best.of.robotics.smachDSL.PrimitivePackage#getStatemachines()
   * @see #getPrimitivePackage()
   * @generated
   */
  EReference getPrimitivePackage_Statemachines();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see org.best.of.robotics.smachDSL.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.Test#getRos <em>Ros</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ros</em>'.
   * @see org.best.of.robotics.smachDSL.Test#getRos()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Ros();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see org.best.of.robotics.smachDSL.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.StateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.best.of.robotics.smachDSL.StateMachine#getName()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.best.of.robotics.smachDSL.StateMachine#getActionclients <em>Actionclients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actionclients</em>'.
   * @see org.best.of.robotics.smachDSL.StateMachine#getActionclients()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Actionclients();

  /**
   * Returns the meta object for the containment reference list '{@link org.best.of.robotics.smachDSL.StateMachine#getServiceclients <em>Serviceclients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Serviceclients</em>'.
   * @see org.best.of.robotics.smachDSL.StateMachine#getServiceclients()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Serviceclients();

  /**
   * Returns the meta object for the containment reference list '{@link org.best.of.robotics.smachDSL.StateMachine#getActionsstates <em>Actionsstates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actionsstates</em>'.
   * @see org.best.of.robotics.smachDSL.StateMachine#getActionsstates()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Actionsstates();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.ActionClient <em>Action Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Client</em>'.
   * @see org.best.of.robotics.smachDSL.ActionClient
   * @generated
   */
  EClass getActionClient();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ActionClient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.best.of.robotics.smachDSL.ActionClient#getName()
   * @see #getActionClient()
   * @generated
   */
  EAttribute getActionClient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ActionClient#getActionname <em>Actionname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actionname</em>'.
   * @see org.best.of.robotics.smachDSL.ActionClient#getActionname()
   * @see #getActionClient()
   * @generated
   */
  EAttribute getActionClient_Actionname();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ActionClient#getActiontype <em>Actiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actiontype</em>'.
   * @see org.best.of.robotics.smachDSL.ActionClient#getActiontype()
   * @see #getActionClient()
   * @generated
   */
  EAttribute getActionClient_Actiontype();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.ServiceClient <em>Service Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Client</em>'.
   * @see org.best.of.robotics.smachDSL.ServiceClient
   * @generated
   */
  EClass getServiceClient();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ServiceClient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.best.of.robotics.smachDSL.ServiceClient#getName()
   * @see #getServiceClient()
   * @generated
   */
  EAttribute getServiceClient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ServiceClient#getServicename <em>Servicename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servicename</em>'.
   * @see org.best.of.robotics.smachDSL.ServiceClient#getServicename()
   * @see #getServiceClient()
   * @generated
   */
  EAttribute getServiceClient_Servicename();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ServiceClient#getServicesrv <em>Servicesrv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servicesrv</em>'.
   * @see org.best.of.robotics.smachDSL.ServiceClient#getServicesrv()
   * @see #getServiceClient()
   * @generated
   */
  EAttribute getServiceClient_Servicesrv();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.ActionState <em>Action State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action State</em>'.
   * @see org.best.of.robotics.smachDSL.ActionState
   * @generated
   */
  EClass getActionState();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.ActionState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.best.of.robotics.smachDSL.ActionState#getName()
   * @see #getActionState()
   * @generated
   */
  EAttribute getActionState_Name();

  /**
   * Returns the meta object for the reference '{@link org.best.of.robotics.smachDSL.ActionState#getClientname <em>Clientname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Clientname</em>'.
   * @see org.best.of.robotics.smachDSL.ActionState#getClientname()
   * @see #getActionState()
   * @generated
   */
  EReference getActionState_Clientname();

  /**
   * Returns the meta object for the containment reference list '{@link org.best.of.robotics.smachDSL.ActionState#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.best.of.robotics.smachDSL.ActionState#getTransitions()
   * @see #getActionState()
   * @generated
   */
  EReference getActionState_Transitions();

  /**
   * Returns the meta object for class '{@link org.best.of.robotics.smachDSL.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.best.of.robotics.smachDSL.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link org.best.of.robotics.smachDSL.Transition#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outcome</em>'.
   * @see org.best.of.robotics.smachDSL.Transition#getOutcome()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Outcome();

  /**
   * Returns the meta object for the reference '{@link org.best.of.robotics.smachDSL.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.best.of.robotics.smachDSL.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmachDSLFactory getSmachDSLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.PrimitivePackageImpl <em>Primitive Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.PrimitivePackageImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getPrimitivePackage()
     * @generated
     */
    EClass PRIMITIVE_PACKAGE = eINSTANCE.getPrimitivePackage();

    /**
     * The meta object literal for the '<em><b>Statemachines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_PACKAGE__STATEMACHINES = eINSTANCE.getPrimitivePackage_Statemachines();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.TestImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Ros</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__ROS = eINSTANCE.getTest_Ros();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.StateMachineImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

    /**
     * The meta object literal for the '<em><b>Actionclients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__ACTIONCLIENTS = eINSTANCE.getStateMachine_Actionclients();

    /**
     * The meta object literal for the '<em><b>Serviceclients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__SERVICECLIENTS = eINSTANCE.getStateMachine_Serviceclients();

    /**
     * The meta object literal for the '<em><b>Actionsstates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__ACTIONSSTATES = eINSTANCE.getStateMachine_Actionsstates();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl <em>Action Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.ActionClientImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getActionClient()
     * @generated
     */
    EClass ACTION_CLIENT = eINSTANCE.getActionClient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLIENT__NAME = eINSTANCE.getActionClient_Name();

    /**
     * The meta object literal for the '<em><b>Actionname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLIENT__ACTIONNAME = eINSTANCE.getActionClient_Actionname();

    /**
     * The meta object literal for the '<em><b>Actiontype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLIENT__ACTIONTYPE = eINSTANCE.getActionClient_Actiontype();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.ServiceClientImpl <em>Service Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.ServiceClientImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getServiceClient()
     * @generated
     */
    EClass SERVICE_CLIENT = eINSTANCE.getServiceClient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_CLIENT__NAME = eINSTANCE.getServiceClient_Name();

    /**
     * The meta object literal for the '<em><b>Servicename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_CLIENT__SERVICENAME = eINSTANCE.getServiceClient_Servicename();

    /**
     * The meta object literal for the '<em><b>Servicesrv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_CLIENT__SERVICESRV = eINSTANCE.getServiceClient_Servicesrv();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.ActionStateImpl <em>Action State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.ActionStateImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getActionState()
     * @generated
     */
    EClass ACTION_STATE = eINSTANCE.getActionState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_STATE__NAME = eINSTANCE.getActionState_Name();

    /**
     * The meta object literal for the '<em><b>Clientname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATE__CLIENTNAME = eINSTANCE.getActionState_Clientname();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATE__TRANSITIONS = eINSTANCE.getActionState_Transitions();

    /**
     * The meta object literal for the '{@link org.best.of.robotics.smachDSL.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.best.of.robotics.smachDSL.impl.TransitionImpl
     * @see org.best.of.robotics.smachDSL.impl.SmachDSLPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Outcome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__OUTCOME = eINSTANCE.getTransition_Outcome();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

  }

} //SmachDSLPackage
