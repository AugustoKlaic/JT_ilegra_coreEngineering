package com.java.augusto.business.notificacao;

public class SMSNotificacaoStrategy implements NotificacaoStrategy{
	
	@Override
	public String enviar() {
		return "Enviando mensagem por SMS para ";
	}
}