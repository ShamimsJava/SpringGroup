package com.shamim.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shamim/beans/beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		
		for(String n : emp.getName()) {
			System.out.println(n);
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
