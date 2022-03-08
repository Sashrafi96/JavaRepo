package com.mars.returnship;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
//		emp1.department="Sales";
//		emp1.empId="E1010";
//		emp1.name="John";
//		emp1.salary=3000;
		
		emp1.setEmpId("E102");
		emp1.setDepartment("Sales");
		emp1.setName("Safia");
		emp1.setSalary(3000.50);
		
		Employee emp2 = new Employee("Kevin",2000,"E102","Marketing");
		
		System.out.println(emp1.getEmployeeInfo());
		System.out.println(emp2.getEmployeeInfo());
	}

}
