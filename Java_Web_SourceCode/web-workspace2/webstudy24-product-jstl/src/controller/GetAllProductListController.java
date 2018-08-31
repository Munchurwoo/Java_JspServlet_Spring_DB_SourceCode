package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;

public class GetAllProductListController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("list",ProductDAO.getInstance().getAllProductList());
		return "product/product_list.jsp";
	}
}
