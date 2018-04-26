package com.jonathansedrez.thread;

public class ThreadImpar implements Runnable {
	
	//Configura o tempo de sleep para essa thread
	public final int sleep = 100;
	
	@Override
	public void run() {
		
		while(true) {
			//Cria um numero IMPAR aleatório
			ThreadRandom impar = new ThreadRandom();
			int numero = impar.geraImpar();			
			System.out.print("Numero Impar: "+ numero + "\n");
			//Sleep
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}