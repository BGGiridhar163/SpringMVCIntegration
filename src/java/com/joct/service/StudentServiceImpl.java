package com.joct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joct.dao.StudentDao;
import com.joct.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		dao.saveStudent(stu);
	}

}
