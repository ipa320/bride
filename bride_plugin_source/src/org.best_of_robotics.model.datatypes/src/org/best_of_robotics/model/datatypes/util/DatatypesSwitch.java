/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.util;

import org.best_of_robotics.model.datatypes.*;
import org.best_of_robotics.model.datatypes.Bool;
import org.best_of_robotics.model.datatypes.Char;
import org.best_of_robotics.model.datatypes.ComplexType;
import org.best_of_robotics.model.datatypes.CustomType;
import org.best_of_robotics.model.datatypes.DataType;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.Field;
import org.best_of_robotics.model.datatypes.IDLReference;
import org.best_of_robotics.model.datatypes.Int;
import org.best_of_robotics.model.datatypes.RosIDLReference;
import org.best_of_robotics.model.datatypes.SimpleType;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.UnsignedChar;
import org.best_of_robotics.model.datatypes.UnsignedInt;
import org.best_of_robotics.model.datatypes.UnsignedLong;
import org.best_of_robotics.model.datatypes.UnsignedShort;
import org.best_of_robotics.model.datatypes.VectorType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatatypesPackage.TYPES_LIBRARY: {
				TypesLibrary typesLibrary = (TypesLibrary)theEObject;
				T result = caseTypesLibrary(typesLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseDataType(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseDataType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ROS_IDL_REFERENCE: {
				RosIDLReference rosIDLReference = (RosIDLReference)theEObject;
				T result = caseRosIDLReference(rosIDLReference);
				if (result == null) result = caseIDLReference(rosIDLReference);
				if (result == null) result = caseComplexType(rosIDLReference);
				if (result == null) result = caseDataType(rosIDLReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.VECTOR_TYPE: {
				VectorType vectorType = (VectorType)theEObject;
				T result = caseVectorType(vectorType);
				if (result == null) result = caseComplexType(vectorType);
				if (result == null) result = caseDataType(vectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CUSTOM_TYPE: {
				CustomType customType = (CustomType)theEObject;
				T result = caseCustomType(customType);
				if (result == null) result = caseComplexType(customType);
				if (result == null) result = caseDataType(customType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IDL_REFERENCE: {
				IDLReference idlReference = (IDLReference)theEObject;
				T result = caseIDLReference(idlReference);
				if (result == null) result = caseComplexType(idlReference);
				if (result == null) result = caseDataType(idlReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesLibrary(TypesLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros IDL Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros IDL Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosIDLReference(RosIDLReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType(VectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomType(CustomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLReference(IDLReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DatatypesSwitch
