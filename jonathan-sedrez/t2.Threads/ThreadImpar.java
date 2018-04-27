package com.jonathansedrez.thread;

public class ThreadImpar implements Runnable {
	
	//Configura o tempo de sleep para essa thread
	private static final int sleep = 100;
	
	@Override
	public void run() {
		
		while(true) {
			ThreadRandom impar = new ThreadRandom();
			int numero = impar.geraImpar();			
			System.out.print("Numero Impar: "+ numero + "\n");
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
