/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.Service;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ros.model.ros.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.ServiceImpl#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.ServiceImpl#getServiceclient <em>Serviceclient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
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
	 * The cached value of the '{@link #getServiceserver() <em>Serviceserver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceserver()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceServer> serviceserver;

	/**
	 * The cached value of the '{@link #getServiceclient() <em>Serviceclient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClient> serviceclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceServer> getServiceserver() {
		if (serviceserver == null) {
			serviceserver = new EObjectResolvingEList<ServiceServer>(ServiceServer.class, this, RosPackage.SERVICE__SERVICESERVER);
		}
		return serviceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClient> getServiceclient() {
		if (serviceclient == null) {
			serviceclient = new EObjectResolvingEList<ServiceClient>(ServiceClient.class, this, RosPackage.SERVICE__SERVICECLIENT);
		}
		return serviceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosPackage.SERVICE__NAME:
				return getName();
			case RosPackage.SERVICE__SERVICESERVER:
				return getServiceserver();
			case RosPackage.SERVICE__SERVICECLIENT:
				return getServiceclient();
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
			case RosPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case RosPackage.SERVICE__SERVICESERVER:
				getServiceserver().clear();
				getServiceserver().addAll((Collection<? extends ServiceServer>)newValue);
				return;
			case RosPackage.SERVICE__SERVICECLIENT:
				getServiceclient().clear();
				getServiceclient().addAll((Collection<? extends ServiceClient>)newValue);
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
			case RosPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.SERVICE__SERVICESERVER:
				getServiceserver().clear();
				return;
			case RosPackage.SERVICE__SERVICECLIENT:
				getServiceclient().clear();
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
			case RosPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.SERVICE__SERVICESERVER:
				return serviceserver != null && !serviceserver.isEmpty();
			case RosPackage.SERVICE__SERVICECLIENT:
				return serviceclient != null && !serviceclient.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
