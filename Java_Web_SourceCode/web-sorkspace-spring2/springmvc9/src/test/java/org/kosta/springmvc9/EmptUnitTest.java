package org.kosta.springmvc9;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc9.model.dao.EmpDAO;
import org.kosta.springmvc9.model.vo.EmpVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class EmptUnitTest {
	@Resource
	EmpDAO empDAO;
	
	@Test
	public void getDeptCount() {
//		System.out.println(empDAO.getEmpCount()); 
		//List<EmpVO> list =empDAO.findEmpListByDeptNo(10);
		EmpVO paramVO = new EmpVO();
		paramVO.setDeptNo(20);
		paramVO.setEname("S");
		List<EmpVO> list =empDAO.findEmpListNameAndDeptNo(paramVO);
		for(EmpVO vo:list)
			System.out.println(vo);
	}
}
