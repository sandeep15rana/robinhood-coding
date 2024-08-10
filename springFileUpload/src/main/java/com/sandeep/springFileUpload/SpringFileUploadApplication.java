package com.sandeep.springFileUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFileUploadApplication.class, args);
	}

}
