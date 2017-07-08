package com.hs.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hs.mybatis.dao.StudentMapper;
import com.hs.mybatis.entry.Student;
import com.hs.mybatis.service.StudentService;

public class Test {
	
	private ApplicationContext applicationContext = null;
	
	@Before
	public void initApplicationContext(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@org.junit.Test
	public void getSqlSessionFactory(){
		
		SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
		System.out.println(sqlSessionFactory);
	}
	
	@org.junit.Test
	public void getMapperXml(){
		
		SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
		SqlSession sqlSession =  sqlSessionFactory.openSession();
		List<Student> list = sqlSession.selectList("com.hs.mybatis.dao.StudentMapper.selectStudentAndCourse");
		System.out.println(list);
		sqlSession.close();
	}
	
	@org.junit.Test
	public void getMapper(){
		StudentMapper studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");
		List<Student> list = studentMapper.selectStudentAndCourse();
		System.out.println(list);
	}
	
	@org.junit.Test
	public void serviceTest(){
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		List<Student> list = studentService.selectStudentAndCourse();
		System.out.println(list);
	}
	
	

}
