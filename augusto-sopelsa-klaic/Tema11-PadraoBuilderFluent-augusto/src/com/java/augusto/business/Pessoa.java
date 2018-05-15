package com.java.augusto.business;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate datanascimento;
	private Endereco endereco;

	private Pessoa(PessoaBuilder builder) {
		this.nome = builder.nome;
		this.datanascimento = builder.datanascimento;
		this.endereco = builder.endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public String getNome() {
		return nome;
	}

	public static class PessoaBuilder
	{
		private String nome;
		private LocalDate datanascimento;
		private Endereco endereco;

		public PessoaBuilder adicionaDataNascimento(LocalDate datanascimento) {
			this.datanascimento = datanascimento;
			return this;
		}

		public PessoaBuilder adicionaNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public PessoaBuilder adicionaEndereco(String rua, int numero, String cidade,String estado) {
			this.endereco = new Endereco(rua,numero,cidade,estado);
			return this;
		}
		
		public Pessoa CriaPessoa() {
			return new Pessoa(this);
		}
	}
}
