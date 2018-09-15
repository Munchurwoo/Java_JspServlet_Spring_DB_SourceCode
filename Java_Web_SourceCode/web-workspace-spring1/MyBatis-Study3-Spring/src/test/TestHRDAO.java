package test;

import java.util.Map;

import org.kosta.model.dao.HRDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHRDAO {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("ioc.mybatis.xml");
		HRDAO dao = (HRDAO)container.getBean("HRDAO");
		/*List<DeptVO> list = dao.getAllDeptList();
		for(DeptVO vo : list)
			System.out.println(vo);*/
		/*String name="SMITH";
		List<EmpVO> list = dao.findEmpListByName(name);
		for(EmpVO vo: list)
			System.out.println(vo);*/
		
		//like 을 이용해 사원명 ename 에 s가 포함된 사원리스트 조회 
		/*String keyword="S";
		List<EmpVO> list = dao.findEmpListLikeName(keyword);
		for(EmpVO vo:list)
			System.out.println(vo);*/
		//empno 7566 인 사원의 ename, dname, sal, grade
		/*int empno = 7566;
		Map<String,Object> map = dao.getEmpAndDeptAndSalGradeMap(empno);
		System.out.println(map.get("ENAME"));
		System.out.println(map.get("DNAME"));
		System.out.println(map.get("SAL"));
		System.out.println(map.get("GRADE"));*/
		int empno = 7934;
		Map<String,Object> map = dao.getEmpAndDeptAndSalGradeAndMgr(empno);
		System.out.println(map.get("ENAME"));
		System.out.println(map.get("DNAME"));
		System.out.println(map.get("MGRNAME"));
		System.out.println(map.get("GRADE"));
		container.close();
	}
}
