package org.kosta.model;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/*
 *  Database Connection Pool을 생성해서 공유하는
 *  클래스
 *  -> 시스템 상에서 DBCP는 하나만 존재하게 하고
 *  	여러 DAO에서 공유해서 사용하면 되므로
 *      Singleton Pattern을 적용한다 
 *       
 *   apache tomcat 즉 WAS에서 제공하는 dbcp를 사용한다 
 *   이후 유지보수성을 위해 javax.sql.DataSource Interface 타입으로
 *   관리한다    
 */
public class DataSourceManager {
	private static DataSourceManager instance=new DataSourceManager();
	private DataSource dataSource;
	private DataSourceManager() {
		//was 에서 제공하는 dbcp를 생성한 후  dataSource 변수에 할당
		BasicDataSource dbcp=new BasicDataSource();
		dbcp.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("scott");
		dbcp.setPassword("tiger");
		// 예를 들면 아래와 같이 dbcp 초기 설정을 할 수 있다 
		dbcp.setInitialSize(10);
		this.dataSource=dbcp;
	}
	public static DataSourceManager getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
}







