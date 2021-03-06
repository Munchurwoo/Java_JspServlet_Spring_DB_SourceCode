package org.kosta.springmvc13.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/* Spring Handler Interceptor : 
	DispatcherServlet이 해당 컨트롤러를 호출하기 전,후에 요청과 응답을
	제어하는 역할을 한다. -> 컨트롤러 영역의 횡단(공통)관심사항을 처리
	 
	컨트롤러 실행전  preHandle(request,response,handler) 
	컨트롤러 실행후 postHandle(request,response,handler)
	응답완료 afterCompletion(request,response,handler)
	Spring에서 제공하는 HandlerInterceptorAdapter 를 상속받아 
	위와 같은 메서드를 오버라이딩해서 사용한다
 * 
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter{
	/*
	 	preHandle():해당 컨트롤러(Handler) 가 실행되기 전 수행되는 메서드 
	 	리턴하는 boolean 정보가 true이면 해당 컨트롤러(Handler)가 실행되고,
	 	리턴하는 boolean 정보가 false 이면 해당 컨트롤러(Handler)가
	 	실행되지 않는다  
	 	
	 	현 인터셉터가 반영될 대상 지정은 spring-web.xml 에서 설정한다 
	
	 	로그인 인증 상태가 아닌 사용자는 
	 	로그인 폼이 있는 home.jsp로 이동시킨다 ( redirect ) 
	 	또한 해당 Handler ( Controller ) 는 실행하여 서비스할 
	 	필요가 없으므로 false를 리턴한다 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
			throws Exception {		
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null) {
			String uri=request.getRequestURI();
			System.out.println("**HandlerInterceptor preHandle 실행**"+uri);
			System.out.println("**로그인 상태가 아니므로 home으로 이동**");
			response.sendRedirect("home.do");
			return false;//해당 컨트롤러(Handler)는 실행안됨 
		}
		return true;
	}	
}
















