package com.infy.spring_maven;

//public class SpringConfiguration {
//
//}

//package com.infy.spring_maven.util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.infy.spring_maven.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean(name = "customerService")
	public CustomerServiceImpl customerServiceImpl() {
		return new CustomerServiceImpl();
	}
}
