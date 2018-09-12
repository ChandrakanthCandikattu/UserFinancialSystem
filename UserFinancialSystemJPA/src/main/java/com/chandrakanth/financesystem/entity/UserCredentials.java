package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Chandrakanth
 */
/**
 * This Entity handles the User Credentials for the login in UserFinancialSystem
 * Portal
 */
@NamedQuery(name="query1", query="FROM UserCredentials")
@Entity
@Table(name = "USER_CREDENTIALS")
public class UserCredentials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private static final Logger LOGGER = Logger.getLogger(UserCredentials.class);

	@EmbeddedId
	private UserCredentialsIdPK userId;

	@Column(name = "ACTIVE_STATUS", updatable = true, columnDefinition = "DEFAULT VALUE IS MAINTAINED AS 'Y' in DB")
	private String activeStatus;

	@Column(name = "PASSWORD", nullable = false, updatable = true, insertable = true)
	private String passWord;

	@Column(name = "CREATED_DATETIME", nullable = true)
	private String createdDateTime;

	@Column(name = "MODIFIED_DATETIME", nullable = true)
	private String modifiedDateTime;

	public UserCredentialsIdPK getUserId() {
		return userId;
	}

	public void setUserId(UserCredentialsIdPK userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getCreatedDateTime() {
		return String.valueOf(createdDateTime);
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
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserCredentials other = (UserCredentials) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
