package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Java Application 과 Database(Oracle) 를 연동하여 
 * DB Table member 의 data를 insert 하는 예제 
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
			pstmt.setString(1, "babo"); // ? 데이터 할당 1은 첫번째 물음표 
			pstmt.setString(2, "1234"); // ? 데이터 할당 1은 첫번째 물음표 
			pstmt.setString(3, "문철우"); // ? 데이터 할당 1은 첫번째 물음표 
			pstmt.setString(4, "중랑"); // ? 데이터 할당 1은 첫번째 물음표 
			pstmt.executeUpdate(); // sql 실행 
			System.out.println("member table에 data를 insert");
			
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
