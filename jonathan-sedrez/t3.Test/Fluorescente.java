package com.jonathansedrez.lampada;

public class Fluorescente implements Lampada{

	public boolean status = false;

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
		if(status == true) {
			off();
		} else {
			on();
		}
	}
	
	//Método utilizado para teste
	@Override
	public boolean verStatus() {
		return status;
	}
}
