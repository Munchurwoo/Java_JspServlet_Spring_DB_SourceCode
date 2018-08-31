package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


public class CustomerDAO {
	private static CustomerDAO instance=new CustomerDAO();
	private DataSource dataSource;
	private CustomerDAO(){
		dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static CustomerDAO getInstance() throws ClassNotFoundException{
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
	public int getAllCustomerCount() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		try{
			con=dataSource.getConnection();
			String sql="select count(*) from customer";
			pstmt=con.prepareStatement(sql);
		
			rs=pstmt.executeQuery();
			if(rs.next())
				count=rs.getInt(1);
		}finally{
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	public boolean idcheck(String id) throws SQLException{
		boolean flag=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=dataSource.getConnection();
			String sql="select count(*) from customer where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()&&(rs.getInt(1)>0))
			flag=true;			
		}finally{
			closeAll(rs,pstmt,con);
		}
		return flag;
	}
	public void register(CustomerVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=dataSource.getConnection();
			String sql="insert into customer(id,password,name,address,birthday,regdate)"
					+ " values(?,?,?,?,to_date(?,'YYYY-MM-DD'),sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.setString(5, vo.getBirthday());
			pstmt.executeUpdate();
		}finally{
			closeAll(pstmt, con);
		}
	}
	public CustomerVO login(String id,String password) throws SQLException{
		CustomerVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;    
		try{
			con=dataSource.getConnection();
			String sql=
		"select name from customer where id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next())
			  vo=new CustomerVO(id,rs.getString(1));  
		}finally{
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public CustomerVO getDetailCustomer(String id) throws SQLException {
		CustomerVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;    
		try{
			con=dataSource.getConnection();
			String sql=
					"select name,address,to_char(birthday,'YYYY-MM-DD'),to_char(regdate,'YYYY.MM.DD HH24:MM'),trunc(months_between(sysdate,birthday)/12) from customer where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
			  vo=new CustomerVO();
			  vo.setId(id);
			  vo.setName(rs.getString(1));
			  vo.setAddress(rs.getString(2));
			  vo.setBirthday(rs.getString(3));
			  vo.setRegdate(rs.getString(4));
			  vo.setAge(rs.getString(5));
			}
		}finally{
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
}











