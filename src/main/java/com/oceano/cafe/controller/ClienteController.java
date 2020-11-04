package com.oceano.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/cliente/cadastro";
	}
	
	@GetMapping("/logar")
	public String logar() {
		return "/cliente/login";
	}
}
