package com.java.augusto.teste;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.java.augusto.business.Lampada;
import com.java.augusto.business.LampadaFluorescente;
import com.java.augusto.business.LampadaIncandescente;
import com.java.augusto.business.Switch;

public class LampadaTeste {

	private Lampada fluorescente1, incandescente1, fluorescente2, incandescente2, fluorescente3, incandescente3;
	private Switch switch1, switch2;

	@Before
	public void setup() {

		System.out.println("Iniciando as Variaveis...");

		fluorescente1 = new LampadaFluorescente();
		incandescente1 = new LampadaIncandescente();

		fluorescente2 = new LampadaFluorescente(true);
		incandescente2 = new LampadaIncandescente(true);

		fluorescente3 = new LampadaFluorescente(false);
		incandescente3 = new LampadaIncandescente(false);

		switch1 = new Switch(fluorescente1);
		switch2 = new Switch();
	}

	@Test
	public void testeLampadaConstrutor() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(false, fluorescente1.getLigada());

	}

	@Test
	public void testeLampadaConstrutorF2() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(true, fluorescente2.getLigada());
	}

	@Test
	public void testeLampadaContrutorF3() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(false, fluorescente3.getLigada());
	}

	@Test
	public void testeLampadaContrutorI1() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, incandescente1.getLigada());

	}

	@Test
	public void testeLampadaContrutorI2() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(true, incandescente2.getLigada());
	}

	@Test
	public void testeLampadaConstrutorI3() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, incandescente3.getLigada());

	}

	@Test
	public void testeSwitchConstrutor() {

		System.out.println("Testando os construtores do Switch...");

		assertEquals(false, switch1.getLampada().getLigada());
		switch2.setSwitch(fluorescente3);
		assertEquals(false, switch2.getLampada().getLigada());
	}

	@Test
	public void testeOnOffF1() {

		System.out.println("Testando F1 liga/desliga...");

		fluorescente1.on();
		assertEquals(true, fluorescente1.getLigada());
		fluorescente1.off();
		assertEquals(false, fluorescente1.getLigada());
	}

	@Test
	public void testeOnOffF2() {

		System.out.println("Testando F2 liga/desliga...");

		fluorescente2.off();
		assertEquals(false, fluorescente2.getLigada());
		fluorescente2.on();
		assertEquals(true, fluorescente2.getLigada());

	}

	@Test
	public void testeOnOffF3() {

		System.out.println("Testando F3 liga/desliga...");

		fluorescente3.on();
		assertEquals(true, fluorescente3.getLigada());
		fluorescente3.off();
		assertEquals(false, fluorescente3.getLigada());

	}

	@Test
	public void testeOnOffI1() {

		System.out.println("Testando I1 liga/desliga...");

		incandescente1.on();
		assertEquals(true, incandescente1.getLigada());
		incandescente1.off();
		assertEquals(false, incandescente1.getLigada());
	}

	@Test
	public void testeOnOffI2() {

		System.out.println("Testando I2 liga/desliga...");

		incandescente2.off();
		assertEquals(false, incandescente2.getLigada());
		incandescente2.on();
		assertEquals(true, incandescente2.getLigada());

	}

	@Test
	public void testeOnOffI3() {

		System.out.println("Testando I3 liga/desliga...");

		incandescente3.on();
		assertEquals(true, incandescente3.getLigada());
		incandescente3.off();
		assertEquals(false, incandescente3.getLigada());
	}

	@Test
	public void testeSwitchS1() {

		System.out.println("Testando o switch S1...");

		
		switch1.switchOnOff();
		assertEquals(true, fluorescente1.getLigada());
		switch1.switchOnOff();
		assertEquals(false, fluorescente1.getLigada());
	}

	@Test
	public void testeSwitchS2() {

		System.out.println("Testando o switch S2...");

		
		switch2.setSwitch(incandescente1);
		switch2.switchOnOff();
		assertEquals(true, incandescente1.getLigada());
		switch2.switchOnOff();
		assertEquals(false, incandescente1.getLigada());
	}
}