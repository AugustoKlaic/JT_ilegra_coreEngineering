package com.java.Augusto.Business;

public class LampadaIncandescente implements Lampada{
	private boolean Ligada;
	
	public LampadaIncandescente() {
		super();
		Ligada = false;
	}
	
	public LampadaIncandescente(boolean x) {
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
		System.out.println("A lampada Incandescente esta Ligada.");
	}

	@Override
	public void Off() {
		Ligada = false;
		System.out.println("A lampada Incandescente esta Desligada.");
	}
}