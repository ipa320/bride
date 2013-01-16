/**
 */
package org.best.of.robotics.smachDSL.impl;

import java.util.Collection;

import org.best.of.robotics.smachDSL.ActionClient;
import org.best.of.robotics.smachDSL.ActionState;
import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.Transition;

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
 * An implementation of the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionStateImpl#getClientname <em>Clientname</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionStateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionStateImpl extends MinimalEObjectImpl.Container implements ActionState
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
   * The cached value of the '{@link #getClientname() <em>Clientname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientname()
   * @generated
   * @ordered
   */
  protected ActionClient clientname;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionStateImpl()
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
    return SmachDSLPackage.Literals.ACTION_STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionClient getClientname()
  {
    if (clientname != null && clientname.eIsProxy())
    {
      InternalEObject oldClientname = (InternalEObject)clientname;
      clientname = (ActionClient)eResolveProxy(oldClientname);
      if (clientname != oldClientname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmachDSLPackage.ACTION_STATE__CLIENTNAME, oldClientname, clientname));
      }
    }
    return clientname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionClient basicGetClientname()
  {
    return clientname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientname(ActionClient newClientname)
  {
    ActionClient oldClientname = clientname;
    clientname = newClientname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_STATE__CLIENTNAME, oldClientname, clientname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, SmachDSLPackage.ACTION_STATE__TRANSITIONS);
    }
    return transitions;
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
      case SmachDSLPackage.ACTION_STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case SmachDSLPackage.ACTION_STATE__NAME:
        return getName();
      case SmachDSLPackage.ACTION_STATE__CLIENTNAME:
        if (resolve) return getClientname();
        return basicGetClientname();
      case SmachDSLPackage.ACTION_STATE__TRANSITIONS:
        return getTransitions();
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
      case SmachDSLPackage.ACTION_STATE__NAME:
        setName((String)newValue);
        return;
      case SmachDSLPackage.ACTION_STATE__CLIENTNAME:
        setClientname((ActionClient)newValue);
        return;
      case SmachDSLPackage.ACTION_STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case SmachDSLPackage.ACTION_STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmachDSLPackage.ACTION_STATE__CLIENTNAME:
        setClientname((ActionClient)null);
        return;
      case SmachDSLPackage.ACTION_STATE__TRANSITIONS:
        getTransitions().clear();
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
      case SmachDSLPackage.ACTION_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmachDSLPackage.ACTION_STATE__CLIENTNAME:
        return clientname != null;
      case SmachDSLPackage.ACTION_STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
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

} //ActionStateImpl
