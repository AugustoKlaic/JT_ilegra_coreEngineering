package com.lsievert.temaInterface.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lsievert.temaInterface.Fluorescente;
import com.lsievert.temaInterface.LED;
import com.lsievert.temaInterface.Lampada;
import com.lsievert.temaInterface.Switches;

public class InterfaceTest {
	
	
	private Lampada lampadaFluo;
	private Lampada lampadaLED;
	private Switches switchFluo;
	private Switches switchLED;
	@Before
	public void Setup() {
		 lampadaFluo = new Fluorescente();
		 lampadaLED = new LED();
		 switchFluo = new Switches(lampadaFluo);
		 switchLED = new Switches(lampadaLED);
		
	}
	
	
	@Test
	public void testeConstrutor() {
		assertEquals(false,lampadaFluo.isOn()); //Construída com Sucesso e apagada
		assertEquals(false, lampadaLED.isOn()); //Construída LED com Sucesso e apagada
	}
	
	@Test
	public void testOn() {
		assertEquals(false, lampadaFluo.isOn());
		lampadaFluo.on();
		assertEquals(true, lampadaFluo.isOn()); // Método para acender luz funciona Fluorescente
		
		
		assertEquals(false, lampadaLED.isOn());
		lampadaLED.on();
		assertEquals(true, lampadaLED.isOn()); // Método para acender luz funciona Fluorescente
		
		
	}


	@Test
	public void testOff() {
		lampadaFluo.on();
		assertEquals(true, lampadaFluo.isOn());
		lampadaFluo.off();
		assertEquals(false, lampadaFluo.isOn()); // Testa se off apaga lampada quando está acesa
		
		lampadaLED.on();
		assertEquals(true, lampadaLED.isOn());
		lampadaLED.off();
		assertEquals(false, lampadaLED.isOn()); // Testa se off apaga lampada quando está acesa
		
		
	}
	
	@Test
	public void testeSwitch() {
		assertEquals(false, lampadaFluo.isOn());
		switchFluo.lightSwitch();
		assertEquals(true, lampadaFluo.isOn()); // Estava desligada e ficou ligada
		switchFluo.lightSwitch();   
		assertEquals(false, lampadaFluo.isOn()); // Estava ligada e ficou desligada
		
		assertEquals(false, lampadaLED.isOn());
		switchLED.lightSwitch();
		assertEquals(true, lampadaLED.isOn()); // Estava desligada e ficou ligada
		switchLED.lightSwitch();   // Estava ligada e ficou desligada
		assertEquals(false, lampadaLED.isOn());
	}

}
