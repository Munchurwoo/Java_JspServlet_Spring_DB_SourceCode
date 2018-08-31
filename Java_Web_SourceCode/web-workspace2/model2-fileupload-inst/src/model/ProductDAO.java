package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

//DBCP 적용해본다 
public class ProductDAO {
	private static ProductDAO instance=new ProductDAO();
	private DataSource dataSource;
	private ProductDAO(){
		dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static ProductDAO getInstance(){
		return instance;
	}
	public void closeAll(PreparedStatement pstmt, Connection con) {
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con){
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		closeAll(pstmt,con);
	}
	private Connection getConnection() throws SQLException {
		return dataSource.getConnection(); //컨넥션 빌려온다
	}
	public void registerProduct(ProductVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String 	sql="insert into semi_product(pno,name,maker,picture) values(semi_product_seq.nextval,?,?,?)";			
			pstmt=con.prepareStatement(sql);			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setString(3, vo.getPicture());
			pstmt.executeUpdate();
			pstmt.close();
			sql="select semi_product_seq.currval from dual";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo.setPno(rs.getString(1));
		}finally{
			closeAll(rs,pstmt, con);
		}
	}
	public ProductVO findProductByNo(String pno) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ProductVO vo=null;
		try{
			con=getConnection();
			String sql="select name,maker,picture from semi_product where pno=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,pno);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductVO(pno,rs.getString(1),rs.getString(2),rs.getString(3));
		}finally{
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
}











