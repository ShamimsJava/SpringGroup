package com.shamim.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shamim/beans/beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		
		Employee emp2 = (Employee)context.getBean("employee2");
		
		System.out.println(emp);
		
		System.out.println(emp2);
			
		((ClassPathXmlApplicationContext)context).close();
	}
}
