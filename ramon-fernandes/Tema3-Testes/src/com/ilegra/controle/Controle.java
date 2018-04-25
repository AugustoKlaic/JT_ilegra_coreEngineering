package com.ilegra.controle;
import com.ilegra.lampadas.Lampada;

public class Controle {
	 private Lampada lampada;

	public Controle(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public Lampada getLampada() {
		return lampada;
	}
	 
	public void switchStat() {
		if(lampada.isSet())
			lampada.off();
		else
			lampada.on();
	}
}
