package com.jonathansedrez.thread;

import java.util.Random;

public class ThreadRandom {
	
	public int geraRandom() {
			
		int numero;
		Random gerador = new Random();
		numero = gerador.nextInt();
		numero = Math.abs(numero);	
		return numero;
	}
}