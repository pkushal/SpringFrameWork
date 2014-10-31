package logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"loggerbeans/beans.xml");
		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("hello there");
		logger.writeFile("Hi again");
		((ClassPathXmlApplicationContext) context).close();
	}

}
