package com.techelevator;

public class Employee {
	
	public Employee() {
		
	}
	
	
	public Employee(String firstName,String lastName,String email,
			Department department, String  hireDate, long employeeId) {
		this.department=department;
		this.email=email;
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.hireDate=hireDate;
	}
	public String getFullName() {
		
		return lastName+", "+ firstName;
	}
	public double raiseSalary(double percent) {
		
		return salary+salary*percent/100;
	}

	
	private long employeeId;
	private String firstName;
	private String lastName;
	private  String email;
	private   double salary=60000.00;
	private  Department department;
	private  String hireDate;
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	 
}
