package com.kushal.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() throws Exception {
		System.out.println("snapped");
//		throw new Exception("bye bye");
	}

	/*
	 * public void snap(int exposure) {
	 * System.out.println("snapped for "+exposure+" milliseconds"); }
	 * 
	 * public String snap(String name) {
	 * System.out.println("snapped with "+name+" camera"); return name; }
	 * 
	 * public void snapNight() { System.out.println("snapped Night Mode"); }
	 */
}
