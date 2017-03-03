package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.model.CategoryModel;

@Controller

public class CategoryController {
	@Autowired
	CategoryDAO Categorydao;

	@RequestMapping(value="category", method=RequestMethod.GET)
    public ModelAndView sendcategory(@ModelAttribute("register") CategoryModel category)
	{
		ModelAndView mv=new ModelAndView("/category");
		return mv;
	}
	
	
	@RequestMapping(value="category", method=RequestMethod.POST)
    public ModelAndView getRegister(CategoryModel category)
	{
		
		Categorydao.addCategory(category);
	ModelAndView mv = new ModelAndView("/home", "category", new CategoryModel());
		return mv;		
		
	}
	

}
