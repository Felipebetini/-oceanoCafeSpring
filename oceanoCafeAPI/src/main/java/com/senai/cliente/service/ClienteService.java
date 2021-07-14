package com.senai.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cliente.entity.Cliente;
import com.senai.cliente.repository.ClienteRepository;


@Service
public class ClienteService {
	@Autowired
	  public ClienteRepository clienteRepository;

	  public List<Cliente> buscarTodos() {
	    System.out.println("Listando Clientes");
	    return clienteRepository.findAll();
	  }

	  public Cliente salvar(Cliente cliente) {
	    return clienteRepository.save(cliente);
	  }

	  public Cliente buscarId(Integer id) {
	    return clienteRepository.findById(id).get();
	  }

}
