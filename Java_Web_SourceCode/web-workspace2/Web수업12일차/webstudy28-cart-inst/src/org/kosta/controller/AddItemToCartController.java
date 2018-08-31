package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.DuplicateItemException;
import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;
import org.kosta.model.MemberDTO;

public class AddItemToCartController implements Controller {
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/*
		 * 로그인 체크 : 세션이 존재하고 
		 * 					 세션 내부에 회원 객체 존재 여부를
		 * 					 확인 
		 *  회원 객체가 존재하면 쇼핑 카트에 
		 *  상품을 담기 위해 
		 *  회원 객체로부터 쇼핑 카트를 반환받는다 
		 *  클라이언트부터 전달된 상품번호를 이용해 
		 *  DAO로부터 상품 객체를 반환받는다. 
		 *  쇼핑카트에 상품을 추가한다. 
		 *  만약 상품이 중복될 경우에는 
		 *  duplicate_item.jsp로 이동시키고,
		 *  정상 수행시에는 addItemToCart_result.jsp로 이동시킨다 
		 */
		String path="index.jsp";
		HttpSession session=request.getSession(false);
		if(request.getMethod().equals("POST")&&session!=null){
			MemberDTO mvo=(MemberDTO) session.getAttribute("memberDTO");
			if(mvo!=null){
				String no=request.getParameter("no");
				ItemDTO ivo=ItemDAO.getInstance().findItemByNo(no);
				try{
					mvo.getCart().addItem(ivo);					
					path="addItemToCart_result.jsp";
				}catch(DuplicateItemException de){
					path="duplicate_item.jsp";
				}
			}
		}
		return  path;
	}
}











