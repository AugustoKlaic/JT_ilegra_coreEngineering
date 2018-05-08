package com.jonathansedrez.thread;

public class ThreadImpar implements Runnable {
	
	private static final int SLEEP = 100;
	
	@Override
	public void run() {
		
		while(true) {
			ThreadRandom impar = new ThreadRandom();
			int numero = impar.geraImpar();			
			System.out.print("Numero Impar: "+ numero + "\n");
			try {
				Thread.sleep(SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}