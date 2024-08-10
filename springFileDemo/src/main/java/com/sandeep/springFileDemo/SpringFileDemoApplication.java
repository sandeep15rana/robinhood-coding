package com.sandeep.springFileDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandeep.springFileDemo.controller.FileController;

@SpringBootApplication
public class SpringFileDemoApplication {

    // Logger added 
    private static final Logger logger = LoggerFactory.getLogger(SpringFileDemoApplication.class);

	public static void main(String[] args) {
		
		logger.info("SpringBoot application started executing...");
		SpringApplication.run(SpringFileDemoApplication.class, args);
	}

}
