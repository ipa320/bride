/**
 */
package org.best.of.robotics.smachDSL.impl;

import java.util.Collection;

import org.best.of.robotics.smachDSL.ActionClient;
import org.best.of.robotics.smachDSL.ActionState;
import org.best.of.robotics.smachDSL.ServiceClient;
import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.StateMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl#getActionclients <em>Actionclients</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl#getServiceclients <em>Serviceclients</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.StateMachineImpl#getActionsstates <em>Actionsstates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine
{
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
   * The cached value of the '{@link #getActionclients() <em>Actionclients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionclients()
   * @generated
   * @ordered
   */
  protected EList<ActionClient> actionclients;

  /**
   * The cached value of the '{@link #getServiceclients() <em>Serviceclients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceclients()
   * @generated
   * @ordered
   */
  protected EList<ServiceClient> serviceclients;

  /**
   * The cached value of the '{@link #getActionsstates() <em>Actionsstates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionsstates()
   * @generated
   * @ordered
   */
  protected EList<ActionState> actionsstates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateMachineImpl()
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
    return SmachDSLPackage.Literals.STATE_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.STATE_MACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionClient> getActionclients()
  {
    if (actionclients == null)
    {
      actionclients = new EObjectContainmentEList<ActionClient>(ActionClient.class, this, SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS);
    }
    return actionclients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceClient> getServiceclients()
  {
    if (serviceclients == null)
    {
      serviceclients = new EObjectContainmentEList<ServiceClient>(ServiceClient.class, this, SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS);
    }
    return serviceclients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionState> getActionsstates()
  {
    if (actionsstates == null)
    {
      actionsstates = new EObjectContainmentEList<ActionState>(ActionState.class, this, SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES);
    }
    return actionsstates;
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
      case SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS:
        return ((InternalEList<?>)getActionclients()).basicRemove(otherEnd, msgs);
      case SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS:
        return ((InternalEList<?>)getServiceclients()).basicRemove(otherEnd, msgs);
      case SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES:
        return ((InternalEList<?>)getActionsstates()).basicRemove(otherEnd, msgs);
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
      case SmachDSLPackage.STATE_MACHINE__NAME:
        return getName();
      case SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS:
        return getActionclients();
      case SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS:
        return getServiceclients();
      case SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES:
        return getActionsstates();
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
      case SmachDSLPackage.STATE_MACHINE__NAME:
        setName((String)newValue);
        return;
      case SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS:
        getActionclients().clear();
        getActionclients().addAll((Collection<? extends ActionClient>)newValue);
        return;
      case SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS:
        getServiceclients().clear();
        getServiceclients().addAll((Collection<? extends ServiceClient>)newValue);
        return;
      case SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES:
        getActionsstates().clear();
        getActionsstates().addAll((Collection<? extends ActionState>)newValue);
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
      case SmachDSLPackage.STATE_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS:
        getActionclients().clear();
        return;
      case SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS:
        getServiceclients().clear();
        return;
      case SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES:
        getActionsstates().clear();
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
      case SmachDSLPackage.STATE_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmachDSLPackage.STATE_MACHINE__ACTIONCLIENTS:
        return actionclients != null && !actionclients.isEmpty();
      case SmachDSLPackage.STATE_MACHINE__SERVICECLIENTS:
        return serviceclients != null && !serviceclients.isEmpty();
      case SmachDSLPackage.STATE_MACHINE__ACTIONSSTATES:
        return actionsstates != null && !actionsstates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StateMachineImpl
