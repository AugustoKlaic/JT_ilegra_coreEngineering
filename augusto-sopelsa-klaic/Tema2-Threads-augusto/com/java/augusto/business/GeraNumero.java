package com.java.augusto.business;

public class GeraNumero{
	private static int numero;
	
	public static void randomEven() {
		int numeroPar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroPar % 2 != 0)
			numeroPar += 1;

		numero = numeroPar;

	}

	public static void randomOdd() {
		int numeroImpar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroImpar % 2 == 0)
			numeroImpar += 1;

		numero = numeroImpar;
	}
	
	public int getNumero() {
		return numero;
	}
}