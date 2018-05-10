package com.java.augusto.business;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Emprestimo {

	public static int geraID = 1;
	private int idemprestimo;
	private Pessoa pessoa;
	private Livro livro;
	private LocalDate prazo;
	private Map<String, Integer> emprestimoatrasados = new HashMap<String, Integer>();

	public Emprestimo(Pessoa pessoa, Livro livro) {
		this.idemprestimo = geraID++;
		this.pessoa = pessoa;
		this.livro = livro;
		this.prazo = LocalDate.now();
	}

	public LocalDate getPrazoEntrega() {
		return prazo.plusDays(7);
	}

	public LocalDate getDiaEmprestimo() {
		return prazo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public int getIdEmprestimo() {
		return idemprestimo;
	}

	public void setRenovacaoEmprestimo(LocalDate prazo) {
		this.prazo = prazo;
	}

	public Map<String, Integer> getEmprestimosAtrasados() {
		return emprestimoatrasados;
	}

	public void adicionaCLienteAtrasadoEValor(Pessoa pessoa, int valormulta) {
		emprestimoatrasados.put(pessoa.getNome(), valormulta);
	}
}