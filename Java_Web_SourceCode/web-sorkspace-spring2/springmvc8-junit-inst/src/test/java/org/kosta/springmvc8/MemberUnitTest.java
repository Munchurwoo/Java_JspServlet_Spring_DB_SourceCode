package org.kosta.springmvc8;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.model.dao.MemberDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *  JUnit : 자바 단위 테스트를 위한 framework 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class MemberUnitTest {
	@Resource
	MemberDAO memberDAO;
	@Test
	public void testMember() {
		//1. 아이디로 회원 검색 
		//System.out.println(memberDAO.findMemberById("java"));
		//2. 주소로 회원 검색 
		System.out.println(memberDAO.findMemberListByAddress("판교"));
	}	
}










