/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ros.model.ros.ActionClient;
import org.ros.model.ros.ActionServer;
import org.ros.model.ros.Node;
import org.ros.model.ros.Parameter;
import org.ros.model.ros.Publisher;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;
import org.ros.model.ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getLoopRate <em>Loop Rate</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getActionserver <em>Actionserver</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.NodeImpl#getActionclient <em>Actionclient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
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
	 * The default value of the '{@link #getLoopRate() <em>Loop Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopRate()
	 * @generated
	 * @ordered
	 */
	protected static final double LOOP_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLoopRate() <em>Loop Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopRate()
	 * @generated
	 * @ordered
	 */
	protected double loopRate = LOOP_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> publisher;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> subscriber;

	/**
	 * The cached value of the '{@link #getServiceClient() <em>Service Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClient()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClient> serviceClient;

	/**
	 * The cached value of the '{@link #getServiceServer() <em>Service Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceServer()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceServer> serviceServer;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getActionserver() <em>Actionserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionserver()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionServer> actionserver;

	/**
	 * The cached value of the '{@link #getActionclient() <em>Actionclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionclient()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionClient> actionclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLoopRate() {
		return loopRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopRate(double newLoopRate) {
		double oldLoopRate = loopRate;
		loopRate = newLoopRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.NODE__LOOP_RATE, oldLoopRate, loopRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublisher() {
		if (publisher == null) {
			publisher = new EObjectContainmentEList.Resolving<Publisher>(Publisher.class, this, RosPackage.NODE__PUBLISHER);
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getSubscriber() {
		if (subscriber == null) {
			subscriber = new EObjectContainmentEList.Resolving<Subscriber>(Subscriber.class, this, RosPackage.NODE__SUBSCRIBER);
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClient> getServiceClient() {
		if (serviceClient == null) {
			serviceClient = new EObjectContainmentEList.Resolving<ServiceClient>(ServiceClient.class, this, RosPackage.NODE__SERVICE_CLIENT);
		}
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceServer> getServiceServer() {
		if (serviceServer == null) {
			serviceServer = new EObjectContainmentEList.Resolving<ServiceServer>(ServiceServer.class, this, RosPackage.NODE__SERVICE_SERVER);
		}
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, RosPackage.NODE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionServer> getActionserver() {
		if (actionserver == null) {
			actionserver = new EObjectContainmentEList.Resolving<ActionServer>(ActionServer.class, this, RosPackage.NODE__ACTIONSERVER);
		}
		return actionserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClient> getActionclient() {
		if (actionclient == null) {
			actionclient = new EObjectContainmentEList.Resolving<ActionClient>(ActionClient.class, this, RosPackage.NODE__ACTIONCLIENT);
		}
		return actionclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosPackage.NODE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__SUBSCRIBER:
				return ((InternalEList<?>)getSubscriber()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__SERVICE_CLIENT:
				return ((InternalEList<?>)getServiceClient()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__SERVICE_SERVER:
				return ((InternalEList<?>)getServiceServer()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__ACTIONSERVER:
				return ((InternalEList<?>)getActionserver()).basicRemove(otherEnd, msgs);
			case RosPackage.NODE__ACTIONCLIENT:
				return ((InternalEList<?>)getActionclient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosPackage.NODE__NAME:
				return getName();
			case RosPackage.NODE__LOOP_RATE:
				return getLoopRate();
			case RosPackage.NODE__PUBLISHER:
				return getPublisher();
			case RosPackage.NODE__SUBSCRIBER:
				return getSubscriber();
			case RosPackage.NODE__SERVICE_CLIENT:
				return getServiceClient();
			case RosPackage.NODE__SERVICE_SERVER:
				return getServiceServer();
			case RosPackage.NODE__PARAMETER:
				return getParameter();
			case RosPackage.NODE__ACTIONSERVER:
				return getActionserver();
			case RosPackage.NODE__ACTIONCLIENT:
				return getActionclient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RosPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case RosPackage.NODE__LOOP_RATE:
				setLoopRate((Double)newValue);
				return;
			case RosPackage.NODE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends Publisher>)newValue);
				return;
			case RosPackage.NODE__SUBSCRIBER:
				getSubscriber().clear();
				getSubscriber().addAll((Collection<? extends Subscriber>)newValue);
				return;
			case RosPackage.NODE__SERVICE_CLIENT:
				getServiceClient().clear();
				getServiceClient().addAll((Collection<? extends ServiceClient>)newValue);
				return;
			case RosPackage.NODE__SERVICE_SERVER:
				getServiceServer().clear();
				getServiceServer().addAll((Collection<? extends ServiceServer>)newValue);
				return;
			case RosPackage.NODE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RosPackage.NODE__ACTIONSERVER:
				getActionserver().clear();
				getActionserver().addAll((Collection<? extends ActionServer>)newValue);
				return;
			case RosPackage.NODE__ACTIONCLIENT:
				getActionclient().clear();
				getActionclient().addAll((Collection<? extends ActionClient>)newValue);
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
			case RosPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.NODE__LOOP_RATE:
				setLoopRate(LOOP_RATE_EDEFAULT);
				return;
			case RosPackage.NODE__PUBLISHER:
				getPublisher().clear();
				return;
			case RosPackage.NODE__SUBSCRIBER:
				getSubscriber().clear();
				return;
			case RosPackage.NODE__SERVICE_CLIENT:
				getServiceClient().clear();
				return;
			case RosPackage.NODE__SERVICE_SERVER:
				getServiceServer().clear();
				return;
			case RosPackage.NODE__PARAMETER:
				getParameter().clear();
				return;
			case RosPackage.NODE__ACTIONSERVER:
				getActionserver().clear();
				return;
			case RosPackage.NODE__ACTIONCLIENT:
				getActionclient().clear();
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
			case RosPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.NODE__LOOP_RATE:
				return loopRate != LOOP_RATE_EDEFAULT;
			case RosPackage.NODE__PUBLISHER:
				return publisher != null && !publisher.isEmpty();
			case RosPackage.NODE__SUBSCRIBER:
				return subscriber != null && !subscriber.isEmpty();
			case RosPackage.NODE__SERVICE_CLIENT:
				return serviceClient != null && !serviceClient.isEmpty();
			case RosPackage.NODE__SERVICE_SERVER:
				return serviceServer != null && !serviceServer.isEmpty();
			case RosPackage.NODE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case RosPackage.NODE__ACTIONSERVER:
				return actionserver != null && !actionserver.isEmpty();
			case RosPackage.NODE__ACTIONCLIENT:
				return actionclient != null && !actionclient.isEmpty();
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
		result.append(", loopRate: ");
		result.append(loopRate);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
