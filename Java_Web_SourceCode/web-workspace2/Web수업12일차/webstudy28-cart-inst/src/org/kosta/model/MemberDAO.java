package org.kosta.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
 
// Data Access Logic Object
/*  MemberDAO는 웹어플리케이션 상에서 하나만 존재하면 된다
 *  Singleton Pattern을 적용하여 
 *  외부에서 객체생성하는 것을 막고 
 *  한번 생성한 객체를 공유하여 사용하게 한다 
 */
public class MemberDAO {
	//class loading 시점에 단 한번 객체생성하여 method area에 적재
	private static MemberDAO instance=new MemberDAO();	
	private DataSource dataSource;
	private MemberDAO(){
		dataSource=DataSourceManager.getInstance().getDataSource();
	}	
	public static MemberDAO getInstance() {
		return instance;
	}

	public static void setInstance(MemberDAO instance) {
		MemberDAO.instance = instance;
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
	
	public MemberDTO login(MemberDTO dto) throws SQLException {
		MemberDTO resultDTO=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			String sql="select name,address from member where id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next())
				resultDTO=new MemberDTO(dto.getId(),dto.getPassword(),
						rs.getString(1),rs.getString(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return resultDTO;
	}	
}






























