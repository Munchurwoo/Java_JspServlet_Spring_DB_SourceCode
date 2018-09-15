package test.aop;

import kosta.board.BoardService;
import kosta.member.MemberNotFoundException;
import kosta.member.MemberService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	/**
	 * ---------------------------------------------------------------------
요구사항
---------------------------------------------------------------------
**기존 시스템의 메서드 실행시간을 체크**
기존 시스템의 비즈니스(서비스) 계층의 
모든 메서드를 대상으로 
메서드 시작부터 종료까지 실행 소요시간을 
체크하여 리포트를 작성해야 한다. 
리포트는 
0.5초~1초 소요시에는 
log.warn(target class명 메서드명 소요시간)
1초 초과시에는 
log.error(target class명 메서드명 소요시간)
로 파일에 기록되어야 한다. 
주의사항) Exception 발생 여부와 관계없이 모든 메서드
    시간이 체크되어야 한다. 
    
----------------------------------------
AOP 적용하면 기존 코드 수정없이 
시간체크 공통관심사항을 개발하고 유지보수할 수 있다.

1. 공통관심사항 정의 클래스:
    aop.common.PerformanceReportAspect
    메서드명 
    checkTime(ProceedingJoinPoint) 
 2. aop.xml 에서 ioc 및 aop 설정 
     pointcut 은 execution or bean 
     advice 는 around 


====실행결과====
find board
findAllList board
WARN : aop.common.PerformanceReportService - kosta.board.BoardService findAllList time:701
find member
WARN : aop.common.PerformanceReportService - kosta.member.MemberService findMember time:608
findAllMember
ERROR: aop.common.PerformanceReportService - kosta.member.MemberService findAllMember time:1800
WARN : aop.common.PerformanceReportService - kosta.member.MemberService deleteMember time:900
member not found!!!
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		BoardService boardService = (BoardService) ctx.getBean("boardService");
		MemberService memberService = (MemberService) ctx
				.getBean("memberService");
		System.out.println("main:"+boardService.find());
		System.out.println("main:"+boardService.findAllList());
		memberService.findMember();
		memberService.findAllMember();
		try {
			memberService.deleteMember(null);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
