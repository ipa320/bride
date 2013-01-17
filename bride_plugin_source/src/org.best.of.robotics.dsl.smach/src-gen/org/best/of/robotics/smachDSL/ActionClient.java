/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionClient#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionClient#getActionname <em>Actionname</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ActionClient#getActiontype <em>Actiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionClient()
 * @model
 * @generated
 */
public interface ActionClient extends EObject
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
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionClient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ActionClient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actionname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actionname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actionname</em>' attribute.
   * @see #setActionname(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionClient_Actionname()
   * @model
   * @generated
   */
  String getActionname();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ActionClient#getActionname <em>Actionname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actionname</em>' attribute.
   * @see #getActionname()
   * @generated
   */
  void setActionname(String value);

  /**
   * Returns the value of the '<em><b>Actiontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actiontype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actiontype</em>' attribute.
   * @see #setActiontype(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getActionClient_Actiontype()
   * @model
   * @generated
   */
  String getActiontype();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ActionClient#getActiontype <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actiontype</em>' attribute.
   * @see #getActiontype()
   * @generated
   */
  void setActiontype(String value);

} // ActionClient
