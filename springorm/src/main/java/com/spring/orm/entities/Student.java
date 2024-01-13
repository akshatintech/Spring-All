package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	
	@Id
	@Column(name = "student_id")
	private int studentid;
	@Column(name = "student_name")
	private String studentname;
	@Column(name = "student_city")
	private String studentcity;
	public Student(int studentid, String studentname, String studentcity) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentcity = studentcity;
		
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	
	

}
