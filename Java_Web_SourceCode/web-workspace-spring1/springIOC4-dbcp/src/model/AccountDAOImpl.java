package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;import javax.xml.transform.Result;

public class AccountDAOImpl implements AccountDAO {
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource dataSource) {
		System.out.println("**spring container로부터 dbcp 주입**"+dataSource);
		this.dataSource = dataSource;
	}
	//closeAll
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}
	@Override
	public AccountVO findAccountById(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AccountVO vo = null;
		
		try {
			con=dataSource.getConnection();
			String sql = "select name,balance from account where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo= new AccountVO(null,rs.getString(1),rs.getInt(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
}
