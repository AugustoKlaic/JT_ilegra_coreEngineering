package com.java.cocaro.tema1;

public class Lampada_troca {
	private Lampada lampada;
	
	public Lampada_troca(Lampada a) {
		this.lampada = a;
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
