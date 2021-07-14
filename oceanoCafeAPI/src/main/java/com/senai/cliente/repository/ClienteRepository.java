package com.senai.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
