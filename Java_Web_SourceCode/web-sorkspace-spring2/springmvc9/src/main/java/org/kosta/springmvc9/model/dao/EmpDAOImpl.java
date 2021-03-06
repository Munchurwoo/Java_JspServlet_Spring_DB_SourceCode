package org.kosta.springmvc9.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.springmvc9.model.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO {
	@Resource
	private SqlSessionTemplate template;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kosta.springmvc9.model.dao.EmpDAO#getEmpCount()
	 */
	@Override
	public int getEmpCount() {
		return template.selectOne("emp.getEmpCount");
	}

	@Override
	public List<EmpVO> findEmpListByDeptNo(int deptNo) {

		return template.selectList("emp.findEmpListByDeptNo", deptNo);
	}

	@Override
	public List<EmpVO> findEmpListNameAndDeptNo(EmpVO paramVO) {

		return template.selectList("emp.findEmpListNameAndDeptNo", paramVO);
	}
}
