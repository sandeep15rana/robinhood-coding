package com.sandeep.springEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.sandeep.springEmailDemo.service.EmailService;

@SpringBootApplication
public class SpringEmailDemoApplication {
	
	@Autowired
	private EmailService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendMail( "bekham14david@gmail.com", 
							   "Test Email from SpringBoot",
							   "This is body of Email");
		
	}

}
