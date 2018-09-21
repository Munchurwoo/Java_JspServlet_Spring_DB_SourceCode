package org.kosta.springmvc9.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.springmvc9.model.vo.DeptVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements DeptDAO {
	
	@Resource
	private SqlSessionTemplate template;
	public int getDeptCount() {
		return template.selectOne("dept.getDeptCount");
	}
	@Override
	public List<DeptVO> getAllDeptList() {
		// TODO Auto-generated method stub
		return template.selectList("dept.getAllDeptList");
	}
}
