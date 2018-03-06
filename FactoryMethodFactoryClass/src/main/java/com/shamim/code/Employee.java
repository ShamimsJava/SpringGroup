package com.shamim.code;

public class Employee {

	private int id;
	private String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Employee factoryMethod(int id, String name) {
		
		System.out.println("I am working...");
		
		Employee employee = new Employee(id, name);
		
		return employee;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
