package com.chandrakanth.financesystem.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "ELECTRONIC_CARD_DETAILS")
public class ElectronicCardDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ELEC_CRDS")
	@SequenceGenerator(name = "SEQ_ELEC_CRDS", sequenceName = "SEQ_ELEC_CRDS")
	@Column(name = "SEQ_ELEC_CRDS")
	private String seqElecCard;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name = "CARD_NUMBER")
	private String cardNumber;
	@Column(name = "CARD_CATEGORY")
	private String cardCategory;
	@Column(name = "BANK_ACNT_NUMBER", nullable = false)
	private String bankAccntNUmber;
	@Column(name = "ACTIVE_STATUS", nullable = false, columnDefinition = "DEFAULTS TO 'Y' IN DB")
	private String activeStatus;
	@Column(name = "CARDHOLDER_NAME")
	private String cardHolderName;
	@Column(name = "CARD_PROVIDER", nullable = false)
	private String cardProvider;
	@Column(name = "CARD_ISSUE_DATE")
	private String cardIssueDate;
	@Column(name = "EXPIRY_DATE", nullable = false)
	private String expiryDate;
	@Column(name = "CREDIT_LIMIT", nullable = false)
	private String creditLimit;
	@Column(name = "POINTS_AVAILABLE", nullable = true)
	private Integer pointsAvailable;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	// Unidirectional - One Sided
	@ManyToOne
	// @JoinColumn(name = "CARD_NUMBER"/*, referencedColumnName = "CARD_NUMBER"*/)
	private ElectronicCardDetails electronicCardDetails;

	// UniDirectonal
	@OneToMany
	@JoinColumn(name = "AC_NUMBER"/* , referencedColumnName = "accNumber" */)
	private Set<BankAccNumDetails> bankAccNumDetails;

	// Unidirectional
	// @Transient
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	// @JoinColumns({ @JoinColumn(name = "USER_NAME"), @JoinColumn(name =
	// "MOBILE_NUMBER") })
	private UserCredentials userCredentials;

	public String getCreditDebitCardNumber() {
		return cardNumber;
	}

	public void setCreditDebitCardNumber(String creditDebitCardNumber) {
		this.cardNumber = creditDebitCardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getBankAccntNUmber() {
		return bankAccntNUmber;
	}

	public void setBankAccntNUmber(String bankAccntNUmber) {
		this.bankAccntNUmber = bankAccntNUmber;
	}

	public String getCardProvider() {
		return cardProvider;
	}

	public void setCardProvider(String cardProvider) {
		this.cardProvider = cardProvider;
	}

	public String getCardCategory() {
		return cardCategory;
	}

	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getPointsAvailable() {
		return pointsAvailable;
	}

	public void setPointsAvailable(Integer pointsAvailable) {
		this.pointsAvailable = pointsAvailable;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getSeqElecCard() {
		return seqElecCard;
	}

	public void setSeqElecCard(String seqElecCard) {
		this.seqElecCard = seqElecCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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

	public String getCardIssueDate() {
		return cardIssueDate;
	}

	public void setCardIssueDate(String cardIssueDate) {
		this.cardIssueDate = cardIssueDate;
	}

	public ElectronicCardDetails getElectronicCardDetails() {
		return electronicCardDetails;
	}

	public void setElectronicCardDetails(ElectronicCardDetails electronicCardDetails) {
		this.electronicCardDetails = electronicCardDetails;
	}

	public Set<BankAccNumDetails> getBankAccNumDetails() {
		return bankAccNumDetails;
	}

	public void setBankAccNumDetails(Set<BankAccNumDetails> bankAccNumDetails) {
		this.bankAccNumDetails = bankAccNumDetails;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqElecCard == null) ? 0 : seqElecCard.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ElectronicCardDetails))
			return false;
		ElectronicCardDetails other = (ElectronicCardDetails) obj;
		if (seqElecCard == null) {
			if (other.seqElecCard != null)
				return false;
		} else if (!seqElecCard.equals(other.seqElecCard))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);

	}

}
