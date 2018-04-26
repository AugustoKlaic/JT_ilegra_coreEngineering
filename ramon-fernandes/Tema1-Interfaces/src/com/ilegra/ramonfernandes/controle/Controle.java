package com.ilegra.ramonfernandes.controle;
import com.ilegra.ramonfernandes.lampadas.Lampada;

public class Controle {
	 private Lampada lampada;

	public Controle(Lampada lampada) {
		this.lampada = lampada;
	}
	 
	public void switchStat() {
		if(lampada.isSet())
			lampada.off();
		else
			lampada.on();
	}
}
