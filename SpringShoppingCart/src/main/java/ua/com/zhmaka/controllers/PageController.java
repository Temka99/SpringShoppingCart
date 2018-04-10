package ua.com.zhmaka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","Home Page");
		model.addObject("userClickHome","true");
		return model;
	}
	@RequestMapping(value={"/about"})
	public ModelAndView about()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","About Us Page");
		model.addObject("userClickAbout","true");
		return model;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","Contact Us Page");
		model.addObject("userClickContact","true");
		return model;
	}
	
	
	

	
	
	
	
	
}
