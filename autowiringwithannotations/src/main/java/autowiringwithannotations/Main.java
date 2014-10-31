package autowiringwithannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");
		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("Oh yeah this is console");
		logger.writeFile("Oh I see this is calling the filewriter from the main class");
		((ClassPathXmlApplicationContext) context).close();
	}

}
