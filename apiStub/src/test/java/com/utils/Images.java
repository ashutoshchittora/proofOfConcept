package com.utils;
import java.util.List;

class Images {
	private String assetID;

	private String assetName;

	private int assetSequence;

	private String productManagementAssetURL;

	private String assetManagementPublishedURL;

	private String assetManagementPrimaryURL;

	private List<Integer> modelID;

	public void setAssetID(String assetID) {
		this.assetID = assetID;
	}

	public String getAssetID() {
		return this.assetID;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetName() {
		return this.assetName;
	}

	public void setAssetSequence(int assetSequence) {
		this.assetSequence = assetSequence;
	}

	public int getAssetSequence() {
		return this.assetSequence;
	}

	public void setProductManagementAssetURL(String productManagementAssetURL) {
		this.productManagementAssetURL = productManagementAssetURL;
	}

	public String getProductManagementAssetURL() {
		return this.productManagementAssetURL;
	}

	public void setAssetManagementPublishedURL(String assetManagementPublishedURL) {
		this.assetManagementPublishedURL = assetManagementPublishedURL;
	}

	public String getAssetManagementPublishedURL() {
		return this.assetManagementPublishedURL;
	}

	public void setAssetManagementPrimaryURL(String assetManagementPrimaryURL) {
		this.assetManagementPrimaryURL = assetManagementPrimaryURL;
	}

	public String getAssetManagementPrimaryURL() {
		return this.assetManagementPrimaryURL;
	}

	public void setModelID(List<Integer> modelID) {
		this.modelID = modelID;
	}

	public List<Integer> getModelID() {
		return this.modelID;
	}
}

