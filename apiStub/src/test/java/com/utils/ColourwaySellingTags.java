package com.utils;
import java.util.List;

import org.joda.time.DateTime;

class ColourwaySellingTags {
	private int sellingTagID;

	private String sellingTagName;

	private DateTime effectiveFromDate;

	private DateTime effectiveToDate;

	public void setSellingTagID(int sellingTagID) {
		this.sellingTagID = sellingTagID;
	}

	public int getSellingTagID() {
		return this.sellingTagID;
	}

	public void setSellingTagName(String sellingTagName) {
		this.sellingTagName = sellingTagName;
	}

	public String getSellingTagName() {
		return this.sellingTagName;
	}

	public void setEffectiveFromDate(DateTime effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public DateTime getEffectiveFromDate() {
		return this.effectiveFromDate;
	}

	public void setEffectiveToDate(DateTime effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
	}

	public DateTime getEffectiveToDate() {
		return this.effectiveToDate;
	}
}
