/**
 */
package org.best.of.robotics.smachDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.ServiceClient#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ServiceClient#getServicename <em>Servicename</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.ServiceClient#getServicesrv <em>Servicesrv</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getServiceClient()
 * @model
 * @generated
 */
public interface ServiceClient extends EObject
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
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getServiceClient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ServiceClient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Servicename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servicename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servicename</em>' attribute.
   * @see #setServicename(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getServiceClient_Servicename()
   * @model
   * @generated
   */
  String getServicename();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ServiceClient#getServicename <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servicename</em>' attribute.
   * @see #getServicename()
   * @generated
   */
  void setServicename(String value);

  /**
   * Returns the value of the '<em><b>Servicesrv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servicesrv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servicesrv</em>' attribute.
   * @see #setServicesrv(String)
   * @see org.best.of.robotics.smachDSL.SmachDSLPackage#getServiceClient_Servicesrv()
   * @model
   * @generated
   */
  String getServicesrv();

  /**
   * Sets the value of the '{@link org.best.of.robotics.smachDSL.ServiceClient#getServicesrv <em>Servicesrv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servicesrv</em>' attribute.
   * @see #getServicesrv()
   * @generated
   */
  void setServicesrv(String value);

} // ServiceClient
