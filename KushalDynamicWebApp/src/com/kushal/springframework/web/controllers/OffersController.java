package com.kushal.springframework.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {
	@RequestMapping("/")
	public String showHome(){
		return "home";
		// this home will be converted as
		// /WEB-INF/jsps/home.jps using the prefix and suffix properties by the beans
	}
}
