package org.kosta;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MemberController {
	private Log log = LogFactory.getLog(getClass());

	public void testLog() {

		log.fatal("fatal test");
		log.error("error");
		log.warn("warn test");
		log.info("info test");
		log.debug("debug test");
		log.trace("trace test");
	}
}
