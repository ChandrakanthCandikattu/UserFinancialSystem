package com.chandrakanth.financesystem.utils;

import static org.hibernate.cfg.AvailableSettings.C3P0_ACQUIRE_INCREMENT;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_STATEMENTS;
import static org.hibernate.cfg.AvailableSettings.C3P0_MIN_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_TIMEOUT;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.DriverManagerDataSource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class DataSourceConfiguration {

	public DataSourceConfiguration() {

	}

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dS = new DriverManagerDataSource();
		dS.setDriverClass(env.getProperty("oracle.driver"));
		dS.setJdbcUrl(env.getProperty("oracle.url"));
		dS.setUser(env.getProperty("oracle.user"));
		dS.setPassword(env.getProperty("oracle.password"));
		return (DriverManagerDataSource)dS;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		Properties props = new Properties();
		// Setting JDBC properties
//		props.put(DRIVER, env.getProperty("oracle.driver"));
//		props.put(URL, env.getProperty("oracle.url"));
//		props.put(USER, env.getProperty("oracle.user"));
//		props.put(PASS, env.getProperty("oracle.password"));
		// Setting Hibernate properties
		props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
		props.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		
		// Setting C3P0 properties
		props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
		props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
		props.put(C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
		props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
		props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(props);
		factoryBean.setPackagesToScan("com.chandrakanth.financesystem.entity");
		factoryBean.setMappingResources("Queries.hbm.xml");
		return factoryBean;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}

}