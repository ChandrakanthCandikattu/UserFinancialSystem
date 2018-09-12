package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VPOLLUTION_CONTROL_CERTIFICATE")
public class VehiclePollutionControlCert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VEH_POL_CTRL")
	private String vehPolCtrlId;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "IS 'Y' BY DEFAULT IN THE DATABASE SIDE")
	private String activeStatus;
	@Column(name = "CATALYST", nullable = false)
	private String catalyst;
	@Column(name = "ENGINE_TYPE", nullable = false)
	private String engineType;
	@Column(name = "VEHICLE_MAKE", nullable = false)
	private String vehicleMake;
	@Column(name = "VEHICLE_MODEL", nullable = false)
	private String vehicleModel;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	public String getCatalyst() {
		return catalyst;
	}

	public void setCatalyst(String catalyst) {
		this.catalyst = catalyst;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehPolCtrlCertId() {
		return vehPolCtrlId;
	}

	public void setVehPolCtrlCertd(String docId) {
		this.vehPolCtrlId = docId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activeStatus == null) ? 0 : activeStatus.hashCode());
		result = prime * result + ((catalyst == null) ? 0 : catalyst.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
		result = prime * result + ((modifiedDateTime == null) ? 0 : modifiedDateTime.hashCode());
		result = prime * result + ((vehPolCtrlId == null) ? 0 : vehPolCtrlId.hashCode());
		result = prime * result + ((vehicleMake == null) ? 0 : vehicleMake.hashCode());
		result = prime * result + ((vehicleModel == null) ? 0 : vehicleModel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VehiclePollutionControlCert))
			return false;
		VehiclePollutionControlCert other = (VehiclePollutionControlCert) obj;
		if (activeStatus == null) {
			if (other.activeStatus != null)
				return false;
		} else if (!activeStatus.equals(other.activeStatus))
			return false;
		if (catalyst == null) {
			if (other.catalyst != null)
				return false;
		} else if (!catalyst.equals(other.catalyst))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (engineType == null) {
			if (other.engineType != null)
				return false;
		} else if (!engineType.equals(other.engineType))
			return false;
		if (modifiedDateTime == null) {
			if (other.modifiedDateTime != null)
				return false;
		} else if (!modifiedDateTime.equals(other.modifiedDateTime))
			return false;
		if (vehPolCtrlId == null) {
			if (other.vehPolCtrlId != null)
				return false;
		} else if (!vehPolCtrlId.equals(other.vehPolCtrlId))
			return false;
		if (vehicleMake == null) {
			if (other.vehicleMake != null)
				return false;
		} else if (!vehicleMake.equals(other.vehicleMake))
			return false;
		if (vehicleModel == null) {
			if (other.vehicleModel != null)
				return false;
		} else if (!vehicleModel.equals(other.vehicleModel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
