package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "EDUCATION_DOCS")
public class EducationDocs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "SEQ_EDU_DOC_ID", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 50, name = "SEQ_EDU_DOC_ID", sequenceName = "SEQ_EDU_DOC_ID")
	@Column(name = "SEQ_EDU_DOC_ID")
	private String docId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name = "DOC_REF_NUM")
	private String docRefNumber;
	@Column(name = "EDU_STANDARD")
	private Byte standard;
	@Column(name = "CANDIDATE_ROLL_NUM")
	private String candidateId;
	@Column(name = "CANDIDATE_NAME")
	private String nameAsPerRecord;
	@Column(name = "EDU_DEGREE", nullable = false)
	private String degree;
	@Column(name = "SPECIALIZATION", nullable = false)
	private String specialization;
	@Column(name = "SEMESTER_YEAR", columnDefinition = "DEFAULTS TO 'NA' IN DB")
	private Byte semesterYear;
	@Column(name = "NAME_OF_INSTITUTE")
	private String nameOfInstitue;
	@Column(name = "INSTITUTE_GOVERNING_BODY", nullable = false)
	private String instituteGoverningBody;
	@Column(name = "AFFILIATED_TO_UNIVERSITY", nullable = false, columnDefinition = "DEFAULTS TO 'NA' IN DB")
	private String affiliatedToUniv;
	@Column(name = "TOTAL_MARKS", nullable = false)
	private Integer totalMarks;
	@Column(name = "MAXIMUM_MARKS", nullable = false)
	private Integer maximumMarks;
	@Column(name = "PERCENTAGE_CGPA_TYPE", nullable = false, columnDefinition = "DEFAULTS TO 'PERCENTAGE' IN DB")
	private String cgpaPercentageType;
	@Column(name = "PERCENTAGE_CGPA_VALUE", scale = 3, precision = 2)
	private Double cgpaPercentage;
	@Column(name = "MONTH_YEAR_PASSING", nullable = false)
	private String monthYearOfPassing;
	@Column(name = "PASSOUT_BATCH")
	private String passOutBatch;
	@Column(name = "DOC_ISSUE_DATE", nullable = false)
	private String docIssueDate;
	@Column(name = "CREATED_DATETIME", columnDefinition = "DEFAULTS TO SYSTEMTIMESTAMP OF ORACLE SERVER LOCALE")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME", columnDefinition = "DEFAULTS TO SYSTEMTIMESTAMP OF ORACLE SERVER LOCALE")
	private String modifiedDateTime;
