/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://communicationmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "communicationmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationmodelPackage eINSTANCE = org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TRANSPORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = 5;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InteractionImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.DistributionImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TransportImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__PROTOCOL = 0;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PubSubImpl <em>Pub Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PubSubImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPubSub()
	 * @generated
	 */
	int PUB_SUB = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__PROPERTIES = INTERACTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProtocolImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PropertyImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TCPImpl <em>TCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TCPImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getTCP()
	 * @generated
	 */
	int TCP = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP__PROPERTIES = PROTOCOL__PROPERTIES;

	/**
	 * The number of structural features of the '<em>TCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PeerToPeerImpl <em>Peer To Peer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PeerToPeerImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPeerToPeer()
	 * @generated
	 */
	int PEER_TO_PEER = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_TO_PEER__PROPERTIES = INTERACTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Peer To Peer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_TO_PEER_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.UDPImpl <em>UDP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.UDPImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getUDP()
	 * @generated
	 */
	int UDP = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP__PROPERTIES = PROTOCOL__PROPERTIES;

	/**
	 * The number of structural features of the '<em>UDP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InprocImpl <em>Inproc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InprocImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getInproc()
	 * @generated
	 */
	int INPROC = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROC__PROPERTIES = PROTOCOL__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Inproc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROC_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.BrokerImpl <em>Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.BrokerImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getBroker()
	 * @generated
	 */
	int BROKER = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__PROPERTIES = DISTRIBUTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProxyImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__PROPERTIES = DISTRIBUTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PortImpl
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getDistribution()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Distribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getInteraction()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Interaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTransport()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Transport();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Interaction#getProperties()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Properties();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Distribution#getProperties()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Properties();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Transport#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Transport#getProtocol()
	 * @see #getTransport()
	 * @generated
	 */
	EReference getTransport_Protocol();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.PubSub <em>Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pub Sub</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.PubSub
	 * @generated
	 */
	EClass getPubSub();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol#getProperties()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Properties();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.TCP <em>TCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.TCP
	 * @generated
	 */
	EClass getTCP();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.PeerToPeer <em>Peer To Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peer To Peer</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.PeerToPeer
	 * @generated
	 */
	EClass getPeerToPeer();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.UDP <em>UDP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.UDP
	 * @generated
	 */
	EClass getUDP();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Inproc <em>Inproc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inproc</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Inproc
	 * @generated
	 */
	EClass getInproc();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Broker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Broker
	 * @generated
	 */
	EClass getBroker();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationmodelFactory getCommunicationmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ConnectorImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DISTRIBUTION = eINSTANCE.getConnector_Distribution();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__INTERACTION = eINSTANCE.getConnector_Interaction();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TRANSPORT = eINSTANCE.getConnector_Transport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InteractionImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PROPERTIES = eINSTANCE.getInteraction_Properties();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.DistributionImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__PROPERTIES = eINSTANCE.getDistribution_Properties();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TransportImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT__PROTOCOL = eINSTANCE.getTransport_Protocol();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PubSubImpl <em>Pub Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PubSubImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPubSub()
		 * @generated
		 */
		EClass PUB_SUB = eINSTANCE.getPubSub();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProtocolImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__PROPERTIES = eINSTANCE.getProtocol_Properties();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PropertyImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TCPImpl <em>TCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.TCPImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getTCP()
		 * @generated
		 */
		EClass TCP = eINSTANCE.getTCP();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PeerToPeerImpl <em>Peer To Peer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PeerToPeerImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPeerToPeer()
		 * @generated
		 */
		EClass PEER_TO_PEER = eINSTANCE.getPeerToPeer();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.UDPImpl <em>UDP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.UDPImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getUDP()
		 * @generated
		 */
		EClass UDP = eINSTANCE.getUDP();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InprocImpl <em>Inproc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.InprocImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getInproc()
		 * @generated
		 */
		EClass INPROC = eINSTANCE.getInproc();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.BrokerImpl <em>Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.BrokerImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getBroker()
		 * @generated
		 */
		EClass BROKER = eINSTANCE.getBroker();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.ProxyImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.PortImpl
		 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.impl.CommunicationmodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

	}

} //CommunicationmodelPackage
