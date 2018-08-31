package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="scott";
	private String pass="tiger";
	private static ProductDAO instance;
	private ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	public static ProductDAO getInstance() throws ClassNotFoundException {
		if(instance==null)
			instance=new ProductDAO();
		return instance;
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
	//method overloading
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	
	public ArrayList<ProductVO> getAllProductList() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		try {
			con=getConnection();
			String sql=
			"select id,name,maker,price from jdbc_product order by id desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new ProductVO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getInt(4)));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ProductVO findProductById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ProductVO vo=null;
		try {
			con=getConnection();
			String sql="select name,maker,price from jdbc_product where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductVO(id, rs.getString(1), rs.getString(2), rs.getInt(3));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public void registerProduct(ProductVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=getConnection();
			/*String sql="insert into jdbc_product(id,name,maker,price)"
			+ " values(jdbc_product_seq.nextval,?,?,?)";*/
			StringBuilder sql=new StringBuilder();
			sql.append("insert into jdbc_product(id,name,maker,price) ");
			sql.append("values(jdbc_product_seq.nextval,?,?,?)");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
}










