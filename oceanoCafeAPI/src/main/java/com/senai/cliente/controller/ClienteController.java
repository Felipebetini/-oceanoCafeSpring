package com.senai.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cliente.entity.Cliente;
import com.senai.cliente.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	public ClienteService clienteService;
	@GetMapping()
	  public List<Cliente> buscarTodos() {
	    return clienteService.buscarTodos();
	  }

	  @GetMapping("/{id}")
	  public Cliente buscarId(@PathVariable Integer id) {
	    return clienteService.buscarId(id);
	  }

	  @PostMapping
	  public Cliente inserirCliente(@RequestBody Cliente cliente) {
	    return clienteService.salvar(cliente);
	  }

	  @PutMapping
	  public Cliente atualizarCliente(@RequestBody Cliente cliente) {
	    return clienteService.salvar(cliente);
	  }

}
