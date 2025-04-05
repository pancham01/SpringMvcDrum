package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/")
public class WelcomeController {

	@RequestMapping("/")
	public String getResponse()
	{
		System.out.println("WelcomeController.getResponse()");
		return "hello";
	}
	
	
	
	@RequestMapping("/login")
	public String loginRequest()
	{
		System.out.println("loginRequest.getResponse()");
		return "profile";
	}
}


