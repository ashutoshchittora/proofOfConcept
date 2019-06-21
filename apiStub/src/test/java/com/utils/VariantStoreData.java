package com.utils;
import java.util.List;

class VariantStoreData {
	private int retailStoreID;

	private String digitalStoreID;

	private String availableToSellDate;

	private String dateOnSite;

	private boolean isOnQuery;

	private String lastUpdatedDateTime;

	public void setRetailStoreID(int retailStoreID) {
		this.retailStoreID = retailStoreID;
	}

	public int getRetailStoreID() {
		return this.retailStoreID;
	}

	public void setDigitalStoreID(String digitalStoreID) {
		this.digitalStoreID = digitalStoreID;
	}

	public String getDigitalStoreID() {
		return this.digitalStoreID;
	}

	public void setAvailableToSellDate(String availableToSellDate) {
		this.availableToSellDate = availableToSellDate;
	}

	public String getAvailableToSellDate() {
		return this.availableToSellDate;
	}

	public void setDateOnSite(String dateOnSite) {
		this.dateOnSite = dateOnSite;
	}

	public String getDateOnSite() {
		return this.dateOnSite;
	}

	public void setIsOnQuery(boolean isOnQuery) {
		this.isOnQuery = isOnQuery;
	}

	public boolean getIsOnQuery() {
		return this.isOnQuery;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime() {
		return this.lastUpdatedDateTime;
	}
}

