package com.java.augusto.main;

import java.util.Scanner;

import com.java.augusto.business.ArabicNumber;
import com.java.augusto.business.RomanNumber;

public class main {
	public static void main(String[] args) {
		
		ArabicNumber numeroarabic;
		RomanNumber numeroromano;
		
		System.out.println("Digite um numero arabe.\n");
		
		Scanner scannernum = new Scanner(System.in);
		int lernumeroarabico = scannernum.nextInt();
		numeroarabic = new ArabicNumber();
		
		System.out.println(numeroarabic.transformaParaRomano(lernumeroarabico) + "\n");
		System.out.println("Digite um numero romano.\n");
		
		Scanner scannernum2 = new Scanner(System.in);
		String lernumeroromano = scannernum2.nextLine();
		numeroromano = new RomanNumber();
		
		System.out.println(numeroromano.transformaParaArabico(lernumeroromano)+ "\n");
	}
}