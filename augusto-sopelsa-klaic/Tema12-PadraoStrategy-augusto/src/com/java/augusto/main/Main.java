package com.java.augusto.main;

import com.java.augusto.business.Cliente;
import com.java.augusto.business.Notificacao;

public class Main{
	public static void main(String[] args) {
		Cliente c1 = new Cliente("aaa","aaa@aaa.com","");
		Cliente c2 = new Cliente("bbb", "bbb@bbb.com", "123456789");
	
		Notificacao n1 = new Notificacao();
		
		System.out.println(n1.enviaMensagem(c1));
		System.out.println(n1.enviaMensagem(c2));
		
	}
}