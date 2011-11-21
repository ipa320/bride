/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel.impl;

import org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage;
import org.best_of_robotics.research.brsu.comm.communicationmodel.Connector;
import org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution;
import org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction;
import org.best_of_robotics.research.brsu.comm.communicationmodel.Port;
import org.best_of_robotics.research.brsu.comm.communicationmodel.Transport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected Distribution distribution;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction interaction;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected Transport transport;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Port source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Port target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationmodelPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(Distribution newDistribution, NotificationChain msgs) {
		Distribution oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__DISTRIBUTION, oldDistribution, newDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(Distribution newDistribution) {
		if (newDistribution != distribution) {
			NotificationChain msgs = null;
			if (distribution != null)
				msgs = ((InternalEObject)distribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__DISTRIBUTION, null, msgs);
			if (newDistribution != null)
				msgs = ((InternalEObject)newDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__DISTRIBUTION, null, msgs);
			msgs = basicSetDistribution(newDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__DISTRIBUTION, newDistribution, newDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
		Interaction oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransport(Transport newTransport, NotificationChain msgs) {
		Transport oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__TRANSPORT, oldTransport, newTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(Transport newTransport) {
		if (newTransport != transport) {
			NotificationChain msgs = null;
			if (transport != null)
				msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__TRANSPORT, null, msgs);
			if (newTransport != null)
				msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__TRANSPORT, null, msgs);
			msgs = basicSetTransport(newTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__TRANSPORT, newTransport, newTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Port newSource, NotificationChain msgs) {
		Port oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Port newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Port newTarget, NotificationChain msgs) {
		Port oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Port newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationmodelPackage.CONNECTOR__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationmodelPackage.CONNECTOR__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationmodelPackage.CONNECTOR__DISTRIBUTION:
				return basicSetDistribution(null, msgs);
			case CommunicationmodelPackage.CONNECTOR__INTERACTION:
				return basicSetInteraction(null, msgs);
			case CommunicationmodelPackage.CONNECTOR__TRANSPORT:
				return basicSetTransport(null, msgs);
			case CommunicationmodelPackage.CONNECTOR__SOURCE:
				return basicSetSource(null, msgs);
			case CommunicationmodelPackage.CONNECTOR__TARGET:
				return basicSetTarget(null, msgs);
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
			case CommunicationmodelPackage.CONNECTOR__DISTRIBUTION:
				return getDistribution();
			case CommunicationmodelPackage.CONNECTOR__INTERACTION:
				return getInteraction();
			case CommunicationmodelPackage.CONNECTOR__TRANSPORT:
				return getTransport();
			case CommunicationmodelPackage.CONNECTOR__NAME:
				return getName();
			case CommunicationmodelPackage.CONNECTOR__SOURCE:
				return getSource();
			case CommunicationmodelPackage.CONNECTOR__TARGET:
				return getTarget();
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
			case CommunicationmodelPackage.CONNECTOR__DISTRIBUTION:
				setDistribution((Distribution)newValue);
				return;
			case CommunicationmodelPackage.CONNECTOR__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case CommunicationmodelPackage.CONNECTOR__TRANSPORT:
				setTransport((Transport)newValue);
				return;
			case CommunicationmodelPackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case CommunicationmodelPackage.CONNECTOR__SOURCE:
				setSource((Port)newValue);
				return;
			case CommunicationmodelPackage.CONNECTOR__TARGET:
				setTarget((Port)newValue);
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
			case CommunicationmodelPackage.CONNECTOR__DISTRIBUTION:
				setDistribution((Distribution)null);
				return;
			case CommunicationmodelPackage.CONNECTOR__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case CommunicationmodelPackage.CONNECTOR__TRANSPORT:
				setTransport((Transport)null);
				return;
			case CommunicationmodelPackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommunicationmodelPackage.CONNECTOR__SOURCE:
				setSource((Port)null);
				return;
			case CommunicationmodelPackage.CONNECTOR__TARGET:
				setTarget((Port)null);
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
			case CommunicationmodelPackage.CONNECTOR__DISTRIBUTION:
				return distribution != null;
			case CommunicationmodelPackage.CONNECTOR__INTERACTION:
				return interaction != null;
			case CommunicationmodelPackage.CONNECTOR__TRANSPORT:
				return transport != null;
			case CommunicationmodelPackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommunicationmodelPackage.CONNECTOR__SOURCE:
				return source != null;
			case CommunicationmodelPackage.CONNECTOR__TARGET:
				return target != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
