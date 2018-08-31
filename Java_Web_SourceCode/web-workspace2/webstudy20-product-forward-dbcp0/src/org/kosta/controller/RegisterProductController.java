package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductDTO;

public class RegisterProductController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));		
		ProductDTO dto=new ProductDTO(name,maker,price);		
		ProductDAO.getInstance().registerProduct(dto);
		return "redirect:front?command=getAllProductList";
	}

}






