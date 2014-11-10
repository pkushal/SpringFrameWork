package com.kushal.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/spring/aop/beans.xml");

		Camera camera = (Camera) context.getBean("camera");
		try {
			camera.snap();
		} catch (Exception e) {
			System.out.println("Caught Exception " + e.getMessage());
		}
		/*
		 * camera.snap(12); camera.snap("Nikon"); camera.snapNight();
		 * 
		 * Lens lens = (Lens) context.getBean("lens"); lens.zoom(5);
		 */
		context.close();// If you had used the application context instead of
						// classpathxmlapplicationcontext, then you will need to
						// cast it before calling the close().

	}
}
