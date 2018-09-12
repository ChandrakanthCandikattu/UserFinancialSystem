package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProfitLoss implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "SEQ_PRFT_LOSS", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 50, name = "SEQ_PRFT_LOSS", sequenceName = "SEQ_PRFT_LOSS")
	@Column(name = "SEQ_PRFT_LOSS")
	private String seqProfitLoss;
	@Column(name = "V_REG_NUMBER")
	private String vRegisteredNumber;
	@Column(name = "QR_BARCODE")
	private String qrBarcode;
	@Column(name = "COST_PRICE")
	private String costPrice;
	@Column(name = "SELLING_PRICE")
	private String sellingPRice;
	@Column(name = "SELLER_NAME")
	private String sellerName;
	@Column(name = "SELLER_COMM_PERC")
	private String sellerCommPercnt;
	@Column(name = "PRFT_LSS_PERC")
	private String prftLssPercnt;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	@OneToOne
	@JoinColumn(name = "V_REG_NUMBER", referencedColumnName = "V_REGISTRATION_NUM")
	private VehicleDetails vehicleDetails;

	@OneToOne
	@JoinColumn(name = "QR_BARCODE")
	private QRBarCode qrBarcodeDetails;

	public String getSeqProfitLoss() {
		return seqProfitLoss;
	}

	public void setSeqProfitLoss(String seqProfitLoss) {
		this.seqProfitLoss = seqProfitLoss;
	}

	public String getvRegisteredNumber() {
		return vRegisteredNumber;
	}

	public void setvRegisteredNumber(String vRegisteredNumber) {
		this.vRegisteredNumber = vRegisteredNumber;
	}

	public String getQrBarcode() {
		return qrBarcode;
	}

	public void setQrBarcode(String qrBarcode) {
		this.qrBarcode = qrBarcode;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getSellingPRice() {
		return sellingPRice;
	}

	public void setSellingPRice(String sellingPRice) {
		this.sellingPRice = sellingPRice;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerCommPercnt() {
		return sellerCommPercnt;
	}

	public void setSellerCommPercnt(String sellerCommPercnt) {
		this.sellerCommPercnt = sellerCommPercnt;
	}

	public String getPrftLssPercnt() {
		return prftLssPercnt;
	}

	public void setPrftLssPercnt(String prftLssPercnt) {
		this.prftLssPercnt = prftLssPercnt;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public QRBarCode getQrBarcodeDetails() {
		return qrBarcodeDetails;
	}

	public void setQrBarcodeDetails(QRBarCode qrBarcodeDetails) {
		this.qrBarcodeDetails = qrBarcodeDetails;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqProfitLoss == null) ? 0 : seqProfitLoss.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ProfitLoss))
			return false;
		ProfitLoss other = (ProfitLoss) obj;
		if (seqProfitLoss == null) {
			if (other.seqProfitLoss != null)
				return false;
		} else if (!seqProfitLoss.equals(other.seqProfitLoss))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
