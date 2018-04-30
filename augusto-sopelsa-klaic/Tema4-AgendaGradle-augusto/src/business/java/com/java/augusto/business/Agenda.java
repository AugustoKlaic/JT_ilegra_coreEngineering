package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Pessoa> pessoas;

	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public void adicionaContato(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void removeContato(int id) {

		pessoas.remove(buscaContatoPorId(id));
	}

	public List<Pessoa> getTodasContatos() {
		return pessoas;
	}

	public List<Pessoa> buscaContatoPorNome(String nomePessoa) {

		List<Pessoa> pessoasAux = new ArrayList<>();

		for (Pessoa p : pessoas) {
			String aux = p.getNome();
			if (nomePessoa.equals(aux) || p.getNome().contains(nomePessoa)) {
				pessoasAux.add(p);
			}
		}
		return pessoasAux;
	}

	public Pessoa buscaContatoPorId(int idPessoa) {

		Pessoa pessoaAux = null;

		for (Pessoa p : pessoas) {
			int aux = p.getId();
			if (idPessoa == aux) {
				pessoaAux = p;
				break;
			}
		}
		return pessoaAux;
	}
}