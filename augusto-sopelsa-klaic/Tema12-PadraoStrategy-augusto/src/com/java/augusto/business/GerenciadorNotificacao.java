package com.java.augusto.business;

public class GerenciadorNotificacao{
	
	public String enviaParaCliente(Cliente cliente) {
		if(cliente.getTelefone().equals("")) {
			return new MensagemEmail().enviaMensagem() + cliente.getNome();
		}
		else
			return new MensagemSMS().enviaMensagem() + cliente.getNome();
	}
}