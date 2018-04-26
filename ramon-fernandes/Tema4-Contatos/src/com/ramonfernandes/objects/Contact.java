package com.ramonfernandes.objects;

public class Contact {
	private static int id_auxiliar;
	private int id;
	private String nome;
	private String email;
	private String telefone;
	

	public Contact(String nome, String email, String telefone) {
		this.id = id_auxiliar;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		id_auxiliar += 1;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getId_auxiliar() {
		return id_auxiliar;
	}
	public static void setId_auxiliar(int id_auxiliar) {
		Contact.id_auxiliar = id_auxiliar;
	}
	
	
	public String toString() {
		return "Contato: \n ID:" + this.id + " Nome: " + this.nome + "\n Email: " + this.email + "\n Telefone: " + this.telefone+"\n--------------------------";
	}
	
	
}
