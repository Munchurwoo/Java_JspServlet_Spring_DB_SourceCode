package org.kosta.spring10.model.dao;

import java.util.List;

import org.kosta.spring10.model.vo.EmpVO;

public interface EmpDAO {

	List<String> getEmpNo();

	EmpVO getEmpList(String enpNo);

}