package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CardDAO2 {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";

	public CardDAO2() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	/*
	 * ī��� ����Ʈ �߱�(���)�ϴ� �޼��� ( Transaction ó�� ) try{ conncetion.setAutoCommit(false);
	 * 1. ī�� ��� 2. ����Ʈ ��� connection commit(); // ���� db�� ���� }catch(){
	 * connection.rollback(); //�۾� ���
	 */
	public void registerCardAndPoint(String id, String name, String point_type, int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt=null;
		try {
			con = getConnection();
			con.setAutoCommit(false); // �ڵ� Ŀ�� ��� ���� 
			String insertCard="insert into card(id,name) values(?,?)" ;
			pstmt = con.prepareStatement(insertCard);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int result = pstmt.executeUpdate();
			System.out.println("ī�� ���"+result);
			pstmt.close();
			String insertPoint ="insert into POINT(id,point_type,point) values (?,?,?)";
			pstmt=con.prepareStatement(insertPoint);
			pstmt.setString(1, id);
			pstmt.setString(2, point_type);
			pstmt.setInt(3, point);
			int result2=pstmt.executeUpdate();
			System.out.println("����Ʈ ����"+result2);
			con.commit();
			System.out.println("ī��� ����Ʈ �����ϵǾ� db�� �ݿ��Ѵ�. commit");
		}catch(Exception e){
				con.rollback();
				System.out.println("����۾��� ��ְ� �߻��Ͽ� ��ü ����۾� ���");
				throw e; // ȣ���� ���� ������ ���ܰ� ���޵ǵ��� throw ó���Ѵ�.
		}finally {
			closeAll(pstmt, con);
		}
	}
}
