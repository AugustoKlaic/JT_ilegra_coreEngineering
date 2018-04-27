package com.lsievert.temaInterface;

public class Switches {

	public Lampada lampada;
	
	public Switches(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void lightSwitch() {
		
		if(lampada.isOn()) {
			lampada.off();
		}
		else {
			lampada.on();
		}
	}
}
