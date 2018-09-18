package com.chandrakanth.financesystem.entity.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class EducationDocsDTO {

	public EducationDocsDTO() {
		// TODO Auto-generated constructor stub
	}

	public EducationDocsDTO(String docId, String userName, String mobileNumber, String docRefNumber, Byte standard,
			String candidateId, String nameAsPerRecord, String degree, String specialization, Byte semesterYear,
			String nameOfInstitue, String instituteGoverningBody, String affiliatedToUniv, Integer totalMarks,
			Integer maximumMarks, String cgpaPercentageType, Double cgpaPercentage, String monthYearOfPassing,
			String passOutBatch, String docIssueDate, String createdDateTime, String modifiedDateTime) {
		super();
		this.docId = docId;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.docRefNumber = docRefNumber;
		this.standard = standard;
		this.candidateId = candidateId;
		this.nameAsPerRecord = nameAsPerRecord;
		this.degree = degree;
		this.specialization = specialization;
		this.semesterYear = semesterYear;
		this.nameOfInstitue = nameOfInstitue;
		this.instituteGoverningBody = instituteGoverningBody;
		this.affiliatedToUniv = affiliatedToUniv;
		this.totalMarks = totalMarks;
		this.maximumMarks = maximumMarks;
		this.cgpaPercentageType = cgpaPercentageType;
		this.cgpaPercentage = cgpaPercentage;
		this.monthYearOfPassing = monthYearOfPassing;
		this.passOutBatch = passOutBatch;
		this.docIssueDate = docIssueDate;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	private String docId;
	private String userName;
	private String mobileNumber;
	private String docRefNumber;
	private Byte standard;
	private String candidateId;
	private String nameAsPerRecord;
	private String degree;
	private String specialization;
	private Byte semesterYear;
	private String nameOfInstitue;
	private String instituteGoverningBody;
	private String affiliatedToUniv;
	private Integer totalMarks;
	private Integer maximumMarks;
	private String cgpaPercentageType;
	private Double cgpaPercentage;
	private String monthYearOfPassing;
	private String passOutBatch;
	private String docIssueDate;
	private String createdDateTime;
	private String modifiedDateTime;

	/**
	 * @return the docId
	 */
	public String getDocId() {
		return docId;
	}

	/**
	 * @param docId
	 *            the docId to set
	 */
	public void setDocId(String docId) {
		this.docId = docId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the docRefNumber
	 */
	public String getDocRefNumber() {
		return docRefNumber;
	}

	/**
	 * @param docRefNumber
	 *            the docRefNumber to set
	 */
	public void setDocRefNumber(String docRefNumber) {
		this.docRefNumber = docRefNumber;
	}

	/**
	 * @return the standard
	 */
	public Byte getStandard() {
		return standard;
	}

	/**
	 * @param standard
	 *            the standard to set
	 */
	public void setStandard(Byte standard) {
		this.standard = standard;
	}

	/**
	 * @return the candidateId
	 */
	public String getCandidateId() {
		return candidateId;
	}

	/**
	 * @param candidateId
	 *            the candidateId to set
	 */
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	/**
	 * @return the nameAsPerRecord
	 */
	public String getNameAsPerRecord() {
		return nameAsPerRecord;
	}

	/**
	 * @param nameAsPerRecord
	 *            the nameAsPerRecord to set
	 */
	public void setNameAsPerRecord(String nameAsPerRecord) {
		this.nameAsPerRecord = nameAsPerRecord;
	}

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree
	 *            the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization
	 *            the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the semesterYear
	 */
	public Byte getSemesterYear() {
		return semesterYear;
	}

	/**
	 * @param semesterYear
	 *            the semesterYear to set
	 */
	public void setSemesterYear(Byte semesterYear) {
		this.semesterYear = semesterYear;
	}

	/**
	 * @return the nameOfInstitue
	 */
	public String getNameOfInstitue() {
		return nameOfInstitue;
	}

	/**
	 * @param nameOfInstitue
	 *            the nameOfInstitue to set
	 */
	public void setNameOfInstitue(String nameOfInstitue) {
		this.nameOfInstitue = nameOfInstitue;
	}

	/**
	 * @return the instituteGoverningBody
	 */
	public String getInstituteGoverningBody() {
		return instituteGoverningBody;
	}

	/**
	 * @param instituteGoverningBody
	 *            the instituteGoverningBody to set
	 */
	public void setInstituteGoverningBody(String instituteGoverningBody) {
		this.instituteGoverningBody = instituteGoverningBody;
	}

	/**
	 * @return the affiliatedToUniv
	 */
	public String getAffiliatedToUniv() {
		return affiliatedToUniv;
	}

	/**
	 * @param affiliatedToUniv
	 *            the affiliatedToUniv to set
	 */
	public void setAffiliatedToUniv(String affiliatedToUniv) {
		this.affiliatedToUniv = affiliatedToUniv;
	}

	/**
	 * @return the totalMarks
	 */
	public Integer getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks
	 *            the totalMarks to set
	 */
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the maximumMarks
	 */
	public Integer getMaximumMarks() {
		return maximumMarks;
	}

	/**
	 * @param maximumMarks
	 *            the maximumMarks to set
	 */
	public void setMaximumMarks(Integer maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	/**
	 * @return the cgpaPercentageType
	 */
	public String getCgpaPercentageType() {
		return cgpaPercentageType;
	}

	/**
	 * @param cgpaPercentageType
	 *            the cgpaPercentageType to set
	 */
	public void setCgpaPercentageType(String cgpaPercentageType) {
		this.cgpaPercentageType = cgpaPercentageType;
	}

	/**
	 * @return the cgpaPercentage
	 */
	public Double getCgpaPercentage() {
		return cgpaPercentage;
	}

	/**
	 * @param cgpaPercentage
	 *            the cgpaPercentage to set
	 */
	public void setCgpaPercentage(Double cgpaPercentage) {
		this.cgpaPercentage = cgpaPercentage;
	}

	/**
	 * @return the monthYearOfPassing
	 */
	public String getMonthYearOfPassing() {
		return monthYearOfPassing;
	}

	/**
	 * @param monthYearOfPassing
	 *            the monthYearOfPassing to set
	 */
	public void setMonthYearOfPassing(String monthYearOfPassing) {
		this.monthYearOfPassing = monthYearOfPassing;
	}

	/**
	 * @return the passOutBatch
	 */
	public String getPassOutBatch() {
		return passOutBatch;
	}

	/**
	 * @param passOutBatch
	 *            the passOutBatch to set
	 */
	public void setPassOutBatch(String passOutBatch) {
		this.passOutBatch = passOutBatch;
	}

	/**
	 * @return the docIssueDate
	 */
	public String getDocIssueDate() {
		return docIssueDate;
	}

	/**
	 * @param docIssueDate
	 *            the docIssueDate to set
	 */
	public void setDocIssueDate(String docIssueDate) {
		this.docIssueDate = docIssueDate;
	}

	/**
	 * @return the createdDateTime
	 */
	public String getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime
	 *            the createdDateTime to set
	 */
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	/**
	 * @return the modifiedDateTime
	 */
	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	/**
	 * @param modifiedDateTime
	 *            the modifiedDateTime to set
	 */
	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
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
