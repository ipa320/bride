/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros;


import org.best_of_robotics.model.datatypes.DataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.Subscriber#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.Subscriber#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.ros.model.ros.Subscriber#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link org.ros.model.ros.Subscriber#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends EObject {
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
	 * @see org.ros.model.ros.RosPackage#getSubscriber_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Subscriber#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' reference.
	 * @see #setMsg(DataType)
	 * @see org.ros.model.ros.RosPackage#getSubscriber_Msg()
	 * @model required="true"
	 * @generated
	 */
	DataType getMsg();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Subscriber#getMsg <em>Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' reference.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(DataType value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see org.ros.model.ros.RosPackage#getSubscriber_QueueSize()
	 * @model default="1"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Subscriber#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Event Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handler</em>' attribute.
	 * @see #setEventHandler(String)
	 * @see org.ros.model.ros.RosPackage#getSubscriber_EventHandler()
	 * @model
	 * @generated
	 */
	String getEventHandler();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Subscriber#getEventHandler <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handler</em>' attribute.
	 * @see #getEventHandler()
	 * @generated
	 */
	void setEventHandler(String value);

} // Subscriber
