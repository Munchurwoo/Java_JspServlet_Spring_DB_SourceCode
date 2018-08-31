package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";

	public CompanyDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}
	public Emp findEmpAndDepartmentInfo(int empNo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Emp emp = new Emp();
		try {
			con = getConnection();
			String sql ="SELECT e.emp_no, e.name, e.salary, d.dept_no, d.location, d.dname FROM department d, emp e WHERE d.dept_no = e.dept_no AND e.emp_no=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empNo);
			rs = pstmt.executeQuery();
			if (rs.next())
				emp.setEmpNo(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				emp.setDepartment(new Department(rs.getInt(4), rs.getString(5), rs.getString(6)));
				
		} finally {
			closeAll(rs, pstmt, con);
		}
		return emp;
	}

	public ArrayList<Emp> getEmpHighSalary() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Emp> list=new ArrayList<Emp>();
		try {
			con = getConnection();
			String sql = "select emp_No,name, salary from emp where salary=(select max(salary) from emp )";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new Emp(rs.getInt(1),rs.getString(2),rs.getInt(3), null));
		} finally {
			closeAll(rs, pstmt, con);
		}
		
		return list;
	}

	public ArrayList<Emp> getEmpListLowSalary() throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Emp emp = new Emp();
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		try {
			con = getConnection();
			String sql = "select e.name, e.salary, d.dept_no, d.dname, d.location from department d, emp e WHERE d.dept_no = e.dept_no and salary=(SELECT min(salary) from emp)";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next())
				emp.setName(rs.getString(1));
				emp.setSalary(rs.getInt(1));
				Department dept = new Department(rs.getInt(3), rs.getString(4), rs.getString(5));
//				list.add(new Emp(null.))
//				list.add(new Emp(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getNString(4), getString(5)));
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}

	private Department getString(int i) {
		
		return null;
	}

}
