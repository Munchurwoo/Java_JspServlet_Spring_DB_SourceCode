package org.kosta.model;

import org.springframework.stereotype.Repository;

public class ProductDAOImpl implements ProductDAO {
	/*
	@Repository
	 * 영속성 계층(데이터엑서스 계층)에 명시하는 어노테이션 
	 * - 스프링컨테이너에 의해 아래 어노테이션이 명시된 객체가 생성된다.
	 */
	@Override
	public ProductVO findProductById(String id) {
		if(id!=null && id.equals("a"))
			return new ProductVO("a","겔럭시8",100);
		return null;
		
	}
}
