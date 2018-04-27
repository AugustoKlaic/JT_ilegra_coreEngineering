package com.lsievert.threadTema;

public class RandomPar implements Runnable{
	
	private static final int ESPERA_NUM_PAR = 5000;

	@Override
	public void run() {
		
		while(true) {
				
			int randNumb;
			GeraPar gerador = new GeraPar();
			randNumb = gerador.geraNovoPar();
			System.out.println("Numero Par Gerado: " + randNumb);
			try {
				Thread.sleep(ESPERA_NUM_PAR);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
