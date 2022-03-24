package com.Hibernatecrudlogin.Hibernatecrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class config 
{

@Bean
public DriverManagerDataSource getDataSource() {
	
		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("oracle");
	
		System.out.println("Welcome to Databse Connectivity");
		return bds;
	}
	
	

}
