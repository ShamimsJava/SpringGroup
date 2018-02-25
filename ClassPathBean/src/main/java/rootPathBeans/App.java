package rootPathBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/beans/beans.xml");
		
		Person p = (Person)context.getBean("person");
		
		p.getName();
	}
}
