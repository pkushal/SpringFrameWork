package com.kushal.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	@Pointcut("execution(* com.kushal.spring.aop.Camera.snap())")
	public void dummy() {
	}

	/*
	 * @Pointcut("execution(* com.kushal.spring.aop.Camera.snap(String))")
	 * public void dummy1() { }
	 * 
	 * @Pointcut("execution(* com.kushal.spring.aop.*.*(..))") public void
	 * dummy2() { }
	 */

	@Before("dummy()")
	public void beforeAdvice() {
		System.out.println("Before Advice...");
	}

	@After("dummy()")
	public void afterAdvice() {
		System.out.println("After Advice...");
	}

	@AfterReturning("dummy()")
	public void afterReturningAdvice() {
		System.out.println("After Returning Advice...");
	}

	@AfterThrowing("dummy()")
	public void afterThrowingAdvice() {
		System.out.println("After Throwing Advice...");
	}

	@Around("dummy()")
	public void aroundAdvice(ProceedingJoinPoint p) {
		System.out.println("Around Advice...(before)...");
		try {
			p.proceed();
		} catch (Throwable e) {
			System.out.println("In around advise " + e.getMessage());
		}
		System.out.println("Around Advice...(after)...");

	}
	/*
	 * @Before("dummy1()") public void aboutToTakePhotoWithName() {
	 * System.out.println("About to take photo with name"); }
	 * 
	 * @Before("dummy2()") public void aboutToTakeCameraRealtedAtion() {
	 * System.out.println("Adjusting the camera"); }
	 */
}
