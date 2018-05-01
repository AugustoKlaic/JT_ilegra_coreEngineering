package com.jonathansedrez.lampada;

public class Incandecente implements Lampada{

	private boolean status = false;

	@Override
	public void on() {
			status = true;
			System.out.println("Lampada Incandecente ligada");
	}

	@Override
	public void off() {
			status = false;
			System.out.println("Lampada Incandecente desligada");
	}
	
	@Override
	public void turn() {
		if(status) {
			off();
		} else {
			on();
		}
	}
}
