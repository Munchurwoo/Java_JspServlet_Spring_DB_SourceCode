package org.kosta.model.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductService {
	private Log log=LogFactory.getLog(getClass());
	public void registerProduct() {
		System.out.println("상품등록");
		log.info("registerProduct");
	}
	public void findProductById() {
		System.out.println("아이디로 상품검색");
		log.info("findProductById");
	}
	public void findProductByMaker() {
		System.out.println("제조사로 상품검색");
		log.info("findProductByMaker");
	}
	//그 외 많은 메서드가 있다고 가정 
}




