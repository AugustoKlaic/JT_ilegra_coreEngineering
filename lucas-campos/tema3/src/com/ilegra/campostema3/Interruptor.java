package com.ilegra.campostema3;

public class Interruptor {
	private Lampada lampada;
	
	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
		 
	}
	
	public void  lightswitch() {
	if (lampada.isStatus())
		lampada.off();
		else
			lampada.on();

	}
}