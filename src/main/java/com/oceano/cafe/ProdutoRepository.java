package com.oceano.cafe;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceano.cafe.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
