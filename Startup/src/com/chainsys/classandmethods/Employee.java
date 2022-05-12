package com.chainsys.classandmethods;

public class Employee {
    private final int EmployeeID;
	private String name;
	private String city;
	private String salary;

	//constructor
	public Employee(int id) {
	
		
		        //Assign value to read only
		 this.EmployeeID=id;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
	


