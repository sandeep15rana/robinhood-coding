package com.infy.config;
import com.infy.service.*;
import com.infy.repository.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.infy.repository.*;
 

// SpringConfiguration class is annotated with @Configuration,
// indicating that it contains Spring bean definitions.

@Configuration
public class SpringConfiguration {
	
	//The employeeService method is annotated with @Bean, defining a bean of type EmployeeService
	
	@Bean
	public EmployeeRepository employeeRepository() {
		return new EmployeeRepositoryImpl();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeRepository());
	}
	
}
