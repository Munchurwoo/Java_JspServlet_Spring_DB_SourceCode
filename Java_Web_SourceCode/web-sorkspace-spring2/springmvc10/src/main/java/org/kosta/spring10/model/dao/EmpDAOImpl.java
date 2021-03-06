package org.kosta.spring10.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.spring10.model.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Resource
	private SqlSessionTemplate template;
	
	@Override
	public List<String> getEmpNo() {
		
		return template.selectList("emp.getEmpNo");
	}

	@Override
	public EmpVO getEmpList(String empNo) {
		
		return template.selectOne("emp.getEmpList",empNo);
	}
	
}
