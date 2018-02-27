package com.shamim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		System.out.println(person);
	}
}