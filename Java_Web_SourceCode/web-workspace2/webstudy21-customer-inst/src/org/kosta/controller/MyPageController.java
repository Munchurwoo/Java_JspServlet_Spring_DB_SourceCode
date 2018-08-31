package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.CustomerDAO;
import org.kosta.model.CustomerVO;

public class MyPageController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			CustomerVO vo=(CustomerVO)session.getAttribute("cvo");
			if(vo!=null) {
				CustomerVO vo2=CustomerDAO.getInstance().getDetailCustomer(vo.getId());
				session.setAttribute("cvo", vo2);
				return "redirect:mypage.jsp";
			}
		}
		return "redirect:index.jsp";
	}

}
