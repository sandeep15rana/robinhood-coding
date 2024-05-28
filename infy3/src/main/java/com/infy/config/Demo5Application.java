package com.infy.config;
import com.infy.service.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.*;

@SpringBootApplication
public class Demo5Application {
	
	public static void main(String[] args) {
		
//		CustomerServiceImpl service = null;
		
//		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(Demo5Application.class, args);
		
		ApplicationContext context = SpringApplication.run(Demo5Application.class, args);
		
//		service = (CustomerServiceImpl) context.getBean("customerService");
        CustomerService service = context.getBean(CustomerService.class);

		System.out.println("service.fetchCustomer()");
		
//		context.close();
		
	}

}
