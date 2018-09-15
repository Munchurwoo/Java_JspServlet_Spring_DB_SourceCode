package org.kosta.model;

public interface ProductService {

	/*
	 * 비즈니스 계층(서비스계층)에 사용되는 클래스를 스프링 컨테이너에 객체 생서할 것을 명시한는 어노테이션  @Service
	 */
	ProductVO findProductById(String id);

}