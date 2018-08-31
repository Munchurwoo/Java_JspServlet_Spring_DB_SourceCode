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
	 * 계좌를 개설하는 메서드 
	 * 계좌번호는 시퀀스를 이용해 자동 생성해 입력하고
	 * 계좌주명과 비밀번호,초기 납입금을 데이터베이스에 입력한다
	 * 초기 납입금이 1000원 미만이면 개설하지 않는다. 
	 * @param vo
	 * @throws CreateAccountException 
	 * @throws SQLException 
	 */
	public void createAccount(AccountVO vo) throws CreateAccountException, SQLException{
		if(vo.getBalance()<1000)
			throw new CreateAccountException("초기 납입액은 1000원 이상이어야 합니다!");
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
	 * 계좌번호와 비밀번호를 입력받아 잔액을 반환하는 메서드 
	 * 계좌번호가 존재하지 않거나 
	 * 계좌번호에 따른 비밀번호가 일치하지 않으면 
	 * 예외를 발생시킨다. 
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
		    	if(password.equals(rs.getString(1))) { //비밀번호가 일치하면
		    		balance=rs.getInt(2);
		    	}else {	//비밀번호가 일치하지 않으면 	    		
		    		throw new NotMatchedPasswordException("비밀번호가 일치하지 않습니다!");
		    	}
		    }else {//계좌가 존재하지 않으면 
		    	throw new AccountNotFoundException("계좌가 존재하지 않습니다!");
		    }
		}finally{
			closeAll(rs, pstmt, con);
		}
		return balance;
	}
	/**
	 * 계좌번호에 해당하는 계좌가 존재하는 지를 
	 * 조회하는 메서드 
	 * 계좌가 존재하면 true , 존재하지 않으면 false를 반환한다
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
	 * 입금처리 메서드 
	 * @param accountNo
	 * @param money
	 * @throws NoMoneyException
	 * @throws SQLException
	 * @throws AccountNotFoundException
	 */
	public void deposit(String accountNo, int money) throws NoMoneyException, SQLException, AccountNotFoundException {
		if(money<=0)
			throw new NoMoneyException("입금액은 0원을 초과해야 합니다!");
		if(existAccount(accountNo)==false)
			throw new AccountNotFoundException("입금계좌가 존재하지 않습니다");
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
	 * 출금 메서드 
	 * money는 0 초과 
	 * accountNo 존재하고  password 일치해야 한다 
	 * balance 보다 money(출금액) 은 같거나 작아야 한다. 
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
			throw new NoMoneyException("출금액은 0원을 초과해야 합니다");
		int balance=getAccountBalance(accountNo, password);
		if(balance<money)
			throw new InsufficientBalanceException("잔액부족하여 출금할 수 없습니다");
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
	 * 계좌이체 
	 * accountNo 에 해당하는 계좌에서 출금하여 
	 * otherAccountNo에 해당하는 계좌에 입금하는 메서드 
	 * 예외상황 
	 * 1.transferMoney가 0 이하일 경우 NoMoneyException
	 * 2.accountNo 또는 otherAccountNo가 존재하지 않을 경우
	 *   AccountNotFoundException
	 * 3.accountNo 즉 출금계좌 password가 다를 경우 
	 *   NotMatchedPasswordException 
	 * 4. accountNo 즉 출금계좌의 balance(잔액) 이 
	 * 	   transferMoney(이체액) 보다 작을 경우 
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
				throw new NoMoneyException("잘못된 이체액입니다!");
			if(!existAccount(otherAccountNo))
				throw new AccountNotFoundException(
						"이체받을 계좌가 존재하지 않습니다");
			withdraw(accountNo, password, transferMoney);
			deposit(otherAccountNo, transferMoney);
	}
}

































