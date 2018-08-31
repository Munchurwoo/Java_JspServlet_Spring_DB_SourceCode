package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class ProductDAO {
	 private String driver="oracle.jdbc.OracleDriver";
	 private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	 private String user="scott";
	 private String pass="tiger";
	 public ProductDAO() throws ClassNotFoundException {
	  Class.forName(driver);
	 }
	 public Connection getConnection() throws SQLException {
		 return DriverManager.getConnection(url, user, pass);
	 }
	 public void closeAll(PreparedStatement pstmt, Connection con
			 ) throws SQLException {
		 if(pstmt!=null)
			 pstmt.close();
		 if(con!=null)
			 con.close();
	 }
	 public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con
			 ) throws SQLException {
		 if(rs!=null)
			 rs.close();
		 closeAll(pstmt, con);
	 }
	public void registerProduct(ProductVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			String sql = "insert into jdbc_product (id,name,maker,price) values (jdbc_product_seq.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt,con);
		}
	}
	public ArrayList<ProductVO> getAllProductList() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		
		/*
		 * 최근에 등록된 상품순으로 ( 상품 아이디 내림차순 ) 
		 * 상품 목록을 조회해 출력한다. 
		 */
		try {
			con = getConnection();
			String sql = "select * from jdbc_product order by price desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new ProductVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ArrayList<ProductVO> getProductListDiscountPrice(int percent) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		
		try {
			con = getConnection();
			String sql = "select id,name,maker,price-(price*(?/100)) from JDBC_PRODUCT";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, percent);
			rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new ProductVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}
