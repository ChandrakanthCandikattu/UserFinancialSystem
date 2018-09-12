package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "EMI_DETAILS")
public class EmiDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "SEQ_EMI_ID", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_EMI_ID", sequenceName = "SEQ_EMI_ID", allocationSize = 50)
	@Column(name = "SEQ_EMI_ID")
	private String seqEmiId;
	@Column(name = "PRODUCT_ID")
	private String productId;
	@Column(name = "VEHICLE_REG_NUMBER")
	private String vehicleRegNumber;
	@Column(name = "ECARD_NUM")
	private String ecardNumber;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "Defaulted to 'Y' in DB")
	private String activeStatus;
	@Column(name = "PRODUCT_PRICE")
	private String productPrice;
	@Column(name = "EMI_PROVIDER")
	private String emiProvider;
	@Column(name = "EMI_START_DATE")
	private String emiStartDate;
	@Column(name = "EMI_END_DATE")
	private String emiEndDate;
	@Column(name = "EMI_INTEREST_RATE")
	private Double emiInterestRate;
	@Column(name = "EMI_AMOUNT")
	private Double emiAmount;
	@Column(name = "EMI_INSTL_COUNT")
	private Byte emiInstalmentCount;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	@OneToOne(cascade = { CascadeType.REMOVE, CascadeType.REFRESH })
	@JoinTable(name = "QR_BARCODE", joinColumns = { @JoinColumn(name = "QR_BARCODE") }, inverseJoinColumns = {
			@JoinColumn(name = "PRODUCT_OWNER") })
	private ProductDetails warrantyProducts;
	
	//TODO: ADD ASSOCIATION MAPPINGS WITH 
	// VEHICLE_DETAILS, ELECTRONIC_CARD_DETAILS,
	// BANK_ACC_DETAILS
	
	
	public String getSeqEmiId() {
		return seqEmiId;
	}

	public void setSeqEmiId(String seqEmiId) {
		this.seqEmiId = seqEmiId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public String getEcardNumber() {
		return ecardNumber;
	}

	public void setEcardNumber(String ecardNumber) {
		this.ecardNumber = ecardNumber;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getEmiProvider() {
		return emiProvider;
	}

	public void setEmiProvider(String emiProvider) {
		this.emiProvider = emiProvider;
	}

	public String getEmiStartDate() {
		return emiStartDate;
	}

	public void setEmiStartDate(String emiStartDate) {
		this.emiStartDate = emiStartDate;
	}

	public Double getEmiInterestRate() {
		return emiInterestRate;
	}

	public void setEmiInterestRate(Double emiInterestRate) {
		this.emiInterestRate = emiInterestRate;
	}

	public Double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public Byte getEmiInstalmentCount() {
		return emiInstalmentCount;
	}

	public void setEmiInstalmentCount(Byte emiInstalmentCount) {
		this.emiInstalmentCount = emiInstalmentCount;
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

	public String getEmiEndDate() {
		return emiEndDate;
	}

	public void setEmiEndDate(String emiEndDate) {
		this.emiEndDate = emiEndDate;
	}

	public ProductDetails getWarrantyProducts() {
		return warrantyProducts;
	}

	public void setWarrantyProducts(ProductDetails warrantyProducts) {
		this.warrantyProducts = warrantyProducts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqEmiId == null) ? 0 : seqEmiId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EmiDetails))
			return false;
		EmiDetails other = (EmiDetails) obj;
		if (seqEmiId == null) {
			if (other.seqEmiId != null)
				return false;
		} else if (!seqEmiId.equals(other.seqEmiId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
