package com.java.cocaro.lampadatroca;

public class Lampada_fluorescente implements Lampada {
	
	private boolean ligada = false;
	
	public Lampada_fluorescente() {
	}
	@Override
	public void on() {
		System.out.println("Lampada fluorescente acesa");
		ligada=true;
		
	}

	@Override
	public void off() {
		System.out.println("Lampada fluorescente apagada");
		ligada=false;
		
	}
	@Override
	public boolean getLigada() {
		return ligada;
	}

}
