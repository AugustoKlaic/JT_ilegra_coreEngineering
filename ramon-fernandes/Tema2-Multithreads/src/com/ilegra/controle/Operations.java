package com.ilegra.controle;

public class Operations {
	
	
	public static int randomEven() {
			return (Integer.valueOf((int) (Math.random() * 100))) * 2;
	}

	public static int randomOdd() {
			return randomEven() + 1;
	};
}
