package com.infy.service;

import com.infy.dto.*;
import com.infy.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
	
	@Autowired
	private final EmployeeRepository employeeRepository; // Property based Autowiring
	
	// constructor to inject EmployeeRepository
	
    // Setter or Constructor based Autowiring
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) { 
		this.employeeRepository = employeeRepository;
	}

//	@Autowired
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) { // Constructor-based DI
//        this.employeeRepository = employeeRepository;
//    }
	
	@Override
	public void insetEmployee(EmployeeDTO employee) {
		System.out.println("Employee details has been inserted");
		employeeRepository.insert(employee);
	}

	@Override
	public void removeEmployee(int empId) {
		
		System.out.println("Employee details has been removed");
		employeeRepository.remove(empId);
	}
	
	public List<EmployeeDTO> getAllEmployee(){
		return employeeRepository.fetchEmployee();
	}

}
