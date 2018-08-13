package com.java.augusto.main;

import com.java.augusto.business.Cliente;
import com.java.augusto.business.GerenciadorNotificacao;
import com.java.augusto.business.notificacao.EmailNotificacaoStrategy;
import com.java.augusto.business.notificacao.NotificacaoStrategy;
import com.java.augusto.business.notificacao.SMSNotificacaoStrategy;

public class Main{
	public static void main(String[] args) {
	
		Cliente cliente = new Cliente("teste","teste@teste.com","123456789");
		Cliente cliente2 = new Cliente("teste2","teste2@teste2.com","");	
				
		GerenciadorNotificacao notificacao = new GerenciadorNotificacao(cliente.getTelefone().equals("") 
				? new EmailNotificacaoStrategy(): new SMSNotificacaoStrategy());
		
		GerenciadorNotificacao notificacao2 = new GerenciadorNotificacao(cliente2.getTelefone().equals("") 
				? new EmailNotificacaoStrategy(): new SMSNotificacaoStrategy());
		
		System.out.println(notificacao.enviar()+cliente.getNome());
		System.out.println(notificacao2.enviar()+cliente2.getNome());
		

	}
}