package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
//	@Pointcut("execution(public void get*(..))")	// public void인 모든 get메소드
//	@Pointcut("execution(* com.javalec.ex.*.*())")	// com.javalec.ex 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.javalec.ex..*.*())")	// com.javalec.ex 패키지 & com.javalec.ex 하위 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.javalec.ex.Worker.*())")	// com.javalec.ex.Worker 안의 모든 메소드

//	@Pointcut("within(com.javalec.ex.*)")	//com.javalec.ex 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.javalec.ex..*)")  //com.javalec.ex 패키지 및 하위 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.javalec.ex.Worker)") //com.javalec.ex.Worker 모든 메소드
	
//	@Pointcut("bean(student)")	//student 빈에만 적용
	@Pointcut("bean(*ker)")		//~ker로 끝나는 빈에만 적용
	private void pointcutMethod() {
	}
	
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println( signatureStr + " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println( signatureStr + " is finished.");
			System.out.println( signatureStr + " 경과시간 : " + (et - st));
		}
		
	}
	
	@Before("pointcutMethod()")
	public void beforAdvice() {
		System.out.println("beforAdvice()");
	}
	
}
