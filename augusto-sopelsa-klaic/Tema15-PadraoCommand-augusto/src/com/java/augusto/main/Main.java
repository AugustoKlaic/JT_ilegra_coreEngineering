package com.java.augusto.main;

import com.java.augusto.business.Cliente;
import com.java.augusto.business.Conta;
import com.java.augusto.business.command.Banco;
import com.java.augusto.business.command.DepositarDinheiroCommand;
import com.java.augusto.business.command.SacarDinheiroCommand;

public class Main{
	 public static void main(String[] args) {
		 
		 Cliente cliente = new Cliente("Augusto", "123123123123");
		 Conta conta = new Conta("4444232",cliente,0.0);
		 Banco banco = new Banco(conta);
		 DepositarDinheiroCommand depcommand = new DepositarDinheiroCommand(conta,300);
		 SacarDinheiroCommand sacarcommand = new SacarDinheiroCommand(conta,200);
		 
		 
		 banco.recebeCommand(depcommand);
		 banco.executarCommand();
		 banco.calculaSaldo();
		 
		 banco.recebeCommand(sacarcommand);
		 banco.executarCommand();
		 banco.calculaSaldo();
	 }
}