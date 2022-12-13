package com.joct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/wel")
	public ModelAndView welcome(){
		System.out.println("Inside the welcome controller");
		ModelAndView v = new ModelAndView("welcome");
		String msg="Welcome To Spring MVC Tutorial";
		v.addObject("mess", msg);
		return v;
		//return new ModelAndView("welcome","mess",msg);
		
	}
	
	@RequestMapping(value="/student")
	public ModelAndView getMyPage() {
		return new ModelAndView("student");
	}

}
