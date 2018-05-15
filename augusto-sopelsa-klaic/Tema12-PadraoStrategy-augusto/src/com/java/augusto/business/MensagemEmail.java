package com.java.augusto.business;

public class MensagemEmail implements Mensagem{
	
	@Override
	public String enviaMensagem(Cliente cliente) {
		return "Enviando mensagem por Email para "+ cliente.getNome();
	}
}