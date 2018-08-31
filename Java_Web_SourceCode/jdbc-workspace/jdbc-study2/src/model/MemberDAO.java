package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO : Data Access Object 
 * 			데이터베이스 연동 업무를 담당하는 객체 
 */
public class MemberDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String password = "tiger";

	public MemberDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	/*
	 * database member table에 저장된 모든 회원 정보를 조회하여 ArrayList 에 저장해 반환하는 메서드
	 * 
	 * connection -> PreparedStatement - > ResultSet -> close
	 */
	public ArrayList<MemberVO> getAllMemberList() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<MemberVO>();

			while (rs.next()) {
				list.add(new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));

			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	// 오버 로딩 
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();

	}

	public MemberVO findMemberById(String id) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select password,name,address from member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo=new MemberVO(id,rs.getString(1), rs.getString(2), rs.getString(3));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

	public void registerMember(MemberVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "insert into member(id,password,name,address) values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.executeUpdate();
			System.out.println("insert 완료");
		}finally {
			closeAll(rs,pstmt,con);
		}
		
	}

	public void updataMember(MemberVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "update member password=?, name=?, address=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,vo.getPassword());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
			System.out.println("Update 완료 ");
		}finally {
			closeAll(pstmt, con);
		}
	}

	public void deleteMemberById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO vo = null;
		
		try {
			
			con = DriverManager.getConnection(url, user, password);
			String sql = "delete from member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
			
		}finally {
			closeAll(pstmt, con);
		}
	}

	private void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}
}
