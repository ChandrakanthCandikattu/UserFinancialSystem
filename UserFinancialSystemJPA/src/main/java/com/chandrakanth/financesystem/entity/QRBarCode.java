package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "QR_BARCODE")
public class QRBarCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "QR_BARCODE")
	private String qrBarcode;
	@Column(name = "PRODUCT_OWNER")
	private String productOwner;
	@Column(name = "PO_MOBILE")
	private String productOwnerContact;
	@Column(name = "ACTIVE_STATUS")
	private String activeStatus;
	@Column(name = "CREATED_DATETIME")
	private String createDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	public String getProductOwnerContact() {
		return productOwnerContact;
	}

	public void setProductOwnerContact(String productOwnerContact) {
		this.productOwnerContact = productOwnerContact;
	}

	public String getQrBarcode() {
		return qrBarcode;
	}

	public void setQrBarcode(String qrBarcode) {
		this.qrBarcode = qrBarcode;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
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
		result = prime * result + ((qrBarcode == null) ? 0 : qrBarcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof QRBarCode))
			return false;
		QRBarCode other = (QRBarCode) obj;
		if (qrBarcode == null) {
			if (other.qrBarcode != null)
				return false;
		} else if (!qrBarcode.equals(other.qrBarcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
