package com.java.augusto.business;

import com.java.augusto.business.notificacao.NotificacaoStrategy;

public class GerenciadorNotificacao{
	
	private NotificacaoStrategy notificacao;
	
	public GerenciadorNotificacao(NotificacaoStrategy notificacao) {
		this.notificacao = notificacao;
	}
	
	public String enviar() {
		return notificacao.enviar();
	}
}