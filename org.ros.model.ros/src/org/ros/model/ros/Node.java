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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getLoopRate <em>Loop Rate</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link org.ros.model.ros.Node#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
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
	 * @see org.ros.model.ros.RosPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Loop Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Rate</em>' attribute.
	 * @see #setLoopRate(double)
	 * @see org.ros.model.ros.RosPackage#getNode_LoopRate()
	 * @model
	 * @generated
	 */
	double getLoopRate();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Node#getLoopRate <em>Loop Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Rate</em>' attribute.
	 * @see #getLoopRate()
	 * @generated
	 */
	void setLoopRate(double value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getNode_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publisher> getPublisher();

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getNode_Subscriber()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscriber> getSubscriber();

	/**
	 * Returns the value of the '<em><b>Service Client</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Client</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getNode_ServiceClient()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceClient> getServiceClient();

	/**
	 * Returns the value of the '<em><b>Service Server</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Server</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getNode_ServiceServer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceServer> getServiceServer();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getNode_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Node
