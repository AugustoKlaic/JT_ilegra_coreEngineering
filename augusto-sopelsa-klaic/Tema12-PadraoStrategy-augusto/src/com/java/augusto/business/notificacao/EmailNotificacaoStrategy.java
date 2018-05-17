package com.java.augusto.business.notificacao;

public class EmailNotificacaoStrategy implements NotificacaoStrategy{
	
	@Override
	public String enviar() {
		return "Enviando mensagem por email para ";
		
	}
}