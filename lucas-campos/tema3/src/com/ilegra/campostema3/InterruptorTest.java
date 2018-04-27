package com.ilegra.campostema3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InterruptorTest {
	
	private Lampada lampadaled;
	private Lampada lampadafluorecente;
	
	@Before
	public void setup() {
		lampadaled = new LED();
		lampadafluorecente = new Fluorecente();
	}
	

	@Test
	public void testledon() {
		lampadaled.on();
		assertEquals(true, lampadaled.isStatus());  
	}
	
	@Test
	public void testledoff() {
		lampadaled.off();
		assertEquals(false, lampadaled.isStatus());  
	}

	@Test
	public void testfluorecenteon() {
		lampadafluorecente.on();
		assertEquals(true, lampadafluorecente.isStatus());  
	}

	@Test
	public void testfluorecentoff() {
		lampadafluorecente.off();
		assertEquals(false, lampadafluorecente.isStatus());  
	}

	@Test
	public void testledswitch() {
		lampadaled.off();
		assertEquals(false, lampadaled.isStatus());  
		lampadaled.on();
		assertEquals(true, lampadaled.isStatus());
		lampadaled.off();
		assertEquals(false, lampadaled.isStatus());  
	
	}
	
	@Test
	public void testfluorecenteswitch() {
		lampadafluorecente.off();
		assertEquals(false, lampadafluorecente.isStatus());  
		lampadafluorecente.on();
		assertEquals(true, lampadafluorecente.isStatus());
		lampadafluorecente.off();
		assertEquals(false, lampadafluorecente.isStatus());  
	
	}

}
