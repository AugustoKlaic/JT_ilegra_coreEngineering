package com.jonathansedrez.lampada.teste;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.jonathansedrez.lampada.*;



public class LampadaTest {
	
	//Cria os objetos para teste
	Fluorescente testFluorescente  = new Fluorescente();
	Incandecente testIncandecente  = new Incandecente();
	Switch testeSwitchFluorescente = new Switch(new Fluorescente());
	Switch testeSwitchIncandecente = new Switch(new Incandecente());
	
	
	//Testa o método ON
	@Test
	public void testeOn() {
		//test Fluorescente
		testFluorescente.on();
		assertEquals(true, testFluorescente.verStatus());
		//test Incandecente
		testIncandecente.on();
		assertEquals(true, testIncandecente.verStatus());
	}
	
	//Testa o método OFF
	@Test
	public void testeOff() {
		//test Fluorescente
		testIncandecente.off();
		assertEquals(false, testIncandecente.verStatus());
		//test Incandecente
		testIncandecente.off();
		assertEquals(false, testIncandecente.verStatus());
	}
	
	//Testa o modo switch, no qual muda o status para ON
	@Test
	public void testeSwitchOn() {
		//test Fluorescente
		testeSwitchFluorescente.change();
		assertEquals(true, testeSwitchFluorescente.verStatus());
		//test Incandecente
		testeSwitchIncandecente.change();
		assertEquals(true, testeSwitchIncandecente.verStatus());
	}
	
	//Testa o modo switch, no qual muda o status para ON e logo em seguida OFF
	@Test
	public void testeSwitchOff() {
		//test Fluorescente
		testeSwitchFluorescente.change();
		testeSwitchFluorescente.change();
		assertEquals(false, testeSwitchFluorescente.verStatus());
		//test Incandecente
		testeSwitchIncandecente.change();
		testeSwitchIncandecente.change();
		assertEquals(false, testeSwitchIncandecente.verStatus());
	}
}