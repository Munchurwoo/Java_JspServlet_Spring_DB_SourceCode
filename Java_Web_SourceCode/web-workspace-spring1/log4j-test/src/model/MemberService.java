package model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/*FATAL(가장 높은 로그레벨)
ERROR
WARN
INFO
DEBUG
TRACE(가장 낮은 로그레벨)*/
public class MemberService {
	private Log log = LogFactory.getLog(getClass());
	public void register() {
		System.out.println("register");
		
		//log4j.xml 설정 파일에서 priority 를 info 로 설정하면 
		//info 이상인 info, wran, error, fatal 로그가 실행된다. 
		
		log.fatal("fatal test");
		log.error("error");
		log.warn("warn test");
		log.info("info test");
		log.debug("debug test");
		log.trace("trace test");
	}
}
