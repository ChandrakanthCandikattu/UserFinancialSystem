/**
 * 
 */
package com.chandrakanth.financesystem.entity.dto;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author THIS PC
 *
 */
public class BankAccNumDetailsDTO {

	/**
	 * 
	 */
	private BankAccNumDetailsDTO() {
		// TODO Auto-generated constructor stub
	}

	public BankAccNumDetailsDTO(String accNumber, String activeStatus, LocalDateTime createdDateTime,
			LocalDateTime modifiedDateTime) {
		super();
		this.accNumber = accNumber;
		this.activeStatus = activeStatus;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	private String accNumber;
	private String activeStatus;
	private LocalDateTime createdDateTime;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accNumber == null) ? 0 : accNumber.hashCode());
		result = prime * result + ((activeStatus == null) ? 0 : activeStatus.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((modifiedDateTime == null) ? 0 : modifiedDateTime.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BankAccNumDetailsDTO))
			return false;
		BankAccNumDetailsDTO other = (BankAccNumDetailsDTO) obj;
		if (accNumber == null) {
			if (other.accNumber != null)
				return false;
		} else if (!accNumber.equals(other.accNumber))
			return false;
		if (activeStatus == null) {
			if (other.activeStatus != null)
				return false;
		} else if (!activeStatus.equals(other.activeStatus))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (modifiedDateTime == null) {
			if (other.modifiedDateTime != null)
				return false;
		} else if (!modifiedDateTime.equals(other.modifiedDateTime))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
