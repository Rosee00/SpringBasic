package com.simple.basic;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트환경 구성
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //동작시킬 스프링 설정파일
public class JDBCMybatis {
	
	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void testCode01() {
		//마이바티스 핵심 객체
		System.out.println(sqlSessionFactory);
		
	}
	
	@Test
	public void testCode02() {
		
		String time = testMapper.getTime();
		System.out.println(time);
	}
	
	

}