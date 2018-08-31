import java.sql.SQLException;
import java.util.ArrayList;

import model.CompanyDAO;
import model.Emp;

public class TestSubQuery {
	public static void main(String[] args) {
		try {
			CompanyDAO dao = new CompanyDAO();
			// 사원들 중 가장 높은 월급을 받는 사원 명단 
			// 사원 정보는 사원명과 월급만 조회 
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
