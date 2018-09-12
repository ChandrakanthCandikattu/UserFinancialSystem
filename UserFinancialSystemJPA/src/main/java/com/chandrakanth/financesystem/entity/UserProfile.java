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
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@NamedQuery(query="From UserProfile", name = "query2")
@Entity
@Table(name = "USER_PROFILE")
public class UserProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEQ_USER_PROFILE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UP_PK")
	@SequenceGenerator(allocationSize = 50, name = "SEQ_UP_PK", sequenceName = "SEQ_USER_PROFILE")
	private Integer userProfileIdPk;

	// A single user of unique username and mobile number will have one user profile
	// uni-Directional One-To-One relation
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "USER_NAME", referencedColumnName="USER_NAME"), 
		@JoinColumn(name = "MOBILE_NUMBER", referencedColumnName = "MOBILE_NUMBER") })
//	@Transient
	private UserCredentials userCredentials;

	/*@Column(name = "P_USER_NAME")
	private String userName;

	@Column(name = "P_MOBILE_NUMBER")
	private String mobileNumber;
*/
	@Column(name = "ACTIVE_STATUS", length = 1, columnDefinition = "DEFAULT VALUE IS MAINTAINED AS 'Y' in DB")
	private Integer activeStatus;

	@Column(name = "DISPLAY_NAME", nullable = false)
	private String displayName;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "EMAIL_ID", nullable = false)
	private String emailId;

	@Column(name = "AGE", nullable = true)
	private Integer age;

	@Column(name = "HEIGHT", nullable = true)
	private String height;

	@Column(name = "WEIGHT", nullable = true)
	private String weight;

	@Column(name = "ADDRESS", nullable = false)
	private String address;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "PR_STATE", nullable = false)
	private String state;

	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private String dateOfBirth;

	@Column(name = "PIN_CODE", nullable = false)
	private String pinCode;

	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;

	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getUserProfileIdPk() {
		return userProfileIdPk;
	}

	public void setUserProfileIdPk(Integer userProfileIdPk) {
		this.userProfileIdPk = userProfileIdPk;
	}

	/*public String getUserName() {
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
	}*/

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
		result = prime * result + ((userProfileIdPk == null) ? 0 : userProfileIdPk.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof UserProfile))
			return false;
		UserProfile other = (UserProfile) obj;
		if (userProfileIdPk == null) {
			if (other.userProfileIdPk != null)
				return false;
		} else if (!userProfileIdPk.equals(other.userProfileIdPk))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
