package com.java.cocaro.tema1;


public class Lampadafluorescente implements Lampada {
	
	private boolean ligada = false;
	
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