/*
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumns({ @JoinColumn(name = "USER_NAME"), @JoinColumn(name = "MOBILE_NUMBER") })
	private UserCredentials userCredentials;
*/
	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getNameAsPerRecord() {
		return nameAsPerRecord;
	}

	public void setNameAsPerRecord(String nameAsPerRecord) {
		this.nameAsPerRecord = nameAsPerRecord;
	}

	public String getStandardOrDegree() {
		return degree;
	}

	public void setStandardOrDegree(String standardOrDegree) {
		this.degree = standardOrDegree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getNameOfInstitue() {
		return nameOfInstitue;
	}

	public void setNameOfInstitue(String nameOfInstitue) {
		this.nameOfInstitue = nameOfInstitue;
	}

	public String getInstituteGoverningBody() {
		return instituteGoverningBody;
	}

	public void setInstituteGoverningBody(String instituteGoverningBody) {
		this.instituteGoverningBody = instituteGoverningBody;
	}

	public String getAffiliatedToUniv() {
		return affiliatedToUniv;
	}

	public void setAffiliatedToUniv(String affiliatedToUniv) {
		this.affiliatedToUniv = affiliatedToUniv;
	}

	public String getMonthYearOfPassing() {
		return monthYearOfPassing;
	}

	public void setMonthYearOfPassing(String monthYearOfPassing) {
		this.monthYearOfPassing = monthYearOfPassing;
	}

	public String getDocIssueDate() {
		return docIssueDate;
	}

	public void setDocIssueDate(String docIssueDate) {
		this.docIssueDate = docIssueDate;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Integer getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(Integer maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public String getCgpaPercentageType() {
		return cgpaPercentageType;
	}

	public void setCgpaPercentageType(String cgpaPercentageType) {
		this.cgpaPercentageType = cgpaPercentageType;
	}

	public Double getCgpaPercentage() {
		return cgpaPercentage;
	}

	public void setCgpaPercentage(Double cgpaPercentage) {
		this.cgpaPercentage = cgpaPercentage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Byte getStandard() {
		return standard;
	}

	public void setStandard(Byte standard) {
		this.standard = standard;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Byte getSemesterYear() {
		return semesterYear;
	}

	public void setSemesterYear(Byte semesterYear) {
		this.semesterYear = semesterYear;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDocRefNumber() {
		return docRefNumber;
	}

	public void setDocRefNumber(String docRefNumber) {
		this.docRefNumber = docRefNumber;
	}

	public String getPassOutBatch() {
		return passOutBatch;
	}

	public void setPassOutBatch(String passOutBatch) {
		this.passOutBatch = passOutBatch;
	}

	/*public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}*/


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((affiliatedToUniv == null) ? 0 : affiliatedToUniv.hashCode());
		result = prime * result + ((candidateId == null) ? 0 : candidateId.hashCode());
		result = prime * result + ((cgpaPercentage == null) ? 0 : cgpaPercentage.hashCode());
		result = prime * result + ((cgpaPercentageType == null) ? 0 : cgpaPercentageType.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((docIssueDate == null) ? 0 : docIssueDate.hashCode());
		result = prime * result + ((docRefNumber == null) ? 0 : docRefNumber.hashCode());
		result = prime * result + ((instituteGoverningBody == null) ? 0 : instituteGoverningBody.hashCode());
		result = prime * result + ((maximumMarks == null) ? 0 : maximumMarks.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((modifiedDateTime == null) ? 0 : modifiedDateTime.hashCode());
		result = prime * result + ((monthYearOfPassing == null) ? 0 : monthYearOfPassing.hashCode());
		result = prime * result + ((nameAsPerRecord == null) ? 0 : nameAsPerRecord.hashCode());
		result = prime * result + ((nameOfInstitue == null) ? 0 : nameOfInstitue.hashCode());
		result = prime * result + ((passOutBatch == null) ? 0 : passOutBatch.hashCode());
		result = prime * result + ((semesterYear == null) ? 0 : semesterYear.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		result = prime * result + ((standard == null) ? 0 : standard.hashCode());
		result = prime * result + ((totalMarks == null) ? 0 : totalMarks.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDocs other = (EducationDocs) obj;
		if (affiliatedToUniv == null) {
			if (other.affiliatedToUniv != null)
				return false;
		} else if (!affiliatedToUniv.equals(other.affiliatedToUniv))
			return false;
		if (candidateId == null) {
			if (other.candidateId != null)
				return false;
		} else if (!candidateId.equals(other.candidateId))
			return false;
		if (cgpaPercentage == null) {
			if (other.cgpaPercentage != null)
				return false;
		} else if (!cgpaPercentage.equals(other.cgpaPercentage))
			return false;
		if (cgpaPercentageType == null) {
			if (other.cgpaPercentageType != null)
				return false;
		} else if (!cgpaPercentageType.equals(other.cgpaPercentageType))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (docIssueDate == null) {
			if (other.docIssueDate != null)
				return false;
		} else if (!docIssueDate.equals(other.docIssueDate))
			return false;
		if (docRefNumber == null) {
			if (other.docRefNumber != null)
				return false;
		} else if (!docRefNumber.equals(other.docRefNumber))
			return false;
		if (instituteGoverningBody == null) {
			if (other.instituteGoverningBody != null)
				return false;
		} else if (!instituteGoverningBody.equals(other.instituteGoverningBody))
			return false;
		if (maximumMarks == null) {
			if (other.maximumMarks != null)
				return false;
		} else if (!maximumMarks.equals(other.maximumMarks))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (modifiedDateTime == null) {
			if (other.modifiedDateTime != null)
				return false;
		} else if (!modifiedDateTime.equals(other.modifiedDateTime))
			return false;
		if (monthYearOfPassing == null) {
			if (other.monthYearOfPassing != null)
				return false;
		} else if (!monthYearOfPassing.equals(other.monthYearOfPassing))
			return false;
		if (nameAsPerRecord == null) {
			if (other.nameAsPerRecord != null)
				return false;
		} else if (!nameAsPerRecord.equals(other.nameAsPerRecord))
			return false;
		if (nameOfInstitue == null) {
			if (other.nameOfInstitue != null)
				return false;
		} else if (!nameOfInstitue.equals(other.nameOfInstitue))
			return false;
		if (passOutBatch == null) {
			if (other.passOutBatch != null)
				return false;
		} else if (!passOutBatch.equals(other.passOutBatch))
			return false;
		if (semesterYear == null) {
			if (other.semesterYear != null)
				return false;
		} else if (!semesterYear.equals(other.semesterYear))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		if (standard == null) {
			if (other.standard != null)
				return false;
		} else if (!standard.equals(other.standard))
			return false;
		if (totalMarks == null) {
			if (other.totalMarks != null)
				return false;
		} else if (!totalMarks.equals(other.totalMarks))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
