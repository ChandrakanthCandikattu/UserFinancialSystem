package com.chandrakanth.financesystem.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandrakanth.financesystem.entity.UserCredentials;
import com.chandrakanth.financesystem.entity.UserProfile;

@Component
public class DAOImpl implements DisposableBean/* , InitializingBean */ {

	private static final Logger LOGGER = Logger.getLogger(DAOImpl.class);

	public DAOImpl() {
		super();
	}

	public DAOImpl(SessionFactory sFactory) {
		this.factory = sFactory;
	}

	/*
	 * @Autowired private SessionFactory session;
	 */
	@Autowired
	private SessionFactory factory;

	@Transactional
	public void persistValues(UserCredentials userCredentials, UserProfile uProfile) {
		Transaction tr = null;
		try {
			LOGGER.info("***Getting the current transaction***");
			tr = factory.openSession().beginTransaction();

			if (uProfile != null) {
				factory.getCurrentSession().persist(uProfile);
			} else if (userCredentials != null) {
				factory.getCurrentSession().persist(userCredentials);
			}

			/*
			 * Query q = factory.getCurrentSession().getNamedQuery("query3");
			 * q.setMaxResults(3); System.out.println(q.list()); Query q2 =
			 * factory.getCurrentSession().getNamedQuery("query4"); q2.setMaxResults(3);
			 * System.out.println(q2.list());
			 */
			factory.getCurrentSession().flush();
			tr.commit();

		} catch (Exception e) {
			System.out.println(e);
		}
		/*
		 * finally { if (factory.getCurrentSession().isConnected()) {
		 * factory.getCurrentSession().close(); }
		 * 
		 * }
		 */
	}

	@Override
	public void destroy() throws Exception {
		if (factory.getCurrentSession().isConnected()) {
			factory.getCurrentSession().close();
		}
	}

}
