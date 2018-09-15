package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MockDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ProductListController extends AbstractController{
	
	private MockDAO mockDAO;
	
	public ProductListController(MockDAO mockDAO) {
		super();
		this.mockDAO = mockDAO;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new ModelAndView("product_list","list",mockDAO.getProductList());
	}

}
