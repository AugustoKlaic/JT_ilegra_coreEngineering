package com.jonathansedrez.lampada;

public class Switch {
	
	public Lampada lampada;
	
	public Switch (Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void change(){
		lampada.turn();
	}
}
