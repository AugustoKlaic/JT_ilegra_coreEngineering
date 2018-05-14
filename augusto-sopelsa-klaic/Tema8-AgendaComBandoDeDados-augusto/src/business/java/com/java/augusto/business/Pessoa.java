package com.java.augusto.business;

public class Pessoa {
	private int ID;
	private String nome;
	private String email;
	private String telefone;

	public Pessoa(int id, String nome, String email, String telefone) {
		this.ID = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String toString() {
		return "Id: " + getId() + " - Nome: " + getNome() + " - Email: " + getEmail() + " - Telefone: " + getTelefone()
				+ "\n";
	}
}