package com.oceano.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")//terá essa url
	public String home(){
		return "/home";//vai ser direcionado para essa página
	
	}@GetMapping("/home")//terá essa url
	public String home2(){
		return "/home";//vai ser direcionado para essa página
	
	}
	
}