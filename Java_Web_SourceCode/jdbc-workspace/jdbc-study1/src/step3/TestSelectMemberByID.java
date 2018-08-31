package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelectMemberByID {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	 //String url = "jdbc:oracle:thin:@192.168.0.176:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			String sql="select password, name, address from member where id=?";
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setString(1, "babo");
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				//pk 로 검색하므로 없거나 1명 존재하거나 
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			rs.close();
			pstmt.close();
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
