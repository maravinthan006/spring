package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("validate")
public ModelAndView validateCredentials(@RequestParam("user") String id,
@RequestParam("password") String pwd)
{
ModelAndView  mv = new ModelAndView("/home");
if(id.equals("niit") && pwd.equals("niit@123"))
{
mv.addObject("loginmsg", "Valid Credentials");
}
else
{
mv.addObject("loginmsg", "Invalid Credentials...please try again");
}	
return mv;
}
}
	
