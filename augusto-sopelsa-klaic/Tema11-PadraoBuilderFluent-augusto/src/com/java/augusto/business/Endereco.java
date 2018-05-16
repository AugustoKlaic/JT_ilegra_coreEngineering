package com.java.augusto.business;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String estado;

	public Endereco(String rua, int numero, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Endereço Rua: " + rua + " Numero: " + numero + " Cidade: " + cidade + " Estado: " + estado;
	}
}