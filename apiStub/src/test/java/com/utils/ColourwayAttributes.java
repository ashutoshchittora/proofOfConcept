package com.utils;
import java.util.List;

class ColourwayAttributes {
	private int attributeID=9999999;

	private String attributeName="9999999";

	private List<AttributeValues> attributeValues;

	public void setAttributeID(int attributeID) {
		this.attributeID = attributeID;
	}

	public int getAttributeID() {
		return this.attributeID;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeValues(List<AttributeValues> attributeValues) {
		this.attributeValues = attributeValues;
	}

	public List<AttributeValues> getAttributeValues() {
		return this.attributeValues;
	}
}

