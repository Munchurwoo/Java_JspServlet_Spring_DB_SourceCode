package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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
	public ArrayList<HashMap<String, String>> getMakerAndProductCount() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String, String>>();
		HashMap<String,String> map=new HashMap<String,String>();
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append(" select maker,count(*) as 상품수");
			sql.append(" from jdbc_product");
			sql.append(" group by maker");
			sql.append(" order by 상품수 desc");
			pstmt=con.prepareStatement(sql.toString());			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				map.put("maker", rs.getString(1));
				map.put("totalCount", rs.getString(2));
				list.add(map);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}
