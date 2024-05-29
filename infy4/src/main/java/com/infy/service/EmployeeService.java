package com.infy.service;

import java.util.List;

import com.infy.dto.*;

public interface EmployeeService {
	
	public void insetEmployee(EmployeeDTO employee);
	public void removeEmployee(int empId);
	List<EmployeeDTO> getAllEmployee();

}
