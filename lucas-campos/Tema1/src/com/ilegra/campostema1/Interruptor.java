package com.ilegra.campostema1;

public class Interruptor {
	public Lampada lampada;
	
	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
		 
	}
	
	public void  Switch() {
	if (lampada.isStatus())
		lampada.off();
		else
			lampada.on();

	}
}
