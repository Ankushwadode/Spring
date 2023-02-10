package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.spring.jdbc.dao.Studentimpl;

@Configuration
@ComponentScan(basePackages={"com.spring.jdbc.dao"})
public class jdbcconfig {
	
	@Bean("dmds")
	public DataSource getdataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring");
		ds.setUsername("root");
		ds.setPassword("Root@123");
		return ds;
	}
	
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate(){
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getdataSource());
		return jdbcTemplate;
	}
	
//	@Bean("imple")
//	public Studentimpl getstudentimple(){
//		Studentimpl  dao=new Studentimpl();
//		dao.setJdbcTemplate(getTemplate());
//		return dao;
//	}
}
