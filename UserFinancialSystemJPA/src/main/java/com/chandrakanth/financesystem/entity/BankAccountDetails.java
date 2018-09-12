package com.chandrakanth.financesystem.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "BANK_ACCOUNT_DETAILS")
public class BankAccountDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BANK_ACC")
	@SequenceGenerator(name = "SEQ_BANK_ACC", sequenceName = "SEQ_BANK_ACC", allocationSize = 50)
	@Column(name = "SEQ_BANK_ACC")
	private String seqBankAcc;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "DEFAULTED TO 'Y' IN DB")
	private Character activeStatus;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "ELECTRONIC_CARD_NUM")
	private String electronicCardNumber;
	@Column(name = "ACC_HOLDER_NAME", nullable = false)
	private String accHolderName;
	@Column(name = "BANK", nullable = false)
	private String bank;
	@Column(name = "BRANCH", nullable = false)
	private String branch;
	@Column(name = "IFSC_CODE", nullable = false)
	private String ifscCode;
	@Column(name = "ACCOUNT_CATEGORY", nullable = false)
	private String accountCategory;
	@Column(name = "ACCOUNT_TYPE", nullable = true)
	private String accountType;
	@Column(name="PERSONAL_SALARY_ACC", columnDefinition="Defaults to 'PERSONAL' in DB")
	private String personalSalaryAcc;
	@Column(name = "REGTD_MOBILE_NUM", nullable = false)
	private String registeredMobNumber;
	@Column(name = "ALTRN_MOBILE_NUM", nullable = true)
	private String alternateMobileNumber;
	@Column(name = "BALANCE")
	private Double balance;
	@Column(name = "CREATED_DATETIME")
	private LocalDateTime createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private LocalDateTime modifiedDateTime;

	// Unidirectional - One Sided
	@ManyToOne
	@JoinColumn(name = "AC_NUMBER")
	private BankAccNumDetails bankAccNumDetails;

	// UniDirectonal
	@ManyToMany
	@JoinColumn(name = "CARD_NUMBER")
	private Set<ElectronicCardDetails> electronicCardDetails;
	
	// Unidirectional
	@Transient
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "USER_NAME"), @JoinColumn(name = "MOBILE_NUMBER") })
	private UserCredentials userCredentials;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getRegisteredMobNumber() {
		return registeredMobNumber;
	}

	public void setRegisteredMobNumber(String registeredMobNumber) {
		this.registeredMobNumber = registeredMobNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public BankAccNumDetails getBankAccNumDetails() {
		return bankAccNumDetails;
	}

	public void setBankAccNumDetails(BankAccNumDetails bankAccNumDetails) {
		this.bankAccNumDetails = bankAccNumDetails;
	}

	public String getSeqBankAcc() {
		return seqBankAcc;
	}

	public void setSeqBankAcc(String seqBankAcc) {
		this.seqBankAcc = seqBankAcc;
	}

	public String getElectronicCardNumber() {
		return electronicCardNumber;
	}

	public void setElectronicCardNumber(String electronicCardNumber) {
		this.electronicCardNumber = electronicCardNumber;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Character getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Character activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Set<ElectronicCardDetails> getElectronicCardDetails() {
		return electronicCardDetails;
	}

	public void setElectronicCardDetails(Set<ElectronicCardDetails> electronicCardDetails) {
		this.electronicCardDetails = electronicCardDetails;
	}

	public String getPersonalSalaryAcc() {
		return personalSalaryAcc;
	}

	public void setPersonalSalaryAcc(String personalSalaryAcc) {
		this.personalSalaryAcc = personalSalaryAcc;
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
		result = prime * result + ((seqBankAcc == null) ? 0 : seqBankAcc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BankAccountDetails))
			return false;
		BankAccountDetails other = (BankAccountDetails) obj;
		if (seqBankAcc == null) {
			if (other.seqBankAcc != null)
				return false;
		} else if (!seqBankAcc.equals(other.seqBankAcc))
			return false;
		return true;
	}

}
