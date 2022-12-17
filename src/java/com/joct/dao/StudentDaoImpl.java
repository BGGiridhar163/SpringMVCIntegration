package com.joct.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joct.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		se.save(stu);
		tx.commit();
	}


	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Session se = sf.openSession();
		List<Student> slist =se.createQuery("from Student").list();
		return slist;
	}

}
