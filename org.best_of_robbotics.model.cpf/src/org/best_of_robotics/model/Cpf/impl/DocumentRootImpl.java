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

import org.best_of_robotics.model.Cpf.Choice;
import org.best_of_robotics.model.Cpf.Choices;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.model.Cpf.Defaultvalue;
import org.best_of_robotics.model.Cpf.Description;
import org.best_of_robotics.model.Cpf.DocumentRoot;
import org.best_of_robotics.model.Cpf.Properties;
import org.best_of_robotics.model.Cpf.Sequence;
import org.best_of_robotics.model.Cpf.Simple;
import org.best_of_robotics.model.Cpf.Struct;
import org.best_of_robotics.model.Cpf.Value;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpfPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CpfPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getChoice() {
		return (Choice) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(Choice newChoice,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICE, newChoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(Choice newChoice) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICE, newChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choices getChoices() {
		return (Choices) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoices(Choices newChoices,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICES, newChoices, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(Choices newChoices) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__CHOICES, newChoices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defaultvalue getDefaultvalue() {
		return (Defaultvalue) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__DEFAULTVALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultvalue(Defaultvalue newDefaultvalue,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__DEFAULTVALUE,
				newDefaultvalue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvalue(Defaultvalue newDefaultvalue) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__DEFAULTVALUE,
				newDefaultvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return (Description) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return (Properties) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return (Sequence) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__SEQUENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple getSimple() {
		return (Simple) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__SIMPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple(Simple newSimple,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__SIMPLE, newSimple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple(Simple newSimple) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__SIMPLE, newSimple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		return (Struct) getMixed().get(
				CpfPackage.Literals.DOCUMENT_ROOT__STRUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Struct newStruct,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__STRUCT, newStruct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__STRUCT, newStruct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return (Value) getMixed().get(CpfPackage.Literals.DOCUMENT_ROOT__VALUE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				CpfPackage.Literals.DOCUMENT_ROOT__VALUE, newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		((FeatureMap.Internal) getMixed()).set(
				CpfPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
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
		case CpfPackage.DOCUMENT_ROOT__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(
					otherEnd, msgs);
		case CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(
					otherEnd, msgs);
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
			return basicSetChoice(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
			return basicSetChoices(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
			return basicSetDefaultvalue(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
			return basicSetProperties(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
			return basicSetSequence(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
			return basicSetSimple(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
			return basicSetStruct(null, msgs);
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			return basicSetValue(null, msgs);
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
		case CpfPackage.DOCUMENT_ROOT__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			if (coreType)
				return getXMLNSPrefixMap();
			else
				return getXMLNSPrefixMap().map();
		case CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			if (coreType)
				return getXSISchemaLocation();
			else
				return getXSISchemaLocation().map();
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
			return getChoice();
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
			return getChoices();
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
			return getDefaultvalue();
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
			return getDescription();
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
			return getProperties();
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
			return getSequence();
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
			return getSimple();
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
			return getStruct();
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			return getValue();
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
		case CpfPackage.DOCUMENT_ROOT__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
			setChoice((Choice) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
			setChoices((Choices) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
			setDefaultvalue((Defaultvalue) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
			setDescription((Description) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
			setProperties((Properties) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
			setSequence((Sequence) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
			setSimple((Simple) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
			setStruct((Struct) newValue);
			return;
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			setValue((Value) newValue);
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
		case CpfPackage.DOCUMENT_ROOT__MIXED:
			getMixed().clear();
			return;
		case CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			getXMLNSPrefixMap().clear();
			return;
		case CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			getXSISchemaLocation().clear();
			return;
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
			setChoice((Choice) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
			setChoices((Choices) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
			setDefaultvalue((Defaultvalue) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
			setDescription((Description) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
			setProperties((Properties) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
			setSequence((Sequence) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
			setSimple((Simple) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
			setStruct((Struct) null);
			return;
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			setValue((Value) null);
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
		case CpfPackage.DOCUMENT_ROOT__MIXED:
			return mixed != null && !mixed.isEmpty();
		case CpfPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
		case CpfPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
		case CpfPackage.DOCUMENT_ROOT__CHOICE:
			return getChoice() != null;
		case CpfPackage.DOCUMENT_ROOT__CHOICES:
			return getChoices() != null;
		case CpfPackage.DOCUMENT_ROOT__DEFAULTVALUE:
			return getDefaultvalue() != null;
		case CpfPackage.DOCUMENT_ROOT__DESCRIPTION:
			return getDescription() != null;
		case CpfPackage.DOCUMENT_ROOT__PROPERTIES:
			return getProperties() != null;
		case CpfPackage.DOCUMENT_ROOT__SEQUENCE:
			return getSequence() != null;
		case CpfPackage.DOCUMENT_ROOT__SIMPLE:
			return getSimple() != null;
		case CpfPackage.DOCUMENT_ROOT__STRUCT:
			return getStruct() != null;
		case CpfPackage.DOCUMENT_ROOT__VALUE:
			return getValue() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
