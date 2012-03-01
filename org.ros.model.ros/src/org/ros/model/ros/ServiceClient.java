/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.ServiceClient#getService <em>Service</em>}</li>
 *   <li>{@link org.ros.model.ros.ServiceClient#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getServiceClient()
 * @model
 * @generated
 */
public interface ServiceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see org.ros.model.ros.RosPackage#getServiceClient_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.ServiceClient#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

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
	 * @see org.ros.model.ros.RosPackage#getServiceClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.ServiceClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ServiceClient
