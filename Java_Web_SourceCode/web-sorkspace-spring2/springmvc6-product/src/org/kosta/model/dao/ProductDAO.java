package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.ProductVO;

public interface ProductDAO {

	ProductVO ProductNumberInfo(int i);

	List<ProductVO> DetailProduct();

	void insertProduct(ProductVO vo);

}
