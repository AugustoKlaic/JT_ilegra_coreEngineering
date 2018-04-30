package com.java.augusto.business;

public class Switch{
	private Lampada lampada;
	
	public Switch() {
		
	}
	
	public Switch(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void switchOnOff() {
		if(lampada.getLigada() == true) {
			lampada.off();
		}
		else if(lampada.getLigada() == false) {
			lampada.on();
		}
	}
	
	public void setSwitch(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public Lampada getLampada() {
		return lampada;
	}
}