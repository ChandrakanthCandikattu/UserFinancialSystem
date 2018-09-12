package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VCERTIFICATE_REGISTRATION")
public class VehicleCertificateRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VEH_RC_ID")
	private String vehRCId;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "IS 'Y' BY DEFAULT IN THE DATABASE SIDE")
	private String activeStatus;
	@Column(name = "VEHICLE_CLASS", nullable = true, columnDefinition = "Defaults to 'NA' in DB")
	private String vehicleClass;
	@Column(name = "MAKER_CLASS", nullable = false)
	private String makerClass;
	@Column(name = "BODY_TYPE", nullable = false)
	private String bodyType;
	@Column(name = "V_MANUFACTURING_DATE", nullable = false)
	private String vehicleMfgDate;
	@Column(name = "CHASSIS_NUMBER", nullable = false)
	private String chassisNumber;
	@Column(name = "ENGINE_NUMBER", nullable = false)
	private String engineNumber;
	@Column(name = "CUBIC_CAPACITY", nullable = false)
	private Integer cubicCapacity;
	@Column(name = "WHEEL_BASE", nullable = false)
	private Integer wheelBase;
	@Column(name = "SEATING_CAPACITY", nullable = false)
	private Integer seatingCapacity;
	@Column(name = "UNLADEN_WEIGHT", nullable = false)
	private Integer unladenWeight;
	@Column(name = "COLOR", nullable = false)
	private String color;
	@Column(name = "VEHICLE_TAX", nullable = false)
	private Integer vehicleTax;
	@Column(name = "TAX_TYPE", nullable = false)
	private String taxType;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getMakerClass() {
		return makerClass;
	}

	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getVehicleMfgDate() {
		return vehicleMfgDate;
	}

	public void setVehicleMfgDate(String vehicleMfgDate) {
		this.vehicleMfgDate = vehicleMfgDate;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public Integer getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(Integer cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public Integer getWheelBase() {
		return wheelBase;
	}

	public void setWheelBase(Integer wheelBase) {
		this.wheelBase = wheelBase;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Integer getUnladenWeight() {
		return unladenWeight;
	}

	public void setUnladenWeight(Integer unladenWeight) {
		this.unladenWeight = unladenWeight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getVehicleTax() {
		return vehicleTax;
	}

	public void setVehicleTax(Integer vehicleTax) {
		this.vehicleTax = vehicleTax;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getVehRCId() {
		return vehRCId;
	}

	public void setVehRCId(String docId) {
		this.vehRCId = docId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		result = prime * result + ((vehRCId == null) ? 0 : vehRCId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VehicleCertificateRegistration))
			return false;
		VehicleCertificateRegistration other = (VehicleCertificateRegistration) obj;
		if (vehRCId == null) {
			if (other.vehRCId != null)
				return false;
		} else if (!vehRCId.equals(other.vehRCId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
