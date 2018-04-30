package com.java.augusto.business;

public class LampadaIncandescente implements Lampada{
	private boolean ligada;
	
	public LampadaIncandescente() {
		super();
		ligada = false;
	}
	
	public LampadaIncandescente(boolean lampada) {
		super();
		this.ligada = lampada;
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
