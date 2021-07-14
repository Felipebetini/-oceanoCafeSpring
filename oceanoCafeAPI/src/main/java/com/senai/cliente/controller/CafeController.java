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

import com.senai.cliente.entity.Cafe;
import com.senai.cliente.service.CafeService;

@RestController
@RequestMapping("/cafe")
public class CafeController {
	@Autowired
	public CafeService cafeService;
	@GetMapping()
	  public List<Cafe> buscarTodos() {
	    return cafeService.buscarTodos();
	  }

	  @GetMapping("/{id}")
	  public Cafe buscarId(@PathVariable Integer id) {
	    return cafeService.buscarId(id);
	  }

	  @PostMapping
	  public Cafe inserirCafe(@RequestBody Cafe cafe) {
	    return cafeService.salvar(cafe);
	  }

	  @PutMapping
	  public Cafe atualizarCafe(@RequestBody Cafe cafe) {
	    return cafeService.salvar(cafe);
	  }
}
