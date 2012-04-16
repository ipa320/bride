/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.VectorType#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getVectorType()
 * @model
 * @generated
 */
public interface VectorType extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(DataType)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getVectorType_Template()
	 * @model required="true"
	 * @generated
	 */
	DataType getTemplate();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.VectorType#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(DataType value);

} // VectorType
