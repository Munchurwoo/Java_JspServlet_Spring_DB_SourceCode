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
	public void registerProduct(ProductDTO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=getConnection();
			/*String sql="insert into jdbc_product(id,name,maker,price)"
			+ " values(jdbc_product_seq.nextval,?,?,?)";*/
			StringBuilder sql=new StringBuilder();
			sql.append("insert into model2_product(pno,name,maker,price,regdate) ");
			sql.append("values(model2_product_seq.nextval,?,?,?,sysdate)");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
	
	public ArrayList<ProductDTO> getAllProductList() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ProductDTO> list=new ArrayList<ProductDTO>();
		try {
			con=getConnection();
			String sql=
			"select pno,name,maker,price,regdate from model2_product order by pno desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new ProductDTO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getInt(4),rs.getString(5)));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ProductDTO findProductById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ProductDTO vo=null;
		try {
			con=getConnection();
			String sql="select pno,name,maker,price,regdate from model2_product where pno=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getString(5));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
}










