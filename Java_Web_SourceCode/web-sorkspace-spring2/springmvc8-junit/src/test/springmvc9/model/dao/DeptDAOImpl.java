package org.kosta.springmvc9.model.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements DeptDAO {
	
	@Resource
	private SqlSessionTemplate template;
	public int getDeptCount() {
		return template.selectOne("dept.getDeptCount");
	}
}
