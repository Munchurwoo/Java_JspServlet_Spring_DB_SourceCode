package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Java Application �� Database(Oracle) �� �����Ͽ� 
 * DB Table member �� data�� insert �ϴ� ���� 
 * 
 */
public class TestInsertMember {
	public static void main(String[] args) {
		// database driver loading 
		String driver = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName(driver);
			System.out.println("database driver loading");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("database connection"+con);
			String insertSQL = "insert into member(id,password,name,address) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			pstmt.setString(1, "babo"); // ? ������ �Ҵ� 1�� ù��° ����ǥ 
			pstmt.setString(2, "1234"); // ? ������ �Ҵ� 1�� ù��° ����ǥ 
			pstmt.setString(3, "��ö��"); // ? ������ �Ҵ� 1�� ù��° ����ǥ 
			pstmt.setString(4, "�߶�"); // ? ������ �Ҵ� 1�� ù��° ����ǥ 
			pstmt.executeUpdate(); // sql ���� 
			System.out.println("member table�� data�� insert");
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
