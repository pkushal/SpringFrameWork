package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spel_beans/beans.xml");
		Robot robot = (Robot) context.getBean("robot");
		robot.speak();

		((ClassPathXmlApplicationContext) context).close();
	}
}
