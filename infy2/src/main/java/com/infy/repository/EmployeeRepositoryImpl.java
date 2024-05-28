package com.infy.repository;

import java.util.ArrayList;
import javax.annotation.*;
import java.util.List;

import com.infy.dto.EmployeeDTO;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	
//	List<EmployeeDTO> employee = null;
	private List<EmployeeDTO> employee = null;
		
	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setDepartment("ETA");
		
		employee  = new ArrayList<>();
		employee.add(employeeDTO);
		
	}
	
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		employee.add(emp);
	}
	
	@Override
	public void removeEmployee(int empId) {
		employee.remove(empId);
	}
	
	public List<EmployeeDTO> fetchCustomer(){
//		return employee;
		return new ArrayList<>(employee);
	}
}
