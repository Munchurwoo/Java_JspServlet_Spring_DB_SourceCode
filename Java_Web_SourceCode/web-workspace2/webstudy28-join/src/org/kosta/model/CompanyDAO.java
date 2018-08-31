package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class CompanyDAO {
	private static CompanyDAO instance= new CompanyDAO();
	private DataSource dataSource;
	private CompanyDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();
	}
	public static CompanyDAO getInstance() {
		return instance;
	}
	
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException{
		closeAll(null, pstmt,con);
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,
			Connection con) throws SQLException{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	
	private Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	public void registerEmployee(EmployeeVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con=getConnection();
			String sql="insert into employee(empno, ename, sal, deptno) values(mvc_emp_seq.nextval,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setInt(3, vo.getSal());
			pstmt.setInt(4, vo.get);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<EmployeeVO> employeeList() throws SQLException{
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "select e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel"
					+ " from department d,employee e"
					+ " where d.deptno=e.deptno"
					+ " order by e.empno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new EmployeeVO(rs.getString(1),rs.getString(2),rs.getInt(3),new DepartmentVO(rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7))));
			}
			
		}finally {
			closeAll(rs,pstmt,con);
		}
		return list;
		
	}
	public void registerEmployee(String ename,int sal,int department) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "insert into employee(empno,ename,sal,deptno) values(mvc_emp_seq.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setInt(2,sal);
			pstmt.setInt(3, department);
			pstmt.executeUpdate();
		}finally {
			closeAll(rs,pstmt,con);
		}
	}
	
}
