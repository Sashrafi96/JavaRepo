package com.mars.returnship;

public class Employee { //POJO /java Beans
	private String name;
	private double salary;
	private String empId;
	private String department;

	//Constructors

	public Employee() {

	}

	public Employee(String name,double salary, String empId, String department) {
		this.name = name;
		this.salary=salary;
		this.empId=empId;
		this.department=department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		if (empId.equals(this.empId)) {
			System.out.println("EmpId already exists");
		} else {
			this.empId = empId;
		}

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeInfo() {
		return "Name: "+name+" EmpId: "+empId+" Salary: "+salary+" Department: "+ department;
	}


}
