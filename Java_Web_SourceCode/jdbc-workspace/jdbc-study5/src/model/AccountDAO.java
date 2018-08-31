package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";

	public AccountDAO() throws ClassNotFoundException {
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

	public void openAccount(String name, String password, int initialMoney) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if (initialMoney >= 1000) {
			try {
				con = getConnection();
				String sql = "insert into Account (accountNum, name, password, balance) values (account_seq.nextval,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setInt(3, initialMoney);
				pstmt.executeUpdate();
				System.out.println("업데이트 완료");
			} finally {
				closeAll(pstmt, con);
			}
		}else
			System.out.println("계좌 개설을 위해서는 최소 1,000원 이상을 입금 하셔야 됩니다.");
	}

	public void checkBalance(int i, int j) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "select name, balance from Account where accountNum=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			pstmt.setInt(2, j);
			rs = pstmt.executeQuery();
			if (rs.next())
				System.out.println(rs.getString(1)+"고객님의 잔액은 : "+rs.getInt(2)+"입니다.");
			else {
				System.out.println("계좌번호나 비밀 번호가 틀렸습니다.");
			}
			
		} finally {
			closeAll(rs, pstmt, con);
		}
		
	}

	public void deposit(int i, int j) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int balance =0;
		try {
			con = getConnection();
			String sql = "select balance from account where accountnum=?"; 
 			String sql1 = "update Account set balance=? where accountnum=?  ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				balance = balance + j;
				if(balance>0) {
					pstmt = con.prepareStatement(sql1);
					pstmt.setInt(1, balance);
					pstmt.setInt(2, i);
					rs = pstmt.executeQuery();
					System.out.println(balance+"입금 완료됬습니다.");
				}else {
					System.err.println("0원 이상 입금 신청 해야 합니다.");
				}
			}else {
				System.out.println("계좌 번호가 잘못됬습니다.");
			}
		}finally {
			closeAll(pstmt, con);
		}
	}

	public void withdraw(int i, int j, int k) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int balance =0;
		try {
			con = getConnection();
			String sql = "select balance from account where accountnum=? and password=?"; 
 			String sql1 = "update Account set balance=? where accountnum=?  ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			pstmt.setInt(2, j);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				balance=rs.getInt(1);
				balance = balance - k;
				if(k>0) {
					pstmt = con.prepareStatement(sql1);
					pstmt.setInt(1, balance);
					pstmt.setInt(2, i);
					rs = pstmt.executeQuery();
					System.out.println(balance+"출금 완료 후 남은 잔액입니다..");
				}else {
					System.err.println("0원 이상 출금 신청 해야 합니다.");
				}
			}else {
				System.out.println("계좌 번호나 비밀번호를  잘못 입력하셨습니다.");
			}
		}finally {
			closeAll(pstmt, con);
		}
	
	}

	public void transfer(int i, int j, int k, int l) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int balance,balance1 =0;
		try {
			con = getConnection();
			String sql = "select balance from account where accountnum=? and password=?"; 
 			String sql1 = "update Account set balance=? where accountnum=?  ";
 			String sql2 = "update Account set balance=balance+? where accountnum=?  ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			pstmt.setInt(2, k);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				balance=rs.getInt(1);
				balance1 = balance - l;
				if(balance1>0) {
					pstmt = con.prepareStatement(sql1);
					pstmt.setInt(1, balance1);
					pstmt.setInt(2, i);
					rs = pstmt.executeQuery();
					System.out.println(balance1+"이체 완료 후 남은 잔액입니다..");
					pstmt = con.prepareStatement(sql2);
					pstmt.setInt(1, balance);
					pstmt.setInt(2, j);
					rs = pstmt.executeQuery();
					System.out.println(i+"님 으로부터 "+rs.getInt(1)+"입금 받으셨습니다.");
				}else {
					System.err.println("이체 금액이 부족합니다.");
				}
			}else {
				System.out.println("계좌 번호나 비밀번호를  잘못 입력하셨습니다.");
			}
		}finally {
			closeAll(rs,pstmt, con);
		}

	}
}
