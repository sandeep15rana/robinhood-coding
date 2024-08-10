package com.infy.repository;

import java.util.List;

import com.infy.dto.EmployeeDTO;

public interface EmployeeRepository {
	
	void insertEmployee(EmployeeDTO emp);
	void removeEmployee(int empId);
	List<EmployeeDTO> fetchCustomer();
	
}
