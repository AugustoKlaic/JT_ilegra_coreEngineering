package com.jonathansedrez.lampada;

public class Incandecente implements Lampada{

	public boolean status = false;

	@Override
	public void on() {
		if (status == false) {
			status = true;
			System.out.println("Lampada Incandecente ligada");
		} 
	}

	@Override
	public void off() {
		if (status == true) {
			status = false;
			System.out.println("Lampada Incandecente desligada");
		} 
	}
	
	@Override
	public void turn() {
		if(status == true) {
			off();
		} else {
			on();
		}
	}
}