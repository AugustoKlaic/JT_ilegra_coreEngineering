package com.java.augusto.business.command;

import com.java.augusto.business.Conta;

public class SacarDinheiroCommand implements BancoCommand{

	private Conta conta;
	
	public SacarDinheiroCommand(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public void executar(double valor) {
		conta.sacarDinheiro(valor);
	}	
}