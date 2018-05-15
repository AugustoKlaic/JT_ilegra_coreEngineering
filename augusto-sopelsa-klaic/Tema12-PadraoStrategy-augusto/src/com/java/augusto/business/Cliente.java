package com.java.augusto.business;

public class Cliente{
	
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}
}