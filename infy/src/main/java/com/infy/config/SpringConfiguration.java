package com.infy.config;
import com.infy.service.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}
	
}
