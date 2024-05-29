package com.infy.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.infy.dto.EmployeeDTO;
 
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	
	public List<EmployeeDTO> employee = null;
	
	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setEmpDep("ETA");
		
		employee  = new ArrayList<>();
		employee.add(employeeDTO);
		
	}

	@Override
	public void insert(EmployeeDTO emp) {
		employee.add(emp);
	}
	
	@Override
	public void remove(int empId) {
		employee.remove(empId);
	}
	
	@Override
	public List<EmployeeDTO> fetchEmployee(){
		return new ArrayList<>(employee);
	}

}
