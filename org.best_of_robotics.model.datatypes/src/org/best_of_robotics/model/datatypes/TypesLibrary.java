/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import java.lang.String;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getTypes <em>Types</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getBool <em>Bool</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getChar <em>Char</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getDouble <em>Double</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getFloat <em>Float</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getInt <em>Int</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getLong <em>Long</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getShort <em>Short</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getString <em>String</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedChar <em>Unsigned Char</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedInt <em>Unsigned Int</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedLong <em>Unsigned Long</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedShort <em>Unsigned Short</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary()
 * @model
 * @generated
 */
public interface TypesLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.datatypes.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getTypes();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference.
	 * @see #setBool(Bool)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Bool()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bool getBool();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getBool <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' containment reference.
	 * @see #getBool()
	 * @generated
	 */
	void setBool(Bool value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' containment reference.
	 * @see #setChar(Char)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Char()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Char getChar();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getChar <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' containment reference.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(Char value);

	/**
	 * Returns the value of the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' containment reference.
	 * @see #setDouble(org.best_of_robotics.model.datatypes.Double)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Double()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.best_of_robotics.model.datatypes.Double getDouble();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getDouble <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' containment reference.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(org.best_of_robotics.model.datatypes.Double value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference.
	 * @see #setFloat(org.best_of_robotics.model.datatypes.Float)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Float()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.best_of_robotics.model.datatypes.Float getFloat();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getFloat <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' containment reference.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(org.best_of_robotics.model.datatypes.Float value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference.
	 * @see #setInt(Int)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Int()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Int getInt();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getInt <em>Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' containment reference.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(Int value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' containment reference.
	 * @see #setLong(org.best_of_robotics.model.datatypes.Long)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Long()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.best_of_robotics.model.datatypes.Long getLong();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getLong <em>Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' containment reference.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(org.best_of_robotics.model.datatypes.Long value);

	/**
	 * Returns the value of the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short</em>' containment reference.
	 * @see #setShort(org.best_of_robotics.model.datatypes.Short)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Short()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.best_of_robotics.model.datatypes.Short getShort();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getShort <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' containment reference.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(org.best_of_robotics.model.datatypes.Short value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(org.best_of_robotics.model.datatypes.String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_String()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.best_of_robotics.model.datatypes.String getString();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(org.best_of_robotics.model.datatypes.String value);

	/**
	 * Returns the value of the '<em><b>Unsigned Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned Char</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Char</em>' containment reference.
	 * @see #setUnsignedChar(UnsignedChar)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_UnsignedChar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedChar getUnsignedChar();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedChar <em>Unsigned Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Char</em>' containment reference.
	 * @see #getUnsignedChar()
	 * @generated
	 */
	void setUnsignedChar(UnsignedChar value);

	/**
	 * Returns the value of the '<em><b>Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Int</em>' containment reference.
	 * @see #setUnsignedInt(UnsignedInt)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_UnsignedInt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedInt getUnsignedInt();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedInt <em>Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Int</em>' containment reference.
	 * @see #getUnsignedInt()
	 * @generated
	 */
	void setUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Unsigned Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Long</em>' containment reference.
	 * @see #setUnsignedLong(UnsignedLong)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_UnsignedLong()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedLong getUnsignedLong();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedLong <em>Unsigned Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Long</em>' containment reference.
	 * @see #getUnsignedLong()
	 * @generated
	 */
	void setUnsignedLong(UnsignedLong value);

	/**
	 * Returns the value of the '<em><b>Unsigned Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned Short</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Short</em>' containment reference.
	 * @see #setUnsignedShort(UnsignedShort)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_UnsignedShort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedShort getUnsignedShort();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedShort <em>Unsigned Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Short</em>' containment reference.
	 * @see #getUnsignedShort()
	 * @generated
	 */
	void setUnsignedShort(UnsignedShort value);

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
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TypesLibrary
