package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/v1/")
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String getResponse()
	{
		System.out.println("WelcomeController.getResponse()");
		return "THIS IS MY FIRST RESPONSE WITHOUT VIEW";
	}
	
	
	
	@RequestMapping("/login")
	public String loginRequest(@RequestParam("user") String userName , @RequestParam("pass")String pass, Model m)
	{
		
		System.out.println("Your UserName is: "+userName);
		System.out.println("Your Password is: "+pass);
		System.out.println("loginRequest.getResponse()");
		
		String str = "Hello "+ userName +" Now All Yours";
		
		m.addAttribute("msg",str);
		
		return "profile";
	}
}


