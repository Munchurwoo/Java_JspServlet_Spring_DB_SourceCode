package aop.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

/*
 * 공통(횡단) 관심사항을 정의한 클래스 
 */
public class LoggingAspect {
	private Log log = LogFactory.getLog(getClass());
	
	public void logging(JoinPoint point) {
		String cn = point.getTarget().getClass().getName();
		String mn = point.getSignature().getName();
		//Target(핵심Core) 메서드가 전달받는 매개변수의 인자값을 출력 
		Object args[] = point.getArgs();
		String param="";
		for(int i =0;i<args.length;i++) {
			param+=args[i]+" ";
		}
		System.out.println("AOP"+cn+mn+ "전달받은 인자값"+param );
	}
}
