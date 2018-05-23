package com.java.augusto.business.command;

import java.util.ArrayList;
import java.util.List;

import com.java.augusto.business.Conta;

public class Banco{
	private BancoCommand command;
	private static List<BancoCommand> historico;
	private Conta conta;
	
	public Banco(Conta conta) {
		Banco.historico = new ArrayList<BancoCommand>();
		this.conta = conta;
	}
	
	public void recebeCommand(BancoCommand command) {
		this.command = command;
		
	}
	
	public List<BancoCommand> getHistorico(){
		return historico;
	}
	
	public void calculaSaldo() {
		double saldo = 0;
		for(BancoCommand command : historico) {
			if(command instanceof DepositarDinheiroCommand) {
				saldo = saldo+ ((DepositarDinheiroCommand) command).getValor();
				
			}
			else if(command instanceof SacarDinheiroCommand) {
				saldo = saldo  + (((SacarDinheiroCommand) command).getValor() * -1);
				
			}
		}
		System.out.println("O saldo disponivel é de: " + saldo);
	}
	
	public void executarCommand() {
		command.executar();
		historico.add(command);
	}
}