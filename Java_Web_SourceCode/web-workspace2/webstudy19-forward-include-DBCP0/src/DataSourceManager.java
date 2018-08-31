import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/**
 *  아파치 톰켓 WAS 에서 제공하는 컨넥션풀 객체를 시스템에서 단 한번 생성 
 *  여러 DAO (Data Access Object)에서 사용하도록 하는 클래스 
 * @author mdnbo
 *
 */
public class DataSourceManager {
	private static DataSourceManager instance = new DataSourceManager();
	/*
	 * javax.sql.DataSource interface는 
	 * 다양한 dbcp를 표준화하기 위한 인터페이스
	 */
	private DataSource dataSource;
	private DataSourceManager(){
		BasicDataSource dbcp=new BasicDataSource();
		dbcp.setDriverClassName("oracle.jdbc.OracleDriver");
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("scott");
		dbcp.setPassword("tiger");
		//각종 dbcp 설정
		//기본 컨넥션 풀의 최대 컨넥션 수 기본8 
		//을 20으로 변경한다. 
		dbcp.setMaxTotal(20);
		this.dataSource=dbcp;
	}
	public static DataSourceManager getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
}
