package com.lsievert.threadTema;

import java.util.Random;

public class GeraImpar {
	
	private static final int NUM_MAX = 100;
	
	public int geraNovoImpar() {
		
		int randNumber;
		Random gerador = new Random();
		boolean imparGerado = false;
		do {
			randNumber = gerador.nextInt(NUM_MAX);
			if(randNumber % 2 == 1) {
				imparGerado = true;
			}
		}while(!imparGerado);
		return randNumber;
	}

}
