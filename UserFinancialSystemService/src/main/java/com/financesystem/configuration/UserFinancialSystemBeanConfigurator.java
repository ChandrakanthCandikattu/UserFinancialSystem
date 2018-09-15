/**
 * @author Chandrakanth
 */

package com.financesystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Spring Bean Configuration - Programmatic Approach
 *
 */
@Configuration // Replacement to Spring Configuration File
@EnableWebMvc // Replacement to <mvc:annotation-config/>
@ComponentScan(basePackages = { "com.financesystem.controllers","com.financesystem.api" }) 
// Replacement to <context:component-scan>
public class UserFinancialSystemBeanConfigurator extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix(ApplicationConstants.VIEW_LOCATION_PREFIX);
		viewResolver.setSuffix(ApplicationConstants.VIEW_SUFFIX);
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/views/icons/**").addResourceLocations("/views/icons/");
		registry.addResourceHandler("/views/scripts/**").addResourceLocations("/views/scripts/");
		registry.addResourceHandler("/views/snaps/**").addResourceLocations("/views/snaps/");
		registry.addResourceHandler("/views/stylesheets/**").addResourceLocations("/views/stylesheets/");
		registry.addResourceHandler("/views/cdnscripts/**").addResourceLocations("/views/cdnscripts/");
	}
}
