package com.utils;

import java.util.List;
import javax.annotation.Generated;
import java.util.Collections;

public class ProductRoot {
	private int productID;

	private int legacyRestrictionID;

	private String createdDateTime;

	private String productManagementGender;

	private String productManagementFitInfo;

	private String productDetails;

	private String productName= "Adidas";

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

	//@Generated("SparkTools")
	private ProductRoot(Builder builder) {
		this.productID = builder.productID;
		this.legacyRestrictionID = builder.legacyRestrictionID;
		this.createdDateTime = builder.createdDateTime;
		this.productManagementGender = builder.productManagementGender;
		this.productManagementFitInfo = builder.productManagementFitInfo;
		this.productDetails = builder.productDetails;
		this.productName = builder.productName;
		this.legacyStyleID = builder.legacyStyleID;
		this.productManagementLastUpdatedTS = builder.productManagementLastUpdatedTS;
		this.fabricConstruction = builder.fabricConstruction;
		this.legacyMixMatchID = builder.legacyMixMatchID;
		this.brand = builder.brand;
		this.productManagementPublishedDate = builder.productManagementPublishedDate;
		this.isInWorkflow = builder.isInWorkflow;
		this.facetGender = builder.facetGender;
		this.webCategoryID = builder.webCategoryID;
		this.retailProductComposition = builder.retailProductComposition;
		this.legacyBuyTheLookID = builder.legacyBuyTheLookID;
		this.customerProductTitle = builder.customerProductTitle;
		this.colourways = builder.colourways;
		this.retailHierarchy = builder.retailHierarchy;
		this.sizeAndFit = builder.sizeAndFit;
		this.productManagementComposition = builder.productManagementComposition;
		this.PDPLayout = builder.PDPLayout;
		this.lookAfterMe = builder.lookAfterMe;
		this.deletedDateTime = builder.deletedDateTime;
		this.sampleSize = builder.sampleSize;
		this.aboutMe = builder.aboutMe;
		this.isExclusive = builder.isExclusive;
		this.supportedLanguages = builder.supportedLanguages;
		this.retailProductTitle = builder.retailProductTitle;
		this.retailGender = builder.retailGender;
		this.isGift = builder.isGift;
		this.isHazmat = builder.isHazmat;
		this.productType = builder.productType;
		this.countryRestriction = builder.countryRestriction;
		this.productAttributes = builder.productAttributes;
		this.merchandisingSeason = builder.merchandisingSeason;
		this.productStatus = builder.productStatus;
		this.retailBusinessModelID = builder.retailBusinessModelID;
		this.retailStyleID = builder.retailStyleID;
		this.retailBusinessModel = builder.retailBusinessModel;
		this.isReturnable = builder.isReturnable;
		this.productCode = builder.productCode;
		this.productionStyling = builder.productionStyling;
		this.productLanguage = builder.productLanguage;
		this.productManagementPublishedStatus = builder.productManagementPublishedStatus;
		this.lastUpdatedDateTime = builder.lastUpdatedDateTime;
		this.packingFormat = builder.packingFormat;
	}

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

	/**
	 * Creates builder to build {@link ProductRoot}.
	 * @return created builder
	 */
	//@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ProductRoot}.
	 */
	//@Generated("SparkTools")
	public static class Builder {
		private int productID=9999999;
		private int legacyRestrictionID=9999999;
		private String createdDateTime="";
		private String productManagementGender;
		private String productManagementFitInfo;
		private String productDetails;
		private String productName;
		private int legacyStyleID=9999999;
		private String productManagementLastUpdatedTS;
		private String fabricConstruction;
		private int legacyMixMatchID=9999999;
		private Brand brand;
		private String productManagementPublishedDate;
		private boolean isInWorkflow;
		private List<String> facetGender = Collections.emptyList();
		private List<Integer> webCategoryID = Collections.emptyList();
		private String retailProductComposition;
		private int legacyBuyTheLookID;
		private String customerProductTitle;
		private List<Colourways> colourways = Collections.emptyList();
		private RetailHierarchy retailHierarchy;
		private String sizeAndFit;
		private String productManagementComposition;
		private String PDPLayout;
		private String lookAfterMe;
		private String deletedDateTime;
		private List<String> sampleSize = Collections.emptyList();
		private String aboutMe;
		private boolean isExclusive;
		private List<String> supportedLanguages = Collections.emptyList();
		private String retailProductTitle;
		private String retailGender;
		private boolean isGift;
		private boolean isHazmat;
		private ProductType productType;
		private List<String> countryRestriction = Collections.emptyList();
		private List<ProductAttributes> productAttributes = Collections.emptyList();
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

		Builder() {
		}

		public Builder withProductID(int productID) {
			this.productID = productID;
			return this;
		}

		public Builder withLegacyRestrictionID(int legacyRestrictionID) {
			this.legacyRestrictionID = legacyRestrictionID;
			return this;
		}

		public Builder withCreatedDateTime(String createdDateTime) {
			this.createdDateTime = createdDateTime;
			return this;
		}

		public Builder withProductManagementGender(String productManagementGender) {
			this.productManagementGender = productManagementGender;
			return this;
		}

		public Builder withProductManagementFitInfo(String productManagementFitInfo) {
			this.productManagementFitInfo = productManagementFitInfo;
			return this;
		}

		public Builder withProductDetails(String productDetails) {
			this.productDetails = productDetails;
			return this;
		}

		public Builder withProductName(String productName) {
			this.productName = productName;
			return this;
		}

		public Builder withLegacyStyleID(int legacyStyleID) {
			this.legacyStyleID = legacyStyleID;
			return this;
		}

