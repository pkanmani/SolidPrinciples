package com.OpenClosed.Sample1;

public class Employee extends Person {
	
	private String name;
	private String empCode;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		Employee emp = new Employee();
		emp.name=person.getName();
		
		System.out.println("Employee Name :" +emp.getName());
		//Bad Practice
		System.out.println("First Person Name :"+person.getName());
		
		person.setName("Preetha");
		System.out.println("Second Person Name :"+person.getName());
		
	}

}
