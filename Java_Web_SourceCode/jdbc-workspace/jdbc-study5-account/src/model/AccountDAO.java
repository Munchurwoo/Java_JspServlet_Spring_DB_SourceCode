package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DbInfo;


public class AccountDAO {
	public AccountDAO() throws ClassNotFoundException{
		Class.forName(DbInfo.DRIVER_NAME);
	}
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DbInfo.URL,
				DbInfo.USER,DbInfo.PASS);
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException{
		closeAll(null,pstmt,con);
	}
	/**
	 * ���¸� �����ϴ� �޼��� 
	 * ���¹�ȣ�� �������� �̿��� �ڵ� ������ �Է��ϰ�
	 * �����ָ�� ��й�ȣ,�ʱ� ���Ա��� �����ͺ��̽��� �Է��Ѵ�
	 * �ʱ� ���Ա��� 1000�� �̸��̸� �������� �ʴ´�. 
	 * @param vo
	 * @throws CreateAccountException 
	 * @throws SQLException 
	 */
	public void createAccount(AccountVO vo) throws CreateAccountException, SQLException{
		if(vo.getBalance()<1000)
			throw new CreateAccountException("�ʱ� ���Ծ��� 1000�� �̻��̾�� �մϴ�!");
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("insert into account_inst(account_no,name,password,balance)");
		    sql.append(" values(account_inst_seq.nextval,?,?,?)");
		    pstmt=con.prepareStatement(sql.toString());
		    pstmt.setString(1,vo.getName());
		    pstmt.setString(2,vo.getPassword());
		    pstmt.setInt(3,vo.getBalance());		  
		    pstmt.executeUpdate();		    
		}finally{
			closeAll(rs, pstmt, con);
		}
	}
	/**
	 * ���¹�ȣ�� ��й�ȣ�� �Է¹޾� �ܾ��� ��ȯ�ϴ� �޼��� 
	 * ���¹�ȣ�� �������� �ʰų� 
	 * ���¹�ȣ�� ���� ��й�ȣ�� ��ġ���� ������ 
	 * ���ܸ� �߻���Ų��. 
	 * @param accountNo
	 * @param password
	 * @return
	 * @throws SQLException 
	 * @throws AccountNotFoundException 
	 * @throws NotMatchedPasswordException 
	 * 
	 */
	public int getAccountBalance(String accountNo,String password) throws SQLException, NotMatchedPasswordException, AccountNotFoundException{
		int balance=-1;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String sql
              ="select password,balance from account_inst where account_no=?";
		    pstmt=con.prepareStatement(sql);
		    pstmt.setString(1, accountNo);
		    rs=pstmt.executeQuery();
		    if(rs.next()) {
		    	if(password.equals(rs.getString(1))) { //��й�ȣ�� ��ġ�ϸ�
		    		balance=rs.getInt(2);
		    	}else {	//��й�ȣ�� ��ġ���� ������ 	    		
		    		throw new NotMatchedPasswordException("��й�ȣ�� ��ġ���� �ʽ��ϴ�!");
		    	}
		    }else {//���°� �������� ������ 
		    	throw new AccountNotFoundException("���°� �������� �ʽ��ϴ�!");
		    }
		}finally{
			closeAll(rs, pstmt, con);
		}
		return balance;
	}
	/**
	 * ���¹�ȣ�� �ش��ϴ� ���°� �����ϴ� ���� 
	 * ��ȸ�ϴ� �޼��� 
	 * ���°� �����ϸ� true , �������� ������ false�� ��ȯ�Ѵ�
	 * 
	 * @param accountNo
	 * @return
	 * @throws SQLException
	 */
	public boolean existAccount(String accountNo) 
			throws SQLException{
		boolean flag=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String sql="select count(*) from account_inst where account_no=?";
		    pstmt=con.prepareStatement(sql);
		    pstmt.setString(1, accountNo);		    
		    rs=pstmt.executeQuery();
		    if(rs.next()&&rs.getInt(1)>0)
		    	flag=true;		  
		}finally{
			closeAll(rs, pstmt, con);
		}
		return flag;
	}
	/**
	 * �Ա�ó�� �޼��� 
	 * @param accountNo
	 * @param money
	 * @throws NoMoneyException
	 * @throws SQLException
	 * @throws AccountNotFoundException
	 */
	public void deposit(String accountNo, int money) throws NoMoneyException, SQLException, AccountNotFoundException {
		if(money<=0)
			throw new NoMoneyException("�Աݾ��� 0���� �ʰ��ؾ� �մϴ�!");
		if(existAccount(accountNo)==false)
			throw new AccountNotFoundException("�Աݰ��°� �������� �ʽ��ϴ�");
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String sql="update account_inst set balance=balance+? where account_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.executeUpdate();
		}finally{
			closeAll(rs, pstmt, con);
		}		
	}
	/**
	 * ��� �޼��� 
	 * money�� 0 �ʰ� 
	 * accountNo �����ϰ�  password ��ġ�ؾ� �Ѵ� 
	 * balance ���� money(��ݾ�) �� ���ų� �۾ƾ� �Ѵ�. 
	 * @param accountNo
	 * @param password
	 * @param money
	 * @throws NoMoneyException 
	 * @throws AccountNotFoundException 
	 * @throws SQLException 
	 * @throws InsufficientBalanceException 
	 * @throws NotMatchedPasswordException 
	 */
	public void withdraw(String accountNo, String password, int money) 
			throws SQLException, NoMoneyException,  InsufficientBalanceException, NotMatchedPasswordException, AccountNotFoundException {
		if(money<1)
			throw new NoMoneyException("��ݾ��� 0���� �ʰ��ؾ� �մϴ�");
		int balance=getAccountBalance(accountNo, password);
		if(balance<money)
			throw new InsufficientBalanceException("�ܾ׺����Ͽ� ����� �� �����ϴ�");
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String sql="update account_inst set balance=balance-? where account_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.executeUpdate();
		}finally{
			closeAll(rs, pstmt, con);
		}	
	}
	/**
	 * ������ü 
	 * accountNo �� �ش��ϴ� ���¿��� ����Ͽ� 
	 * otherAccountNo�� �ش��ϴ� ���¿� �Ա��ϴ� �޼��� 
	 * ���ܻ�Ȳ 
	 * 1.transferMoney�� 0 ������ ��� NoMoneyException
	 * 2.accountNo �Ǵ� otherAccountNo�� �������� ���� ���
	 *   AccountNotFoundException
	 * 3.accountNo �� ��ݰ��� password�� �ٸ� ��� 
	 *   NotMatchedPasswordException 
	 * 4. accountNo �� ��ݰ����� balance(�ܾ�) �� 
	 * 	   transferMoney(��ü��) ���� ���� ��� 
	 *     InsufficientBalanceException 
	 * 
	 * @param accountNo
	 * @param password
	 * @param otherAccountNo
	 * @param transferMoney
	 * @throws NoMoneyException
	 * @throws SQLException
	 * @throws AccountNotFoundException
	 * @throws InsufficientBalanceException
	 * @throws NotMatchedPasswordException
	 */
	public void transfer(String accountNo,String password,
			String otherAccountNo,int transferMoney) throws NoMoneyException, SQLException, AccountNotFoundException, InsufficientBalanceException, NotMatchedPasswordException{
			if(transferMoney<=0)
				throw new NoMoneyException("�߸��� ��ü���Դϴ�!");
			if(!existAccount(otherAccountNo))
				throw new AccountNotFoundException(
						"��ü���� ���°� �������� �ʽ��ϴ�");
			withdraw(accountNo, password, transferMoney);
			deposit(otherAccountNo, transferMoney);
	}
}

































