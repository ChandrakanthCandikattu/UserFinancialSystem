package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VEHICLE_DOCS")
public class VehicleDocs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VDOC_ID")
	@SequenceGenerator(name = "SEQ_VDOC_ID", sequenceName = "SEQ_VDOC_ID")
	@Column(name = "SEQ_VDOC")
	private String seqVDoc;
	@Column(name = "VEH_RC_ID")
	private String vehicleRCID;
	@Column(name = "VEH_POL_CTRL")
	private String vehiclePollCtrlCert;
	@Column(name = "VEHICLE_REG_NUM")
	private String vehicleRegNumber;
	@Column(name = "DOC_TYPE", nullable = false)
	private String docType;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "IS 'Y' BY DEFAULT IN THE DATABASE SIDE")
	private String activeStatus;
	@Column(name = "DOC_REFERENCE_NUMBER", nullable = false)
	private String docRefNumber;
	@Column(name = "DOC_HOLDER_NAME", nullable = false)
	private String docHolderName;
	@Column(name = "DOC_AUTHORITY", nullable = false)
	private String docAuthority;
	@Column(name = "AUTHORIZING_UNION", nullable = false)
	private String authorizing_Union;
	@Column(name = "VEHICLE_TYPE", nullable = false)
	private String vehicleType;
	@Column(name = "FUEL_TYPE", nullable = false)
	private String fuelType;
	@Column(name = "REGISTRATION_DATE", nullable = false)
	private String registrationDate;
	@Column(name = "EXPIRY_DATE", nullable = false)
	private String expiryDate;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "V_REGISTRATION_NUM"/* , referencedColumnName = "V_REGISTRATION_NUM" */)
	private VehicleDetails vehicleDetails;

	@OneToOne /* (fetch = FetchType.LAZY) */
	// @JoinColumn(name = "VEH_RC_ID"/*, referencedColumnName = "VEH_RC_ID"*/)
	private VehicleCertificateRegistration vCertificateReg;

	@OneToOne /* (fetch = FetchType.LAZY) */
	// @JoinColumn(name = "VEH_POL_CTRL"/*, referencedColumnName = "VEH_POL_CTRL"*/)
	private VehiclePollutionControlCert vPollutionCntrlCert;

	public String getDocID() {
		return seqVDoc;
	}

	public void setDocID(String docID) {
		this.seqVDoc = docID;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocAuthority() {
		return docAuthority;
	}

	public void setDocAuthority(String docAuthority) {
		this.docAuthority = docAuthority;
	}

	public String getAuthorizing_Union() {
		return authorizing_Union;
	}

	public void setAuthorizing_Union(String authorizing_Union) {
		this.authorizing_Union = authorizing_Union;
	}

	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSeqVDoc() {
		return seqVDoc;
	}

	public void setSeqVDoc(String seqVDoc) {
		this.seqVDoc = seqVDoc;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getDocRefNumber() {
		return docRefNumber;
	}

	public void setDocRefNumber(String docRefNumber) {
		this.docRefNumber = docRefNumber;
	}

	public String getDocHolderName() {
		return docHolderName;
	}

	public void setDocHolderName(String docHolderName) {
		this.docHolderName = docHolderName;
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

	public String getVehicleRCID() {
		return vehicleRCID;
	}

	public void setVehicleRCID(String vehicleRCID) {
		this.vehicleRCID = vehicleRCID;
	}

	public String getVehiclePollCtrlCert() {
		return vehiclePollCtrlCert;
	}

	public void setVehiclePollCtrlCert(String vehiclePollCtrlCert) {
		this.vehiclePollCtrlCert = vehiclePollCtrlCert;
	}

	public VehicleCertificateRegistration getvCertificateReg() {
		return vCertificateReg;
	}

	public void setvCertificateReg(VehicleCertificateRegistration vCertificateReg) {
		this.vCertificateReg = vCertificateReg;
	}

	public VehiclePollutionControlCert getvPollutionCntrlCert() {
		return vPollutionCntrlCert;
	}

	public void setvPollutionCntrlCert(VehiclePollutionControlCert vPollutionCntrlCert) {
		this.vPollutionCntrlCert = vPollutionCntrlCert;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqVDoc == null) ? 0 : seqVDoc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VehicleDocs))
			return false;
		VehicleDocs other = (VehicleDocs) obj;
		if (seqVDoc == null) {
			if (other.seqVDoc != null)
				return false;
		} else if (!seqVDoc.equals(other.seqVDoc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
