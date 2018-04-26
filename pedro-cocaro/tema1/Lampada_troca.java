package com.java.cocaro.tema1;

public class Lampadatroca {
	private Lampada lampada;
	
	public Lampadatroca(Lampada changes) {
		this.lampada = changes;
	}
	
	public void SwitchOnOff() {
		if(lampada.getLigada()) {
			lampada.off();
		}
		else {
			lampada.on();
		}
	}
}
