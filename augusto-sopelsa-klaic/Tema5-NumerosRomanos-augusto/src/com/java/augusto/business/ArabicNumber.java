package com.java.augusto.business;

import java.util.HashMap;
import java.util.Map;

public class ArabicNumber {

	private static int[] numerosarabes = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static String[] numeralRomano = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public String transformaParaRomano(int numeroarabe) {
		String roman = "";
		for (int i = 0; i < numerosarabes.length; i++) {
			while (numeroarabe >= numerosarabes[i]) {
				roman += numeralRomano[i];
				numeroarabe -= numerosarabes[i];
			}
		}
		return roman;
	}
}