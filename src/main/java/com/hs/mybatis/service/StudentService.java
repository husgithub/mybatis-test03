package com.hs.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.mybatis.dao.StudentMapper;
import com.hs.mybatis.entry.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	
	public List<Student> selectStudentAndCourse(){
		return studentMapper.selectStudentAndCourse();
		
	}

}
