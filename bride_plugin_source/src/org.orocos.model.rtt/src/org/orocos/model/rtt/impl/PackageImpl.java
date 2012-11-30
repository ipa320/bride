/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.orocos.model.rtt.impl;

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

import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.IActivity;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.PackageImpl#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.PackageImpl#getConnectionPolicy <em>Connection Policy</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.PackageImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements
		org.orocos.model.rtt.Package {
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
	 * The cached value of the '{@link #getTaskContext() <em>Task Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskContext()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskContext> taskContext;

	/**
	 * The cached value of the '{@link #getConnectionPolicy() <em>Connection Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPolicy> connectionPolicy;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<IActivity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RttPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskContext> getTaskContext() {
		if (taskContext == null) {
			taskContext = new EObjectContainmentEList<TaskContext>(
					TaskContext.class, this, RttPackage.PACKAGE__TASK_CONTEXT);
		}
		return taskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPolicy> getConnectionPolicy() {
		if (connectionPolicy == null) {
			connectionPolicy = new EObjectContainmentEList<ConnectionPolicy>(
					ConnectionPolicy.class, this,
					RttPackage.PACKAGE__CONNECTION_POLICY);
		}
		return connectionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IActivity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<IActivity>(IActivity.class,
					this, RttPackage.PACKAGE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RttPackage.PACKAGE__TASK_CONTEXT:
			return ((InternalEList<?>) getTaskContext()).basicRemove(otherEnd,
					msgs);
		case RttPackage.PACKAGE__CONNECTION_POLICY:
			return ((InternalEList<?>) getConnectionPolicy()).basicRemove(
					otherEnd, msgs);
		case RttPackage.PACKAGE__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd,
					msgs);
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
		case RttPackage.PACKAGE__NAME:
			return getName();
		case RttPackage.PACKAGE__TASK_CONTEXT:
			return getTaskContext();
		case RttPackage.PACKAGE__CONNECTION_POLICY:
			return getConnectionPolicy();
		case RttPackage.PACKAGE__ACTIVITY:
			return getActivity();
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
		case RttPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case RttPackage.PACKAGE__TASK_CONTEXT:
			getTaskContext().clear();
			getTaskContext().addAll(
					(Collection<? extends TaskContext>) newValue);
			return;
		case RttPackage.PACKAGE__CONNECTION_POLICY:
			getConnectionPolicy().clear();
			getConnectionPolicy().addAll(
					(Collection<? extends ConnectionPolicy>) newValue);
			return;
		case RttPackage.PACKAGE__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends IActivity>) newValue);
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
		case RttPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RttPackage.PACKAGE__TASK_CONTEXT:
			getTaskContext().clear();
			return;
		case RttPackage.PACKAGE__CONNECTION_POLICY:
			getConnectionPolicy().clear();
			return;
		case RttPackage.PACKAGE__ACTIVITY:
			getActivity().clear();
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
		case RttPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case RttPackage.PACKAGE__TASK_CONTEXT:
			return taskContext != null && !taskContext.isEmpty();
		case RttPackage.PACKAGE__CONNECTION_POLICY:
			return connectionPolicy != null && !connectionPolicy.isEmpty();
		case RttPackage.PACKAGE__ACTIVITY:
			return activity != null && !activity.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
