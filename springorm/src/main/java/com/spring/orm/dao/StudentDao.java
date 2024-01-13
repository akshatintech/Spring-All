package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	
	//save student
	
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
