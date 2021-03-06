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
		biblioteca.carregarDadosLivros();
		clientes = new CadastroPessoas();
		clientes.carregarDadosPessoa();
		emprestimos = new GerenciaEmprestimo();
		emprestimos.carregarDadosEmprestimo();
	}
	
	@Test
	public void testaDados() {
		assertTrue(biblioteca.getLivrosBiblioteca().isEmpty());
		assertTrue(emprestimos.getEmprestimos().isEmpty());
		assertEquals(10, clientes.getCLientes().size());
	}
	
	@Test
	public void testaAdicionaDados() {
		biblioteca.adicionarLivro(new Livro("The Hobbit", "JRR Tolkien", false));
		assertNotNull(biblioteca.buscarLivroTitulo("The Hobbit"));
		assertNotNull(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), biblioteca.buscarLivroTitulo("The Hobbit"));
		assertNotNull(emprestimos.getEmprestimos());
	}
	
	@Test
	public void testaBuscaPorNome() {
		assertEquals("Augusto Sopelsa Klaic", clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic").getNome());
		biblioteca.adicionarLivro(new Livro("The Hobbit", "JRR Tolkien", false));
		assertEquals("The Hobbit", biblioteca.buscarLivroTitulo("The Hobbit").getTitulo());
	}
	
	@Test
	public void testaNovoEmprestimo() {
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("The Hobbit", "JRR Tolkien", false));
		assertEquals(1, clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic").getNumeroAlugados());
	}
	
	@Test
	public void testaUltrapassaNumeroDeLivros() {
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("The Hobbit", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR1", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR2", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("LOTR3", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("SIMARILLION", "JRR Tolkien", true));
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("Contos Inacabados", "JRR Tolkien", true));
		assertEquals(5, clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic").getNumeroAlugados());
	}
	
	@Test
	public void testaRenovacao() {
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), new Livro("SIMARILLION", "JRR Tolkien", true));
		System.out.println(emprestimos.buscarEmprestimo("SIMARILLION").getDiaEmprestimo());
		emprestimos.renovarEmprestimo("SIMARILLION");
		System.out.println(emprestimos.buscarEmprestimo("SIMARILLION").getPrazoEntrega());
		assertEquals(LocalDate.now().plusDays(14),emprestimos.buscarEmprestimo("SIMARILLION").getPrazoEntrega());
	}
	
	@Test
	public void testaDevolucao() {
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionarLivro(livro);
		emprestimos.novoEmprestimo(clientes.buscarPessoaPorNome("Augusto Sopelsa Klaic"), livro);
		emprestimos.devolverLivro(livro);
		assertFalse(biblioteca.buscarLivroTitulo("SIMARILLION").getEmprestado());
	}
	
	@Test
	public void testaBuscaLivroTituloPorSemelhanca() {
		List<Livro> listaauxiliar = new ArrayList<Livro>();
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionarLivro(livro);
		listaauxiliar.add(livro);
		assertEquals(listaauxiliar,biblioteca.buscarLivroTituloPorSemelhanca("SIMA"));
	}
	
	@Test
	public void testeBuscaLivroAutor() {
		List<Livro> listaauxiliar = new ArrayList<Livro>();
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionarLivro(livro);
		listaauxiliar.add(livro);
		assertEquals(listaauxiliar,biblioteca.buscarLivroAutor("JRR"));
	}
	
	@Test
	public void testaExcluiLivro() {
		Livro livro = new Livro("SIMARILLION", "JRR Tolkien", false);
		biblioteca.adicionarLivro(livro);
		assertEquals(1, biblioteca.getLivrosBiblioteca().size());
		biblioteca.excluirLivro(livro.getID());
		assertTrue(biblioteca.buscarLivroTituloPorSemelhanca("SIMA").isEmpty());
	}
}
