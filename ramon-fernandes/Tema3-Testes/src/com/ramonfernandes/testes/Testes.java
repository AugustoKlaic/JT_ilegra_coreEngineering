package com.ramonfernandes.testes;

import static org.junit.jupiter.api.Assertions.*;
import com.ilegra.*;

import org.junit.Before;
import org.junit.Test;

import com.ilegra.controle.Controle;
import com.ilegra.lampadas.*;



public class Testes {
	
	private Lampada lampadaLED, lampadaFluorescente;
	private Controle controleLED, controleFluorescente;
	
	@Before
	public void beforeTest() {
		lampadaLED = new LED();
		lampadaFluorescente = new Fluorescente();
		
		controleLED = new Controle(lampadaLED);
		controleFluorescente = new Controle(lampadaFluorescente);
	}	
	
	@Test
	public void testIfStartsTurnedOff() {
		//Testa se lampada iniciam desligadas
		assertEquals(false, lampadaFluorescente.isSet());
		assertEquals(false, lampadaLED.isSet());
	}
	
	@Test
	public void testOn() {
		//Testa se método On liga lampadas
		assertEquals(false, lampadaFluorescente.isSet());
		lampadaFluorescente.on();
		assertEquals(true, lampadaFluorescente.isSet());
		
		assertEquals(false, lampadaLED.isSet());
		lampadaLED.on();
		assertEquals(true, lampadaLED.isSet());
	}
	
	@Test 
	public void testOff() {
		lampadaFluorescente.on();
		lampadaFluorescente.off();
		assertEquals(false, lampadaFluorescente.isSet());
		lampadaLED.on();
		lampadaLED.off();
		assertEquals(false, lampadaLED.isSet());
	}
	
	@Test
	public void testSwitch() {
		assertEquals(false, controleFluorescente.getLampada().isSet());
		controleFluorescente.switchStat();
		assertEquals(true, controleFluorescente.getLampada().isSet());
		
		assertEquals(false, controleLED.getLampada().isSet());
		controleLED.switchStat();
		assertEquals(true, controleLED.getLampada().isSet());
	}
}
