package com.traing.core;

public class Employee implements Comparable
{
	
	private int empId;
	private String name,designation;
	
	public Employee(int empId,String name,String designation)
	{
		this.empId=empId;
		this.name=name;
		this.designation=designation;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return e.getDesignation().compareTo(this.designation);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + "] \n";
	}
	
}
