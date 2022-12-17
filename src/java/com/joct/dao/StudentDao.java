package com.joct.dao;

import java.util.List;

import com.joct.entity.Student;

public interface StudentDao {

	public abstract void saveStudent(Student stu);
	
	public abstract List<Student> getStudents();
}
