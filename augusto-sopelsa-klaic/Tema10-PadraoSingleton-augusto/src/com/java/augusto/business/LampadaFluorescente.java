package com.java.augusto.business;

public class LampadaFluorescente implements Lampada{

	private boolean ligada;
	
	public LampadaFluorescente() {
		super();
		ligada = false;
	}
	
	public LampadaFluorescente(boolean x) {
		super();
		this.ligada = x;
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
	
	public String toString() {
		return "A lampada Fluorescente foir criada";
	}
}