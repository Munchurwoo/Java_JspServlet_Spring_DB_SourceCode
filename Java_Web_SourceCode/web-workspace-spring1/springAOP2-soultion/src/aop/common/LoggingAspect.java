package aop.common;
/*
 * 횡단 관심 사항을 정의한 클래스 
 * org.kosta.model 하위 팩키지의 Service로 마치는 클래스들의 모든 메서드들이 실행되기 전 
 * Log4j를 이용해 report.log 파일에 info 레벨 이상으로 로깅 되도록 처리하는 것이 횡단 관심 사항이므로 이 기능을 아래에서 저으이한다. 
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	private Log log=LogFactory.getLog(getClass());
	public void logging(JoinPoint point) {
		String cn = point.getTarget().getClass().getName();
		String mn = point.getSignature().getName();
		log.info("cn");
		log.info("mn");
	}
}
