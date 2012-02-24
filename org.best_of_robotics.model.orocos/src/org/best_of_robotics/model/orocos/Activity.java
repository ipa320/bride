/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.Activity#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Activity#getCpuAffinity <em>Cpu Affinity</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Activity#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Activity#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends IActivity {
	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' attribute.
	 * The default value is <code>"ORO_SCHED_OTHER"</code>.
	 * The literals are from the enumeration {@link org.best_of_robotics.model.orocos.Scheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.Scheduler
	 * @see #setScheduler(Scheduler)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getActivity_Scheduler()
	 * @model default="ORO_SCHED_OTHER" required="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Activity#getScheduler <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.Scheduler
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getActivity_CpuAffinity()
	 * @model default="~0" required="true"
	 * @generated
	 */
	String getCpuAffinity();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Activity#getCpuAffinity <em>Cpu Affinity</em>}' attribute.
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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getActivity_Period()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Activity#getPeriod <em>Period</em>}' attribute.
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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getActivity_Priority()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Activity#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // Activity
