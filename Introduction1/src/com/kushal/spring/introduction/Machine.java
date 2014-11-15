package com.kushal.spring.introduction;

public class Machine implements IMachine {

	@Override
	public void start() {
		System.out.println("Machine starting...");
	}

}
