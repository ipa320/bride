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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.Scheduler;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getSlave <em>Slave</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getCpuAffinity <em>Cpu Affinity</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.orocos.model.rtt.impl.ActivityImpl#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends EObjectImpl implements Activity {
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
	 * The cached value of the '{@link #getSlave() <em>Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<Slave> slave;

	/**
	 * The default value of the '{@link #getCpuAffinity() <em>Cpu Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_AFFINITY_EDEFAULT = "~0";

	/**
	 * The cached value of the '{@link #getCpuAffinity() <em>Cpu Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuAffinity()
	 * @generated
	 * @ordered
	 */
	protected String cpuAffinity = CPU_AFFINITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected float period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler() <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected static final Scheduler SCHEDULER_EDEFAULT = Scheduler.ORO_SCHED_OTHER;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler scheduler = SCHEDULER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RttPackage.Literals.ACTIVITY;
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
					RttPackage.ACTIVITY__NAME, oldName, name));
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
							RttPackage.ACTIVITY__TASK_CONTEXT, oldTaskContext,
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
					RttPackage.ACTIVITY__TASK_CONTEXT, oldTaskContext,
					taskContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slave> getSlave() {
		if (slave == null) {
			slave = new EObjectContainmentWithInverseEList<Slave>(Slave.class,
					this, RttPackage.ACTIVITY__SLAVE, RttPackage.SLAVE__MASTER);
		}
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuAffinity() {
		return cpuAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuAffinity(String newCpuAffinity) {
		String oldCpuAffinity = cpuAffinity;
		cpuAffinity = newCpuAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.ACTIVITY__CPU_AFFINITY, oldCpuAffinity,
					cpuAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(float newPeriod) {
		float oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.ACTIVITY__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.ACTIVITY__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(Scheduler newScheduler) {
		Scheduler oldScheduler = scheduler;
		scheduler = newScheduler == null ? SCHEDULER_EDEFAULT : newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RttPackage.ACTIVITY__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RttPackage.ACTIVITY__SLAVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSlave())
					.basicAdd(otherEnd, msgs);
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
		case RttPackage.ACTIVITY__SLAVE:
			return ((InternalEList<?>) getSlave()).basicRemove(otherEnd, msgs);
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
		case RttPackage.ACTIVITY__NAME:
			return getName();
		case RttPackage.ACTIVITY__TASK_CONTEXT:
			if (resolve)
				return getTaskContext();
			return basicGetTaskContext();
		case RttPackage.ACTIVITY__SLAVE:
			return getSlave();
		case RttPackage.ACTIVITY__CPU_AFFINITY:
			return getCpuAffinity();
		case RttPackage.ACTIVITY__PERIOD:
			return getPeriod();
		case RttPackage.ACTIVITY__PRIORITY:
			return getPriority();
		case RttPackage.ACTIVITY__SCHEDULER:
			return getScheduler();
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
		case RttPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case RttPackage.ACTIVITY__TASK_CONTEXT:
			setTaskContext((TaskContext) newValue);
			return;
		case RttPackage.ACTIVITY__SLAVE:
			getSlave().clear();
			getSlave().addAll((Collection<? extends Slave>) newValue);
			return;
		case RttPackage.ACTIVITY__CPU_AFFINITY:
			setCpuAffinity((String) newValue);
			return;
		case RttPackage.ACTIVITY__PERIOD:
			setPeriod((Float) newValue);
			return;
		case RttPackage.ACTIVITY__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case RttPackage.ACTIVITY__SCHEDULER:
			setScheduler((Scheduler) newValue);
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
		case RttPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RttPackage.ACTIVITY__TASK_CONTEXT:
			setTaskContext((TaskContext) null);
			return;
		case RttPackage.ACTIVITY__SLAVE:
			getSlave().clear();
			return;
		case RttPackage.ACTIVITY__CPU_AFFINITY:
			setCpuAffinity(CPU_AFFINITY_EDEFAULT);
			return;
		case RttPackage.ACTIVITY__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case RttPackage.ACTIVITY__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case RttPackage.ACTIVITY__SCHEDULER:
			setScheduler(SCHEDULER_EDEFAULT);
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
		case RttPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case RttPackage.ACTIVITY__TASK_CONTEXT:
			return taskContext != null;
		case RttPackage.ACTIVITY__SLAVE:
			return slave != null && !slave.isEmpty();
		case RttPackage.ACTIVITY__CPU_AFFINITY:
			return CPU_AFFINITY_EDEFAULT == null ? cpuAffinity != null
					: !CPU_AFFINITY_EDEFAULT.equals(cpuAffinity);
		case RttPackage.ACTIVITY__PERIOD:
			return period != PERIOD_EDEFAULT;
		case RttPackage.ACTIVITY__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case RttPackage.ACTIVITY__SCHEDULER:
			return scheduler != SCHEDULER_EDEFAULT;
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
		result.append(", cpuAffinity: ");
		result.append(cpuAffinity);
		result.append(", period: ");
		result.append(period);
		result.append(", priority: ");
		result.append(priority);
		result.append(", scheduler: ");
		result.append(scheduler);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
