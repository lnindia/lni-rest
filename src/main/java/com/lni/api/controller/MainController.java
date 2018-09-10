package com.lni.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(value= {"/","/home","/index"})
    public ModelAndView homePage(){
        
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("data", "Some Data");
	
		return mav;
		
    }
}
