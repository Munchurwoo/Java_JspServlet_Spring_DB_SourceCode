package org.kosta.springmvc10.model.dao;

import java.util.List;

import org.kosta.springmvc10.model.vo.EmpVO;

public interface EmpDAO {

	List<String> getEmpNoList();

	EmpVO findEmpByEmpNo(String empNo);

}
