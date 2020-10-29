package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginCadastroClienteController{
	@GetMapping("/login")
	public String login() {
		return "/html/loginCadastroCliente";
	}
}