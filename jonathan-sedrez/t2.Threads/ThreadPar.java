package com.jonathansedrez.thread;

public class ThreadPar implements Runnable{
	
	//Configura o tempo de sleep para essa thread
	public final int sleep = 500;
	
	@Override
	public void run() {
		
		while(true) {
			//Cria um numero aleatório
			ThreadRandom par = new ThreadRandom();
			int numero = par.geraRandom();
						
			//Valida se é par ou impar
			if(numero%2 == 0) {
				System.out.print("Numero par: "+ numero + "\n");
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
