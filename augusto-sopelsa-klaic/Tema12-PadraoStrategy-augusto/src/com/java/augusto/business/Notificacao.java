package com.java.augusto.business;

public class Notificacao{
	private Mensagem mensagem;
	
	public String enviaMensagem(Cliente cliente) {
		if(cliente.getTelefone().equals("")) {
			return new MensagemEmail().enviaMensagem(cliente);
		}
		else
			 return new MensagemSMS().enviaMensagem(cliente);
	}
}