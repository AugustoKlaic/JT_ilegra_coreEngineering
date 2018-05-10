package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

import com.java.augusto.persistence.PessoaDao;

public class Agenda {
	private List<Pessoa> pessoas;
	private PessoaDao pessoasbanco;

	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
		this.pessoasbanco = new PessoaDao();
	}

	public void adicionaContato(Pessoa pessoa) {

		pessoasbanco.adicionaContato(pessoa);
		carregaDadosDoBanco();
		// pessoas.add(pessoa);
	}

	public void removeContato(int id) {
		pessoasbanco.removeContato(id);
		carregaDadosDoBanco();
		// pessoas.remove(buscaContatoPorId(id));
	}

	public List<Pessoa> getTodasContatos() {
		return pessoas;
	}

	public List<Pessoa> buscaContatoPorNome(String nomePessoa) {
		List<Pessoa> pessoaaux = new ArrayList<Pessoa>();
		pessoaaux = pessoasbanco.buscaContatoPorNome(nomePessoa);
		return pessoaaux;
		/*
		 * List<Pessoa> pessoasAux = new ArrayList<>(); for (Pessoa p : pessoas) {String
		 * aux = p.getNome(); if(nomePessoa.equals(aux) ||
		 * p.getNome().contains(nomePessoa)) { pessoasAux.add(p); } } return pessoasAux;
		 */
	}

	public Pessoa buscaContatoPorId(int idPessoa) {

		Pessoa pessoaaux = null;
		pessoaaux = pessoasbanco.buscaContatoPorId(idPessoa);
		return pessoaaux;

		/*
		 * for (Pessoa pessoa : pessoas) if (idPessoa == pessoa.getId()) return pessoa;
		 * return null;
		 */
	}

	public void carregaDadosDoBanco() {
		pessoas = pessoasbanco.carregaDadosDoBanco();
	}
}