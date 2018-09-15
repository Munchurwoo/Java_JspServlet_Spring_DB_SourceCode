package org.kosta.model.member;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MemberService {
	private Log log=LogFactory.getLog(getClass());
	public void findMemberById() {
		System.out.println("아이디로 회원검색");
		log.info("findMemberById");
	}
	public void findMemberByAddress() {
		System.out.println("주소로 회원검색");
		log.info("findMemberByAddress");
	}
	public void registerMember() {
		System.out.println("회원가입");
		log.info("registerMember");
	}
	//그외 많은 메서드가 있다고 가정
}




