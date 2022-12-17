package com.joct.service;

import java.util.List;

import com.joct.entity.Student;

public interface StudentService {
	
	public abstract void saveStudent(Student stu);
	
	public abstract List<Student> getStudents();

}
