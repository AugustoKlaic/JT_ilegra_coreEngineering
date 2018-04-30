package com.java.cocaro.lampadatroca;

public class Lampada_incandescente implements Lampada {
	
	private boolean ligada = false;
	
	public Lampada_incandescente() {
	}
	@Override
	public void on() {
		System.out.println("Lampada incandescente acesa");
		ligada=true;
		
	}

	@Override
	public void off() {
		System.out.println("Lampada incandescente apagada");
		ligada=false;
		
	}
	@Override
	public boolean getLigada() {
		return ligada;
	}

}
