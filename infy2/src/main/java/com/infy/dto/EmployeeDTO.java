package com.infy.dto;

public class EmployeeDTO {
	
	private int empId;
	private String empName;
	private String department;

	// Getter and Setter Methods
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId( int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName (String empName) {
		this.empName = empName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment (String department) {
		
		this.department = department;
	}
	
	@Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
	
}
