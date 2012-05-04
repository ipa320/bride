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
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.Publisher#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.Publisher#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.ros.model.ros.Publisher#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.ros.model.ros.Publisher#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.ros.model.ros.Publisher#isLatch <em>Latch</em>}</li>
 *   <li>{@link org.ros.model.ros.Publisher#getEventHandler <em>Event Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends EObject {
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
	 * @see org.ros.model.ros.RosPackage#getPublisher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see org.ros.model.ros.RosPackage#getPublisher_Topic()
	 * @model required="true"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see org.ros.model.ros.RosPackage#getPublisher_Msg()
	 * @model
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

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
	 * @see org.ros.model.ros.RosPackage#getPublisher_QueueSize()
	 * @model default="1"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Latch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latch</em>' attribute.
	 * @see #setLatch(boolean)
	 * @see org.ros.model.ros.RosPackage#getPublisher_Latch()
	 * @model
	 * @generated
	 */
	boolean isLatch();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#isLatch <em>Latch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latch</em>' attribute.
	 * @see #isLatch()
	 * @generated
	 */
	void setLatch(boolean value);

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
	 * @see org.ros.model.ros.RosPackage#getPublisher_EventHandler()
	 * @model
	 * @generated
	 */
	String getEventHandler();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Publisher#getEventHandler <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handler</em>' attribute.
	 * @see #getEventHandler()
	 * @generated
	 */
	void setEventHandler(String value);

} // Publisher
