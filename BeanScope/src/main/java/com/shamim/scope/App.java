package com.shamim.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shamim/beans/beans.xml");
		
		Person p1 = (Person)context.getBean("person");
		
		Person p2 = (Person)context.getBean("person");
		
		p2.setName("Parvez");
		
		System.out.println(p1);
		
		System.out.println(p2);
	}
}