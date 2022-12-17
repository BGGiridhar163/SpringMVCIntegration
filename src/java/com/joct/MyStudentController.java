package com.joct;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joct.entity.Student;
import com.joct.service.StudentService;

@Controller
public class MyStudentController {
	
	@Autowired
	StudentService service;
	
	public void setService(StudentService service) {
		this.service = service;
	}
	
	/*@RequestMapping(value="save", method=RequestMethod.POST)
	public ModelAndView saveStudentData(Student student) {
		System.out.println("Inside save student details method");
		return new ModelAndView("student","st","Student details saved successfully..!");
		
	}
	*/
	

	//@RequestMapping(value="saveStudents", method=RequestMethod.POST)
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveStudent(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Inside student controller");
		Student st = new Student();
		st.setFirstName(req.getParameter("firstName"));
		st.setLastName(req.getParameter("lastName"));
		st.setPassword(req.getParameter("password"));
		st.setEmail(req.getParameter("email"));
		st.setDob(req.getParameter("dob"));
		service.saveStudent(st);
		return new ModelAndView("student","st","OMG...Saved Student Information Successfully..!");
	}

}
