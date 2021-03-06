package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.ProductVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired //TYPE 을 통해 DI 적용하므로 SqlSessionTemplate 적용된다.
	private SqlSessionTemplate template;
	@Override
	public ProductVO ProductNumberInfo(int productNum) {
		// TODO Auto-generated method stub
		return template.selectOne("product.ProductNumberInfo",productNum);
	}
	@Override
	public List<ProductVO> DetailProduct() {
		// TODO Auto-generated method stub
		return template.selectList("product.DetailProduct");
	}
	@Override
	public void insertProduct(ProductVO vo) {
		template.insert("product.insertProduct",vo);
	}

}
