package com.java.augusto.testeagenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java.augusto.business.*;

public class AgendaTeste {

	private Agenda contatos = new Agenda();
	private Pessoa pessoa1, pessoa2, pessoa3, pessoa4;

	@Before
	public void setup() {
		
		System.out.println("Cria 4 pessoas.");
		pessoa1 = new Pessoa(1, "Augusto", "augusto@augusto.com", "111111111");
		pessoa2 = new Pessoa(2, "Julia", "julia@julia.com", "222222222");
		pessoa3 = new Pessoa(3, "Roberto", "roberto@roberto.com", "333333333");
		pessoa4 = new Pessoa(4, "Maria", "maria@maria.com", "444444444");
	}

	@Test
	public void testeAdicionaPessoa() {
		
		System.out.println("Adiciona pessoa.");
		contatos.adicionaContato(pessoa1);
		assertFalse(contatos.getTodasContatos().isEmpty());
		System.out.println("Verifica se Array não esta vazio.");
		System.out.println("Adiciona outra pessoa.");
		contatos.adicionaContato(pessoa2);
		assertEquals(2, contatos.getTodasContatos().size());
		System.out.println("Verifica se o tamanho do Array é 2.");
	}

	@Test
	public void testeRemovePessoa() {

		System.out.println("Adiciona 4 pessoas.");
		contatos.adicionaContato(pessoa1);
		contatos.adicionaContato(pessoa2);
		contatos.adicionaContato(pessoa3);
		contatos.adicionaContato(pessoa4);
		System.out.println("Testa se o array tem tamanho 4");
		assertEquals(4, contatos.getTodasContatos().size());
		System.out.println("Remove pessoa do ID = 2");
		contatos.removeContato(2);
		System.out.println("Testa se o array tem tamanho 3");
		assertEquals(3, contatos.getTodasContatos().size());
	}

	@Test
	public void testeBuscaPorNome() {
		List<Pessoa> pessoasaux = new ArrayList<Pessoa>();
		
		System.out.println("Testando busca por nome.");
		System.out.println("Adiciona 4 pessoas.");
		contatos.adicionaContato(pessoa1);
		contatos.adicionaContato(pessoa2);
		contatos.adicionaContato(pessoa3);
		contatos.adicionaContato(pessoa4);
		System.out.println("Testa se o array tem tamanho 4");
		assertEquals(4, contatos.getTodasContatos().size());
		System.out.println("Buscando pessoa com nome 'Roberto'.");
		pessoasaux = contatos.buscaContatoPorNome("Roberto");
		assertTrue(pessoasaux.contains(pessoa3));
	}
	
	@Test
	public void testeBuscaPorID() {
		
		System.out.println("Testando busca por id.");
		System.out.println("Adiciona 4 pessoas.");
		contatos.adicionaContato(pessoa1);
		contatos.adicionaContato(pessoa2);
		contatos.adicionaContato(pessoa3);
		contatos.adicionaContato(pessoa4);
		System.out.println("Testa se o array tem tamanho 4");
		assertEquals(4, contatos.getTodasContatos().size());
		System.out.println("Buscando pessoa com ID = 4.");
		Pessoa pessoaaux = contatos.buscaContatoPorId(4);
		assertEquals(pessoa4, pessoaaux);
	}
}
