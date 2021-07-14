package com.senai.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cliente.entity.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Integer>{

}
