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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Chandrakanth
 *
 */
/**
 * This entity deails with Personal Identity Documents - viz. Aadhar, PAN, Voter
 * ID, Driving License
 *
 */

@Entity
@Table(name = "PERSONAL_IDENTITY_DOCS")
public class PersonalIdentityDocs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PI_DOCS")
	@SequenceGenerator(allocationSize = 50, name = "SEQ_PI_DOCS", sequenceName = "SEQ_PI_DOCS")
	@Column(name = "SEQ_PI_DOCS")
	private String seqPiDOC;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "DEFAULTS TO 'Y' IN DB")
	private String activeStatus;
	@Column(name = "PAN_ID")
	private String panId;
	@Column(name = "AADHAR_ID")
	private String aadharId;
	@Column(name = "PASSPORT_ID")
	private String passportId;
	@Column(name = "DL_ID")
	private String dlId;
	@Column(name = "NSR_ID")
	private String nsrId;
	@Column(name = "VOTER_ID")
	private String voterId;
	@Column(name = "REFERENCE_NUMBER", columnDefinition = "APPLICABLE ONLY TO DRIVING LICENSE")
	private String referenceNumber;
	@Column(name = "V_REG_NUMBER", columnDefinition = "FOREIGN KEY REFERENCING VEHICLE_DETAILS ENTITY")
	private String vRegNumber;
	@Column(name = "V_CLASS", nullable = true)
	private String vehicleClass;
	@Column(name = "V_CLASS_DESC", nullable = true)
	private String vehicleClassDesc;
	@Column(name = "PI_DOC_TYPE")
	private String piDocType;
	@Column(name = "PI_DOC_CTGRY_TYPE")
	private String piDocCtgryType;
	@Column(name = "PI_PRIMARY_MOB_NUM")
	private String primaryMobileNumber;
	@Column(name = "PI_ALTERNATE_MOB_NUM", nullable = true)
	private String piAlternateMobile;
	@Column(name = "DOC_HOLDER_NAME")
	private String docHolderName;
	@Column(name = "PI_PRNT_SPSE_GRDN")
	private String piParentSpouseGuardian;
	@Column(name = "PRNT_SPSE_GRDN_REL")
	private String parentSpseGrdRelation;
	@Column(name = "BLOOD_GRP")
	private String bloodGroup;
	@Column(name = "PI_DATE_OF_BIRTH")
	private String dateOfBirth;
	@Column(name = "PI_ADDRESS")
	private String piAddress;
	@Column(name = "PI_ADDR_CITY")
	private String piAddressCity;
	@Column(name = "PI_ADDR_STATE")
	private String piAddressState;
	@Column(name = "PI_ADDR_PINCODE")
	private String piAddressPin;
	@Column(name = "FIRST_ISSUE_DATE")
	private String firstIssueDate;
	@Column(name = "RE_ISSUE_DATE")
	private String reIssueDate;
	@Column(name = "REISSUE_INDICATOR")
	private Character reIssueIndicator;
	@Column(name = "TENURE_NUMBER")
	private String tenureNumber;
	@Column(name = "EXPIRY_DATE")
	private String expiryDate;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "USER_NAME"), @JoinColumn(name = "MOBILE_NUMBER") })
	private UserCredentials userCredentials;

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "V_REGISTRATION_NUM") })
	private VehicleDetails vehicleDetails;

	public String getSeqPiDOC() {
		return seqPiDOC;
	}

	public void setSeqPiDOC(final String seqPiDOC) {
		this.seqPiDOC = seqPiDOC;
	}

	public String getPiAlternateMobile() {
		return piAlternateMobile;
	}

	public void setPiAlternateMobile(final String piAlternateMobile) {
		this.piAlternateMobile = piAlternateMobile;
	}

	public String getPiParentSpouseGuardian() {
		return piParentSpouseGuardian;
	}

	public void setPiParentSpouseGuardian(final String piParentSpouseGuardian) {
		this.piParentSpouseGuardian = piParentSpouseGuardian;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPiAddress() {
		return piAddress;
	}

	public void setPiAddress(final String piAddress) {
		this.piAddress = piAddress;
	}

	public String getPiAddressCity() {
		return piAddressCity;
	}

	public void setPiAddressCity(final String piAddressCity) {
		this.piAddressCity = piAddressCity;
	}

	public String getPiAddressState() {
		return piAddressState;
	}

	public void setPiAddressState(final String piAddressState) {
		this.piAddressState = piAddressState;
	}

	public String getPiAddressPin() {
		return piAddressPin;
	}

	public void setPiAddressPin(final String piAddressPin) {
		this.piAddressPin = piAddressPin;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getDlId() {
		return dlId;
	}

	public void setDlId(String dlId) {
		this.dlId = dlId;
	}

	public String getNsrId() {
		return nsrId;
	}

	public void setNsrId(String nsrId) {
		this.nsrId = nsrId;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getvRegNumber() {
		return vRegNumber;
	}

	public void setvRegNumber(String vRegNumber) {
		this.vRegNumber = vRegNumber;
	}

	public String getPiDocType() {
		return piDocType;
	}

	public void setPiDocType(String piDocType) {
		this.piDocType = piDocType;
	}

	public String getPrimaryMobileNumber() {
		return primaryMobileNumber;
	}

	public void setPrimaryMobileNumber(String primaryMobileNumber) {
		this.primaryMobileNumber = primaryMobileNumber;
	}

	public String getDocHolderName() {
		return docHolderName;
	}

	public void setDocHolderName(String docHolderName) {
		this.docHolderName = docHolderName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getReIssueDate() {
		return reIssueDate;
	}

	public void setReIssueDate(String reIssueDate) {
		this.reIssueDate = reIssueDate;
	}

	public Character getReIssueIndicator() {
		return reIssueIndicator;
	}

	public void setReIssueIndicator(Character reIssueIndicator) {
		this.reIssueIndicator = reIssueIndicator;
	}

	public String getTenureNumber() {
		return tenureNumber;
	}

	public void setTenureNumber(String tenureNumber) {
		this.tenureNumber = tenureNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
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

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClassDesc() {
		return vehicleClassDesc;
	}

	public void setVehicleClassDesc(String vehicleClassDesc) {
		this.vehicleClassDesc = vehicleClassDesc;
	}

	public String getPiDocCtgryType() {
		return piDocCtgryType;
	}

	public void setPiDocCtgryType(String piDocCtgryType) {
		this.piDocCtgryType = piDocCtgryType;
	}

	public String getParentSpseGrdRelation() {
		return parentSpseGrdRelation;
	}

	public void setParentSpseGrdRelation(String parentSpseGrdRelation) {
		this.parentSpseGrdRelation = parentSpseGrdRelation;
	}

	public String getFirstIssueDate() {
		return firstIssueDate;
	}

	public void setFirstIssueDate(String firstIssueDate) {
		this.firstIssueDate = firstIssueDate;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqPiDOC == null) ? 0 : seqPiDOC.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PersonalIdentityDocs))
			return false;
		PersonalIdentityDocs other = (PersonalIdentityDocs) obj;
		if (seqPiDOC == null) {
			if (other.seqPiDOC != null)
				return false;
		} else if (!seqPiDOC.equals(other.seqPiDOC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
