package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

import com.java.augusto.persistence.LivrosDao;
import com.java.augusto.persistence.PessoaDao;

public class Biblioteca {
	private List<Livro> livros;
	private LivrosDao livrosdao;

	public Biblioteca() {
		livros = new ArrayList<Livro>();
		livrosdao = new LivrosDao();
	}

	public List<Livro> getLivrosBiblioteca() {
		return livros;
	}

	public void adicionaLivro(Livro livro) {
		this.livros.add(livro);
	}

	public void excluiLivro(int id) {
		for (Livro livro : livros) {
			if (livro.getEmprestado() == false && livro.getID() == id) {
				livros.remove(livro);
			} else
				System.out.println("Livro não encontrado ou está emprestado.");
		}	
	}

	public List<Livro> buscaLivroTituloPorSemelhanca(String titulo) {
		List<Livro> livrosaux = new ArrayList<>();

		for (Livro livro : livros) {
			if (livro.getTitulo().equals(titulo) || livro.getTitulo().contains(titulo)) {
				livrosaux.add(livro);
			}
		}
		return livrosaux;
	}

	public Livro buscaLivroTitulo(String titulo) {

		for (Livro livro : livros) {
			if (livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}

	public List<Livro> buscaLivroAutor(String autor) {
		List<Livro> livrosaux = new ArrayList<>();

		for (Livro livro : livros) {
			if (livro.getAutor().equals(autor) || livro.getAutor().contains(autor)) {
				livrosaux.add(livro);
			}
		}
		return livrosaux;
	}

	public void carregaDadosLivros() {

		livros = livrosdao.carregaDadosLivros();
	}

	public void guardaDadosLivros() {

		livrosdao.gravaDadosLivros(livros);
	}
}