package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductDTO;

public class FindProductByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pno=request.getParameter("pno");			
		ProductDTO dto=ProductDAO.getInstance().findProductById(pno);
		request.setAttribute("dto", dto);
		return "product_detail.jsp";
	}

}
