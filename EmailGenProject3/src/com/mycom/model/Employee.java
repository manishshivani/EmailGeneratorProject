package com.mycom.model;

public class Employee {
	
	private String empFirstName;
	private String empLastName;

	
	public String getEmpFirstName() {
		return empFirstName;
	}
	
	public void setEmpFirstName(String empFirstName)
	{
		this.empFirstName= empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}
	
	public void setEmpLastName(String empLastName)
	{
		this.empLastName= empLastName;
	}	
	
	public Employee(String empFirstName, String empLastName)
	{
		this.empFirstName= empFirstName;
		this.empLastName= empLastName;		
		
	}
}
