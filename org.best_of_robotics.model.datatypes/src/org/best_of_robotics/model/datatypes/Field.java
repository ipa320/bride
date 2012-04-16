/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.Field#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.Field#getType <em>Type</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.Field#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.Field#getMeasureUnit <em>Measure Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getField_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getField_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.Field#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Unit</em>' attribute.
	 * @see #setMeasureUnit(String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getField_MeasureUnit()
	 * @model
	 * @generated
	 */
	String getMeasureUnit();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.Field#getMeasureUnit <em>Measure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Unit</em>' attribute.
	 * @see #getMeasureUnit()
	 * @generated
	 */
	void setMeasureUnit(String value);

} // Field
