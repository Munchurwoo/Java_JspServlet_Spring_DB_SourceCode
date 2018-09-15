package aop.common;

import org.aspectj.lang.JoinPoint;

public class commonLoggingService {
//횡단(공통) 괌시사항을 정의하는 클래스
	public void timeLogging(JoinPoint point) {
		//핵심(core) 관심사항의 Target class 명 
		String className=point.getTarget().getClass().getName();
		// 실행 메서드명 
		String methodName = point.getSignature().getName();
		System.out.println(className +""+methodName+"실행 후 수행완료 시간 기록  AOP");
	}
}
