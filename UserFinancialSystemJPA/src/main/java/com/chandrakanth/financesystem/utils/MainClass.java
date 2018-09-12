package com.chandrakanth.financesystem.utils;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandrakanth.financesystem.dao.impl.DAOImpl;
import com.chandrakanth.financesystem.entity.UserCredentials;
import com.chandrakanth.financesystem.entity.UserCredentialsIdPK;
import com.chandrakanth.financesystem.entity.UserProfile;

/*@Repository*/

//@PropertySource(value = { "classpath:db.properties" })
//@org.springframework.context.annotation.Configuration
public class MainClass {

	private static ApplicationContext appContext = null;
	private static final Logger LOGGER = Logger.getLogger(MainClass.class);

	static {
		if (appContext == null) {
			appContext = new ClassPathXmlApplicationContext(AppConstants.BEAN_PROPERTIES);
		}
		LOGGER.info("Loaded Bean Properties.....");

	}

	public static void main(String[] argz) throws Exception {
		/* LOGGER.info(configClass); */
		LOGGER.info("*****************************************************************\tEntered Main Class....");
		DAOImpl daoImpl = appContext.getBean(DAOImpl.class);
		daoImpl.persistValues(getUCDetails(), null);
	}

	private static UserCredentials getUCDetails() {
		UserCredentialsIdPK userID = new UserCredentialsIdPK("a", "+91293234942");
		UserCredentials uC = new UserCredentials();
		uC.setUserId(userID);
		uC.setPassWord("BINGLE");
		uC.setCreatedDateTime(DateUtil.returnCreatedModifiedDateTime(LocalDateTime.now()));
		uC.setModifiedDateTime(DateUtil.returnCreatedModifiedDateTime(LocalDateTime.now()));
		return uC;
	}
	
	private static UserProfile getUserProfileDetails() {
		UserCredentialsIdPK userID = new UserCredentialsIdPK("aage", "+91 7930334942");
		UserCredentials uC = new UserCredentials();
		uC.setUserId(userID);
		uC.setPassWord("BINGLE");
		UserProfile uP = new UserProfile();
		uP.setAddress("ADDR");
		uP.setCity("CHITTOOR");
		uP.setDateOfBirth("04-APR-91");
		uP.setDisplayName("DISP");
		uP.setEmailId("EMAILID");
		uP.setFirstName("FNAME");
		uP.setLastName("LNAME");
		uP.setPinCode("600000");
		uP.setState("AP");
//		uP.setUserName("aage");
//		uP.setMobileNumber("+91 7930334942");
		uP.setUserCredentials(uC);
		return uP;
	}

	/*
	 * private static void setSessionFactory() { // ConfigurationMap Map<String,
	 * String> configMap = new HashMap<String, String>();
	 * configMap.put(Environment.DRIVER, "${driverClass}");
	 * configMap.put(Environment.URL, "${url}"); configMap.put(Environment.USER,
	 * "${uname}"); configMap.put(Environment.PASS, "${pass}");
	 * configMap.put(Environment.DIALECT, "${hibernate.dialect}"); // Basic Config
	 * // sRB StandardServiceRegistry sB = new
	 * StandardServiceRegistryBuilder().applySettings(configMap).build();
	 * 
	 * MetadataSources metadataSources = new MetadataSources(sB);
	 * 
	 * Metadata metadata = metadataSources.getMetadataBuilder().build();
	 * 
	 * sessionFactory = metadata.getSessionFactoryBuilder().build(); }
	 */
}
