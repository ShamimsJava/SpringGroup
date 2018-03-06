package com.shamim.code;

public class FactoryClass {

	public Employee fClassFactory(int id, String name) {
		
		System.out.println("Factory Class Working....");
		
		Employee employee = new Employee(id, name);

		return employee;
	}
}
