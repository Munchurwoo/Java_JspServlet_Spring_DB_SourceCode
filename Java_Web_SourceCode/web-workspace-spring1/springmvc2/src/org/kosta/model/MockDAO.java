package org.kosta.model;

import java.util.List;

public interface MockDAO {

	ProductVO findProductByName(String name);

	List<ProductVO> getProductList();

}