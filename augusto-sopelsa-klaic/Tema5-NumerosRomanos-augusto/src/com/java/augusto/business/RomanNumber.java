package com.java.augusto.business;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

	private static String[] numeralRomano = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private static int[] numerosarabes = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public int transformaParaArabico(String numeroromano) {
		int numero = 0;
		int numeralDaDireita = 0;
		for (int i = numeroromano.length() - 1; i >= 0; i--) {
			int valor = (int) traduzirNumeralRomano(numeroromano.charAt(i));
			numero += valor * Math.signum(valor + 0.5 - numeralDaDireita);
			numeralDaDireita = valor;
		}
		return numero;
	}

	private double traduzirNumeralRomano(char caractere) {
		return Math.floor(Math.pow(10, "IXCM".indexOf(caractere)))
				+ 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
	}

}