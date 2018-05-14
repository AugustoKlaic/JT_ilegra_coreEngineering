package com.java.augusto.business;

public class Endereco{
	private String rua;
	private int numero;
	private String cidade;
	private String estado;
	
	private Endereco(EnderecoBuilder builder) {
		this.rua = builder.rua;
		this.numero = builder.numero;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
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
	
	public static class EnderecoBuilder{
		private String rua;
		private int numero;
		private String cidade;
		private String estado;
		
		public EnderecoBuilder adicionaRua(String rua) {
			this.rua = rua;
			return this;
		}
		
		public EnderecoBuilder adicionaNumero(int numero) {
			this.numero = numero;
			return this;
		}
		
		public EnderecoBuilder adiconaCidade(String cidade) {
			this.cidade = cidade;
			return this;
		}
		
		public EnderecoBuilder adicionaEstado(String estado) {
			this.estado = estado;
			return this;
		}
		
		public Endereco criaEndereco() {
			return new Endereco(this);
		}
	}
	
	@Override
	public String toString() {
		return "Endereço Rua: " +rua +" Numero: "+ numero +" Cidade: "+ cidade +" Estado: "+ estado;
	}
}