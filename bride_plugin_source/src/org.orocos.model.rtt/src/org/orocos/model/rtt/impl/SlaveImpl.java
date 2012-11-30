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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.impl.SlaveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.SlaveImpl#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.SlaveImpl#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlaveImpl extends EObjectImpl implements Slave {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Activity";

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
	 * The cached value of the '{@link #getTaskContext() <em>Task Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskContext()
	 * @generated
	 * @ordered
	 */
	protected TaskContext taskContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RttPackage.Literals.SLAVE;
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
					RttPackage.SLAVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext getTaskContext() {
		if (taskContext != null && taskContext.eIsProxy()) {
			InternalEObject oldTaskContext = (InternalEObject) taskContext;
			taskContext = (TaskContext) eResolveProxy(oldTaskContext);
			if (taskContext != oldTaskContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RttPackage.SLAVE__TASK_CONTEXT, oldTaskContext,
							taskContext));
			}
		}
		return taskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext basicGetTaskContext() {
		return taskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskContext(TaskContext newTaskContext) {
		TaskContext oldTaskContext = taskContext;
		taskContext = newTaskContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.SLAVE__TASK_CONTEXT, oldTaskContext, taskContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getMaster() {
		if (eContainerFeatureID() != RttPackage.SLAVE__MASTER)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaster(Activity newMaster,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMaster,
				RttPackage.SLAVE__MASTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(Activity newMaster) {
		if (newMaster != eInternalContainer()
				|| (eContainerFeatureID() != RttPackage.SLAVE__MASTER && newMaster != null)) {
			if (EcoreUtil.isAncestor(this, newMaster))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMaster != null)
				msgs = ((InternalEObject) newMaster).eInverseAdd(this,
						RttPackage.ACTIVITY__SLAVE, Activity.class, msgs);
			msgs = basicSetMaster(newMaster, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.SLAVE__MASTER, newMaster, newMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RttPackage.SLAVE__MASTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMaster((Activity) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case RttPackage.SLAVE__MASTER:
			return basicSetMaster(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RttPackage.SLAVE__MASTER:
			return eInternalContainer().eInverseRemove(this,
					RttPackage.ACTIVITY__SLAVE, Activity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RttPackage.SLAVE__NAME:
			return getName();
		case RttPackage.SLAVE__TASK_CONTEXT:
			if (resolve)
				return getTaskContext();
			return basicGetTaskContext();
		case RttPackage.SLAVE__MASTER:
			return getMaster();
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
		case RttPackage.SLAVE__NAME:
			setName((String) newValue);
			return;
		case RttPackage.SLAVE__TASK_CONTEXT:
			setTaskContext((TaskContext) newValue);
			return;
		case RttPackage.SLAVE__MASTER:
			setMaster((Activity) newValue);
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
		case RttPackage.SLAVE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RttPackage.SLAVE__TASK_CONTEXT:
			setTaskContext((TaskContext) null);
			return;
		case RttPackage.SLAVE__MASTER:
			setMaster((Activity) null);
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
		case RttPackage.SLAVE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case RttPackage.SLAVE__TASK_CONTEXT:
			return taskContext != null;
		case RttPackage.SLAVE__MASTER:
			return getMaster() != null;
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

} //SlaveImpl
