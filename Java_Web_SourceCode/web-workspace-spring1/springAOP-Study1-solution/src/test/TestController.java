package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.BoardService;
import model.MemberService;

public class TestController {
	/*  기존 회원 서비스와 보드 서비스의 
	 *  모든 기능이 수행된 후 
	 *  각 메서드에서 수행완료시간을 특정 파일(또는 db)에 
	 *  저장하도록 추가 요구사항이 발생되었다
	 * 	기존 springAOP1 - ex 에서는 추가 요구사항에 대해 직접 코드를 작성해서 
	 *  요구사항을 처리했다.
	 *  -> AOP를 적용하여 
	 *     기존 클래스 (POJO) 를 변경하지 않고 
	 *     추가 요구 사항( 횡단 관심 사항 )을 별도로 모듈에서 개발하여 적용할 수 있다. 
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=
				new ClassPathXmlApplicationContext("ioc.xml");
		BoardService bs=(BoardService)factory.getBean("boardService");
		MemberService ms=(MemberService)factory.getBean("memberService");
		//System.out.println(ms.getClass().getName());
		bs.deletePostByNo("1");
		bs.getContentByNo("1");
		bs.registerInfo("게시물정보");
		ms.deleteMember();
		ms.getAllMember();
		ms.updateMember();
		factory.close();
	}
}












