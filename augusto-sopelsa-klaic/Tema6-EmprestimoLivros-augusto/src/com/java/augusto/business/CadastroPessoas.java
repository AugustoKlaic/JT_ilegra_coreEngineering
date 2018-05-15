package com.java.augusto.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.java.augusto.persistence.PessoaDao;

public class CadastroPessoas {
	private PessoaDao pessoadao = new PessoaDao();
	private List<Pessoa> clientes;

	public CadastroPessoas() {
		clientes = new ArrayList<Pessoa>();
	}

	public List<Pessoa> getCLientes() {
		return clientes;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		clientes.add(pessoa);
	}

	public Pessoa buscarPessoaPorNome(String nome) {
		for (Pessoa pessoa : clientes) {
			if (pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}

	public void ordenarTop10() {
		Collections.sort(clientes);
	}

	public void carregarDadosPessoa() {
		clientes = pessoadao.carregarDadosPessoa();
	}

	public void guardarDadosPessoa() {
		pessoadao.gravarDadosPessoa(clientes);
	}
}