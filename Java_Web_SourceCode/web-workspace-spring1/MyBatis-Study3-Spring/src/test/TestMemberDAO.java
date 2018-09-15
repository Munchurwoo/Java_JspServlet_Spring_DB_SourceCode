package test;

import java.util.List;

import org.kosta.model.dao.MemberDAO;
import org.kosta.model.vo.MemberVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMemberDAO {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("ioc.mybatis.xml");
		MemberDAO dao=(MemberDAO)container.getBean("memberDAO");
		System.out.println(dao.findMemberById("java"));
//		List<MemberVO>
		container.close();
	}
}