package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class ItemDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String no=request.getParameter("no");
		ItemDTO itemDTO=ItemDAO.getInstance().findItemByNo(no);
		request.setAttribute("itemDTO",itemDTO);
		request.setAttribute("url", "/item_detail.jsp");
		return "/template/layout.jsp";
	}

}
