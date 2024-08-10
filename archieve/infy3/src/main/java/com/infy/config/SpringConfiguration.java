package com.infy.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.service.*;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public CustomerService customerService(){
		return new CustomerServiceImpl();
	}
}
