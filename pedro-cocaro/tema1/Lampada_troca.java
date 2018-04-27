package com.java.cocaro.tema1;

public class Lampadatroca {
	private Lampada lampada;
	
	public lampadatroca(Lampada changes) {
		this.lampada = changes;
	}
	
	public void switchOnOff() {
		if(lampada.getLigada()) {
			lampada.off();
		}
		else {
			lampada.on();
		}
	}
}
