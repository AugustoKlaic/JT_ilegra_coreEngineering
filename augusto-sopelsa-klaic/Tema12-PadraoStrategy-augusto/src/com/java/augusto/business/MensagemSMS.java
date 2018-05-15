package com.java.augusto.business;

public class MensagemSMS implements Mensagem{
	
	@Override
	public String enviaMensagem(Cliente cliente) {
		return "Enviando mensagem por SMS para "+ cliente.getNome();
	}
}