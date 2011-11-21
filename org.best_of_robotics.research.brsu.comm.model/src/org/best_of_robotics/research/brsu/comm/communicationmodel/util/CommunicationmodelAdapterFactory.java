/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel.util;

import org.best_of_robotics.research.brsu.comm.communicationmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage
 * @generated
 */
public class CommunicationmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationmodelSwitch<Adapter> modelSwitch =
		new CommunicationmodelSwitch<Adapter>() {
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseTransport(Transport object) {
				return createTransportAdapter();
			}
			@Override
			public Adapter casePubSub(PubSub object) {
				return createPubSubAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseTCP(TCP object) {
				return createTCPAdapter();
			}
			@Override
			public Adapter casePeerToPeer(PeerToPeer object) {
				return createPeerToPeerAdapter();
			}
			@Override
			public Adapter caseUDP(UDP object) {
				return createUDPAdapter();
			}
			@Override
			public Adapter caseInproc(Inproc object) {
				return createInprocAdapter();
			}
			@Override
			public Adapter caseBroker(Broker object) {
				return createBrokerAdapter();
			}
			@Override
			public Adapter caseProxy(Proxy object) {
				return createProxyAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.PubSub <em>Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.PubSub
	 * @generated
	 */
	public Adapter createPubSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.TCP <em>TCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.TCP
	 * @generated
	 */
	public Adapter createTCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.PeerToPeer <em>Peer To Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.PeerToPeer
	 * @generated
	 */
	public Adapter createPeerToPeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.UDP <em>UDP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.UDP
	 * @generated
	 */
	public Adapter createUDPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Inproc <em>Inproc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Inproc
	 * @generated
	 */
	public Adapter createInprocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Broker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Broker
	 * @generated
	 */
	public Adapter createBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Proxy
	 * @generated
	 */
	public Adapter createProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommunicationmodelAdapterFactory
