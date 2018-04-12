package ua.com.zhmaka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.com.zhmaka.Shoppingbackend.dao.CategoryDAO;
import ua.com.zhmaka.Shoppingbackend.dto.Category;

@Controller("/")
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","Home Page");
		
		model.addObject("categories", categoryDAO.list());
		model.addObject("userClickHome","true");
		return model;
	}
	@RequestMapping(value={"about"})
	public ModelAndView about()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","About Us Page");
		model.addObject("userClickAbout","true");
		return model;
	}
	
	@RequestMapping(value={"contact"})
	public ModelAndView contact()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","Contact Us Page");
		model.addObject("userClickContact","true");
		return model;
	}
	
	@RequestMapping(value={"show/",})
	public ModelAndView showAllProducts()
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","All Products ");
		
		model.addObject("categories", categoryDAO.list());
		model.addObject("userClickAllProducts","true");
		return model;
	}
	
	
	@RequestMapping(value={"{id}"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		// to fetch a single category
		Category category = categoryDAO.getCategoryById(id);		
		

		ModelAndView model = new ModelAndView("page");
		model.addObject("title",category.getName());
		//passing the list od categories
		model.addObject("categories", categoryDAO.list());
		
		//passing a single category
		model.addObject("category", category);
		model.addObject("userClickCategoryProducts","true");
		return model;
	}
	
	
	

	
	
	
	
	
}
