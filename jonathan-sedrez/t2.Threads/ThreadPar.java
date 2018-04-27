package com.jonathansedrez.thread;

public class ThreadPar implements Runnable{
	
	//Configura o tempo de sleep para essa thread
	private static final int sleep = 500;
	
	@Override
	public void run() {
		
		while(true) {
			ThreadRandom par = new ThreadRandom();
			int numero = par.geraPar();
			System.out.print("Numero par: "+ numero + "\n");
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
