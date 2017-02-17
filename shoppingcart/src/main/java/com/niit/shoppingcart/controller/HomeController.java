package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
   // http://localhost:8080/ShoppingCart/
@RequestMapping("/")
public ModelAndView showHomepage()
{
System.out.println("Starting the method showHomepage");
  
ModelAndView mv = new ModelAndView("/home");
   
mv.addObject("msg", "WELCOME TO SHOPPING CART");
return mv;
}
@RequestMapping("login")
public ModelAndView showLoginpage()
{
System.out.println("Clicked on Login link");
ModelAndView mv = new ModelAndView("/login");
mv.addObject("isUserClickedLogin","true" );
return mv;
}
@RequestMapping("register")
public ModelAndView showRegistrationpage()
{
System.out.println("Clicked on Registration link");
ModelAndView mv=new ModelAndView("/register");
mv.addObject("isUserClickedRegister", "true");
return mv;
}
@RequestMapping("validate")
public ModelAndView validateCredentials(@RequestAttribute("userID") String id,
@RequestAttribute("password") String pwd)
{
ModelAndView  mv = new ModelAndView("/home");
if(id.equals("niit") && pwd.equals("niit@123"))
{
mv.addObject("msg", "Valid Credentials");
}
else
{
mv.addObject("msg", "Invalid Credentials...please try again");
}	
return mv;
}
}
	
