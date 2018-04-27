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

		assertEquals(false, Fluorescente1.getLigada());// Construtor sem parametros

	}

	@Test
	public void testeLampadaConstrutorF2() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(true, Fluorescente2.getLigada());// Construtor recebendo true
	}

	@Test
	public void testeLampadaContrutorF3() {

		System.out.println("Testando o construtor Fluorescente.");

		assertEquals(false, Fluorescente3.getLigada());// Construtor recebendo false
	}

	@Test
	public void testeLampadaContrutorI1() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, Incandescente1.getLigada());// Construtor sem parametros

	}

	@Test
	public void testeLampadaContrutorI2() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(true, Incandescente2.getLigada());// Construtor recebendo true
	}

	@Test
	public void testeLampadaConstrutorI3() {

		System.out.println("Testando o construtor Incandescente.");

		assertEquals(false, Incandescente3.getLigada());// Construtor recebendo false

	}

	@Test
	public void testeSwitchConstrutor() {

		System.out.println("Testando os construtores do Switch...");

		assertEquals(false, switch1.getLampada().getLigada());// Testando o switch que recebe uma lampada no construtor
		switch2.setSwitch(Fluorescente3);// setando uma lampada para o switch
		assertEquals(false, switch2.getLampada().getLigada());// Testando o switch com construtor sem parametros
	}

	@Test
	public void testeOnOffF1() {

		System.out.println("Testando F1 liga/desliga...");

		Fluorescente1.on();// Liga F1 que esta desligada
		assertEquals(true, Fluorescente1.getLigada());
		Fluorescente1.off();// Desliga F1 novamente
		assertEquals(false, Fluorescente1.getLigada());
	}

	@Test
	public void testeOnOffF2() {

		System.out.println("Testando F2 liga/desliga...");

		Fluorescente2.off();// Desliga F2 que estava ligada
		assertEquals(false, Fluorescente2.getLigada());
		Fluorescente2.on();// Liga F2 novamente
		assertEquals(true, Fluorescente2.getLigada());

	}

	@Test
	public void testeOnOffF3() {

		System.out.println("Testando F3 liga/desliga...");

		Fluorescente3.on();// Liga F3 que esta desligada
		assertEquals(true, Fluorescente3.getLigada());
		Fluorescente3.off();// Desliga F3 novamente
		assertEquals(false, Fluorescente3.getLigada());

	}

	@Test
	public void testeOnOffI1() {

		System.out.println("Testando I1 liga/desliga...");

		Incandescente1.on();// Liga I1 que esta desligada
		assertEquals(true, Incandescente1.getLigada());
		Incandescente1.off();// Desliga I1 novamente
		assertEquals(false, Incandescente1.getLigada());
	}

	@Test
	public void testeOnOffI2() {

		System.out.println("Testando I2 liga/desliga...");

		Incandescente2.off();// Desliga I2 que esta ligada
		assertEquals(false, Incandescente2.getLigada());
		Incandescente2.on();// Liga I2 novamente
		assertEquals(true, Incandescente2.getLigada());

	}

	@Test
	public void testeOnOffI3() {

		System.out.println("Testando I3 liga/desliga..."); 

		Incandescente3.on();// Liga I3 que esta desligada
		assertEquals(true, Incandescente3.getLigada());
		Incandescente3.off();// Desligando I3 novamente
		assertEquals(false, Incandescente3.getLigada());
	}

	@Test
	public void testeSwitchS1() {

		System.out.println("Testando o switch S1...");

		// Switch S1 ja é construido com 1 lampada
		switch1.switchOnOff();// Liga a lampada
		assertEquals(true, Fluorescente1.getLigada());
		switch1.switchOnOff();// Desliga a lampada
		assertEquals(false, Fluorescente1.getLigada());
	}

	@Test
	public void testeSwitchS2() {

		System.out.println("Testando o switch S2...");

		// Switch S2 não tem uma lampada associada ainda
		switch2.setSwitch(Incandescente1);// Associa uma lampada
		switch2.switchOnOff();// Liga a lampada
		assertEquals(true, Incandescente1.getLigada());
		switch2.switchOnOff();// Desliga a lapada
		assertEquals(false, Incandescente1.getLigada());
	}
}
