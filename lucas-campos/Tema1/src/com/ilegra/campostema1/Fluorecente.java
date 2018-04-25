package com.ilegra.campostema1;

public class Fluorecente implements Lampada {

	boolean status = false; 
	
	public boolean isStatus() {
		return status;
	}

	@Override
	public void on() {
		status = true;
		System.out.println("Lampada Fluorecente Ligada");
		
	}

	@Override
	public void off() {
		status = false;
		System.out.println("Lampada Fluorecente Desligada");

	}

}
