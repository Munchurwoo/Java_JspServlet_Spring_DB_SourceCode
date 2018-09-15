package org.kosta.model.dao;

import java.util.List;
import java.util.Map;

import org.kosta.model.vo.DeptVO;
import org.kosta.model.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;

public class HRDAO {
	private SqlSessionTemplate template;

	public HRDAO(SqlSessionTemplate template) {
		super();
		this.template = template;
	}

	public List<DeptVO> getAllDeptList() {

		return template.selectList("hr.getAllDeptList");
	}

	public List<EmpVO> findEmpListByName(String name) {
		
		return template.selectList("hr.findEmpListByName",name);
	}

	public List<EmpVO> findEmpListLikeName(String keyword) {
		
		return template.selectList("hr.findEmpListLikeName",keyword);
	}

	public Map<String, Object> getEmpAndDeptAndSalGradeMap(int empno) {
		
		return template.selectOne("hr.getEmpAndDeptAndSalGradeMap", empno);
	}

	public Map<String, Object> getEmpAndDeptAndSalGradeAndMgr(int empno) {
		
		return template.selectOne("getEmpAndDeptAndSalGradeAndMgr",empno);
	}

}
