package com.jonathansedrez.thread;

import java.util.Random;

public class ThreadRandom {
	
	public int geraPar() {
		int numero;
		Random gerador = new Random();
		numero = gerador.nextInt();
		numero = Math.abs(numero);	
		return numero*2;
	}
	
	public int geraImpar() {
		return geraPar()+1;
	}
}
