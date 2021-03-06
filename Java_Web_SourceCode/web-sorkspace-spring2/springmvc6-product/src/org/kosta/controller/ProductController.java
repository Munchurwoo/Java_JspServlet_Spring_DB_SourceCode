package org.kosta.controller;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.model.dao.ProductDAO;
import org.kosta.model.vo.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Resource
	private ProductDAO productDAO;
	
	@RequestMapping("ProductNumberInfo.do")
	public String ProductNumberInfo(int product_no, Model model) {
		ProductVO vo = productDAO.ProductNumberInfo(product_no);
		String viewName = null;
		System.out.println(vo);
		if(vo==null)
			viewName="findbynumber_product_fail";
		else
			viewName="infoResult";
			model.addAttribute("vo",vo);
		return viewName;
	}
	@RequestMapping("detailProduct.do")
	public String detailProduct(Model model){
		List<ProductVO> list = productDAO.DetailProduct();
		if(!list.isEmpty())
			System.out.println("null 아니다.");
			model.addAttribute("list",list);
		return "detailProduct";
	}
	
	@RequestMapping("insertProduct.do")
	public String insertProduct(ProductVO vo, Model model) {
		String viewName="null";
		
		productDAO.insertProduct(vo);
		ProductVO pvo = productDAO.ProductNumberInfo(vo.getProductNo());
		viewName="insertProjectResult";
		model.addAttribute("vo",pvo);
		
		return viewName;
	}
}
