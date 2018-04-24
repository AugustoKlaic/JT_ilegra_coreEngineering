package etc;

import java.util.Random;

public class ThreadRandom implements Runnable{

	public int numero;

	@Override
	public void run() {
		
		while(true) {				
			Random gerador = new Random();
			numero = gerador.nextInt();
			numero = Math.abs(numero);
			
			
			if(numero%2 == 0) {
				System.out.print("Numero par: "+ numero + "\n");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.print("Numero impar: " + numero + "\n");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
