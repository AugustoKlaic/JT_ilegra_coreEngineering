package com.ilegra.controle;

public class Operations {
	
	
	public static int randomEven() {
			return (Integer.valueOf((int) (Math.random() * 100))) * 2;
	}

	public static int randomOdd() {
			int result = Integer.valueOf((int) (Math.random() * 100));
			if (result % 2 == 0)
				result += 1;
			return result;
	};
}
