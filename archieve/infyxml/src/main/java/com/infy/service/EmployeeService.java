package com.infy.service;
import com.infy.dto.EmployeeDTO;

public interface EmployeeService {
	
	void insert(EmployeeDTO emp);
	void delete(int empId);

}
