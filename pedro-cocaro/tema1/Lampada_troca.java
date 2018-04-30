package com.java.cocaro.lampadatroca;

public class Lampada_troca {
	private Lampada lampada;
	
	public Lampada_troca(Lampada Switch) {
		this.lampada = Switch;
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
