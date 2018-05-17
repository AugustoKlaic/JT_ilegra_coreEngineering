package com.java.augusto.business;

import java.util.List;

import com.java.augusto.persistence.PessoaDao;

public class Agenda {
	private PessoaDao pessoasdao;

	public Agenda() {
		this.pessoasdao = new PessoaDao();
	}

	public void adicionarContato(Pessoa pessoa) {
		pessoasdao.adicionaContato(pessoa);
		carregarDadosDoBanco();
	}

	public void removerContato(int id) {
		pessoasdao.removeContato(id);
		carregarDadosDoBanco();
	}

	public List<Pessoa> getTodasContatos() {
		return pessoasdao.carregaDadosDoBanco();
	}

	public List<Pessoa> buscarContatoPorNome(String nomePessoa) {
		return pessoasdao.buscaContatoPorNome(nomePessoa);
	}

	public Pessoa buscarContatoPorId(int idPessoa) {
		return pessoasdao.buscaContatoPorId(idPessoa);
	}
	
	public void ordenarLista(String tipo) {
		pessoasdao.ordenaContatos(tipo);
	}
	
	public void carregarDadosDoBanco() {
		pessoasdao.carregaDadosDoBanco();
	}
}