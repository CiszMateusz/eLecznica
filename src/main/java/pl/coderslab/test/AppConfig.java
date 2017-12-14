package pl.coderslab.test;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import pl.coderslab.converter.AnimalConverter;
import pl.coderslab.converter.CustomerConverter;
import pl.coderslab.converter.WarehouseConverter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.coderslab")
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
		emfb.setPersistenceUnitName("bookstorePersistenceUnit");
		return emfb;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager tm = new JpaTransactionManager(emf);
		return tm;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Override
	public void addFormatters(FormatterRegistry registry) {
	    registry.addConverter(getCustomerConverter());
	    registry.addConverter(getAnimalConverter());
	    registry.addConverter(getWarehouseConverter());
	}
	@Bean
	public WarehouseConverter getWarehouseConverter() {
	    return new WarehouseConverter();
	}
	@Bean
	public AnimalConverter getAnimalConverter() {
	    return new AnimalConverter();
	}
	@Bean
	public CustomerConverter getCustomerConverter() {
	    return new CustomerConverter();
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/styles/**")
		.addResourceLocations("/css/").setCachePeriod(31556926);    
	}
}