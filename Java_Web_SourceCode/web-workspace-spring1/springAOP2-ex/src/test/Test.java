package test;

import org.kosta.model.member.MemberService;
import org.kosta.model.product.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*	기존 시스템이 서비스가 되고 있는 상황에서 
 *  요구 사항이 발생했다. 
 *  요구 사항은 시스템의 서비스( 상품서비스, 회원서비스 ..)가
 *  실행되기 직전에 실행시간과 어떤 메서드가 실행되는 지 
 *  특정 파일 c:\\java-kosta\\report.log 에 정보를 
 *  저장하는 것이다. 
 *  
 *  파일입출력(IO) 관련 컴포넌트(OR 라이브러리) 를 이용하자 
 *  로깅 라이브러리는 아파치에서 제공하는 Log4J를 이용하는 것으로
 *  결정 -> 별도의 프로젝트에서 테스트 해본다 
 *  
 *  Log4j test 후 
 *  maven 에 Log4j 라이브러리 설정 
 *  log4j.xml 설정파일에 파일명 수정 
 *  각 Service 클래스에 Log4j 를 이용해 로깅 처리한다 
 *  로깅 레벨은 info 레벨로 한다 
 *  --> 적용해서 로깅 처리 후 평가 
 *  	  Log4j 라는 라이브러리를 활용해서 코드량을 줄이고 
 *  	  생산성을 향상시켰으나 
 *  	  실제 Service 코드에 import 및 로깅관련 코드 작성을 
 *  	  해야 한다는 부담이 있다. 
 *  	  이후 요구사항이 추가 수정시에도 역시 별도의 코드 작업을
 * 	      해야 하므로 유지보수에도 부담이 있다. 
 *        ---> 대안 :  AOP 다~~~~	
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory
		=new ClassPathXmlApplicationContext("spring-config.xml");
		ProductService ps=(ProductService)factory.getBean("productService");
		MemberService ms=(MemberService)factory.getBean("memberService");
		ps.findProductById();
		ps.findProductByMaker();
		ps.registerProduct();
		ms.findMemberByAddress();
		ms.findMemberById();
		ms.registerMember();
		factory.close();
	}
}









