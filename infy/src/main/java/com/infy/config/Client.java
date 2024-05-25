package com.infy.config;

import com.infy.service.*;
import com.infy.dto.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		EmployeeDTO emp = new EmployeeDTO();
		
		emp.setEmpId(1);
		emp.setEmpName("Sandeep");
		emp.setDepartment("FIGS");
		employeeService.insert(emp);
		
		employeeService.delete(1);
		
		
	}
}
