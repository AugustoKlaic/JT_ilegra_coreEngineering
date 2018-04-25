package com.jonathansedrez.thread;

public class ThreadImpar implements Runnable {
	
	//Configura o tempo de sleep para essa thread
	public final int sleep = 100;
	
	@Override
	public void run() {
		
		while(true) {
			//Cria um numero aleatório
			ThreadRandom impar = new ThreadRandom();
			int numero = impar.geraRandom();
			
			//Valida se é par ou impar
			if(numero%2 != 0) {
				System.out.print("Numero Impar: "+ numero + "\n");
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
