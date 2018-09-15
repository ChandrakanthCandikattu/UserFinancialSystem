package com.chandrakanth.financesystem.entity.dto;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BankAccountDetailsDTO {

	public BankAccountDetailsDTO() {
		// TODO Auto-generated constructor stub
	}

	private String seqBankAcc;
	private String userName;
	private String mobileNumber;
	private Character activeStatus;
	private String accountNumber;
	private String electronicCardNumber;
	private String accHolderName;
	private String bank;
	private String branch;
	private String ifscCode;
	private String accountCategory;
	private String accountType;
	private String personalSalaryAcc;
	private String registeredMobNumber;
	private String alternateMobileNumber;
	private Double balance;
	private LocalDateTime createdDateTime;
	private LocalDateTime modifiedDateTime;

	private BankAccNumDetailsDTO bankAccNumDetailsDTO;

	/**
	 * @return the seqBankAcc
	 */
	public String getSeqBankAcc() {
		return seqBankAcc;
	}

	/**
	 * @param seqBankAcc
	 *            the seqBankAcc to set
	 */
	public void setSeqBankAcc(String seqBankAcc) {
		this.seqBankAcc = seqBankAcc;
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
	 * @return the activeStatus
	 */
	public Character getActiveStatus() {
		return activeStatus;
	}

	/**
	 * @param activeStatus
	 *            the activeStatus to set
	 */
	public void setActiveStatus(Character activeStatus) {
		this.activeStatus = activeStatus;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the electronicCardNumber
	 */
	public String getElectronicCardNumber() {
		return electronicCardNumber;
	}

	/**
	 * @param electronicCardNumber
	 *            the electronicCardNumber to set
	 */
	public void setElectronicCardNumber(String electronicCardNumber) {
		this.electronicCardNumber = electronicCardNumber;
	}

	/**
	 * @return the accHolderName
	 */
	public String getAccHolderName() {
		return accHolderName;
	}

	/**
	 * @param accHolderName
	 *            the accHolderName to set
	 */
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	/**
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * @param bank
	 *            the bank to set
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch
	 *            the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode
	 *            the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/**
	 * @return the accountCategory
	 */
	public String getAccountCategory() {
		return accountCategory;
	}

	/**
	 * @param accountCategory
	 *            the accountCategory to set
	 */
	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the personalSalaryAcc
	 */
	public String getPersonalSalaryAcc() {
		return personalSalaryAcc;
	}

	/**
	 * @param personalSalaryAcc
	 *            the personalSalaryAcc to set
	 */
	public void setPersonalSalaryAcc(String personalSalaryAcc) {
		this.personalSalaryAcc = personalSalaryAcc;
	}

	/**
	 * @return the registeredMobNumber
	 */
	public String getRegisteredMobNumber() {
		return registeredMobNumber;
	}

	/**
	 * @param registeredMobNumber
	 *            the registeredMobNumber to set
	 */
	public void setRegisteredMobNumber(String registeredMobNumber) {
		this.registeredMobNumber = registeredMobNumber;
	}

	/**
	 * @return the alternateMobileNumber
	 */
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	/**
	 * @param alternateMobileNumber
	 *            the alternateMobileNumber to set
	 */
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the createdDateTime
	 */
	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime
	 *            the createdDateTime to set
	 */
	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	/**
	 * @return the modifiedDateTime
	 */
	public LocalDateTime getModifiedDateTime() {
		return modifiedDateTime;
	}

	/**
	 * @param modifiedDateTime
	 *            the modifiedDateTime to set
	 */
	public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	/**
	 * @return the bankAccNumDetailsDTO
	 */
	public BankAccNumDetailsDTO getBankAccNumDetailsDTO() {
		return bankAccNumDetailsDTO;
	}

	/**
	 * @param bankAccNumDetailsDTO
	 *            the bankAccNumDetailsDTO to set
	 */
	public void setBankAccNumDetailsDTO(BankAccNumDetailsDTO bankAccNumDetailsDTO) {
		this.bankAccNumDetailsDTO = bankAccNumDetailsDTO;
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
		result = prime * result + ((accHolderName == null) ? 0 : accHolderName.hashCode());
		result = prime * result + ((accountCategory == null) ? 0 : accountCategory.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((activeStatus == null) ? 0 : activeStatus.hashCode());
		result = prime * result + ((alternateMobileNumber == null) ? 0 : alternateMobileNumber.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((electronicCardNumber == null) ? 0 : electronicCardNumber.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((modifiedDateTime == null) ? 0 : modifiedDateTime.hashCode());
		result = prime * result + ((personalSalaryAcc == null) ? 0 : personalSalaryAcc.hashCode());
		result = prime * result + ((registeredMobNumber == null) ? 0 : registeredMobNumber.hashCode());
		result = prime * result + ((seqBankAcc == null) ? 0 : seqBankAcc.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		if (!(obj instanceof BankAccountDetailsDTO))
			return false;
		BankAccountDetailsDTO other = (BankAccountDetailsDTO) obj;
		if (accHolderName == null) {
			if (other.accHolderName != null)
				return false;
		} else if (!accHolderName.equals(other.accHolderName))
			return false;
		if (accountCategory == null) {
			if (other.accountCategory != null)
				return false;
		} else if (!accountCategory.equals(other.accountCategory))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (activeStatus == null) {
			if (other.activeStatus != null)
				return false;
		} else if (!activeStatus.equals(other.activeStatus))
			return false;
		if (alternateMobileNumber == null) {
			if (other.alternateMobileNumber != null)
				return false;
		} else if (!alternateMobileNumber.equals(other.alternateMobileNumber))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (electronicCardNumber == null) {
			if (other.electronicCardNumber != null)
				return false;
		} else if (!electronicCardNumber.equals(other.electronicCardNumber))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
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
		if (personalSalaryAcc == null) {
			if (other.personalSalaryAcc != null)
				return false;
		} else if (!personalSalaryAcc.equals(other.personalSalaryAcc))
			return false;
		if (registeredMobNumber == null) {
			if (other.registeredMobNumber != null)
				return false;
		} else if (!registeredMobNumber.equals(other.registeredMobNumber))
			return false;
		if (seqBankAcc == null) {
			if (other.seqBankAcc != null)
				return false;
		} else if (!seqBankAcc.equals(other.seqBankAcc))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
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
