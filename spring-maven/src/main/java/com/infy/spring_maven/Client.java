package com.infy.spring_maven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.infy.spring_maven.service.CustomerServiceImpl;
//import com.infy.spring_maven.util.SpringConfiguration;

public class Client {
	public static void main(String[] args) {
		CustomerServiceImpl service = null;
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		service = (CustomerServiceImpl) context.getBean("customerService");
		System.out.println(service.createCustomer());
		context.close();
	}
}
