package org.kosta.springmvc10.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.springmvc10.model.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO{
	@Resource
	private SqlSessionTemplate template;

	@Override
	public List<String> getEmpNoList() {
		return template.selectList("emp.getEmpNoList");
	}

	@Override
	public EmpVO findEmpByEmpNo(String empNo) {
		return template.selectOne("emp.findEmpByEmpNo", empNo);
	}
	
}
