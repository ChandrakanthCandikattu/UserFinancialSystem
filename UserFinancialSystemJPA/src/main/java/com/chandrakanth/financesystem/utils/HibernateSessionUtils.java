package com.chandrakanth.financesystem.utils;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class HibernateSessionUtils {

	/*@Autowired*/
	private SessionFactory beanSessionFactory;

	private static SessionFactory sessionFactory;

	private HibernateSessionUtils() {
		super();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@PostConstruct
	private void transferSessionFactory() {
		System.out.println("Bean Session Factory Post Construct called");
		HibernateSessionUtils.sessionFactory = beanSessionFactory;
	}

}
