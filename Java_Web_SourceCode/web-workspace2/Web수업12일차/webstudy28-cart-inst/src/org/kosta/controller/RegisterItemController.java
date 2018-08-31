package org.kosta.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class RegisterItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equals("POST")==false)
			throw new ServletException("post 방식만 가능합니다!");
		String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));
		String detail=request.getParameter("detail");
		ItemDTO ivo=new ItemDTO(name,maker,price,detail);
		ItemDAO.getInstance().registerItem(ivo);
		return "redirect:item_register_result.jsp";
	}

}
