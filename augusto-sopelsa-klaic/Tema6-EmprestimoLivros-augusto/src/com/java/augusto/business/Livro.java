package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	public static int numID = 1;
	private int id;
	private String titulo;
	private String autor;
	private boolean emprestado;
	private List<Pessoa> historicoemprestimo = new ArrayList<Pessoa>();

	public Livro(String titulo, String autor, boolean emprestimo) {
		this.id = numID++;
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = emprestimo;
	}

	public List<Pessoa> getHistorico() {
		return historicoemprestimo;
	}

	public void addHistorico(Pessoa pessoa) {
		historicoemprestimo.add(pessoa);
	}

	public int getID() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public String toString() {
		return "Id: " + id + " Livro: " + titulo + " Autor: " + autor + " Alugado?: " + emprestado;
	}
}