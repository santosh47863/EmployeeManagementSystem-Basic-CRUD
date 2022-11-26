package com.cg.ems.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private Integer empId;
    private String empName;
    private String designation;
    private String address;
   
    public Employee() {
    	
    }

	public Employee(Integer empId, String empName, String designation, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
   
	
}


