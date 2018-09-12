package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_DETAILS")
public class VehicleDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "V_REGISTRATION_NUM", nullable = false, unique = true, updatable = true)
	private String vRegisteredNumber;
	@Column(name = "v_USER_NAME")
	private String userName;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "IS 'Y' BY DEFAULT IN THE DATABASE SIDE")
	private String activeStatus;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	@JoinColumns({ @JoinColumn(name = "V_USER_NAME", referencedColumnName = "USER_NAME"),
			@JoinColumn(name = "USER_NAME", referencedColumnName = "MOBILE_NUMBER") })
	private UserCredentials userCredentials;

	public String getvRegisteredNumber() {
		return vRegisteredNumber;
	}

	public void setvRegisteredNumber(String vRegisteredNumber) {
		this.vRegisteredNumber = vRegisteredNumber;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vRegisteredNumber == null) ? 0 : vRegisteredNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VehicleDetails))
			return false;
		VehicleDetails other = (VehicleDetails) obj;
		if (vRegisteredNumber == null) {
			if (other.vRegisteredNumber != null)
				return false;
		} else if (!vRegisteredNumber.equals(other.vRegisteredNumber))
			return false;
		return true;
	}

}
