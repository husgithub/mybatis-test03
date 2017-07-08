package com.hs.mybatis.dao;

import java.util.List;

import com.hs.mybatis.entry.Student;

public interface StudentMapper {
	
	List<Student> selectStudentAndCourse();
	List<Student> selectStudentAndCourseWithLazyingLoading();

}
