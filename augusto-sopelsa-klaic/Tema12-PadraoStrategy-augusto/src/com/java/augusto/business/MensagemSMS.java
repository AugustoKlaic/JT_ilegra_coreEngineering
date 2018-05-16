package com.java.augusto.business;

public class MensagemSMS implements MensagemStrategy{
	
	@Override
	public String enviaMensagem() {
		return "Enviando mensagem por SMS para ";
	}
}