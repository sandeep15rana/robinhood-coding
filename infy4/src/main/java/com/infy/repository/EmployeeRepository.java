package com.infy.repository;

import java.util.List;

import com.infy.dto.*;

public interface EmployeeRepository {
	
	public void insert(EmployeeDTO employee);
	public void remove(int empId);
	public List<EmployeeDTO> fetchEmployee();

}
