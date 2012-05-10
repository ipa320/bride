/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros.impl;

import org.best_of_robotics.model.datatypes.DataType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.ros.model.ros.RosPackage;
import org.ros.model.ros.StandardMessageType;
import org.ros.model.ros.Subscriber;
import org.ros.model.ros.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ros.model.ros.impl.SubscriberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.SubscriberImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.SubscriberImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.SubscriberImpl#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.SubscriberImpl#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubscriberImpl extends EObjectImpl implements Subscriber {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventHandler() <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventHandler() <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandler()
	 * @generated
	 * @ordered
	 */
	protected String eventHandler = EVENT_HANDLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected DataType msg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.SUBSCRIBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SUBSCRIBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.SUBSCRIBER__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SUBSCRIBER__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMsg() {
		if (msg != null && msg.eIsProxy()) {
			InternalEObject oldMsg = (InternalEObject)msg;
			msg = (DataType)eResolveProxy(oldMsg);
			if (msg != oldMsg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.SUBSCRIBER__MSG, oldMsg, msg));
			}
		}
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMsg() {
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg(DataType newMsg) {
		DataType oldMsg = msg;
		msg = newMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SUBSCRIBER__MSG, oldMsg, msg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SUBSCRIBER__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventHandler() {
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandler(String newEventHandler) {
		String oldEventHandler = eventHandler;
		eventHandler = newEventHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SUBSCRIBER__EVENT_HANDLER, oldEventHandler, eventHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosPackage.SUBSCRIBER__NAME:
				return getName();
			case RosPackage.SUBSCRIBER__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
			case RosPackage.SUBSCRIBER__QUEUE_SIZE:
				return getQueueSize();
			case RosPackage.SUBSCRIBER__EVENT_HANDLER:
				return getEventHandler();
			case RosPackage.SUBSCRIBER__MSG:
				if (resolve) return getMsg();
				return basicGetMsg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RosPackage.SUBSCRIBER__NAME:
				setName((String)newValue);
				return;
			case RosPackage.SUBSCRIBER__TOPIC:
				setTopic((Topic)newValue);
				return;
			case RosPackage.SUBSCRIBER__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
				return;
			case RosPackage.SUBSCRIBER__EVENT_HANDLER:
				setEventHandler((String)newValue);
				return;
			case RosPackage.SUBSCRIBER__MSG:
				setMsg((DataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RosPackage.SUBSCRIBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.SUBSCRIBER__TOPIC:
				setTopic((Topic)null);
				return;
			case RosPackage.SUBSCRIBER__QUEUE_SIZE:
				setQueueSize(QUEUE_SIZE_EDEFAULT);
				return;
			case RosPackage.SUBSCRIBER__EVENT_HANDLER:
				setEventHandler(EVENT_HANDLER_EDEFAULT);
				return;
			case RosPackage.SUBSCRIBER__MSG:
				setMsg((DataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RosPackage.SUBSCRIBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.SUBSCRIBER__TOPIC:
				return topic != null;
			case RosPackage.SUBSCRIBER__QUEUE_SIZE:
				return queueSize != QUEUE_SIZE_EDEFAULT;
			case RosPackage.SUBSCRIBER__EVENT_HANDLER:
				return EVENT_HANDLER_EDEFAULT == null ? eventHandler != null : !EVENT_HANDLER_EDEFAULT.equals(eventHandler);
			case RosPackage.SUBSCRIBER__MSG:
				return msg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(", eventHandler: ");
		result.append(eventHandler);
		result.append(')');
		return result.toString();
	}

} //SubscriberImpl
