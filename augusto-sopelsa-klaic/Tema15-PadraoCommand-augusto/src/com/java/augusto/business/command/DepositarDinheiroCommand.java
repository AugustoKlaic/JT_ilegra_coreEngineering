package com.java.augusto.business.command;

import com.java.augusto.business.Conta;

public class DepositarDinheiroCommand implements BancoCommand{
	
	private Conta conta;
	private double valor;

	public DepositarDinheiroCommand(Conta conta,double valor) {
		this.conta = conta;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Conta getConta() {
		return conta;
	}

	@Override
	public void executar() {
		conta.depositarDinheiro(valor);
	}
}