package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class ItemDAO {
	private static ItemDAO dao=new ItemDAO();
	private DataSource dataSource;
	private ItemDAO(){
		dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static ItemDAO getInstance(){		
		return dao;
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException{
		closeAll(null, pstmt,con);
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,
			Connection con) throws SQLException{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	
	private Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	public ArrayList<ItemDTO> getAllItemList() throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ItemDTO> list=new ArrayList<ItemDTO>();
		try{
			con=getConnection();
			String sql="select item_no,name,maker from item order by item_no desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new ItemDTO(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
		}finally{
			closeAll(rs,pstmt,con);
		}
		return list;
	}	
	public void registerItem(ItemDTO dto) throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try{
			con=getConnection();
			String sql="insert into item(item_no,name,maker,price,detail) values(item_seq.nextval,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2,dto.getMaker());
			pstmt.setInt(3,dto.getPrice());
			pstmt.setString(4,dto.getDetail());
			pstmt.executeUpdate();
		}finally{
			closeAll(pstmt,con);
		}		
	}
	public ItemDTO findItemByNo(String no) throws SQLException{
		ItemDTO itemdto=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			String sql="select name,maker,price,detail from item where item_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(no));
			rs=pstmt.executeQuery();
			if(rs.next())
				itemdto=new ItemDTO(no,rs.getString(1),rs.getString(2),
						rs.getInt(3),rs.getString(4));
		}finally{
			closeAll(rs,pstmt,con);
		}
		return itemdto;
	}
}
























