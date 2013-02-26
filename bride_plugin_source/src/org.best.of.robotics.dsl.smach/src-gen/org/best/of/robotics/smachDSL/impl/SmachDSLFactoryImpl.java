/**
 */
package org.best.of.robotics.smachDSL.impl;

import org.best.of.robotics.smachDSL.*;

import org.eclipse.emf.ecore.EClass;
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
public class SmachDSLFactoryImpl extends EFactoryImpl implements SmachDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmachDSLFactory init()
  {
    try
    {
      SmachDSLFactory theSmachDSLFactory = (SmachDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.best.org/of/robotics/SmachDSL"); 
      if (theSmachDSLFactory != null)
      {
        return theSmachDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmachDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmachDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE: return createPrimitivePackage();
      case SmachDSLPackage.TEST: return createTest();
      case SmachDSLPackage.STATE_MACHINE: return createStateMachine();
      case SmachDSLPackage.ACTION_CLIENT: return createActionClient();
      case SmachDSLPackage.SERVICE_CLIENT: return createServiceClient();
      case SmachDSLPackage.ACTION_STATE: return createActionState();
      case SmachDSLPackage.TRANSITION: return createTransition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitivePackage createPrimitivePackage()
  {
    PrimitivePackageImpl primitivePackage = new PrimitivePackageImpl();
    return primitivePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test createTest()
  {
    TestImpl test = new TestImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionClient createActionClient()
  {
    ActionClientImpl actionClient = new ActionClientImpl();
    return actionClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceClient createServiceClient()
  {
    ServiceClientImpl serviceClient = new ServiceClientImpl();
    return serviceClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionState createActionState()
  {
    ActionStateImpl actionState = new ActionStateImpl();
    return actionState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmachDSLPackage getSmachDSLPackage()
  {
    return (SmachDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmachDSLPackage getPackage()
  {
    return SmachDSLPackage.eINSTANCE;
  }

} //SmachDSLFactoryImpl
