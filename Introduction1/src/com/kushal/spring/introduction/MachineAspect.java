package com.kushal.spring.introduction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MachineAspect {
	@DeclareParents(value = "com.kushal.spring.introduction.*", defaultImpl = com.kushal.spring.introduction.Machine.class)
	private IMachine machine;

	@Around("within(com.kushal.spring.introduction.*)")
	public void runMachine(ProceedingJoinPoint jp) {
		System.out.println("Running... from aspect...");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed..");
	}
}
