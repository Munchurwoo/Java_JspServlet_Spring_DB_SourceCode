package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Database member table 에 저장된 member 정보를
 * 모두 조회해서 출력해보는 예제 
 * 
 * 개발 단계 
 * 1. Database Driver loading 
 * 2. Database Connection 
 * 3. PreparedStatement
 * 4. SQL 실행 : executeQuery() : ResultSet 
 * 5. close 
 */
public class TestSelectMember {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
//		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url="jdbc:oracle:thin:@192.168.0.176:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			String sql ="SELECT id, password,name,address from member";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				System.out.println(rs.getString("ID")+" " +rs.getString("PASSWORD")+" "+rs.getString("Name")+ " "+rs.getString("ADDRESS"));
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
