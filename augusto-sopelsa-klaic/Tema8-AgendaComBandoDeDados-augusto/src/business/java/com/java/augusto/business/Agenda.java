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

	public void adicionaContato(Pessoa pessoa) {

		pessoasdao.adicionaContato(pessoa);
		carregaDadosDoBanco();
	}

	public void removeContato(int id) {
		pessoasdao.removeContato(id);
		carregaDadosDoBanco();
	}

	public List<Pessoa> getTodasContatos() {
		return pessoasdao.carregaDadosDoBanco();
	}

	public List<Pessoa> buscaContatoPorNome(String nomePessoa) {
		List<Pessoa> pessoaaux = new ArrayList<Pessoa>();
		pessoaaux = pessoasdao.buscaContatoPorNome(nomePessoa);
		return pessoaaux;
	}

	public Pessoa buscaContatoPorId(int idPessoa) {

		Pessoa pessoaaux = null;
		pessoaaux = pessoasdao.buscaContatoPorId(idPessoa);
		return pessoaaux;
	}
	
	public void ordenaLista(String tipo) {
		pessoasdao.ordenaContatos(tipo);
	}
	

	public void carregaDadosDoBanco() {
		pessoasdao.carregaDadosDoBanco();
	}
}