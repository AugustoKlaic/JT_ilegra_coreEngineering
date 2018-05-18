package com.java.augusto.business.command;

import com.java.augusto.business.Conta;

public class DepositarDinheiroCommand implements BancoCommand{
	
	private Conta conta;

	public DepositarDinheiroCommand(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void executar(double valor) {
		conta.depositarDinheiro(valor);
	}
}