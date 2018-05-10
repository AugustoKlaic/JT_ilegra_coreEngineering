package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

import com.java.augusto.persistence.LivrosDao;
import com.java.augusto.persistence.PessoaDao;

public class Biblioteca {
	private List<Livro> livrosbiblioteca;
	LivrosDao livrosdao = new LivrosDao();

	public Biblioteca() {
		livrosbiblioteca = new ArrayList<Livro>();
	}

	public List<Livro> getLivrosBiblioteca() {
		return livrosbiblioteca;
	}

	public void adicionaLivro(Livro livro) {
		this.livrosbiblioteca.add(livro);
	}

	public void excluiLivro(int id) {
		Livro livroaux = null;
		for (Livro livro : livrosbiblioteca) {
			if (livro.getEmprestado() == false && livro.getID() == id) {
				livroaux = livro;
			} else
				System.out.println("Livro não encontrado ou está emprestado.");
		}
		livrosbiblioteca.remove(livroaux);
	}

	public List<Livro> buscaLivroTituloPorSemelhanca(String titulo) {
		List<Livro> livrosaux = new ArrayList<>();

		for (Livro livro : livrosbiblioteca) {
			if (livro.getTitulo().equals(titulo) || livro.getTitulo().contains(titulo)) {
				livrosaux.add(livro);
			}
		}
		return livrosaux;
	}

	public Livro buscaLivroTitulo(String titulo) {

		for (Livro livro : livrosbiblioteca) {
			if (livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}

	public List<Livro> buscaLivroAutor(String autor) {
		List<Livro> livrosaux = new ArrayList<>();

		for (Livro livro : livrosbiblioteca) {
			if (livro.getAutor().equals(autor) || livro.getAutor().contains(autor)) {
				livrosaux.add(livro);
			}
		}
		return livrosaux;
	}

	public void carregaDadosLivros() {

		livrosbiblioteca = livrosdao.carregaDadosLivros();
	}

	public void guardaDadosLivros() {

		livrosdao.gravaDadosLivros(livrosbiblioteca);
	}
}