package com.financesystem.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Chandrakanth
 */

/**
 * Web.xml Equivalent implementation
 *
 */
public class MyApplicationInitializer
		/* implements WebApplicationInitializer */ extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { UserFinancialSystemBeanConfigurator.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { ApplicationConstants.FILTER_PATH };
	}

}
