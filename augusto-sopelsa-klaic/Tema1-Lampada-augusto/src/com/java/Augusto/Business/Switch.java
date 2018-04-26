package com.java.Augusto.Business;

public class Switch{
	private Lampada lampada;
	
	public Switch() {
		
	}
	
	public Switch(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void SwitchOnOff() {
		if(lampada.getLigada() == true) {
			lampada.off();
		}
		else if(lampada.getLigada() == false) {
			lampada.on();
		}
	}
	
	public void setSwitch(Lampada l) {
		lampada = l;
	}
	
	public Lampada getLampada() {
		return lampada;
	}
}
