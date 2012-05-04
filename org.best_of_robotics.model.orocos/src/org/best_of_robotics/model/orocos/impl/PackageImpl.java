/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos.impl;

import java.util.Collection;

import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.orocos.ConnectionPolicy;
import org.best_of_robotics.model.orocos.IActivity;
import org.best_of_robotics.model.orocos.OrocosPackage;
import org.best_of_robotics.model.orocos.TaskContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.PackageImpl#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.PackageImpl#getConnectionPolicy <em>Connection Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.PackageImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.impl.PackageImpl#getTypesLibrary <em>Types Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements org.best_of_robotics.model.orocos.Package {
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
	 * The cached value of the '{@link #getTypesLibrary() <em>Types Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesLibrary()
	 * @generated
	 * @ordered
	 */
	protected TypesLibrary typesLibrary;

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
		return OrocosPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskContext> getTaskContext() {
		if (taskContext == null) {
			taskContext = new EObjectContainmentEList<TaskContext>(TaskContext.class, this, OrocosPackage.PACKAGE__TASK_CONTEXT);
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
			connectionPolicy = new EObjectContainmentEList<ConnectionPolicy>(ConnectionPolicy.class, this, OrocosPackage.PACKAGE__CONNECTION_POLICY);
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
			activity = new EObjectContainmentEList<IActivity>(IActivity.class, this, OrocosPackage.PACKAGE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibrary getTypesLibrary() {
		if (typesLibrary != null && typesLibrary.eIsProxy()) {
			InternalEObject oldTypesLibrary = (InternalEObject)typesLibrary;
			typesLibrary = (TypesLibrary)eResolveProxy(oldTypesLibrary);
			if (typesLibrary != oldTypesLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrocosPackage.PACKAGE__TYPES_LIBRARY, oldTypesLibrary, typesLibrary));
			}
		}
		return typesLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibrary basicGetTypesLibrary() {
		return typesLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesLibrary(TypesLibrary newTypesLibrary) {
		TypesLibrary oldTypesLibrary = typesLibrary;
		typesLibrary = newTypesLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrocosPackage.PACKAGE__TYPES_LIBRARY, oldTypesLibrary, typesLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrocosPackage.PACKAGE__TASK_CONTEXT:
				return ((InternalEList<?>)getTaskContext()).basicRemove(otherEnd, msgs);
			case OrocosPackage.PACKAGE__CONNECTION_POLICY:
				return ((InternalEList<?>)getConnectionPolicy()).basicRemove(otherEnd, msgs);
			case OrocosPackage.PACKAGE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
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
			case OrocosPackage.PACKAGE__NAME:
				return getName();
			case OrocosPackage.PACKAGE__TASK_CONTEXT:
				return getTaskContext();
			case OrocosPackage.PACKAGE__CONNECTION_POLICY:
				return getConnectionPolicy();
			case OrocosPackage.PACKAGE__ACTIVITY:
				return getActivity();
			case OrocosPackage.PACKAGE__TYPES_LIBRARY:
				if (resolve) return getTypesLibrary();
				return basicGetTypesLibrary();
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
			case OrocosPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case OrocosPackage.PACKAGE__TASK_CONTEXT:
				getTaskContext().clear();
				getTaskContext().addAll((Collection<? extends TaskContext>)newValue);
				return;
			case OrocosPackage.PACKAGE__CONNECTION_POLICY:
				getConnectionPolicy().clear();
				getConnectionPolicy().addAll((Collection<? extends ConnectionPolicy>)newValue);
				return;
			case OrocosPackage.PACKAGE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends IActivity>)newValue);
				return;
			case OrocosPackage.PACKAGE__TYPES_LIBRARY:
				setTypesLibrary((TypesLibrary)newValue);
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
			case OrocosPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrocosPackage.PACKAGE__TASK_CONTEXT:
				getTaskContext().clear();
				return;
			case OrocosPackage.PACKAGE__CONNECTION_POLICY:
				getConnectionPolicy().clear();
				return;
			case OrocosPackage.PACKAGE__ACTIVITY:
				getActivity().clear();
				return;
			case OrocosPackage.PACKAGE__TYPES_LIBRARY:
				setTypesLibrary((TypesLibrary)null);
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
			case OrocosPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrocosPackage.PACKAGE__TASK_CONTEXT:
				return taskContext != null && !taskContext.isEmpty();
			case OrocosPackage.PACKAGE__CONNECTION_POLICY:
				return connectionPolicy != null && !connectionPolicy.isEmpty();
			case OrocosPackage.PACKAGE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case OrocosPackage.PACKAGE__TYPES_LIBRARY:
				return typesLibrary != null;
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

} //PackageImpl
