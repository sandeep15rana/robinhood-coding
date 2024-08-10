package com.infy.config;
import com.infy.service.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.*;


@SpringBootApplication
public class Demo6Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Demo6Application.class, args);
		
//		service = (CustomerServiceImpl) context.getBean("customerService");
        EmployeeService service = context.getBean(EmployeeService.class);

		System.out.println("service.fetchCustomer()");

	}

}
