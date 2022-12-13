package com.joct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="saveStudent", method=RequestMethod.POST)
	public ModelAndView saveStudentData() {
		return new ModelAndView("student","st","Student details saved successfully..!");
		
	}

}
