package org.best_of_robotics.internal.transform.service.parameter;

import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;

public class EglTransformParameter extends AbstractTransformParameter implements IEglTransformParameter {
	
	private String pluginID;
	private String eglTransformation;
	private String sourceName;
	private String sourceMetaModelURI;
	private String sourceModelFilePath;
	private boolean sourceReadOnLoad;
	private boolean sourceStoreOnDisposal;
	private String outputRoot;
	
	public EglTransformParameter() {
	}

	@Override
	public String getPluginID() {
		return pluginID;
	}

	@Override
	public void setPluginID(String pluginID) {
		this.pluginID = pluginID;
	}

	@Override
	public String getEglTransformation() {
		return eglTransformation;
	}

	@Override
	public void setEglTransform(String eglTransformation) {
		this.eglTransformation = eglTransformation;
	}

	@Override
	public String getSourceName() {
		return sourceName;
	}

	@Override
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public String getSourceMetaModelURI() {
		return sourceMetaModelURI;
	}

	@Override
	public void setSourceMetaModelURI(String sourceMetaModelURI) {
		this.sourceMetaModelURI = sourceMetaModelURI;
	}

	@Override
	public String getSourceModelFilePath() {
		return sourceModelFilePath;
	}

	@Override
	public void setSourceModelFilePath(String sourceModelFilePath) {
		this.sourceModelFilePath = sourceModelFilePath;
	}

	@Override
	public boolean isSourceReadOnLoad() {
		return sourceReadOnLoad;
	}

	@Override
	public void setSourceReadOnLoad(boolean sourceReadOnLoad) {
		this.sourceReadOnLoad = sourceReadOnLoad;
	}

	@Override
	public boolean isSourceStoreOnDisposal() {
		return sourceStoreOnDisposal;
	}

	@Override
	public void setSourceStoreOnDisposal(boolean sourceStoreOnDisposal) {
		this.sourceStoreOnDisposal = sourceStoreOnDisposal;
	}

	@Override
	public String getOutputRoot() {
		return outputRoot;
	}

	@Override
	public void setOutputRoot(String outputRoot) {
		this.outputRoot = outputRoot;
	}

}
