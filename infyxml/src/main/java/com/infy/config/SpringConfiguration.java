package com.infy.config;
import com.infy.service.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration 

// SpringConfiguration class is annotated with @Configuration,
// indicating that it contains Spring bean definitions.

public class SpringConfiguration {
	
	@Bean
	//The employeeService method is annotated with @Bean, defining a bean of type EmployeeService
	
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}
	
}
