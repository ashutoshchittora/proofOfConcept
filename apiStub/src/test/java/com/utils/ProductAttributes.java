package com.utils;
import java.util.List;

class ProductAttributes {
	private int attributeID;

	private String attributeName;

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
