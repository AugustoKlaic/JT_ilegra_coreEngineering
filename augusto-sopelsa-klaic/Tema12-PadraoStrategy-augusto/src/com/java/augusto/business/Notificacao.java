package com.java.augusto.business;

public class Notificacao{
	private MensagemStrategy mensagem;
	
	public Notificacao(MensagemStrategy mensagem) {
		this.mensagem = mensagem;
	}
	
	public void EnviaMensagem() {
		mensagem.enviaMensagem();
	}
}