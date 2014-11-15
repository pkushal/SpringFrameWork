package com.kushal.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/spring/introduction/beans.xml");
		IBlender blender = (IBlender) context.getBean("blender");
		blender.blend();
		((IMachine) blender).start();
		IFan fan = (IFan) context.getBean("fan");
		fan.activate(5);
		((IMachine) fan).start();
		context.close();
	}
}
