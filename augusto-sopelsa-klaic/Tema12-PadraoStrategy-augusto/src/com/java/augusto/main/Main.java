package com.java.augusto.main;

import com.java.augusto.business.Cliente;
import com.java.augusto.business.GerenciadorNotificacao;
import com.java.augusto.business.MensagemEmail;
import com.java.augusto.business.MensagemSMS;
import com.java.augusto.business.Notificacao;

public class Main{
	public static void main(String[] args) {
	
		Cliente cliente = new Cliente("teste","teste@teste.com","123456789");
		Cliente cliente2 = new Cliente("teste2","teste2@teste2.com","");
		GerenciadorNotificacao notificacao = new GerenciadorNotificacao();
		
		System.out.println(notificacao.enviaParaCliente(cliente));
		System.out.println(notificacao.enviaParaCliente(cliente2));
	}
}