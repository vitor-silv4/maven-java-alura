package br.com.alura.loja;

import java.math.BigDecimal;

public class Produto {
	private String nome;
	private BigDecimal preço;

	public Produto(String nome, BigDecimal preço) {
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getPreço() {
		return preço;
	}
	
}
