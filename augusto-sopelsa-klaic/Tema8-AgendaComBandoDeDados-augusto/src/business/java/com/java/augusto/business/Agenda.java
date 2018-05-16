package com.java.augusto.business;

import java.util.ArrayList;
import java.util.Collections;
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
		List<Pessoa> pessoaaux = new ArrayList<Pessoa>();
		pessoaaux = pessoasdao.buscaContatoPorNome(nomePessoa);
		return pessoaaux;
	}

	public Pessoa buscarContatoPorId(int idPessoa) {

		Pessoa pessoaaux = null;
		pessoaaux = pessoasdao.buscaContatoPorId(idPessoa);
		return pessoaaux;
	}
	
	public void ordenarLista(String tipo) {
		pessoasdao.ordenaContatos(tipo);
	}
	

	public void carregarDadosDoBanco() {
		pessoasdao.carregaDadosDoBanco();
	}
}