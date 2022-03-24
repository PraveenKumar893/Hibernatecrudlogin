package com.Hibernatecrudlogin.Hibernatecrud.config;

import java.util.Properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan(basePackages="com.Hibernatecrudlogin.Hibernatecrud")
@EnableWebMvc
public class MvcConfiguration 
{

	@Autowired
    private Environment environment;

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		bds.setUrl(environment.getRequiredProperty("jdbc.url"));
		bds.setUsername(environment.getRequiredProperty("jdbc.username"));
		bds.setPassword(environment.getRequiredProperty("jdbc.password"));
	
		System.out.println("Welcome to Database  Connectivity");
		return bds;
	}
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		System.out.println("Welcome to Hibernate  Connectivity");
        return properties;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactories() {
	
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        sessionFactory.setPackagesToScan(new String[] {
            "com.Hibernatecrudlogin.Hibernatecrud.entity" 
        });

        sessionFactory.setHibernateProperties(hibernateProperties());
		System.out.println("Welcome to Session factory  Connectivity");

        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactories().getObject());
		System.out.println("Welcome to Transcition managae  Connectivity");

        return transactionManager;
    }


	
}
