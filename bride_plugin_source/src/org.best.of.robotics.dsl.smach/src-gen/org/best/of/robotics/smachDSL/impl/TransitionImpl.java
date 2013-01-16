/**
 */
package org.best.of.robotics.smachDSL.impl;

import org.best.of.robotics.smachDSL.ActionState;
import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.TransitionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.TransitionImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getOutcome() <em>Outcome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcome()
   * @generated
   * @ordered
   */
  protected static final String OUTCOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcome()
   * @generated
   * @ordered
   */
  protected String outcome = OUTCOME_EDEFAULT;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected ActionState state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return SmachDSLPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutcome()
  {
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutcome(String newOutcome)
  {
    String oldOutcome = outcome;
    outcome = newOutcome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.TRANSITION__OUTCOME, oldOutcome, outcome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionState getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (ActionState)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmachDSLPackage.TRANSITION__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionState basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(ActionState newState)
  {
    ActionState oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.TRANSITION__STATE, oldState, state));
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
      case SmachDSLPackage.TRANSITION__OUTCOME:
        return getOutcome();
      case SmachDSLPackage.TRANSITION__STATE:
        if (resolve) return getState();
        return basicGetState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmachDSLPackage.TRANSITION__OUTCOME:
        setOutcome((String)newValue);
        return;
      case SmachDSLPackage.TRANSITION__STATE:
        setState((ActionState)newValue);
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
      case SmachDSLPackage.TRANSITION__OUTCOME:
        setOutcome(OUTCOME_EDEFAULT);
        return;
      case SmachDSLPackage.TRANSITION__STATE:
        setState((ActionState)null);
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
      case SmachDSLPackage.TRANSITION__OUTCOME:
        return OUTCOME_EDEFAULT == null ? outcome != null : !OUTCOME_EDEFAULT.equals(outcome);
      case SmachDSLPackage.TRANSITION__STATE:
        return state != null;
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
    result.append(" (outcome: ");
    result.append(outcome);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
