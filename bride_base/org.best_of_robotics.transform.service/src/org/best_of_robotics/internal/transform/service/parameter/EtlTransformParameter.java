package org.best_of_robotics.internal.transform.service.parameter;

import org.best_of_robotics.transform.service.parameter.IEtlTransformParameter;

public class EtlTransformParameter extends AbstractTransformParameter implements IEtlTransformParameter {

	private String pluginID;
	private String etlTransformPath;
	private String sourceName;
	private String sourceMetaModelURI;
	private String sourceModelFilePath;
	private boolean sourceReadOnLoad;
	private boolean sourceStoreOnDisposal;
	private String targetName;
	private String targetMetaModelURI;
	private String targetModelFilePath;
	private boolean targetReadOnLoad;
	private boolean targetStoreOnDisposal;
	
	public EtlTransformParameter() {
	}

	@Override
	public String getPluginID() {
		return this.pluginID;
	}

	@Override
	public void setPluginID(String pluginID) {
		this.pluginID = pluginID;
	}

	@Override
	public String getEtlTransformPath() {
		return this.etlTransformPath;
	}

	@Override
	public void setEtlTransformPath(String etlTransformPath) {
		this.etlTransformPath = etlTransformPath;
	}

	@Override
	public String getSourceName() {
		return this.sourceName;
	}

	@Override
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public String getSourceMetaModelURI() {
		return this.sourceMetaModelURI;
	}

	@Override
	public void setSourceMetaModelURI(String sourceMetaModelURI) {
		this.sourceMetaModelURI = sourceMetaModelURI;
	}

	@Override
	public String getSourceModelFilePath() {
		return this.sourceModelFilePath;
	}

	@Override
	public void setSourceModelFilePath(String sourceModelFilePath) {
		this.sourceModelFilePath = sourceModelFilePath;
	}

	@Override
	public boolean isSourceReadOnLoad() {
		return this.sourceReadOnLoad;
	}

	@Override
	public void setSourceReadOnLoad(boolean sourceReadOnLoad) {
		this.sourceReadOnLoad = sourceReadOnLoad;
	}

	@Override
	public boolean isSourceStoreOnDisposal() {
		return this.sourceStoreOnDisposal;
	}

	@Override
	public void setSourceStoreOnDisposal(boolean sourceStoreOnDisposal) {
		this.sourceStoreOnDisposal = sourceStoreOnDisposal;
	}

	@Override
	public String getTargetName() {
		return this.targetName;
	}

	@Override
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	@Override
	public String getTargetMetaModelURI() {
		return this.targetMetaModelURI;
	}

	@Override
	public void setTargetMetaModelURI(String targetMetaModelURI) {
		this.targetMetaModelURI = targetMetaModelURI;
	}

	@Override
	public String getTargetModelFilePath() {
		return this.targetModelFilePath;
	}

	@Override
	public void setTargetModelFilePath(String targetModelFilePath) {
		this.targetModelFilePath = targetModelFilePath;
	}

	@Override
	public boolean isTargetReadOnLoad() {
		return this.targetReadOnLoad;
	}

	@Override
	public void setTargetReadOnLoad(boolean targetReadOnLoad) {
		this.targetReadOnLoad = targetReadOnLoad;
	}

	@Override
	public boolean isTargetStoreOnDisposal() {
		return this.targetStoreOnDisposal;
	}

	@Override
	public void setTargetStoreOnDisposal(boolean targetStoreOnDisposal) {
		this.targetStoreOnDisposal = targetStoreOnDisposal;
	}

}
