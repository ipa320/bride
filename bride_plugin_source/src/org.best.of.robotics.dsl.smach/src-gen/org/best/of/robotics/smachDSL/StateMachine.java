/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.StateMachine#getActionclients <em>Actionclients</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.StateMachine#getServiceclients <em>Serviceclients</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.StateMachine#getActionsstates <em>Actionsstates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getStateMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.StateMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actionclients</b></em>' containment reference list.
   * The list contents are of type {@link org.best.of.robotics.smachDSL.ActionClient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actionclients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actionclients</em>' containment reference list.
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getStateMachine_Actionclients()
   * @model containment="true"
   * @generated
   */
  EList<ActionClient> getActionclients();

  /**
   * Returns the value of the '<em><b>Serviceclients</b></em>' containment reference list.
   * The list contents are of type {@link org.best.of.robotics.smachDSL.ServiceClient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Serviceclients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Serviceclients</em>' containment reference list.
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getStateMachine_Serviceclients()
   * @model containment="true"
   * @generated
   */
  EList<ServiceClient> getServiceclients();

  /**
   * Returns the value of the '<em><b>Actionsstates</b></em>' containment reference list.
   * The list contents are of type {@link org.best.of.robotics.smachDSL.ActionState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actionsstates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actionsstates</em>' containment reference list.
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getStateMachine_Actionsstates()
   * @model containment="true"
   * @generated
   */
  EList<ActionState> getActionsstates();

} // StateMachine
