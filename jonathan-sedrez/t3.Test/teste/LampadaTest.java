package com.jonathansedrez.lampada.teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.jonathansedrez.lampada.*;



public class LampadaTest {
	Fluorescente testFluorescente  = new Fluorescente();
	Incandecente testIncandecente  = new Incandecente();
	Switch testeSwitchFluorescente = new Switch(new Fluorescente());
	Switch testeSwitchIncandecente = new Switch(new Incandecente());
	
	@Test
	public void testeOn() {
		testFluorescente.on();
		assertEquals(true, testFluorescente.verStatus());
		testIncandecente.on();
		assertEquals(true, testIncandecente.verStatus());
	}
	
	@Test
	public void testeOff() {
		testIncandecente.off();
		assertEquals(false, testIncandecente.verStatus());
		testIncandecente.off();
		assertEquals(false, testIncandecente.verStatus());
	}
	
	@Test
	public void testeSwitchOn() {
		testeSwitchFluorescente.change();
		assertEquals(true, testeSwitchFluorescente.verStatus());
		testeSwitchIncandecente.change();
		assertEquals(true, testeSwitchIncandecente.verStatus());
	}
	
	@Test
	public void testeSwitchOff() {
		testeSwitchFluorescente.change();
		testeSwitchFluorescente.change();
		assertEquals(false, testeSwitchFluorescente.verStatus());
		testeSwitchIncandecente.change();
		testeSwitchIncandecente.change();
		assertEquals(false, testeSwitchIncandecente.verStatus());
	}
}