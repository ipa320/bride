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
package org.orocos.model.rtt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.Activity#getSlave <em>Slave</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Activity#getCpuAffinity <em>Cpu Affinity</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Activity#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Activity#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Activity#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends IActivity {
	/**
	 * Returns the value of the '<em><b>Slave</b></em>' containment reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.Slave}.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.Slave#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave</em>' containment reference list.
	 * @see org.orocos.model.rtt.RttPackage#getActivity_Slave()
	 * @see org.orocos.model.rtt.Slave#getMaster
	 * @model opposite="master" containment="true"
	 * @generated
	 */
	EList<Slave> getSlave();

	/**
	 * Returns the value of the '<em><b>Cpu Affinity</b></em>' attribute.
	 * The default value is <code>"~0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Affinity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Affinity</em>' attribute.
	 * @see #setCpuAffinity(String)
	 * @see org.orocos.model.rtt.RttPackage#getActivity_CpuAffinity()
	 * @model default="~0" required="true"
	 * @generated
	 */
	String getCpuAffinity();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Activity#getCpuAffinity <em>Cpu Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Affinity</em>' attribute.
	 * @see #getCpuAffinity()
	 * @generated
	 */
	void setCpuAffinity(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(float)
	 * @see org.orocos.model.rtt.RttPackage#getActivity_Period()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Activity#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(float value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.orocos.model.rtt.RttPackage#getActivity_Priority()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Activity#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' attribute.
	 * The default value is <code>"ORO_SCHED_OTHER"</code>.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.Scheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' attribute.
	 * @see org.orocos.model.rtt.Scheduler
	 * @see #setScheduler(Scheduler)
	 * @see org.orocos.model.rtt.RttPackage#getActivity_Scheduler()
	 * @model default="ORO_SCHED_OTHER" required="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Activity#getScheduler <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' attribute.
	 * @see org.orocos.model.rtt.Scheduler
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

} // Activity
