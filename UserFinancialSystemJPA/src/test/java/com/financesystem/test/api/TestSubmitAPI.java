package com.financesystem.test.api;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chandrakanth.financesystem.dao.impl.DAOImpl;
import com.financesystem.test.util.SessionFactoryTestUtility;

public class TestSubmitAPI {

	public TestSubmitAPI() {
			
	}
	
	private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void setup() {
		sessionFactory = SessionFactoryTestUtility.getSessionFactory();
	}
	
	@Test
	public void testSubmitLogin() {
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.setSessionFactory(sessionFactory);
		daoImpl.persistValues(null, null);
	}
	
}
