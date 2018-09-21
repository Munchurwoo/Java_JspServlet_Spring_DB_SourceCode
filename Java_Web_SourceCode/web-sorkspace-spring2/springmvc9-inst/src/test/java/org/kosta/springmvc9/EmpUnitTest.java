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
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class EmpUnitTest {
	@Resource
	EmpDAO empDAO;
	@Test
	public void test() {
		//System.out.println(empDAO.getEmpCount());
		//List<EmpVO> list=empDAO.findEmpListByDeptNo("10");
		//List<EmpVO> list=empDAO.findEmpListLikeName("A");
		EmpVO paramVO=new EmpVO();
		paramVO.setDeptNo("20");
		paramVO.setEname("A");
	    List<EmpVO> list=empDAO.findEmpListNameAndDeptNo(paramVO);
		for(EmpVO vo:list)
			System.out.println(vo);
	}
}















