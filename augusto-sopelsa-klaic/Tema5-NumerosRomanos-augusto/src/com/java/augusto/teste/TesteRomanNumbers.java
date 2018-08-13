package com.java.augusto.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.java.augusto.business.ArabicNumber;
import com.java.augusto.business.RomanNumber;

public class TesteRomanNumbers {
	private RomanNumber numeroromano, numeroromano2, numeroromano3, numeroromano4, numeroromano5;
	private ArabicNumber numeroarabe1, numeroarabe2, numeroarabe3, numeroarabe4, numeroarabe5;

	
	@Before
	public void setup() {
		numeroromano = new RomanNumber();
		numeroromano2 = new RomanNumber();
		numeroromano3 = new RomanNumber();
		numeroromano4 = new RomanNumber();
		numeroromano5 = new RomanNumber();
		numeroarabe1 = new ArabicNumber();
		numeroarabe2 = new ArabicNumber();
		numeroarabe3 = new ArabicNumber();
		numeroarabe4 = new ArabicNumber();
		numeroarabe5 = new ArabicNumber();
	}
	
	@Test
	public void testeNumeralI() {
		assertEquals(1,numeroromano.transformaParaArabico("I"));
	}
	
	@Test
	public void testeNumeralII() {
		assertEquals(2,numeroromano2.transformaParaArabico("II"));
	}

	@Test
	public void testeNumeralXX() {
		assertEquals(20,numeroromano3.transformaParaArabico("XX"));
	}
	
	@Test
	public void testeNumeralXV() {
		assertEquals(15,numeroromano4.transformaParaArabico("XV"));
	}
	
	@Test
	public void testeNumeralIX() {
		assertEquals(9,numeroromano5.transformaParaArabico("IX"));
	}
	
	@Test
	public void testeNumeral1() {
		assertEquals("I", numeroarabe1.transformaParaRomano(1));
	}
	
	@Test
	public void testeNumeral2() {
		assertEquals("II", numeroarabe2.transformaParaRomano(2));
	}
	
	@Test
	public void testeNumeral20() {
		assertEquals("XX", numeroarabe3.transformaParaRomano(20));
	}
	
	@Test
	public void testeNumeral15() {
		assertEquals("XV", numeroarabe4.transformaParaRomano(15));
	}
	
	@Test
	public void testeNumeral9() {
		assertEquals("IX", numeroarabe5.transformaParaRomano(9));
	}
	
}
