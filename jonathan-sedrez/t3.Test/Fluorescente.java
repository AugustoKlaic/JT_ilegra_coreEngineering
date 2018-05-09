package com.jonathansedrez.lampada;

public class Fluorescente implements Lampada{

	private boolean status = false;

	@Override
	public void on() {
		if (status == false) {
			status = true;
			System.out.println("Lampada Fluorescente ligada");
		}
	}

	@Override
	public void off() {
		if (status == true) {
			status = false;
			System.out.println("Lampada Fluorescente desligada");
		}
	}
	
	@Override
	public void turn() {
		if(status) {
			off();
		} else {
			on();
		}
	}
	
	@Override
	public boolean verStatus() {
		return status;
	}
}
