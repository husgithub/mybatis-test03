package com.hs.mybatis.entry;

import java.util.List;

public class Student {
	/**
	 *  sid     int(11)       (NULL)           NO      PRI     (NULL)   auto_increment  select,insert,update,references           
		sname   varchar(128)  utf8_general_ci  YES             (NULL)                   select,insert,update,references           
		gender  varchar(128)  utf8_general_ci  YES             (NULL)                   select,insert,update,references        
	 */
	
	private Integer sid;
	private String sname;
	private String gender;
    
	private List<Course> courses;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", courses=" + courses + "]";
	}
	
	
	
	

}
