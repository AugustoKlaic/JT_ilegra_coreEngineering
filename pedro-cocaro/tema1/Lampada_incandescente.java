package com.java.cocaro.tema1;

public class Lampadaincandescente implements Lampada {
	
	private boolean ligada = false;
	
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
