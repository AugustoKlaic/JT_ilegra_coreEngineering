package com.java.augusto.business;

public class GeraNumero{
	
	public int randomEven() {
		int numeroPar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroPar % 2 != 0)
			numeroPar += 1;

		return numeroPar;

	}

	public int randomOdd() {
		int numeroImpar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroImpar % 2 == 0)
			numeroImpar += 1;

		return numeroImpar;
	}
}