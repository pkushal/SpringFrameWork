package helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// This will create the spring bean container and we can use this
		// container to get beans from it.

		// ApplicationContext context = new FileSystemXmlApplicationContext(
		// "/src/main/java/helloSpring_beans/beans.xml");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"helloSpring_beans/beans.xml");

		Person person = (Person) context.getBean("person");
		// Person person1 = (Person) context.getBean("person");
		// person.speak();

		person.setTaxId(777);
		System.out.println(person);
		// System.out.println(person1);

		Address address = (Address) context.getBean("address");
		Address address2 = (Address) context.getBean("address2");
		System.out.println(address2);
		address.notifyAll();
		// System.out.println(address);
		// ((FileSystemXmlApplicationContext) context).close();
		((ClassPathXmlApplicationContext) context).close();
	}

	/*
	 * We can use either FileSystemXmlApplicationContext() or
	 * ClassPathXmlApplicationContext(). The former requires to give the correct
	 * file path while in the later we can just give the package directory.
	 * 
	 * Here we have created a new package called helloSpring_beans and dragged
	 * the beans.xml into it. If I right click on the beans.xml now, I can
	 * select the copy qualified name and paste it where it is required
	 */
}
