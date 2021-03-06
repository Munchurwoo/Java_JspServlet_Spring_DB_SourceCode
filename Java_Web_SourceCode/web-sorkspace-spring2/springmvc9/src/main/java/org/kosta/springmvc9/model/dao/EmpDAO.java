package org.kosta.springmvc9.model.dao;

import java.util.List;

import org.kosta.springmvc9.model.vo.EmpVO;

public interface EmpDAO {

	public int getEmpCount();

	public List<EmpVO> findEmpListByDeptNo(int string);

	public List<EmpVO> findEmpListNameAndDeptNo(EmpVO paramVO);		
}