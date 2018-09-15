package factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis 설정 정보(SqlSessionConfig.xml->mapper 계열xml)
 * 를 로딩하는 객체 
 * @author kosta-inst
 *
 */
public class SqlSessionFactoryManager {
	private static SqlSessionFactoryManager instance	
										=new SqlSessionFactoryManager();
	private SqlSessionFactory factory;
	private SqlSessionFactoryManager(){
		String config="mybatis/config/SqlSessionConfig.xml";
		try {
			Reader r=Resources.getResourceAsReader(config);
			factory=new SqlSessionFactoryBuilder().build(r);
			System.out.println("mybatis config loading.."+factory);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	public static SqlSessionFactoryManager getInstance(){
		return instance;
	}
	public SqlSessionFactory getFactory() {
		return factory;
	}
	public static void main(String[] args) {
		System.out.println(SqlSessionFactoryManager.getInstance().getFactory());
	}
}










