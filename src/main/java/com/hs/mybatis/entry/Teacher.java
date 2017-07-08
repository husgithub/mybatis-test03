package com.hs.mybatis.entry;

public class Teacher {
	
	/**
	 *  ID      int(11)       (NULL)           NO      PRI     (NULL)           select,insert,update,references           
		NAME    varchar(255)  utf8_general_ci  YES             (NULL)           select,insert,update,references           

	 */
	
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	

}
