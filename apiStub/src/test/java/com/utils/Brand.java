package com.utils;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

class Brand {
	private int brandID;

	private String brandName;

	private int subBrandID;

	private String subBrandName;

	private String brandFacet;

	private String brandDescriptionPDP;

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public int getBrandID() {
		return this.brandID;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setSubBrandID(int subBrandID) {
		this.subBrandID = subBrandID;
	}

	public int getSubBrandID() {
		return this.subBrandID;
	}

	public void setSubBrandName(String subBrandName) {
		this.subBrandName = subBrandName;
	}

	public String getSubBrandName() {
		return this.subBrandName;
	}

	public void setBrandFacet(String brandFacet) {
		this.brandFacet = brandFacet;
	}

	public String getBrandFacet() {
		return this.brandFacet;
	}

	public void setBrandDescriptionPDP(String brandDescriptionPDP) {
		this.brandDescriptionPDP = brandDescriptionPDP;
	}

	public String getBrandDescriptionPDP() {
		return this.brandDescriptionPDP;
	}
}

