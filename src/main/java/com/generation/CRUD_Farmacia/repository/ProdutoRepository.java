package com.generation.CRUD_Farmacia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.CRUD_Farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public Optional<Produto> findByNome(@Param("nome") String nome);
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}

