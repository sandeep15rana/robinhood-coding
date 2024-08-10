package com.infy.dto;

public class EmployeeDTO {
	
	private int empId;
	private String empName;
	private String empDep;
		
	// getter and setter methods
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDep() {
		return empDep;
	}
	
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	
	// List of All Employee
	
	public void EmployeeDTO(int empId, String empName, String empDep) {
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
	}
	
	@Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + empDep + '\'' +
                '}';
    }

}
