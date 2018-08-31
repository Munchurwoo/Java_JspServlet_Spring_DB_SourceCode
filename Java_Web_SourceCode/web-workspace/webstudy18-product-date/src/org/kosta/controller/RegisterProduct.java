package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductDTO;

public class RegisterProduct implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));
		ProductVO vo=new ProductVO(name,maker,price);
		ProductDAO.getInstance().registerProduct(vo);*/
		String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));
		ProductDTO vo=new ProductDTO(name,maker,price);
		ProductDAO.getInstance().registerProduct(vo);
		return "redirect:front?command=getAllProductList";
	}

}
