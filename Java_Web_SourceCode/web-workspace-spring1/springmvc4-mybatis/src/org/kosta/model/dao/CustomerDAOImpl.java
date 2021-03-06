package org.kosta.model.dao;

import org.kosta.model.vo.CustomerVO;
import org.mybatis.spring.SqlSessionTemplate;

public class CustomerDAOImpl implements CustomerDAO {
	private SqlSessionTemplate template;
	
	
	public CustomerDAOImpl() {
		super();
	}

	public CustomerDAOImpl(SqlSessionTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public CustomerVO findCustomerById(String id) {
		return template.selectOne("customer.findCustomerById",id);
	}

}
