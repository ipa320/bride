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
package org.best_of_robotics.model.Cpf.impl;

import org.best_of_robotics.model.Cpf.Choices;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.model.Cpf.Defaultvalue;
import org.best_of_robotics.model.Cpf.Description;
import org.best_of_robotics.model.Cpf.Simple;
import org.best_of_robotics.model.Cpf.SimpleType;
import org.best_of_robotics.model.Cpf.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleImpl extends EObjectImpl implements Simple {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected Choices choices;

	/**
	 * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected Defaultvalue defaultvalue;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleType TYPE_EDEFAULT = SimpleType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpfPackage.Literals.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription,
			NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.SIMPLE__DESCRIPTION,
					oldDescription, newDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- CpfPackage.SIMPLE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- CpfPackage.SIMPLE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.SIMPLE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue,
			NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.SIMPLE__VALUE, oldValue,
					newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.SIMPLE__VALUE,
						null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.SIMPLE__VALUE,
						null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.SIMPLE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoices(Choices newChoices,
			NotificationChain msgs) {
		Choices oldChoices = choices;
		choices = newChoices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.SIMPLE__CHOICES, oldChoices,
					newChoices);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(Choices newChoices) {
		if (newChoices != choices) {
			NotificationChain msgs = null;
			if (choices != null)
				msgs = ((InternalEObject) choices).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.SIMPLE__CHOICES,
						null, msgs);
			if (newChoices != null)
				msgs = ((InternalEObject) newChoices).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.SIMPLE__CHOICES,
						null, msgs);
			msgs = basicSetChoices(newChoices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.SIMPLE__CHOICES, newChoices, newChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defaultvalue getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultvalue(Defaultvalue newDefaultvalue,
			NotificationChain msgs) {
		Defaultvalue oldDefaultvalue = defaultvalue;
		defaultvalue = newDefaultvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.SIMPLE__DEFAULTVALUE,
					oldDefaultvalue, newDefaultvalue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvalue(Defaultvalue newDefaultvalue) {
		if (newDefaultvalue != defaultvalue) {
			NotificationChain msgs = null;
			if (defaultvalue != null)
				msgs = ((InternalEObject) defaultvalue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpfPackage.SIMPLE__DEFAULTVALUE, null, msgs);
			if (newDefaultvalue != null)
				msgs = ((InternalEObject) newDefaultvalue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpfPackage.SIMPLE__DEFAULTVALUE, null, msgs);
			msgs = basicSetDefaultvalue(newDefaultvalue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.SIMPLE__DEFAULTVALUE, newDefaultvalue,
					newDefaultvalue));
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
					CpfPackage.SIMPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SimpleType newType) {
		SimpleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.SIMPLE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		SimpleType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpfPackage.SIMPLE__TYPE, oldType, TYPE_EDEFAULT,
					oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
		case CpfPackage.SIMPLE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpfPackage.SIMPLE__VALUE:
			return basicSetValue(null, msgs);
		case CpfPackage.SIMPLE__CHOICES:
			return basicSetChoices(null, msgs);
		case CpfPackage.SIMPLE__DEFAULTVALUE:
			return basicSetDefaultvalue(null, msgs);
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
		case CpfPackage.SIMPLE__DESCRIPTION:
			return getDescription();
		case CpfPackage.SIMPLE__VALUE:
			return getValue();
		case CpfPackage.SIMPLE__CHOICES:
			return getChoices();
		case CpfPackage.SIMPLE__DEFAULTVALUE:
			return getDefaultvalue();
		case CpfPackage.SIMPLE__NAME:
			return getName();
		case CpfPackage.SIMPLE__TYPE:
			return getType();
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
		case CpfPackage.SIMPLE__DESCRIPTION:
			setDescription((Description) newValue);
			return;
		case CpfPackage.SIMPLE__VALUE:
			setValue((Value) newValue);
			return;
		case CpfPackage.SIMPLE__CHOICES:
			setChoices((Choices) newValue);
			return;
		case CpfPackage.SIMPLE__DEFAULTVALUE:
			setDefaultvalue((Defaultvalue) newValue);
			return;
		case CpfPackage.SIMPLE__NAME:
			setName((String) newValue);
			return;
		case CpfPackage.SIMPLE__TYPE:
			setType((SimpleType) newValue);
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
		case CpfPackage.SIMPLE__DESCRIPTION:
			setDescription((Description) null);
			return;
		case CpfPackage.SIMPLE__VALUE:
			setValue((Value) null);
			return;
		case CpfPackage.SIMPLE__CHOICES:
			setChoices((Choices) null);
			return;
		case CpfPackage.SIMPLE__DEFAULTVALUE:
			setDefaultvalue((Defaultvalue) null);
			return;
		case CpfPackage.SIMPLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CpfPackage.SIMPLE__TYPE:
			unsetType();
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
		case CpfPackage.SIMPLE__DESCRIPTION:
			return description != null;
		case CpfPackage.SIMPLE__VALUE:
			return value != null;
		case CpfPackage.SIMPLE__CHOICES:
			return choices != null;
		case CpfPackage.SIMPLE__DEFAULTVALUE:
			return defaultvalue != null;
		case CpfPackage.SIMPLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case CpfPackage.SIMPLE__TYPE:
			return isSetType();
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
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleImpl
