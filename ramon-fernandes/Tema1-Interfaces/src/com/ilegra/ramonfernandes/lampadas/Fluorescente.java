package com.ilegra.ramonfernandes.lampadas;



public class Fluorescente implements Lampada{

	boolean status = false;
	
	@Override
	public void on() {
		System.out.println("Lampada Fluorescente: ligada");
		status = true;
	}

	@Override
	public void off() {
		System.out.println("Lampada Fluorescente: desligada");
		status = false;
	}

	@Override
	public boolean isSet() {
		return status;
	}
	
	
}