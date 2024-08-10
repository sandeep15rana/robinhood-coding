package com.infy.service;
import java.util.List;

import com.infy.dto.EmployeeDTO;

public interface EmployeeService {
	
	void insert(EmployeeDTO emp);
	void delete(int empId);
	List<EmployeeDTO> getAllEmployees();
	
}
