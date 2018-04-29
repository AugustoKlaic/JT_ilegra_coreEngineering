package com.lsievert.threadTema;

import java.util.Random;

public class GeraPar {
	
	private static final int NUM_MAX = 100;
	
	public int geraNovoPar() {
		int randNumber;
		boolean parGerado = false;
		Random gerador = new Random();
		do {
			randNumber = gerador.nextInt(NUM_MAX);
			if(randNumber % 2 == 0) {
				parGerado = true;
			}
		}while(!parGerado);
		return randNumber;
	}

}
