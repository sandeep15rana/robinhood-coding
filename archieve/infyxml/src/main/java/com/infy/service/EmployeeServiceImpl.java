package com.infy.service;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeService;

import org.springframework.stereotype.*;

@Service
// EmployeeServiceImpl is annotated with @Service, making it a Spring-managed bean.

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public void insert(EmployeeDTO emp) {
		System.out.println("Inserted: " + emp );
	}
	
	@Override
	public void delete( int empId) {
		System.out.println("Deleted employee with Id: " + empId);
	}
	
}
