package com.oceano.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/adm/cadastro";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/adm/loginAdm";
	}
	@GetMapping("dashboard")
	public String dashboard() {
		return "adm/dashBoard";
	}
	
}