package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductDTO;

public class FindProductByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pno=request.getParameter("pno");			
		ProductDTO dto=ProductDAO.getInstance().findProductById(pno);
		request.setAttribute("dto", dto);
		return "product/product_detail.jsp";
	}

}
