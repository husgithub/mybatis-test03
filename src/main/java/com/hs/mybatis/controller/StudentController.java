package com.hs.mybatis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hs.mybatis.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/testmvc")
	public String testmvc(){
		return "index.jsp";
	}
	
	@RequestMapping(value = "/testservice")
	@ResponseBody
	public String testservice(){
		return studentService.selectStudentAndCourse().toString();
	}

}
