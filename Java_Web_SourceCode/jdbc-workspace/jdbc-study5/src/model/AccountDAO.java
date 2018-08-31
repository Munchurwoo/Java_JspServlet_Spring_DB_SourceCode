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
				System.out.println("������Ʈ �Ϸ�");
			} finally {
				closeAll(pstmt, con);
			}
		}else
			System.out.println("���� ������ ���ؼ��� �ּ� 1,000�� �̻��� �Ա� �ϼž� �˴ϴ�.");
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
				System.out.println(rs.getString(1)+"������ �ܾ��� : "+rs.getInt(2)+"�Դϴ�.");
			else {
				System.out.println("���¹�ȣ�� ��� ��ȣ�� Ʋ�Ƚ��ϴ�.");
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
					System.out.println(balance+"�Ա� �Ϸ����ϴ�.");
				}else {
					System.err.println("0�� �̻� �Ա� ��û �ؾ� �մϴ�.");
				}
			}else {
				System.out.println("���� ��ȣ�� �߸�����ϴ�.");
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
					System.out.println(balance+"��� �Ϸ� �� ���� �ܾ��Դϴ�..");
				}else {
					System.err.println("0�� �̻� ��� ��û �ؾ� �մϴ�.");
				}
			}else {
				System.out.println("���� ��ȣ�� ��й�ȣ��  �߸� �Է��ϼ̽��ϴ�.");
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
					System.out.println(balance1+"��ü �Ϸ� �� ���� �ܾ��Դϴ�..");
					pstmt = con.prepareStatement(sql2);
					pstmt.setInt(1, balance);
					pstmt.setInt(2, j);
					rs = pstmt.executeQuery();
					System.out.println(i+"�� ���κ��� "+rs.getInt(1)+"�Ա� �����̽��ϴ�.");
				}else {
					System.err.println("��ü �ݾ��� �����մϴ�.");
				}
			}else {
				System.out.println("���� ��ȣ�� ��й�ȣ��  �߸� �Է��ϼ̽��ϴ�.");
			}
		}finally {
			closeAll(rs,pstmt, con);
		}

	}
}
