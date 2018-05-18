package com.java.augusto.business;

import java.util.ArrayList;
import java.util.List;

public class Conta{
	
	private static List<Double> listatransacoes = new ArrayList<Double>();;
	private Cliente cliente;
	private double saldo;
	private String numerodaconta;
	
	public Conta(String numerodaconta, Cliente cliente, double saldo) {
		this.numerodaconta = numerodaconta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNumerodaconta() {
		return numerodaconta;
	}
	
	public void depositarDinheiro(double valor) {
		saldo = saldo + valor;
		listatransacoes.add(valor);
	}
	
	public void sacarDinheiro(double valor) {
		if((saldo-valor) < 0) {
			System.out.println("Voce nao tem saldo suficiente.");
		}
		else
			saldo = saldo - valor;
		listatransacoes.add(valor*-1);
	}
	
	public List<Double> getHistorico() {
		return listatransacoes;
	}
	
}