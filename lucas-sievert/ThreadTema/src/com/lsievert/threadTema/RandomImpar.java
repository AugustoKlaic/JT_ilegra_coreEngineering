package com.lsievert.threadTema;

public class RandomImpar implements Runnable {
	
	private static final int ESPERA_NUM_IMPAR = 1000;
	
	@Override
	public void run() {
		
		while(true) {
				
			int randNumb;
			GeraImpar gerador = new GeraImpar();
			randNumb = gerador.geraNovoImpar();
			System.out.println("Numero Impar Gerado: " + randNumb);
			try {
				Thread.sleep(ESPERA_NUM_IMPAR);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
