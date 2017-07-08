package com.hs.mybatis.entry;

public class Course {
	
	/**
	 *  cid         int(11)       (NULL)           NO      PRI     (NULL)   auto_increment  select,insert,update,references           
		cname       varchar(128)  utf8_general_ci  YES             (NULL)                   select,insert,update,references           
		teacher_id  int(11)       (NULL)           YES             (NULL)                   select,insert,update,references           

	 */
	
	private Integer cid;
	private String cname;
	private Integer teacherId;
	private Teacher teacher;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", teacherId=" + teacherId + ", teacher=" + teacher + "]";
	}
	
	

}
