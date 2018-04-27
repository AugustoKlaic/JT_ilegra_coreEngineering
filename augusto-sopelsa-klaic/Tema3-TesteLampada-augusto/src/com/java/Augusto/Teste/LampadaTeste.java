package com.java.Augusto.Teste;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.java.Augusto.Business.Lampada;
import com.java.Augusto.Business.LampadaFluorescente;
import com.java.Augusto.Business.LampadaIncandescente;
import com.java.Augusto.Business.Switch;

public class LampadaTeste {

	private Lampada Fluorescente1, Incandescente1, Fluorescente2, Incandescente2, Fluorescente3, Incandescente3;
	private Switch switch1, switch2;

	@Before
	public void setup() {

		System.out.println("Iniciando as Variaveis...");

		Fluorescente1 = new LampadaFluorescente();
		Incandescente1 = new LampadaIncandescente();

		Fluorescente2 = new LampadaFluorescente(true);
		Incandescente2 = new LampadaIncandescente(true);

		Fluorescente3 = new LampadaFluorescente(false);
		Incandescente3 = new LampadaIncandescente(false);

		switch1 = new Switch(Fluorescente1);
		switch2 = new Switch();
	}

	@Test
	public void testeLampadaConstrutor() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(false, Fluorescente1.getLigada());

	}

	@Test
	public void testeLampadaConstrutorF2() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(true, Fluorescente2.getLigada());
	}

	@Test
	public void testeLampadaContrutorF3() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(false, Fluorescente3.getLigada());
	}

	@Test
	public void testeLampadaContrutorI1() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, Incandescente1.getLigada());

	}

	@Test
	public void testeLampadaContrutorI2() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(true, Incandescente2.getLigada());
	}

	@Test
	public void testeLampadaConstrutorI3() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, Incandescente3.getLigada());

	}

	@Test
	public void testeSwitchConstrutor() {

		System.out.println("Testando os construtores do Switch...");

		assertEquals(false, switch1.getLampada().getLigada());
		switch2.setSwitch(Fluorescente3);
		assertEquals(false, switch2.getLampada().getLigada());
	}

	@Test
	public void testeOnOffF1() {

		System.out.println("Testando F1 liga/desliga...");

		Fluorescente1.on();
		assertEquals(true, Fluorescente1.getLigada());
		Fluorescente1.off();
		assertEquals(false, Fluorescente1.getLigada());
	}

	@Test
	public void testeOnOffF2() {

		System.out.println("Testando F2 liga/desliga...");

		Fluorescente2.off();
		assertEquals(false, Fluorescente2.getLigada());
		Fluorescente2.on();
		assertEquals(true, Fluorescente2.getLigada());

	}

	@Test
	public void testeOnOffF3() {

		System.out.println("Testando F3 liga/desliga...");

		Fluorescente3.on();
		assertEquals(true, Fluorescente3.getLigada());
		Fluorescente3.off();
		assertEquals(false, Fluorescente3.getLigada());

	}

	@Test
	public void testeOnOffI1() {

		System.out.println("Testando I1 liga/desliga...");

		Incandescente1.on();
		assertEquals(true, Incandescente1.getLigada());
		Incandescente1.off();
		assertEquals(false, Incandescente1.getLigada());
	}

	@Test
	public void testeOnOffI2() {

		System.out.println("Testando I2 liga/desliga...");

		Incandescente2.off();
		assertEquals(false, Incandescente2.getLigada());
		Incandescente2.on();
		assertEquals(true, Incandescente2.getLigada());

	}

	@Test
	public void testeOnOffI3() {

		System.out.println("Testando I3 liga/desliga...");

		Incandescente3.on();
		assertEquals(true, Incandescente3.getLigada());
		Incandescente3.off();
		assertEquals(false, Incandescente3.getLigada());
	}

	@Test
	public void testeSwitchS1() {

		System.out.println("Testando o switch S1...");

		
		switch1.SwitchOnOff();
		assertEquals(true, Fluorescente1.getLigada());
		switch1.SwitchOnOff();
		assertEquals(false, Fluorescente1.getLigada());
	}

	@Test
	public void testeSwitchS2() {

		System.out.println("Testando o switch S2...");

		
		switch2.setSwitch(Incandescente1);
		switch2.SwitchOnOff();
		assertEquals(true, Incandescente1.getLigada());
		switch2.SwitchOnOff();
		assertEquals(false, Incandescente1.getLigada());
	}
}