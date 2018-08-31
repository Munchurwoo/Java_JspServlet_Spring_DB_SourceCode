import java.sql.SQLException;
import java.util.ArrayList;

import model.CompanyDAO;
import model.Emp;

public class TestSubQuery {
	public static void main(String[] args) {
		try {
			CompanyDAO dao = new CompanyDAO();
			// ����� �� ���� ���� ������ �޴� ��� ��� 
			// ��� ������ ������ ���޸� ��ȸ 
			ArrayList<Emp> list = dao.getEmpHighSalary();
			for(Emp emp:list)
				System.out.println(emp.getName()+" "+emp.getSalary());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
