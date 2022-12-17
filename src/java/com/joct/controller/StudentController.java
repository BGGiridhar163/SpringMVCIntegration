package com.joct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joct.entity.Student;
import com.joct.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	
	
	public void setService(StudentService service) {
		this.service = service;
	}

	//@RequestMapping(value="saveStudents", method=RequestMethod.POST)
	@RequestMapping(value="saveStudents", method=RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("Student") Student st) {
		System.out.println("Inside student controller");
		service.saveStudent(st);
		return new ModelAndView("student","st","OMG...Saved Student Information Successfully..!");
	}

}
