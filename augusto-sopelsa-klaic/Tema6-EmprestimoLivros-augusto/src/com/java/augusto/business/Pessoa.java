package com.java.augusto.business;

public class Pessoa implements Comparable<Pessoa> {
	private String cpf;
	private String nome;
	private int numerodelivros;
	private int top10;

	public Pessoa(String cpf, String nome, int numlivros, int top10) {
		this.cpf = cpf;
		this.nome = nome;
		this.numerodelivros = 0;
		this.top10 = top10;
	}

	public String getCPF() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroAlugados() {
		return numerodelivros;
	}

	public void devolve() {
		numerodelivros--;
	}

	public void retira() {
		numerodelivros++;
	}

	public int getLivrosQueJaRetirou() {
		return top10;
	}

	public void addLivroQueJaRetirou() {
		top10++;
	}

	public String toString() {
		return "Nome: " + nome + "CPF: " + cpf;
	}

	@Override
	public int compareTo(Pessoa o) {
		Integer tam = top10;
		return tam.compareTo(o.getLivrosQueJaRetirou());
	}
}