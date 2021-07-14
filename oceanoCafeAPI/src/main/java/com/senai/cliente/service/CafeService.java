package com.senai.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cliente.entity.Cafe;
import com.senai.cliente.repository.CafeRepository;

@Service
public class CafeService {
	@Autowired
	  public CafeRepository cafeRepository;

	  public List<Cafe> buscarTodos() {
	    System.out.println("Listando Cafes");
	    return cafeRepository.findAll();
	  }

	  public Cafe salvar(Cafe cafe) {
	    return cafeRepository.save(cafe);
	  }

	  public Cafe buscarId(Integer id) {
	    return cafeRepository.findById(id).get();
	  }

}
