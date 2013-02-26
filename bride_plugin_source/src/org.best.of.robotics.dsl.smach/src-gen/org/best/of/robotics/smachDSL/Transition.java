/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.Transition#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.Transition#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Outcome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcome</em>' attribute.
   * @see #setOutcome(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getTransition_Outcome()
   * @model
   * @generated
   */
  String getOutcome();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.Transition#getOutcome <em>Outcome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outcome</em>' attribute.
   * @see #getOutcome()
   * @generated
   */
  void setOutcome(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(ActionState)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getTransition_State()
   * @model
   * @generated
   */
  ActionState getState();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.Transition#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(ActionState value);

} // Transition
