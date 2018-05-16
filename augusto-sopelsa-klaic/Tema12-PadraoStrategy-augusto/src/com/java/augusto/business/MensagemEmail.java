package com.java.augusto.business;

public class MensagemEmail implements MensagemStrategy{
	
	@Override
	public String enviaMensagem() {
		return "Enviando mensagem por email para ";
		
	}
}