package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;
/**
 * 클라이언트가 전송한 id와 password를 받는다 
 * Model 의 MemberDAO 의 login() 를 호출해서 MemberDTO를 리턴받는다
 * MemberDTO 가 null 이면 아이디와 패스워드가 일치되지 않으므로 
 * login_fail.jsp로 이동시킨다 ( redirect ) 
 * null이 아니면 로그인 조건에 충족되므로 
 * session 을 생성하고 ( or 기존 세션을 반환받고 ) 
 * 그 세션에 인증정보를 setAttribute("memberDTO",dto); 로 할당한다 
 * login_ok.jsp로 이동시킨다 ( redirect ) 
 *   
 * 
 * @author KOSTA16
 *
 */
public class LoginController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("memberId");
		String password=request.getParameter("memberPassword");
		MemberDTO dto=
				MemberDAO.getInstance().login(new MemberDTO(id,password,null));
		if(dto!=null) {//아이디 패스워드가 일치하면
			//기존세션이 있으면 기존세션리턴,없으면 새로생성해서 리턴
			HttpSession session=request.getSession();
			//인증정보를 세션에 할당한다 
			session.setAttribute("memberDTO", dto);
			return "redirect:index.jsp";
		}else {
			request.setAttribute("url", "/login_fail.jsp");
			return "/template/layout.jsp";
		}		
	}
}








