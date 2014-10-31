package myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		Person kushal = new Person(1, "Kushal");
		kushal.speak();
		System.out.println(kushal);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"myappbean/beans.xml");
		// Person kushalbean = (Person) context.getBean("kushalbean");
		// kushalbean.speak();
		// System.out.println(kushalbean);
		Person kushalbeanwithFruit = (Person) context
				.getBean("kushalbeanwithFruit");
		System.out.println(kushalbeanwithFruit.personFruit());

		((ClassPathXmlApplicationContext) context).close();
	}
}
