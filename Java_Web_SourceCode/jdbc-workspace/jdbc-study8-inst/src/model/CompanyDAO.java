package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="scott";
	private String pass="tiger";
	public CompanyDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public Emp findEmpAndDepartmentInfo(String empNo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Emp emp=null;
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append(" SELECT	e.emp_no,e.name,e.salary,e.dept_no,");
			sql.append(" d.dname,d.location");
			sql.append(" FROM department d , emp e");
			sql.append(" WHERE d.dept_no=e.dept_no AND e.emp_no=?");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, empNo);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				emp=new Emp();
				emp.setEmpNo(rs.getString(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				Department department=
						new Department(rs.getString(4),rs.getString(5),rs.getString(6));
				emp.setDepartment(department);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return emp;
	}
	public ArrayList<Emp> getEmpHighSalary() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Emp> list=new ArrayList<Emp>();
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append(" SELECT	name,salary");
			sql.append(" FROM emp");
			sql.append(" WHERE salary=(SELECT MAX(salary) FROM emp)");
			pstmt=con.prepareStatement(sql.toString());			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Emp emp=new Emp();				
				emp.setName(rs.getString(1));
				emp.setSalary(rs.getInt(2));
				list.add(emp);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ArrayList<Emp> getEmpListLowSalary() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Emp> list=new ArrayList<Emp>();
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("select e.name,e.salary,d.dept_no,d.dname,d.location ");
			sql.append("from emp e, department d ");
			sql.append("where e.dept_no=d.dept_no ");
			sql.append("and e.salary=(select min(salary) from emp) ");
			pstmt=con.prepareStatement(sql.toString());			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Emp emp=new Emp();				
				emp.setName(rs.getString(1));
				emp.setSalary(rs.getInt(2));
				Department department=new Department(rs.getString(3),
						rs.getString(4), rs.getString(5));
				emp.setDepartment(department);
				list.add(emp);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}




















