package com.kushal.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(void com.kushal.spring.aop.Camera.snap())")
	public void dummy() {
	}

	@Before("dummy()")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo ...");
	}
	/*
	 * @Pointcut("execution(* com.kushal.spring.aop.Camera.snap())") public void
	 * dummy() { }
	 
	
	 * @Pointcut("target(com.kushal.spring.aop.Camera)") public void dummy() { }
	 

	@Pointcut("args(exposure)")
	public void dummy(int exposure) {
	}

	@Pointcut("target(com.kushal.spring.aop.Camera)")
	public void dummynew(int exposure) {
	}

	@Before("dummynew() && dummy(exposure)")
	public void beforeAdvice(JoinPoint jp, int exposure) {
		System.out.println("Before Advice...");
		System.out.println("exposure: " + exposure);
	}

	@After("within(com.kushal.spring.aop.*) && @annotation(Deprecated)")
	public void someAfterAdvise() {
		System.out.println("After advise running...");
	}

	
	 * @Pointcut("execution(* com.kushal.spring.aop.Camera.snap(String))")
	 * public void dummy1() { }
	 * 
	 * @Pointcut("execution(* com.kushal.spring.aop.*.*(..))") public void
	 * dummy2() { }
	 

	
	 * @Before("dummy(exposure)") public void beforeAdvice(JoinPoint jp, int
	 * exposure) { System.out.println("Before Advice...");
	 * System.out.println("exposure: "+ exposure); for (Object obj :
	 * jp.getArgs()) { System.out.println("Args: " + obj); } }
	 

	
	 * @After("dummy()") public void afterAdvice() {
	 * System.out.println("After Advice..."); }
	 * 
	 * @AfterReturning("dummy()") public void afterReturningAdvice() {
	 * System.out.println("After Returning Advice..."); }
	 * 
	 * @AfterThrowing("dummy()") public void afterThrowingAdvice() {
	 * System.out.println("After Throwing Advice..."); }
	 * 
	 * @Around("dummy()") public void aroundAdvice(ProceedingJoinPoint p) {
	 * System.out.println("Around Advice...(before)..."); try { p.proceed(); }
	 * catch (Throwable e) { System.out.println("In around advise " +
	 * e.getMessage()); } System.out.println("Around Advice...(after)...");
	 * 
	 * }
	 

	
	 * @Pointcut("within(com.kushal.spring..*)") public void withinDemo() { }
	 * 
	 * @Before("withinDemo()") public void withinDemoAdvise() {
	 * System.out.println("*******Before advise*******"); }
	 * 
	 * @Pointcut("target(com.kushal.spring.aop.Camera)") public void
	 * targetDemo() { }
	 * 
	 * @Before("targetDemo()") public void targetDemoAdvise() {
	 * System.out.println("*******Before Target advise*******"); }
	 

	
	 * @Pointcut("@target(org.springframework.stereotype.Component)") public
	 * void targetDemo1(){ }
	 * 
	 * @Before("targetDemo1()") public void targetDemoAdvise1(){
	 * System.out.println
	 * ("*******Before Target advise, annotation based*******"); }
	 

	@Pointcut("@annotation(java.lang.Deprecated)")
	public void targetDemo1() {
	}

	@Before("targetDemo1()")
	public void targetDemoAdvise1() {
		System.out
				.println("*******Before Target advise, annotation based*******");
	}

	
	 * @Pointcut("@args(org.springframework.stereotype.Component)") public void
	 * targetDemo1() { }
	 * 
	 * @Before("targetDemo1()") public void targetDemoAdvise1() { System.out
	 * .println("*******Before Target advise, annotation based*******"); }
	 

	
	 * @Before("dummy1()") public void aboutToTakePhotoWithName() {
	 * System.out.println("About to take photo with name"); }
	 * 
	 * @Before("dummy2()") public void aboutToTakeCameraRealtedAtion() {
	 * System.out.println("Adjusting the camera"); }
	 */
}
