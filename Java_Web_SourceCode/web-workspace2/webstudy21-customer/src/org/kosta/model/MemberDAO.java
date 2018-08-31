package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MemberDAO {
	private DataSource dataSource;
	private static MemberDAO instance;

	private MemberDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static MemberDAO getInstance() {
		if (instance == null)
			instance = new MemberDAO();
		return instance;
	}

	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	// method overloading
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	public int count() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		try {
			con = getConnection();
			String sql = "select count(*) from customer";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			count = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}

	public void register(MemberDTO dto) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			try {
				con = getConnection();
				String sql = "insert into customer(id,password,name,address,birthday,regdate) values(?,?,?,?,?,sysdate)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPassword());
				pstmt.setString(3, dto.getName());
				pstmt.setString(4, dto.getAddress());
				pstmt.setString(5, dto.getBirthday());
				System.out.println(dto.getId());
				System.out.println(dto.getBirthday());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
	}

	public MemberDTO login(String id, String password) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO dto = null;
		try {
			con = getConnection();
			String sql = "select id from CUSTOMER where id=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs != null) {
				dto = new MemberDTO(id, null, null, null, null, null);
			}else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}
	/*
	 * public void registerProduct(ProductDTO dto) throws SQLException { Connection
	 * con=null; PreparedStatement pstmt=null; ResultSet rs=null; try{
	 * con=getConnection(); String
	 * sql="insert into model2_product(pno,name,maker,price,regdate) values(model2_product_seq.nextval,?,?,?,sysdate)"
	 * ; pstmt=con.prepareStatement(sql); pstmt.setString(1, dto.getName());
	 * pstmt.setString(2, dto.getMaker()); pstmt.setInt(3, dto.getPrice());
	 * pstmt.executeUpdate(); }finally{ closeAll(rs,pstmt, con); } } public
	 * ArrayList<ProductDTO> getAllProductList() throws SQLException { Connection
	 * con=null; PreparedStatement pstmt=null; ResultSet rs=null;
	 * ArrayList<ProductDTO> list=new ArrayList<ProductDTO>(); try{
	 * con=getConnection(); String sql
	 * ="select pno,name,to_char(regdate,'YYYY/MM/DD') from model2_product order by pno desc"
	 * ; pstmt=con.prepareStatement(sql); rs=pstmt.executeQuery(); while(rs.next()){
	 * ProductDTO dto=new ProductDTO(); dto.setPno(rs.getString(1));
	 * dto.setName(rs.getString(2)); dto.setRegDate(rs.getString(3)); list.add(dto);
	 * } }finally{ closeAll(rs, pstmt, con); } return list; } public ProductDTO
	 * findProductById(String pno) throws SQLException { Connection con=null;
	 * PreparedStatement pstmt=null; ResultSet rs=null; ProductDTO dto=null; try{
	 * con=getConnection(); String
	 * sql="select name,maker,price,to_char(regdate,'YYYY/MM/DD HH24:MI:SS') from model2_product where pno=?"
	 * ; pstmt=con.prepareStatement(sql); pstmt.setString(1,pno);
	 * rs=pstmt.executeQuery(); if(rs.next()) dto=new
	 * ProductDTO(pno,rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
	 * }finally{ closeAll(rs, pstmt, con); } return dto; }
	 */

}
