package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * Spring Sample Application
 */

@Controller
public class SampleClassController {
	
	@RequestMapping(value={"/", "/index"})
	public ModelAndView getIndexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView myWelcomeMethod() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>"
				+ "This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
	}

}
