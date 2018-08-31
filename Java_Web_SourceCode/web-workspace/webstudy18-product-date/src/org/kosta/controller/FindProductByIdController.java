package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductDTO;

public class FindProductByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductDTO vo=ProductDAO.getInstance().findProductById(request.getParameter("id"));
		request.setAttribute("vo",vo);
		return "product_detail.jsp";
	}

}
