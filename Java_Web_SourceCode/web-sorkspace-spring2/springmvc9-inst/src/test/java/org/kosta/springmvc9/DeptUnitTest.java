package org.kosta.springmvc9;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc9.model.dao.DeptDAO;
import org.kosta.springmvc9.model.vo.DeptVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class DeptUnitTest {
	@Resource
	DeptDAO deptDAO;
	/*@Test
	public void getDeptCount() {
		System.out.println("부서수:"+deptDAO.getDeptCount());
	}*/
	@Test
	public void getDeptList() {
		List<DeptVO> list=deptDAO.getAllDeptList();
		for(DeptVO vo:list)
			System.out.println(vo);
	}
}








