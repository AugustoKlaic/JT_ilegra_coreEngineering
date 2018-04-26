package com.jonathansedrez.thread;

public class ThreadPar implements Runnable{
	
	//Configura o tempo de sleep para essa thread
	public final int sleep = 500;
	
	@Override
	public void run() {
		
		while(true) {
			//Cria um numero PAR aleatório
			ThreadRandom par = new ThreadRandom();
			int numero = par.geraPar();
			System.out.print("Numero par: "+ numero + "\n");
			//Sleep
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
