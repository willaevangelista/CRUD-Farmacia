package com.generation.CRUD_Farmacia.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome do produto é obrigatório!")
	@Size(max = 100, message = "O atributo nome do produto tem que ser menor que 100 caracteres!")
	private String nome;
	
	@NotBlank(message = "O atributo descricao do produto é obrigatório!")
	@Size(max = 100, message = "O atributo descricao do produto tem que ser menor que 100 caracteres!")
	private String descricao;
	
	@NotNull(message = "O atributo preco do produto é obrigatório!")
	private BigDecimal preco;
	
	@NotBlank(message = "O atributo tarja do produto é obrigatório!")
	@Size(max = 100, message = "O atributo tarja do produto tem que ser menor que 100 caracteres!")
	private String tarja;
	
	@NotNull(message = "O atributo data de validade do produto é obrigatório!")
	private LocalDate dataValidade;
	
	@NotNull(message = "O atributo quantidade em estoque do produto é obrigatório!")
	private Integer quantidadeEstoque;
	
	@ManyToOne
	@JsonBackReference
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}



