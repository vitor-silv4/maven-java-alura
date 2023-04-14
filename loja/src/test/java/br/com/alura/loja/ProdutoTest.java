package br.com.alura.loja;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {
		Produto produto = new Produto("teste", new BigDecimal("10"));
		
		assertEquals("teste", produto.getNome());
	}

}
