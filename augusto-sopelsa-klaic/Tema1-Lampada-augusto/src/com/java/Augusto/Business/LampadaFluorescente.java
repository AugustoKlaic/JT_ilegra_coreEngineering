package com.java.Augusto.Business;

public class LampadaFluorescente implements Lampada{

	private boolean Ligada;
	
	public LampadaFluorescente() {
		super();
		Ligada = false;
	}
	
	public LampadaFluorescente(boolean x) {
		super();
		this.Ligada = x;
	}
	
	@Override
	public boolean getLigada() {
		return Ligada;
	}
	
	@Override
	public void On() {
		Ligada = true;
		System.out.println("A lampada Fluorescente esta Ligada.");
	}

	@Override
	public void Off() {
		Ligada = false;
		System.out.println("A lampada Fluorescente esta Desligada.");
	}
}