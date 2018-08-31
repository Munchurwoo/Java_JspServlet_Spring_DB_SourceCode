package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDTO;

public class DeleteItemFromCartController implements Controller {
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* 로그인 여부를 판단한다
		 * 로그인 상태이면 세션으로부터 회원객체를 반환받는다.
		 * 클라이언트로부터 전달받는 상품번호를 이용해
		 * 회원객체 내의 cart 의 removeItem() 을 호출해 
		 * 삭제한다. 삭제 후 cart.jsp로 이동시킨다.
		 * 이동방식은 redirect로 처리한다. 
		 * 
		 */
		String path="index.jsp";
		HttpSession session=request.getSession(false);
		if(request.getMethod().equals("POST")&&session!=null){
			MemberDTO mvo=(MemberDTO) session.getAttribute("memberDTO");
			if(mvo!=null){//로그인 상태이면 
				String no=request.getParameter("no");
				//회원객체 내부의 카트에서 삭제
				mvo.getCart().removeItem(no);
				path="redirect:front?command=CartView";
			}
		}
		return path;
	}
}










