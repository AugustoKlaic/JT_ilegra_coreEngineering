package com.jonathansedrez.thread;

import java.util.Random;

public class ThreadRandom {
	
	public int geraPar() {
		Random gerador = new Random();
		int numero = gerador.nextInt();	
		return Math.abs(numero)*2;
	}
	
	public int geraImpar() {
		return geraPar()+1;
	}
}
