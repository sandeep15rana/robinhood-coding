package com.infy.config;

import com.infy.service.*;
import com.infy.dto.*;

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
		
		employeeService.delete(1);
		
	}
}
