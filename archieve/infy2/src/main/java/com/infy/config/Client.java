package com.infy.config;

import com.infy.service.*;
import com.infy.dto.*;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		// The Client class uses AnnotationConfigApplicationContext to load the Spring context 
		// from SpringConfiguration.
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		// The EmployeeService bean is retrieved from the context and used to perform operations.
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		EmployeeDTO emp = new EmployeeDTO();
		
		emp.setEmpId(1);
		emp.setEmpName("Sandeep");
		emp.setDepartment("FIGS");
		employeeService.insert(emp);
		
		// Get all employee 
		
		List<EmployeeDTO> employee = employeeService.getAllEmployees();
        employee.forEach(System.out::println);
		
		
		employeeService.delete(1);
		
		context.close();
	}
}
