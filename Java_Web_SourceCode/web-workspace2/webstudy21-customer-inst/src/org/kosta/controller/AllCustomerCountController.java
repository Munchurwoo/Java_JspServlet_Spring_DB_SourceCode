package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CustomerDAO;

public class AllCustomerCountController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int count=CustomerDAO.getInstance().getAllCustomerCount();
		request.setAttribute("count",count);
		return "home.jsp";
	}
}
