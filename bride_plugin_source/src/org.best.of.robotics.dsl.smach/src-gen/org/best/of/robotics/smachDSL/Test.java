/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.Test#getRos <em>Ros</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject
{
  /**
   * Returns the value of the '<em><b>Ros</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ros</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ros</em>' attribute.
   * @see #setRos(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getTest_Ros()
   * @model
   * @generated
   */
  String getRos();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.Test#getRos <em>Ros</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ros</em>' attribute.
   * @see #getRos()
   * @generated
   */
  void setRos(String value);

} // Test
