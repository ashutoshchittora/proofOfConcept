package com.utils;
import java.util.List;

class Video {
	private String assetID="9999999";

	private String assetName="9999999";

	private String assetManagementPublishedURL="9999999";

	private String assetManagementPrimaryURL="9999999";

	private String productManagementAssetURL="9999999";

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

	public void setProductManagementAssetURL(String productManagementAssetURL) {
		this.productManagementAssetURL = productManagementAssetURL;
	}

	public String getProductManagementAssetURL() {
		return this.productManagementAssetURL;
	}

	public void setModelID(List<Integer> modelID) {
		this.modelID = modelID;
	}

	public List<Integer> getModelID() {
		return this.modelID;
	}
}

