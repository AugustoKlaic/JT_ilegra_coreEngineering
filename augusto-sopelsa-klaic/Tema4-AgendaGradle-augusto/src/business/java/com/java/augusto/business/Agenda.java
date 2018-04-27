package com.java.augusto.business;

import java.util.ArrayList; 

public class Agenda {
	private ArrayList<Pessoa> pessoas;

	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public void adicionaContato(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void removeContato(int id) {

		pessoas.remove(buscaContatoPorId(id));
	}

	public ArrayList<Pessoa> getTodasContatos() {
		return pessoas;
	}

	public ArrayList<Pessoa> buscaContatoPorNome(String nomePessoa) {

		ArrayList<Pessoa> pessoasAux = new ArrayList<Pessoa>();

		for (Pessoa p : pessoas) {
			String aux = p.getNome();
			if (nomePessoa.equals(aux)) {
				pessoasAux.add(p);
			}
			else if(p.getNome().contains(nomePessoa)) {
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
			}
		}
		return pessoaAux;
	}
}
