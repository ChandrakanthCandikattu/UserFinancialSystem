package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT")
	@SequenceGenerator(allocationSize = 50, name = "SEQ_PRODUCT", sequenceName = "SEQ_PRODUCT")
	@Column(name = "SEQ_PRODUCT")
	private String seqProduct;
	@Column(name = "PRODUCT_ID", nullable = true)
	private String qrBarcodeNumber;
	@Column(name = "V_REGISTERED_NUMBER", nullable = true)
	private String vRegNumber;
	@Column(name = "BANK_AC_NUM")
	private String bankAccNumber;
	@Column(name = "ELECTRONIC_CRD_NUM")
	private String electronicCardNumber;
	@Column(name = "WARRANTY_DOC_ID", columnDefinition = "Defaults to 'NA' in DB")
	private String warrantyDocId;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "Defaults to 'Y' in DB")
	private String activeStatus;
	@Column(name = "IS_VEHICLE", columnDefinition = "Defaults to 'N' in DB")
	private String isVehicle;
	@Column(name = "WARRANTY_MODE")
	private String warrantyMode;
	@Column(name = "WARRANTY_HOLDER_NAME")
	private String warrantyHolderName;
	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productName;
	@Column(name = "PRODUCT_DESCRIPTION", columnDefinition = "Defaults to 'NO INFO' in DB")
	private String productDescription;
	@Column(name = "PURCHASE_MODE", nullable = false)
	private String purchaseMode;
	@Column(name = "PRODUCT_STATE", columnDefinition = "Defaults to 'NEW' in DB")
	private String productState;
	@Column(name = "PRODUCT_PRICE")
	private Double productPrice;
	@Column(name = "PURCHASE_MERCHANT")
	private String purchaseMerchant;
	@Column(name = "MERCHANT_TYPE", columnDefinition = "Defaults to 'Retailer' in DB")
	private String merchantType;
	@Column(name = "MERCHANT_CONTACT")
	private String merchantContact;
	@Column(name = "MERCHANT_EMAIL", columnDefinition = "Defaults to 'NO INFO' in DB")
	private String merchantEmail;
	@Column(name = "PURCHASE_DATE")
	private String purchaseDate;
	@Column(name = "WARRANTY_EXP_DATE")
	private String warrantyExpiryDate;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	// TODO: BUILD ASSOCIATED RELATIONS WITH ELECTRONIC_CARDS, BANK_ACC,
	// VEHICLE_DETAILS WARRANTY_PRODUCTS

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "BANK_AC_NUM_DETAILS", joinColumns = {
			@JoinColumn(name = "AC_NUMBER" /* ,referencedColumnName = "AC_NUMBER" */) } /*
																						 * , inverseJoinColumns = {
																						 * 
																						 * @JoinColumn(name =
																						 * "AC_NUMBER"
																						 * ,referencedColumnName =
																						 * "AC_NUMBER" ) }
																						 */)
	private BankAccountDetails bankAccNumDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "ELECTRONIC_CARD_NUM_DETAILS", joinColumns = {
			@JoinColumn(name = "CARD_NUMBER" /* , referencedColumnName = "CARD_NUMBER" */) }
	/*
	 * , inverseJoinColumns = {@JoinColumn(name = "CARD_NUMBER" ,
	 * referencedColumnName = "CARD_NUMBER") }
	 */
	)
	private ElectronicCardDetails electronicCardDetails;

	@OneToOne
	@JoinColumn(name = "V_REGISTRATION_NUM" /* , referencedColumnName="V_REGISTRATION_NUM" */)
	private VehicleDetails vehicleDetails;

	@OneToOne
	@JoinColumn(name = "QR_BARCODE" /* , referencedColumnName = "QR_BARCODE" */)
	private QRBarCode qrBarCode;

	public String getSeqProduct() {
		return seqProduct;
	}

	public void setSeqProduct(String seqProduct) {
		this.seqProduct = seqProduct;
	}

	public BankAccountDetails getBankAccNumDetails() {
		return bankAccNumDetails;
	}

	public void setBankAccNumDetails(BankAccountDetails bankAccNumDetails) {
		this.bankAccNumDetails = bankAccNumDetails;
	}

	public ElectronicCardDetails getElectronicCardDetails() {
		return electronicCardDetails;
	}

	public void setElectronicCardDetails(ElectronicCardDetails electronicCardDetails) {
		this.electronicCardDetails = electronicCardDetails;
	}

	public String getQR_BARCODE_NUM() {
		return qrBarcodeNumber;
	}

	public void setQR_BARCODE_NUM(String qR_BARCODE_NUM) {
		qrBarcodeNumber = qR_BARCODE_NUM;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getPurchaseMode() {
		return purchaseMode;
	}

	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getPurchaseMerchant() {
		return purchaseMerchant;
	}

	public void setPurchaseMerchant(String purchaseMerchant) {
		this.purchaseMerchant = purchaseMerchant;
	}

	public String getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getWarrantyExpiryDate() {
		return warrantyExpiryDate;
	}

	public void setWarrantyExpiryDate(String warrantyExpiryDate) {
		this.warrantyExpiryDate = warrantyExpiryDate;
	}

	public String getSeqWarrantyPrd() {
		return seqProduct;
	}

	public void setSeqWarrantyPrd(String seqWarrantyPrd) {
		this.seqProduct = seqWarrantyPrd;
	}

	public String getQrBarcodeNumber() {
		return qrBarcodeNumber;
	}

	public void setQrBarcodeNumber(String qrBarcodeNumber) {
		this.qrBarcodeNumber = qrBarcodeNumber;
	}

	public String getvRegNumber() {
		return vRegNumber;
	}

	public void setvRegNumber(String vRegNumber) {
		this.vRegNumber = vRegNumber;
	}

	public String getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public String getElectronicCardNumber() {
		return electronicCardNumber;
	}

	public void setElectronicCardNumber(String electronicCardNumber) {
		this.electronicCardNumber = electronicCardNumber;
	}

	public String getWarrantyDocId() {
		return warrantyDocId;
	}

	public void setWarrantyDocId(String warrantyDocId) {
		this.warrantyDocId = warrantyDocId;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getIsVehicle() {
		return isVehicle;
	}

	public void setIsVehicle(String isVehicle) {
		this.isVehicle = isVehicle;
	}

	public String getWarrantyMode() {
		return warrantyMode;
	}

	public void setWarrantyMode(String warrantyMode) {
		this.warrantyMode = warrantyMode;
	}

	public String getWarrantyHolderName() {
		return warrantyHolderName;
	}

	public void setWarrantyHolderName(String warrantyHolderName) {
		this.warrantyHolderName = warrantyHolderName;
	}

	public String getProductState() {
		return productState;
	}

	public void setProductState(String productState) {
		this.productState = productState;
	}

	public String getMerchantContact() {
		return merchantContact;
	}

	public void setMerchantContact(String merchantContact) {
		this.merchantContact = merchantContact;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public QRBarCode getQrBarCode() {
		return qrBarCode;
	}

	public void setQrBarCode(QRBarCode qrBarCode) {
		this.qrBarCode = qrBarCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqProduct == null) ? 0 : seqProduct.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ProductDetails))
			return false;
		ProductDetails other = (ProductDetails) obj;
		if (seqProduct == null) {
			if (other.seqProduct != null)
				return false;
		} else if (!seqProduct.equals(other.seqProduct))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
