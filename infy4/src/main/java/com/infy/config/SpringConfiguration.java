package com.infy.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.repository.EmployeeRepository;
import com.infy.repository.EmployeeRepositoryImpl;
import com.infy.service.*;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public EmployeeRepository employeeRepository() {
		return new EmployeeRepositoryImpl();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeRepository());
	}

}
