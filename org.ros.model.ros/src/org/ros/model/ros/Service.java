/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.Service#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link org.ros.model.ros.Service#getServiceclient <em>Serviceclient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see org.ros.model.ros.RosPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Serviceserver</b></em>' reference list.
	 * The list contents are of type {@link org.ros.model.ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceserver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceserver</em>' reference list.
	 * @see org.ros.model.ros.RosPackage#getService_Serviceserver()
	 * @model
	 * @generated
	 */
	EList<ServiceServer> getServiceserver();

	/**
	 * Returns the value of the '<em><b>Serviceclient</b></em>' reference list.
	 * The list contents are of type {@link org.ros.model.ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceclient</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceclient</em>' reference list.
	 * @see org.ros.model.ros.RosPackage#getService_Serviceclient()
	 * @model
	 * @generated
	 */
	EList<ServiceClient> getServiceclient();

} // Service
