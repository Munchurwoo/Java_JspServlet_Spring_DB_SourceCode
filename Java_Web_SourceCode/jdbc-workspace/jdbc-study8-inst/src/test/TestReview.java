package test;

import java.util.ArrayList;

import model.CompanyDAO;
import model.Emp;

public class TestReview {
	public static void main(String[] args) {
		try {
			CompanyDAO dao=new CompanyDAO();
			/*	��� �� ���� ���� ������ �޴� ������� 
			 *  �����, ����, �μ���ȣ , �μ��� , �μ������� ��ȸ 
			 *  SQL : subquery , join �� Ȱ�� 
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





