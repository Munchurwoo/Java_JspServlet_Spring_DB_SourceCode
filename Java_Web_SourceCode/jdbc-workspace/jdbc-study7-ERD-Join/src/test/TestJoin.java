package test;

import model.CompanyDAO;
import model.Emp;

public abstract class TestJoin {
	public static void main(String[] args) {
		try {
		CompanyDAO dao = new CompanyDAO();
		int empNo =2; 
		Emp emp=dao.findEmpAndDepartmentInfo(empNo);
		System.out.println("사원번호 :"+emp.getEmpNo());
		System.out.println("사원명 :" +emp.getName());
		System.out.println("월급:"+emp.getSalary());
		System.out.println("부서번호:"+emp.getDepartment().getDeptNo());
		System.out.println("부서명:"+emp.getDepartment().getDname());
		System.out.println("근무지"+emp.getDepartment().getLocation());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