		public Builder withProductManagementLastUpdatedTS(String productManagementLastUpdatedTS) {
			this.productManagementLastUpdatedTS = productManagementLastUpdatedTS;
			return this;
		}

		public Builder withFabricConstruction(String fabricConstruction) {
			this.fabricConstruction = fabricConstruction;
			return this;
		}

		public Builder withLegacyMixMatchID(int legacyMixMatchID) {
			this.legacyMixMatchID = legacyMixMatchID;
			return this;
		}

		public Builder withBrand(Brand brand) {
			this.brand = brand;
			return this;
		}

		public Builder withProductManagementPublishedDate(String productManagementPublishedDate) {
			this.productManagementPublishedDate = productManagementPublishedDate;
			return this;
		}

		public Builder withIsInWorkflow(boolean isInWorkflow) {
			this.isInWorkflow = isInWorkflow;
			return this;
		}

		public Builder withFacetGender(List<String> facetGender) {
			this.facetGender = facetGender;
			return this;
		}

		public Builder withWebCategoryID(List<Integer> webCategoryID) {
			this.webCategoryID = webCategoryID;
			return this;
		}

		public Builder withRetailProductComposition(String retailProductComposition) {
			this.retailProductComposition = retailProductComposition;
			return this;
		}

		public Builder withLegacyBuyTheLookID(int legacyBuyTheLookID) {
			this.legacyBuyTheLookID = legacyBuyTheLookID;
			return this;
		}

		public Builder withCustomerProductTitle(String customerProductTitle) {
			this.customerProductTitle = customerProductTitle;
			return this;
		}

		public Builder withColourways(List<Colourways> colourways) {
			this.colourways = colourways;
			return this;
		}

		public Builder withRetailHierarchy(RetailHierarchy retailHierarchy) {
			this.retailHierarchy = retailHierarchy;
			return this;
		}

		public Builder withSizeAndFit(String sizeAndFit) {
			this.sizeAndFit = sizeAndFit;
			return this;
		}

		public Builder withProductManagementComposition(String productManagementComposition) {
			this.productManagementComposition = productManagementComposition;
			return this;
		}

		public Builder withPDPLayout(String PDPLayout) {
			this.PDPLayout = PDPLayout;
			return this;
		}

		public Builder withLookAfterMe(String lookAfterMe) {
			this.lookAfterMe = lookAfterMe;
			return this;
		}

		public Builder withDeletedDateTime(String deletedDateTime) {
			this.deletedDateTime = deletedDateTime;
			return this;
		}

		public Builder withSampleSize(List<String> sampleSize) {
			this.sampleSize = sampleSize;
			return this;
		}

		public Builder withAboutMe(String aboutMe) {
			this.aboutMe = aboutMe;
			return this;
		}

		public Builder withIsExclusive(boolean isExclusive) {
			this.isExclusive = isExclusive;
			return this;
		}

		public Builder withSupportedLanguages(List<String> supportedLanguages) {
			this.supportedLanguages = supportedLanguages;
			return this;
		}

		public Builder withRetailProductTitle(String retailProductTitle) {
			this.retailProductTitle = retailProductTitle;
			return this;
		}

		public Builder withRetailGender(String retailGender) {
			this.retailGender = retailGender;
			return this;
		}

		public Builder withIsGift(boolean isGift) {
			this.isGift = isGift;
			return this;
		}

		public Builder withIsHazmat(boolean isHazmat) {
			this.isHazmat = isHazmat;
			return this;
		}

		public Builder withProductType(ProductType productType) {
			this.productType = productType;
			return this;
		}

		public Builder withCountryRestriction(List<String> countryRestriction) {
			this.countryRestriction = countryRestriction;
			return this;
		}

		public Builder withProductAttributes(List<ProductAttributes> productAttributes) {
			this.productAttributes = productAttributes;
			return this;
		}

		public Builder withMerchandisingSeason(String merchandisingSeason) {
			this.merchandisingSeason = merchandisingSeason;
			return this;
		}

		public Builder withProductStatus(String productStatus) {
			this.productStatus = productStatus;
			return this;
		}

		public Builder withRetailBusinessModelID(int retailBusinessModelID) {
			this.retailBusinessModelID = retailBusinessModelID;
			return this;
		}

		public Builder withRetailStyleID(String retailStyleID) {
			this.retailStyleID = retailStyleID;
			return this;
		}

		public Builder withRetailBusinessModel(String retailBusinessModel) {
			this.retailBusinessModel = retailBusinessModel;
			return this;
		}

		public Builder withIsReturnable(boolean isReturnable) {
			this.isReturnable = isReturnable;
			return this;
		}

		public Builder withProductCode(String productCode) {
			this.productCode = productCode;
			return this;
		}

		public Builder withProductionStyling(String productionStyling) {
			this.productionStyling = productionStyling;
			return this;
		}

		public Builder withProductLanguage(String productLanguage) {
			this.productLanguage = productLanguage;
			return this;
		}

		public Builder withProductManagementPublishedStatus(String productManagementPublishedStatus) {
			this.productManagementPublishedStatus = productManagementPublishedStatus;
			return this;
		}

		public Builder withLastUpdatedDateTime(String lastUpdatedDateTime) {
			this.lastUpdatedDateTime = lastUpdatedDateTime;
			return this;
		}

		public Builder withPackingFormat(String packingFormat) {
			this.packingFormat = packingFormat;
			return this;
		}

		public ProductRoot build() {
			return new ProductRoot(this);
		}
	}
}
