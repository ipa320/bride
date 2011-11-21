/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel.impl;

import org.best_of_robotics.research.brsu.comm.communicationmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationmodelFactoryImpl extends EFactoryImpl implements CommunicationmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationmodelFactory init() {
		try {
			CommunicationmodelFactory theCommunicationmodelFactory = (CommunicationmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://communicationmodel/1.0"); 
			if (theCommunicationmodelFactory != null) {
				return theCommunicationmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommunicationmodelPackage.CONNECTOR: return createConnector();
			case CommunicationmodelPackage.INTERACTION: return createInteraction();
			case CommunicationmodelPackage.DISTRIBUTION: return createDistribution();
			case CommunicationmodelPackage.TRANSPORT: return createTransport();
			case CommunicationmodelPackage.PUB_SUB: return createPubSub();
			case CommunicationmodelPackage.PROTOCOL: return createProtocol();
			case CommunicationmodelPackage.PROPERTY: return createProperty();
			case CommunicationmodelPackage.TCP: return createTCP();
			case CommunicationmodelPackage.PEER_TO_PEER: return createPeerToPeer();
			case CommunicationmodelPackage.UDP: return createUDP();
			case CommunicationmodelPackage.INPROC: return createInproc();
			case CommunicationmodelPackage.BROKER: return createBroker();
			case CommunicationmodelPackage.PROXY: return createProxy();
			case CommunicationmodelPackage.PORT: return createPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSub createPubSub() {
		PubSubImpl pubSub = new PubSubImpl();
		return pubSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCP createTCP() {
		TCPImpl tcp = new TCPImpl();
		return tcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeerToPeer createPeerToPeer() {
		PeerToPeerImpl peerToPeer = new PeerToPeerImpl();
		return peerToPeer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDP createUDP() {
		UDPImpl udp = new UDPImpl();
		return udp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inproc createInproc() {
		InprocImpl inproc = new InprocImpl();
		return inproc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broker createBroker() {
		BrokerImpl broker = new BrokerImpl();
		return broker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy createProxy() {
		ProxyImpl proxy = new ProxyImpl();
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationmodelPackage getCommunicationmodelPackage() {
		return (CommunicationmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationmodelPackage getPackage() {
		return CommunicationmodelPackage.eINSTANCE;
	}

} //CommunicationmodelFactoryImpl
