package com.java.augusto.business.command;

public class Banco{
	private BancoCommand command;
	
	public void setCommand(BancoCommand command) {
		this.command = command;
	}
	
	public void executarCommand(double valor) {
		command.executar(valor);
	}
}