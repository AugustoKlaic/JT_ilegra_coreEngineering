package com.java.augusto.teste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.java.augusto.business.Biblioteca;
import com.java.augusto.business.CadastroPessoas;
import com.java.augusto.business.GerenciaEmprestimo;
import com.java.augusto.business.Livro;

public class TesteEmprestimodeLivro {
	
	private Biblioteca biblioteca;
	private CadastroPessoas clientes;
	private GerenciaEmprestimo emprestimos;

	@Before
	public void setup() {
		biblioteca = new Biblioteca();
		biblioteca.carregaDadosLivros();
		clientes = new CadastroPessoas();
		clientes.carregaDadosPessoa();
		emprestimos = new GerenciaEmprestimo();
		emprestimos.carregaDadosEmprestimo();
	}
	
	@Test
	public void testaDados() {
		assertTrue(biblioteca.getLivrosBiblioteca().isEmpty());
		assertTrue(emprestimos.getEmprestimos().isEmpty());
		assertEquals(10, clientes.getCLientes().size());
	}
	
	@Test
	public void testaAdicionaDados() {
		biblioteca.adicionaLivro(new Livro("The Hobbit", "JRR Tolkien", false));
		assertNotNull(biblioteca.buscaLivroTitulo("The Hobbit"));
		assertNotNull(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), biblioteca.buscaLivroTitulo("The Hobbit"));
		assertNotNull(emprestimos.getEmprestimos());
	}
	
	@Test
	public void testaBuscaPorNome() {
		assertEquals("Augusto Sopelsa Klaic", clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic").getNome());
		biblioteca.adicionaLivro(new Livro("The Hobbit", "JRR Tolkien", false));
		assertEquals("The Hobbit", biblioteca.buscaLivroTitulo("The Hobbit").getTitulo());
	}
	
	@Test
	public void testaNovoEmprestimo() {
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("The Hobbit", "JRR Tolkien", false));
		assertEquals(1, clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic").getNumeroAlugados());
	}
	
	@Test
	public void testaUltrapassaNumeroDeLivros() {
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("The Hobbit", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR1", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR2", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR3", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("SIMARILLION", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("Contos Inacabados", "JRR Tolkien", true));
		assertEquals(5, clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic").getNumeroAlugados());
	}
	
	@Test
	public void testaRenovacao() {
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("SIMARILLION", "JRR Tolkien", true));
		System.out.println(emprestimos.buscaEmprestimo("SIMARILLION").getDiaEmprestimo());
		emprestimos.renovaEmprestimo("SIMARILLION");
		System.out.println(emprestimos.buscaEmprestimo("SIMARILLION").getPrazoEntrega());
		assertEquals(LocalDate.now().plusDays(14),emprestimos.buscaEmprestimo("SIMARILLION").getPrazoEntrega());
	}
	
	@Test
	public void testaDevolucao() {
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionaLivro(livro);
		emprestimos.novoEmprestimo(clientes.buscaPessoaPorNome("Augusto Sopelsa Klaic"), livro);
		emprestimos.devolveLivro(livro);
		assertFalse(biblioteca.buscaLivroTitulo("SIMARILLION").getEmprestado());
	}
	
	@Test
	public void testaBuscaLivroTituloPorSemelhanca() {
		List<Livro> listaauxiliar = new ArrayList<Livro>();
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionaLivro(livro);
		listaauxiliar.add(livro);
		assertEquals(listaauxiliar,biblioteca.buscaLivroTituloPorSemelhanca("SIMA"));
	}
	
	@Test
	public void testeBuscaLivroAutor() {
		List<Livro> listaauxiliar = new ArrayList<Livro>();
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionaLivro(livro);
		listaauxiliar.add(livro);
		assertEquals(listaauxiliar,biblioteca.buscaLivroAutor("JRR"));
	}
	
	@Test
	public void testaExcluiLivro() {
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionaLivro(livro);
		assertEquals(1, biblioteca.getLivrosBiblioteca().size());
		biblioteca.excluiLivro(livro.getID());
		assertTrue(biblioteca.buscaLivroTituloPorSemelhanca("SIMA").isEmpty());
	}
}
