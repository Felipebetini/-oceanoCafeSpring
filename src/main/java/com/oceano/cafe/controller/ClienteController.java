package com.oceano.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	@GetMapping("/pedido")
	public String pedido() {
		return "/cliente/pedido";
	}
}
