package com.chandrakanth.financesystem.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_AC_NUM_DETAILS")
public class BankAccNumDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "AC_NUMBER")
	private String accNumber;
	@Column(name = "ACTIVE_STATUS" , columnDefinition="DEFAULTS TO 'Y' IN DB")
	private String activeStatus;
	@Column(name = "CREATED_DATETIME")
	private LocalDateTime createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private LocalDateTime modifiedDateTime;

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public LocalDateTime getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accNumber == null) ? 0 : accNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BankAccNumDetails))
			return false;
		BankAccNumDetails other = (BankAccNumDetails) obj;
		if (accNumber == null) {
			if (other.accNumber != null)
				return false;
		} else if (!accNumber.equals(other.accNumber))
			return false;
		return true;
	}

}
