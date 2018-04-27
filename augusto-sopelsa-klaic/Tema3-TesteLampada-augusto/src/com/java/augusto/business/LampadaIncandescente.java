package com.java.Augusto.Business;

public class LampadaIncandescente implements Lampada{
	private boolean ligada;
	
	public LampadaIncandescente() {
		super();
		ligada = false;
	}
	
	public LampadaIncandescente(boolean x) { 
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
		System.out.println("A lampada Incandescente esta ligada.");
	}

	@Override
	public void off() {
		ligada = false;
		System.out.println("A lampada Incandescente esta Desligada.");
	}
}
