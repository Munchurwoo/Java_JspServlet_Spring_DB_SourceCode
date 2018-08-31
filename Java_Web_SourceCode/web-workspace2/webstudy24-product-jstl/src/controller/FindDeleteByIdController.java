package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductDTO;

public class FindDeleteByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		/*
		 * 상품 삭제는 클라이언트가 post 방식으로 요청할 때만 
		 * 동작 되도록 처리 
		 */
		String requestMethod=request.getMethod();
		if(!requestMethod.equalsIgnoreCase("post")) {
			
			throw new ServletException("상품삭제는 post 방식 요청만 가능!");
		}
		String pno=request.getParameter("pno");			
		ProductDAO.getInstance().findDeleteById(pno);
		
		
		return "redirect:index.jsp";
		
	}

}
