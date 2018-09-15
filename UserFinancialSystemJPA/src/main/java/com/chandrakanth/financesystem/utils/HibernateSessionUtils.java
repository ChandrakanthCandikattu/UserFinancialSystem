package com.chandrakanth.financesystem.utils;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class HibernateSessionUtils {
	
	@Autowired
	private SessionFactory beanSessionFactory;

	private static SessionFactory sessionFactory;

	private HibernateSessionUtils() {
		super();
	}

	public static SessionFactory getSessionFactoryInstance() {
		return sessionFactory;
	}

	@PostConstruct
	private void transferSessionFactory() {
		System.out.println("Bean Session Factory Post Construct called");
		HibernateSessionUtils.sessionFactory = beanSessionFactory;
	}

}
