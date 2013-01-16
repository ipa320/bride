/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.PrimitivePackage#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getPrimitivePackage()
 * @model
 * @generated
 */
public interface PrimitivePackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
   * The list contents are of type {@link org.best.of.robotics.smachDSL.StateMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemachines</em>' containment reference list.
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getPrimitivePackage_Statemachines()
   * @model containment="true"
   * @generated
   */
  EList<StateMachine> getStatemachines();

} // PrimitivePackage
