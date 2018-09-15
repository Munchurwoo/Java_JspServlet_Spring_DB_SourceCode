package aop.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Value;

import kosta.model.InventoryException;

/*
 * advice : 횡단관심사항 기능이 어떤 시점에 적용될 것인지를 결정 
 * before - Target 메서드 실행전 적용 
 * after - 실행 후 적용 
 * after-throwing : 특정 Exception 발생시 
 * after-returning : 실행 후 리턴할 때 
 * 
 * 위 네가지 advice 를 around advice 하나로 모두 처리 가능 
 */
public class AroundLoggingAspect {
	private Log log= LogFactory.getLog(getClass());
	//around advice 실제 target 을 제어 
	
	public Object aroundLogging(ProceedingJoinPoint point) throws Throwable {
		//proceed() : 실제 Target(객체의 메서드) 을 실행시킨다.
		log.debug("**Around Adivce AOP**");
		Object retValue=null;
		try {
			retValue=point.proceed();
			
			if(retValue!=null&&retValue instanceof String && retValue.equals("신현수")){
				retValue+="왕자님";
			}
			log.debug("**AOP after-returni advice** 리턴값 :"+retValue);
		}catch(InventoryException ie) {
			log.error("**AOP after-throwing advice** 공급처에 연락");
			// 재고가 부족할 경우 해당 상품의 공급처에 자동으로 연락 
			throw ie;
		}finally {
			log.error("*AOP after adve*");
		}
		return retValue;		
	}
}