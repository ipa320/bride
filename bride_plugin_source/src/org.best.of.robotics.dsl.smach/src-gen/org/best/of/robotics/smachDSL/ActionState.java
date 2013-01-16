/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionState#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionState#getClientname <em>Clientname</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionState#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionState()
 * @model
 * @generated
 */
public interface ActionState extends EObject
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
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ActionState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Clientname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clientname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clientname</em>' reference.
   * @see #setClientname(ActionClient)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionState_Clientname()
   * @model
   * @generated
   */
  ActionClient getClientname();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ActionState#getClientname <em>Clientname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clientname</em>' reference.
   * @see #getClientname()
   * @generated
   */
  void setClientname(ActionClient value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.best.of.robotics.smachDSL.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // ActionState
