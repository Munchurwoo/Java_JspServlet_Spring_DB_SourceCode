package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.CustomerDAO;
import org.kosta.model.CustomerVO;

public class LoginController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		CustomerVO vo=CustomerDAO.getInstance().login(id, password);
		String url=null;
		if(vo!=null){
			HttpSession session=request.getSession();
			session.setAttribute("cvo", vo);
			url="redirect:index.jsp";
		}else{
			url="redirect:login_fail.jsp";
		}
		return url;
	}
}
