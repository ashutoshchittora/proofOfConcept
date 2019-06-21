/*package com.apiStub;

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

class AttributeValues {
	private int valueID;

	private String value;

	private String unitOfMeasure;

	public void setValueID(int valueID) {
		this.valueID = valueID;
	}

	public int getValueID() {
		return this.valueID;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getUnitOfMeasure() {
		return this.unitOfMeasure;
	}
}

class ColourwayAttributes {
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

class Video {
	private String assetID;

	private String assetName;

	private String assetManagementPublishedURL;

	private String assetManagementPrimaryURL;

	private String productManagementAssetURL;

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

class SpinSet {
	private String assetID;

	private String assetName;

	private String assetManagementPublishedURL;

	private String assetManagementPrimaryURL;

	private String productManagementAssetURL;

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

class ProductionAsset {
	private List<Images> images;

	private Video video;

	private SpinSet spinSet;

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public List<Images> getImages() {
		return this.images;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setSpinSet(SpinSet spinSet) {
		this.spinSet = spinSet;
	}

	public SpinSet getSpinSet() {
		return this.spinSet;
	}
}

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

class Variants {
	private int variantID;

	private String variantName;

	private String retailSKUID;

	private String retailVariantTitle;

	private String variantStatus;

	private String createdDateTime;

	private String lastUpdatedDateTime;

	private String deletedDateTime;

	private String SKUID;

	private int legacySKUID;

	private String supplierRef;

	private int legacyWorkflowStatus;

	private String EAN;

	private int sizeDescriptionID;

	private String supplierSize;

	private int brandSizeID;

	private String brandSize;

	private int refinementSizeID;

	private String refinementSize;

	private int sizeOrder;

	private String productManagementPublishedStatus;

	private List<VariantStoreData> variantStoreData;

	private int variantSizeID;

	private String retailSizeID;

	private String retailSize;

	private String retailSizeGroupID;

	private String retailSizeGroup;

	private String commodityCode;

	public void setVariantID(int variantID) {
		this.variantID = variantID;
	}

	public int getVariantID() {
		return this.variantID;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}

	public String getVariantName() {
		return this.variantName;
	}

	public void setRetailSKUID(String retailSKUID) {
		this.retailSKUID = retailSKUID;
	}

	public String getRetailSKUID() {
		return this.retailSKUID;
	}

	public void setRetailVariantTitle(String retailVariantTitle) {
		this.retailVariantTitle = retailVariantTitle;
	}

	public String getRetailVariantTitle() {
		return this.retailVariantTitle;
	}

	public void setVariantStatus(String variantStatus) {
		this.variantStatus = variantStatus;
	}

	public String getVariantStatus() {
		return this.variantStatus;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime() {
		return this.lastUpdatedDateTime;
	}

	public void setDeletedDateTime(String deletedDateTime) {
		this.deletedDateTime = deletedDateTime;
	}

	public String getDeletedDateTime() {
		return this.deletedDateTime;
	}

	public void setSKUID(String SKUID) {
		this.SKUID = SKUID;
	}

	public String getSKUID() {
		return this.SKUID;
	}

	public void setLegacySKUID(int legacySKUID) {
		this.legacySKUID = legacySKUID;
	}

	public int getLegacySKUID() {
		return this.legacySKUID;
	}

	public void setSupplierRef(String supplierRef) {
		this.supplierRef = supplierRef;
	}

	public String getSupplierRef() {
		return this.supplierRef;
	}

	public void setLegacyWorkflowStatus(int legacyWorkflowStatus) {
		this.legacyWorkflowStatus = legacyWorkflowStatus;
	}

	public int getLegacyWorkflowStatus() {
		return this.legacyWorkflowStatus;
	}

	public void setEAN(String EAN) {
		this.EAN = EAN;
	}

	public String getEAN() {
		return this.EAN;
	}

	public void setSizeDescriptionID(int sizeDescriptionID) {
		this.sizeDescriptionID = sizeDescriptionID;
	}

	public int getSizeDescriptionID() {
		return this.sizeDescriptionID;
	}

	public void setSupplierSize(String supplierSize) {
		this.supplierSize = supplierSize;
	}

	public String getSupplierSize() {
		return this.supplierSize;
	}

	public void setBrandSizeID(int brandSizeID) {
		this.brandSizeID = brandSizeID;
	}

	public int getBrandSizeID() {
		return this.brandSizeID;
	}

	public void setBrandSize(String brandSize) {
		this.brandSize = brandSize;
	}

	public String getBrandSize() {
		return this.brandSize;
	}

	public void setRefinementSizeID(int refinementSizeID) {
		this.refinementSizeID = refinementSizeID;
	}

	public int getRefinementSizeID() {
		return this.refinementSizeID;
	}

	public void setRefinementSize(String refinementSize) {
		this.refinementSize = refinementSize;
	}

	public String getRefinementSize() {
		return this.refinementSize;
	}

	public void setSizeOrder(int sizeOrder) {
		this.sizeOrder = sizeOrder;
	}

	public int getSizeOrder() {
		return this.sizeOrder;
	}

	public void setProductManagementPublishedStatus(String productManagementPublishedStatus) {
		this.productManagementPublishedStatus = productManagementPublishedStatus;
	}

	public String getProductManagementPublishedStatus() {
		return this.productManagementPublishedStatus;
	}

	public void setVariantStoreData(List<VariantStoreData> variantStoreData) {
		this.variantStoreData = variantStoreData;
	}

	public List<VariantStoreData> getVariantStoreData() {
		return this.variantStoreData;
	}

	public void setVariantSizeID(int variantSizeID) {
		this.variantSizeID = variantSizeID;
	}

	public int getVariantSizeID() {
		return this.variantSizeID;
	}

	public void setRetailSizeID(String retailSizeID) {
		this.retailSizeID = retailSizeID;
	}

	public String getRetailSizeID() {
		return this.retailSizeID;
	}

	public void setRetailSize(String retailSize) {
		this.retailSize = retailSize;
	}

	public String getRetailSize() {
		return this.retailSize;
	}

	public void setRetailSizeGroupID(String retailSizeGroupID) {
		this.retailSizeGroupID = retailSizeGroupID;
	}

	public String getRetailSizeGroupID() {
		return this.retailSizeGroupID;
	}

	public void setRetailSizeGroup(String retailSizeGroup) {
		this.retailSizeGroup = retailSizeGroup;
	}

	public String getRetailSizeGroup() {
		return this.retailSizeGroup;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
}

class BuyTheLookGroup {
	private int productID;

	private int colourwayID;

	private int sequence;

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getProductID() {
		return this.productID;
	}

	public void setColourwayID(int colourwayID) {
		this.colourwayID = colourwayID;
	}

	public int getColourwayID() {
		return this.colourwayID;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getSequence() {
		return this.sequence;
	}
}

class Colourways {
	private int colourwayID;

	private String colourwayName;

	private boolean isPrimaryColourway;

	private String retailOptionID;

	private String retailColourwayTitle;

	private String customerColourwayTitle;

	private String legacyOptionID;

	private String colourwayStatus;

	private String createdDateTime;

	private String lastUpdatedDateTime;

	private String deletedDateTime;

	private String productManagementPublishedDate;

	private List<ColourwayAttributes> colourwayAttributes;

	private List<ColourwaySellingTags> colourwaySellingTags;

	private ProductionAsset productionAsset;

	private String retailColourID;

	private String supplierColour;

	private int refinementColourID;

	private String refinementColour;

	private String customerFriendlyColour;

	private String productManagementPublishedStatus;

	private List<Variants> variants;

	private String sampleStatus;

	private List<String> sampleSize;

	private boolean isStylingItem;

	private boolean isInWorkflow;

	private String countryOfManufacture;

	private String fabricComposition;

	private List<BuyTheLookGroup> buyTheLookGroup;

	private int modelID;

	private String modelName;

	private String modelLastUpdatedDate;

	private String modelTenureUsageDate;

	private String retailReportingColourID;

	private String retailReportingColour;

	public void setColourwayID(int colourwayID) {
		this.colourwayID = colourwayID;
	}

	public int getColourwayID() {
		return this.colourwayID;
	}

	public void setColourwayName(String colourwayName) {
		this.colourwayName = colourwayName;
	}

	public String getColourwayName() {
		return this.colourwayName;
	}

	public void setIsPrimaryColourway(boolean isPrimaryColourway) {
		this.isPrimaryColourway = isPrimaryColourway;
	}

	public boolean getIsPrimaryColourway() {
		return this.isPrimaryColourway;
	}

	public void setRetailOptionID(String retailOptionID) {
		this.retailOptionID = retailOptionID;
	}

	public String getRetailOptionID() {
		return this.retailOptionID;
	}

	public void setRetailColourwayTitle(String retailColourwayTitle) {
		this.retailColourwayTitle = retailColourwayTitle;
	}

	public String getRetailColourwayTitle() {
		return this.retailColourwayTitle;
	}

	public void setCustomerColourwayTitle(String customerColourwayTitle) {
		this.customerColourwayTitle = customerColourwayTitle;
	}

	public String getCustomerColourwayTitle() {
		return this.customerColourwayTitle;
	}

	public void setLegacyOptionID(String legacyOptionID) {
		this.legacyOptionID = legacyOptionID;
	}

	public String getLegacyOptionID() {
		return this.legacyOptionID;
	}

	public void setColourwayStatus(String colourwayStatus) {
		this.colourwayStatus = colourwayStatus;
	}

	public String getColourwayStatus() {
		return this.colourwayStatus;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime() {
		return this.lastUpdatedDateTime;
	}

	public void setDeletedDateTime(String deletedDateTime) {
		this.deletedDateTime = deletedDateTime;
	}

	public String getDeletedDateTime() {
		return this.deletedDateTime;
	}

	public void setProductManagementPublishedDate(String productManagementPublishedDate) {
		this.productManagementPublishedDate = productManagementPublishedDate;
	}

	public String getProductManagementPublishedDate() {
		return this.productManagementPublishedDate;
	}

	public void setColourwayAttributes(List<ColourwayAttributes> colourwayAttributes) {
		this.colourwayAttributes = colourwayAttributes;
	}

	public List<ColourwayAttributes> getColourwayAttributes() {
		return this.colourwayAttributes;
	}

	public void setColourwaySellingTags(List<ColourwaySellingTags> colourwaySellingTags) {
		this.colourwaySellingTags = colourwaySellingTags;
	}

	public List<ColourwaySellingTags> getColourwaySellingTags() {
		return this.colourwaySellingTags;
	}

	public void setProductionAsset(ProductionAsset productionAsset) {
		this.productionAsset = productionAsset;
	}

	public ProductionAsset getProductionAsset() {
		return this.productionAsset;
	}

	public void setRetailColourID(String retailColourID) {
		this.retailColourID = retailColourID;
	}

	public String getRetailColourID() {
		return this.retailColourID;
	}

	public void setSupplierColour(String supplierColour) {
		this.supplierColour = supplierColour;
	}

	public String getSupplierColour() {
		return this.supplierColour;
	}

	public void setRefinementColourID(int refinementColourID) {
		this.refinementColourID = refinementColourID;
	}

	public int getRefinementColourID() {
		return this.refinementColourID;
	}

	public void setRefinementColour(String refinementColour) {
		this.refinementColour = refinementColour;
	}

	public String getRefinementColour() {
		return this.refinementColour;
	}

	public void setCustomerFriendlyColour(String customerFriendlyColour) {
		this.customerFriendlyColour = customerFriendlyColour;
	}

	public String getCustomerFriendlyColour() {
		return this.customerFriendlyColour;
	}

	public void setProductManagementPublishedStatus(String productManagementPublishedStatus) {
		this.productManagementPublishedStatus = productManagementPublishedStatus;
	}

	public String getProductManagementPublishedStatus() {
		return this.productManagementPublishedStatus;
	}

	public void setVariants(List<Variants> variants) {
		this.variants = variants;
	}

	public List<Variants> getVariants() {
		return this.variants;
	}

	public void setSampleStatus(String sampleStatus) {
		this.sampleStatus = sampleStatus;
	}

	public String getSampleStatus() {
		return this.sampleStatus;
	}

	public void setSampleSize(List<String> sampleSize) {
		this.sampleSize = sampleSize;
	}

	public List<String> getSampleSize() {
		return this.sampleSize;
	}

	public void setIsStylingItem(boolean isStylingItem) {
		this.isStylingItem = isStylingItem;
	}

	public boolean getIsStylingItem() {
		return this.isStylingItem;
	}

	public void setIsInWorkflow(boolean isInWorkflow) {
		this.isInWorkflow = isInWorkflow;
	}

	public boolean getIsInWorkflow() {
		return this.isInWorkflow;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public String getCountryOfManufacture() {
		return this.countryOfManufacture;
	}

	public void setFabricComposition(String fabricComposition) {
		this.fabricComposition = fabricComposition;
	}

	public String getFabricComposition() {
		return this.fabricComposition;
	}

	public void setBuyTheLookGroup(List<BuyTheLookGroup> buyTheLookGroup) {
		this.buyTheLookGroup = buyTheLookGroup;
	}

	public List<BuyTheLookGroup> getBuyTheLookGroup() {
		return this.buyTheLookGroup;
	}

	public void setModelID(int modelID) {
		this.modelID = modelID;
	}

	public int getModelID() {
		return this.modelID;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelLastUpdatedDate(String modelLastUpdatedDate) {
		this.modelLastUpdatedDate = modelLastUpdatedDate;
	}

	public String getModelLastUpdatedDate() {
		return this.modelLastUpdatedDate;
	}

	public void setModelTenureUsageDate(String modelTenureUsageDate) {
		this.modelTenureUsageDate = modelTenureUsageDate;
	}

	public String getModelTenureUsageDate() {
		return this.modelTenureUsageDate;
	}

	public void setRetailReportingColourID(String retailReportingColourID) {
		this.retailReportingColourID = retailReportingColourID;
	}

	public String getRetailReportingColourID() {
		return this.retailReportingColourID;
	}

	public void setRetailReportingColour(String retailReportingColour) {
		this.retailReportingColour = retailReportingColour;
	}

	public String getRetailReportingColour() {
		return this.retailReportingColour;
	}
}

class RetailHierarchy {
	private int legacyDepartmentID;

	private String legacyDepartmentName;

	private int legacyDivisionID;

	private String legacyDivision;

	private int legacyCategoryID;

	private String legacyCategoryName;

	private int retailDepartmentID;

	private String retailDepartmentName;

	private int retailClassID;

	private String retailClassName;

	private int retailSubClassID;

	private String retailSubClassName;

	private int retailGroupID;

	private String retailGroupName;

	private int retailProductGroupID;

	private String retailProductGroupName;

	private int retailBuyingSubGroupID;

	private String retailBuyingSubGroup;

	public void setLegacyDepartmentID(int legacyDepartmentID) {
		this.legacyDepartmentID = legacyDepartmentID;
	}

	public int getLegacyDepartmentID() {
		return this.legacyDepartmentID;
	}

	public void setLegacyDepartmentName(String legacyDepartmentName) {
		this.legacyDepartmentName = legacyDepartmentName;
	}

	public String getLegacyDepartmentName() {
		return this.legacyDepartmentName;
	}

	public void setLegacyDivisionID(int legacyDivisionID) {
		this.legacyDivisionID = legacyDivisionID;
	}

	public int getLegacyDivisionID() {
		return this.legacyDivisionID;
	}

	public void setLegacyDivision(String legacyDivision) {
		this.legacyDivision = legacyDivision;
	}

	public String getLegacyDivision() {
		return this.legacyDivision;
	}

	public void setLegacyCategoryID(int legacyCategoryID) {
		this.legacyCategoryID = legacyCategoryID;
	}

	public int getLegacyCategoryID() {
		return this.legacyCategoryID;
	}

	public void setLegacyCategoryName(String legacyCategoryName) {
		this.legacyCategoryName = legacyCategoryName;
	}

	public String getLegacyCategoryName() {
		return this.legacyCategoryName;
	}

	public void setRetailDepartmentID(int retailDepartmentID) {
		this.retailDepartmentID = retailDepartmentID;
	}

	public int getRetailDepartmentID() {
		return this.retailDepartmentID;
	}

	public void setRetailDepartmentName(String retailDepartmentName) {
		this.retailDepartmentName = retailDepartmentName;
	}

	public String getRetailDepartmentName() {
		return this.retailDepartmentName;
	}

	public void setRetailClassID(int retailClassID) {
		this.retailClassID = retailClassID;
	}

	public int getRetailClassID() {
		return this.retailClassID;
	}

	public void setRetailClassName(String retailClassName) {
		this.retailClassName = retailClassName;
	}

	public String getRetailClassName() {
		return this.retailClassName;
	}

	public void setRetailSubClassID(int retailSubClassID) {
		this.retailSubClassID = retailSubClassID;
	}

	public int getRetailSubClassID() {
		return this.retailSubClassID;
	}

	public void setRetailSubClassName(String retailSubClassName) {
		this.retailSubClassName = retailSubClassName;
	}

	public String getRetailSubClassName() {
		return this.retailSubClassName;
	}

	public void setRetailGroupID(int retailGroupID) {
		this.retailGroupID = retailGroupID;
	}

	public int getRetailGroupID() {
		return this.retailGroupID;
	}

	public void setRetailGroupName(String retailGroupName) {
		this.retailGroupName = retailGroupName;
	}

	public String getRetailGroupName() {
		return this.retailGroupName;
	}

	public void setRetailProductGroupID(int retailProductGroupID) {
		this.retailProductGroupID = retailProductGroupID;
	}

	public int getRetailProductGroupID() {
		return this.retailProductGroupID;
	}

	public void setRetailProductGroupName(String retailProductGroupName) {
		this.retailProductGroupName = retailProductGroupName;
	}

	public String getRetailProductGroupName() {
		return this.retailProductGroupName;
	}

	public void setRetailBuyingSubGroupID(int retailBuyingSubGroupID) {
		this.retailBuyingSubGroupID = retailBuyingSubGroupID;
	}

	public int getRetailBuyingSubGroupID() {
		return this.retailBuyingSubGroupID;
	}

	public void setRetailBuyingSubGroup(String retailBuyingSubGroup) {
		this.retailBuyingSubGroup = retailBuyingSubGroup;
	}

	public String getRetailBuyingSubGroup() {
		return this.retailBuyingSubGroup;
	}
}

class ProductType {
	private int productTypeID;

	private String productTypeName;

	public void setProductTypeID(int productTypeID) {
		this.productTypeID = productTypeID;
	}

	public int getProductTypeID() {
		return this.productTypeID;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getProductTypeName() {
		return this.productTypeName;
	}
}

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

class Root {
	private int productID;

	private int legacyRestrictionID;

	private String createdDateTime;

	private String productManagementGender;

	private String productManagementFitInfo;

	private String productDetails;

	private String productName;

	private int legacyStyleID;

	private String productManagementLastUpdatedTS;

	private String fabricConstruction;

	private int legacyMixMatchID;

	private Brand brand;

	private String productManagementPublishedDate;

	private boolean isInWorkflow;

	private List<String> facetGender;

	private List<Integer> webCategoryID;

	private String retailProductComposition;

	private int legacyBuyTheLookID;

	private String customerProductTitle;

	private List<Colourways> colourways;

	private RetailHierarchy retailHierarchy;

	private String sizeAndFit;

	private String productManagementComposition;

	private String PDPLayout;

	private String lookAfterMe;

	private String deletedDateTime;

	private List<String> sampleSize;

	private String aboutMe;

	private boolean isExclusive;

	private List<String> supportedLanguages;

	private String retailProductTitle;

	private String retailGender;

	private boolean isGift;

	private boolean isHazmat;

	private ProductType productType;

	private List<String> countryRestriction;

	private List<ProductAttributes> productAttributes;

	private String merchandisingSeason;

	private String productStatus;

	private int retailBusinessModelID;

	private String retailStyleID;

	private String retailBusinessModel;

	private boolean isReturnable;

	private String productCode;

	private String productionStyling;

	private String productLanguage;

	private String productManagementPublishedStatus;

	private String lastUpdatedDateTime;

	private String packingFormat;

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getProductID() {
		return this.productID;
	}

	public void setLegacyRestrictionID(int legacyRestrictionID) {
		this.legacyRestrictionID = legacyRestrictionID;
	}

	public int getLegacyRestrictionID() {
		return this.legacyRestrictionID;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setProductManagementGender(String productManagementGender) {
		this.productManagementGender = productManagementGender;
	}

	public String getProductManagementGender() {
		return this.productManagementGender;
	}

	public void setProductManagementFitInfo(String productManagementFitInfo) {
		this.productManagementFitInfo = productManagementFitInfo;
	}

	public String getProductManagementFitInfo() {
		return this.productManagementFitInfo;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductDetails() {
		return this.productDetails;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setLegacyStyleID(int legacyStyleID) {
		this.legacyStyleID = legacyStyleID;
	}

	public int getLegacyStyleID() {
		return this.legacyStyleID;
	}

	public void setProductManagementLastUpdatedTS(String productManagementLastUpdatedTS) {
		this.productManagementLastUpdatedTS = productManagementLastUpdatedTS;
	}

	public String getProductManagementLastUpdatedTS() {
		return this.productManagementLastUpdatedTS;
	}

	public void setFabricConstruction(String fabricConstruction) {
		this.fabricConstruction = fabricConstruction;
	}

	public String getFabricConstruction() {
		return this.fabricConstruction;
	}

	public void setLegacyMixMatchID(int legacyMixMatchID) {
		this.legacyMixMatchID = legacyMixMatchID;
	}

	public int getLegacyMixMatchID() {
		return this.legacyMixMatchID;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setProductManagementPublishedDate(String productManagementPublishedDate) {
		this.productManagementPublishedDate = productManagementPublishedDate;
	}

	public String getProductManagementPublishedDate() {
		return this.productManagementPublishedDate;
	}

	public void setIsInWorkflow(boolean isInWorkflow) {
		this.isInWorkflow = isInWorkflow;
	}

	public boolean getIsInWorkflow() {
		return this.isInWorkflow;
	}

	public void setFacetGender(List<String> facetGender) {
		this.facetGender = facetGender;
	}

	public List<String> getFacetGender() {
		return this.facetGender;
	}

	public void setWebCategoryID(List<Integer> webCategoryID) {
		this.webCategoryID = webCategoryID;
	}

	public List<Integer> getWebCategoryID() {
		return this.webCategoryID;
	}

	public void setRetailProductComposition(String retailProductComposition) {
		this.retailProductComposition = retailProductComposition;
	}

	public String getRetailProductComposition() {
		return this.retailProductComposition;
	}

	public void setLegacyBuyTheLookID(int legacyBuyTheLookID) {
		this.legacyBuyTheLookID = legacyBuyTheLookID;
	}

	public int getLegacyBuyTheLookID() {
		return this.legacyBuyTheLookID;
	}

	public void setCustomerProductTitle(String customerProductTitle) {
		this.customerProductTitle = customerProductTitle;
	}

	public String getCustomerProductTitle() {
		return this.customerProductTitle;
	}

	public void setColourways(List<Colourways> colourways) {
		this.colourways = colourways;
	}

	public List<Colourways> getColourways() {
		return this.colourways;
	}

	public void setRetailHierarchy(RetailHierarchy retailHierarchy) {
		this.retailHierarchy = retailHierarchy;
	}

	public RetailHierarchy getRetailHierarchy() {
		return this.retailHierarchy;
	}

	public void setSizeAndFit(String sizeAndFit) {
		this.sizeAndFit = sizeAndFit;
	}

	public String getSizeAndFit() {
		return this.sizeAndFit;
	}

	public void setProductManagementComposition(String productManagementComposition) {
		this.productManagementComposition = productManagementComposition;
	}

	public String getProductManagementComposition() {
		return this.productManagementComposition;
	}

	public void setPDPLayout(String PDPLayout) {
		this.PDPLayout = PDPLayout;
	}

	public String getPDPLayout() {
		return this.PDPLayout;
	}

	public void setLookAfterMe(String lookAfterMe) {
		this.lookAfterMe = lookAfterMe;
	}

	public String getLookAfterMe() {
		return this.lookAfterMe;
	}

	public void setDeletedDateTime(String deletedDateTime) {
		this.deletedDateTime = deletedDateTime;
	}

	public String getDeletedDateTime() {
		return this.deletedDateTime;
	}

	public void setSampleSize(List<String> sampleSize) {
		this.sampleSize = sampleSize;
	}

	public List<String> getSampleSize() {
		return this.sampleSize;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getAboutMe() {
		return this.aboutMe;
	}

	public void setIsExclusive(boolean isExclusive) {
		this.isExclusive = isExclusive;
	}

	public boolean getIsExclusive() {
		return this.isExclusive;
	}

	public void setSupportedLanguages(List<String> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}

	public List<String> getSupportedLanguages() {
		return this.supportedLanguages;
	}

	public void setRetailProductTitle(String retailProductTitle) {
		this.retailProductTitle = retailProductTitle;
	}

	public String getRetailProductTitle() {
		return this.retailProductTitle;
	}

	public void setRetailGender(String retailGender) {
		this.retailGender = retailGender;
	}

	public String getRetailGender() {
		return this.retailGender;
	}

	public void setIsGift(boolean isGift) {
		this.isGift = isGift;
	}

	public boolean getIsGift() {
		return this.isGift;
	}

	public void setIsHazmat(boolean isHazmat) {
		this.isHazmat = isHazmat;
	}

	public boolean getIsHazmat() {
		return this.isHazmat;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setCountryRestriction(List<String> countryRestriction) {
		this.countryRestriction = countryRestriction;
	}

	public List<String> getCountryRestriction() {
		return this.countryRestriction;
	}

	public void setProductAttributes(List<ProductAttributes> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public List<ProductAttributes> getProductAttributes() {
		return this.productAttributes;
	}

	public void setMerchandisingSeason(String merchandisingSeason) {
		this.merchandisingSeason = merchandisingSeason;
	}

	public String getMerchandisingSeason() {
		return this.merchandisingSeason;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setRetailBusinessModelID(int retailBusinessModelID) {
		this.retailBusinessModelID = retailBusinessModelID;
	}

	public int getRetailBusinessModelID() {
		return this.retailBusinessModelID;
	}

	public void setRetailStyleID(String retailStyleID) {
		this.retailStyleID = retailStyleID;
	}

	public String getRetailStyleID() {
		return this.retailStyleID;
	}

	public void setRetailBusinessModel(String retailBusinessModel) {
		this.retailBusinessModel = retailBusinessModel;
	}

	public String getRetailBusinessModel() {
		return this.retailBusinessModel;
	}

	public void setIsReturnable(boolean isReturnable) {
		this.isReturnable = isReturnable;
	}

	public boolean getIsReturnable() {
		return this.isReturnable;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductionStyling(String productionStyling) {
		this.productionStyling = productionStyling;
	}

	public String getProductionStyling() {
		return this.productionStyling;
	}

	public void setProductLanguage(String productLanguage) {
		this.productLanguage = productLanguage;
	}

	public String getProductLanguage() {
		return this.productLanguage;
	}

	public void setProductManagementPublishedStatus(String productManagementPublishedStatus) {
		this.productManagementPublishedStatus = productManagementPublishedStatus;
	}

	public String getProductManagementPublishedStatus() {
		return this.productManagementPublishedStatus;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime() {
		return this.lastUpdatedDateTime;
	}

	public void setPackingFormat(String packingFormat) {
		this.packingFormat = packingFormat;
	}

	public String getPackingFormat() {
		return this.packingFormat;
	}
}
*/