package test;

import model.CompanyDAO;
import model.Emp;

public abstract class TestJoin {
	public static void main(String[] args) {
		try {
		CompanyDAO dao = new CompanyDAO();
		int empNo =2; 
		Emp emp=dao.findEmpAndDepartmentInfo(empNo);
		System.out.println("�����ȣ :"+emp.getEmpNo());
		System.out.println("����� :" +emp.getName());
		System.out.println("����:"+emp.getSalary());
		System.out.println("�μ���ȣ:"+emp.getDepartment().getDeptNo());
		System.out.println("�μ���:"+emp.getDepartment().getDname());
		System.out.println("�ٹ���"+emp.getDepartment().getLocation());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
