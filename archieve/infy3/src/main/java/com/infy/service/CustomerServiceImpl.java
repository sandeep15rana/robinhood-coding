package com.infy.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  implements CustomerService {
	
	@Value("10")
	private int count;
	
	@Override
	public String fetchCustomer() {
		return "The no of customer are: " + count ;
	}
	
	@Override
	public String createCustomer() {
		return "customer is successfully created";
	}
}
