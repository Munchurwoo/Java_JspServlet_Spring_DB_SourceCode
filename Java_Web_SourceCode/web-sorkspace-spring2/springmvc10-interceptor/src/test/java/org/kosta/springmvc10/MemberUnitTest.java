package org.kosta.springmvc10;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc10.model.dao.MemberDAO;
import org.kosta.springmvc10.model.vo.MemberVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class MemberUnitTest {
	@Resource
	MemberDAO memberDAO;
	@Test
	public void test() {		
		/*List<String> list=empDAO.getEmpNoList();
		System.out.println(list);*/
		String id="java";
		MemberVO vo=memberDAO.findMemberById(id);
		System.out.println(vo);
	}
}















