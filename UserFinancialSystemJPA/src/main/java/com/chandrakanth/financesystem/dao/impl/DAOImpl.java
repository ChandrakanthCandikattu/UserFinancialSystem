package com.chandrakanth.financesystem.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.chandrakanth.financesystem.entity.UserCredentials;
import com.chandrakanth.financesystem.entity.UserProfile;
import com.chandrakanth.financesystem.utils.HibernateSessionUtils;

@Component
public class DAOImpl {

	private static final Logger LOGGER = Logger.getLogger(DAOImpl.class);

	public DAOImpl() {
		super();
	}

	
	private SessionFactory factory = HibernateSessionUtils.getSessionFactoryInstance();

/*	public void setSessionFactory(SessionFactory factory) {
		this.factory = factory;
	}*/

	@Transactional(isolation=Isolation.READ_COMMITTED)
	public boolean persistValues(UserCredentials userCredentials, UserProfile uProfile) {
		Session session = null;
		/*try {*/
//			LOGGER.info("***Getting the current transaction***");
			session = factory.openSession();
			Transaction tr = session.beginTransaction();

			/*if (uProfile != null) {
				session.persist(uProfile);
			} else if (userCredentials != null) {
				session.persist(userCredentials);
			}*/

			Query q = session.getNamedQuery("query3");
			q.setMaxResults(3);
			System.out.println(q.list());
		/*}*//* catch (Exception e) {
			
		}*/
		/*finally {
			if(session.isConnected()) {
				session.close();
			}
		}*/
		return true;
	}

}
