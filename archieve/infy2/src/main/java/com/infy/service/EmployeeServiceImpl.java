package com.infy.service;
import com.infy.dto.EmployeeDTO;
import com.infy.repository.*;
import com.infy.service.EmployeeService;

import java.util.List;

import org.springframework.stereotype.*;

@Service
// EmployeeServiceImpl is annotated with @Service, making it a Spring-managed bean.

public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	// constructor to inject EmployeeRepository
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

//	EmployeeRepository employeeDAO = new EmployeeRepositoryImpl();
	
	public void insert(EmployeeDTO emp) {
		employeeRepository.insertEmployee(emp);
	}
	
	public void delete(int empId) {
		employeeRepository.removeEmployee(empId);
	}
	
	public List<EmployeeDTO> getAllEmployees(){
		return employeeRepository.fetchCustomer();
	}
	
}
