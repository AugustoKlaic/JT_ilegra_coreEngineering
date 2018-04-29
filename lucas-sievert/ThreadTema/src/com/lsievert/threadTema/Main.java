package com.lsievert.threadTema;

public class Main {

	public static void main(String[] args) {
		
		Thread imprimePar = new Thread(new RandomPar());
		Thread imprimeImpar = new Thread(new RandomImpar());
		
		imprimeImpar.start();
		imprimePar.start();
	}

}


