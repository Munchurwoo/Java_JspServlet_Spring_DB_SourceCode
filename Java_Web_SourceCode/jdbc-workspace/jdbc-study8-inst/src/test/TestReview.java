package test;

import java.util.ArrayList;

import model.CompanyDAO;
import model.Emp;

public class TestReview {
	public static void main(String[] args) {
		try {
			CompanyDAO dao=new CompanyDAO();
			/*	사원 중 가장 낮은 월급을 받는 사원들의 
			 *  사원명, 월급, 부서번호 , 부서명 , 부서지역을 조회 
			 *  SQL : subquery , join 을 활용 
			 */
			ArrayList<Emp> list=dao.getEmpListLowSalary();
			for(Emp emp:list) {
				System.out.println(emp.getName()+" "+emp.getSalary()
				+" "+emp.getDepartment().getDeptNo()
				+" "+emp.getDepartment().getDname()
				+" "+emp.getDepartment().getLocation());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





