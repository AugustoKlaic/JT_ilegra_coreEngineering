package com.java.Augusto.Business;

public class LampadaFluorescente implements Lampada{

	private boolean ligada;
	
	public LampadaFluorescente() {
		super();
		ligada = false;
	}
	
	public LampadaFluorescente(boolean ligada) {
		super();
		this.ligada = ligada; 
	}
	
	@Override
	public boolean getLigada() {
		return ligada;
	}
	
	@Override
	public void on() {
		ligada = true;
		System.out.println("A lampada Fluorescente esta ligada.");
	}

	@Override
	public void off() {
		ligada = false;
		System.out.println("A lampada Fluorescente esta Desligada.");
	}

}
