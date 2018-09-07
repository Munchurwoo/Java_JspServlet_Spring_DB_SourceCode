package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig implements InitializingBean, DisposableBean{
	
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub_admin.id}")
	private String subAdminId;
	@Value("${sub_admin.pw}")
	private String subAdminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertics() {
		PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
		Resource[] locations = new Resource[2];
		locations[0]=new ClassPathResource("admin.properties");
		locations[1]=new ClassPathResource("sub_admin.properties");
		config.setLocations(locations);
		return config;
	}
	
	@Bean
	public AdminConnection admin() {
		
		AdminConnection admin = new AdminConnection();
		admin.setAdminId(adminId);
		admin.setAdminPw(adminPw);
		admin.setSubAdminId(subAdminId);
		admin.setSubAdminPw(subAdminPw);
		
		return admin;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("초기화 완료");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("종료 완료");
		
	}
}
