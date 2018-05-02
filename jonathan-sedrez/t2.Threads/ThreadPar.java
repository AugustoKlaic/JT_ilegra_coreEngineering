package com.jonathansedrez.thread;

public class ThreadPar implements Runnable{
	
	private static final int SLEEP = 500;
	
	@Override
	public void run() {
		
		while(true) {
			ThreadRandom par = new ThreadRandom();
			int numero = par.geraPar();
			System.out.print("Numero par: "+ numero + "\n");
			try {
				Thread.sleep(SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}