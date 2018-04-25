package com.java.Augusto.Teste;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.java.Augusto.Business.Lampada;
import com.java.Augusto.Business.LampadaFluorescente;
import com.java.Augusto.Business.LampadaIncandescente;
import com.java.Augusto.Business.Switch;

public class LampadaTeste {

	private Lampada F1, I1, F2, I2, F3, I3;
	private Switch s1, s2;

	@Before
	public void Setup() {

		System.out.println("Iniciando as Variaveis...");

		F1 = new LampadaFluorescente();
		I1 = new LampadaIncandescente();

		F2 = new LampadaFluorescente(true);
		I2 = new LampadaIncandescente(true);

		F3 = new LampadaFluorescente(false);
		I3 = new LampadaIncandescente(false);

		s1 = new Switch(F1);
		s2 = new Switch();
	}

	@Test
	public void testeLampadaConstrutor() {

		System.out.println("Testando os contrutores das lampadas...");

		assertEquals(false, F1.getLigada());// Construtor sem parametros
		assertEquals(true, F2.getLigada());// Construtor recebendo true
		assertEquals(false, F3.getLigada());// Construtor recebendo false

		assertEquals(false, I1.getLigada());// Construtor sem parametros
		assertEquals(true, I2.getLigada());// Construtor recebendo true
		assertEquals(false, I3.getLigada());// Construtor recebendo false
	}

	@Test
	public void testeSwitchConstrutor() {

		System.out.println("Testando os construtores do Switch...");

		assertEquals(false, s1.getLampada().getLigada());// Testando o switch que recebe uma lampada no construtor
		s2.setSwitch(F3);// setando uma lampada para o switch
		assertEquals(false, s2.getLampada().getLigada());// Testando o switch com construtor sem parametros
	}

	@Test
	public void testeOnOffF1() {

		System.out.println("Testando F1 liga/desliga...");

		F1.On();// Liga F1 que esta desligada
		assertEquals(true, F1.getLigada());
		F1.Off();// Desliga F1 novamente
		assertEquals(false, F1.getLigada());
	}

	@Test
	public void testeOnOffF2() {

		System.out.println("Testando F2 liga/desliga...");

		F2.Off();// Desliga F2 que estava ligada
		assertEquals(false, F2.getLigada());
		F2.On();// Liga F2 novamente
		assertEquals(true, F2.getLigada());

	}

	@Test
	public void testeOnOffF3() {

		System.out.println("Testando F3 liga/desliga...");

		F3.On();// Liga F3 que esta desligada
		assertEquals(true, F3.getLigada());
		F3.Off();// Desliga F3 novamente
		assertEquals(false, F3.getLigada());

	}

	@Test
	public void testeOnOffI1() {

		System.out.println("Testando I1 liga/desliga...");

		I1.On();// Liga I1 que esta desligada
		assertEquals(true, I1.getLigada());
		I1.Off();// Desliga I1 novamente
		assertEquals(false, I1.getLigada());
	}

	@Test
	public void testeOnOffI2() {

		System.out.println("Testando I2 liga/desliga...");

		I2.Off();// Desliga I2 que esta ligada
		assertEquals(false, I2.getLigada());
		I2.On();// Liga I2 novamente
		assertEquals(true, I2.getLigada());

	}

	@Test
	public void testeOnOffI3() {

		System.out.println("Testando I3 liga/desliga...");

		I3.On();// Liga I3 que esta desligada
		assertEquals(true, I3.getLigada());
		I3.Off();// Desligando I3 novamente
		assertEquals(false, I3.getLigada());
	}

	@Test
	public void testeSwitchS1() {

		System.out.println("Testando o switch S1...");

		// Switch S1 ja é construido com 1 lampada
		s1.SwitchOnOff();// Liga a lampada
		assertEquals(true, F1.getLigada());
		s1.SwitchOnOff();// Desliga a lampada
		assertEquals(false, F1.getLigada());
	}

	@Test
	public void testeSwitchS2() {

		System.out.println("Testando o switch S2...");

		// Switch S2 não tem uma lampada associada ainda
		s2.setSwitch(I1);// Associa uma lampada
		s2.SwitchOnOff();// Liga a lampada
		assertEquals(true, I1.getLigada());
		s2.SwitchOnOff();// Desliga a lapada
		assertEquals(false, I1.getLigada());
	}
}
