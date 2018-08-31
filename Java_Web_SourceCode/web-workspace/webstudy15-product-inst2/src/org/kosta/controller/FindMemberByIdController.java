package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class FindMemberByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductVO vo=ProductDAO.getInstance().findProductById(request.getParameter("id"));
		request.setAttribute("productVO",vo);
		return "product_detail.jsp";
	}

}
