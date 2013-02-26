/**
 */
package org.best.of.robotics.smachDSL.impl;

import java.util.Collection;

import org.best.of.robotics.smachDSL.PrimitivePackage;
import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.StateMachine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.PrimitivePackageImpl#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitivePackageImpl extends MinimalEObjectImpl.Container implements PrimitivePackage
{
  /**
   * The cached value of the '{@link #getStatemachines() <em>Statemachines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemachines()
   * @generated
   * @ordered
   */
  protected EList<StateMachine> statemachines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitivePackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmachDSLPackage.Literals.PRIMITIVE_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateMachine> getStatemachines()
  {
    if (statemachines == null)
    {
      statemachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES);
    }
    return statemachines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES:
        return ((InternalEList<?>)getStatemachines()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES:
        return getStatemachines();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES:
        getStatemachines().clear();
        getStatemachines().addAll((Collection<? extends StateMachine>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES:
        getStatemachines().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmachDSLPackage.PRIMITIVE_PACKAGE__STATEMACHINES:
        return statemachines != null && !statemachines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimitivePackageImpl
