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
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.DataType#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.DataType#getTypesLibrary <em>Types Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getDataType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataType extends EObject {
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
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getDataType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.DataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Library</em>' container reference.
	 * @see #setTypesLibrary(TypesLibrary)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getDataType_TypesLibrary()
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getTypes
	 * @model opposite="types" required="true" transient="false"
	 * @generated
	 */
	TypesLibrary getTypesLibrary();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.DataType#getTypesLibrary <em>Types Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Library</em>' container reference.
	 * @see #getTypesLibrary()
	 * @generated
	 */
	void setTypesLibrary(TypesLibrary value);

} // DataType
