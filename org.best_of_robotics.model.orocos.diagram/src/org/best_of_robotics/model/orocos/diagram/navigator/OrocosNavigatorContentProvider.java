package org.best_of_robotics.model.orocos.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class OrocosNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public OrocosNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem> result = new ArrayList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup group = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem navigatorItem = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {

		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup outgoinglinks = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_Activity_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup incominglinks = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_InputPort_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup links = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_Package_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup outgoinglinks = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_OutputPort_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup incominglinks = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_TaskContext_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup target = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_ConnectionPolicy_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup source = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_ConnectionPolicy_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID: {
			LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup target = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_IActivityTaskContext_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup source = new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorGroup(
					org.best_of_robotics.model.orocos.diagram.part.Messages.NavigatorGroupName_IActivityTaskContext_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
							.getType(org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem> result = new ArrayList<org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem abstractNavigatorItem = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
