package com.java.augusto.main;

import com.java.augusto.business.Cliente;
import com.java.augusto.business.Conta;
import com.java.augusto.business.command.Banco;
import com.java.augusto.business.command.DepositarDinheiroCommand;
import com.java.augusto.business.command.SacarDinheiroCommand;

public class Main{
	 public static void main(String[] args) {
		 Banco banco = new Banco();
		 Cliente cliente = new Cliente("Augusto", "123123123123");
		 Conta conta = new Conta("4444232",cliente,10000.00);
		 DepositarDinheiroCommand depcommand = new DepositarDinheiroCommand(conta);
		 SacarDinheiroCommand sacarcommand = new SacarDinheiroCommand(conta);
		 
		 banco.setCommand(depcommand);
		 banco.executarCommand(200.00);
		 System.out.println(conta.getCliente().getNome());
		 System.out.println(conta.getSaldo());
		 
		 banco.setCommand(sacarcommand);
		 banco.executarCommand(300.00);
		 System.out.println(conta.getCliente().getNome());
		 System.out.println(conta.getSaldo());
		 
		for(int i=0; i<conta.getHistorico().size(); i++) {
			if(conta.getHistorico().get(i) < 0) {
				System.out.println("Saque de "+ (conta.getHistorico().get(i) * -1) +" Reais");
			}
			else if(conta.getHistorico().get(i) > 0) {
				System.out.println("Deposito de "+ conta.getHistorico().get(i) +" Reais");
			}
		}
	 }
}