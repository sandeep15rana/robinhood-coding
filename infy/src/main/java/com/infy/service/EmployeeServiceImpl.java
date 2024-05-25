package com.infy.service;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeService;

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
