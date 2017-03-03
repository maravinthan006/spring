package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.RegisterDAO;
import com.niit.model.RegisterModel;

@Controller

public class RegisterController {
	@Autowired
	RegisterDAO Registerdao;

	@RequestMapping(value="register", method=RequestMethod.GET)
    public ModelAndView sendregister(@ModelAttribute("register") RegisterModel register)
	{
		ModelAndView mv=new ModelAndView("/register");
		return mv;
	}
	
	
	@RequestMapping(value="register", method=RequestMethod.POST)
    public ModelAndView getRegister(RegisterModel register)
	{
		
		Registerdao.addRegister(register);
	ModelAndView mv = new ModelAndView("/login", "register", new RegisterModel());
		return mv;		
		
	}
	

}
