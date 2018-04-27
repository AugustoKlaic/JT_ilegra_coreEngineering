package com.ilegra.campostema1;

public class LED implements Lampada {
	
	private boolean status = false;

	public LED () {
		this.status = false;
	}


	public boolean isStatus() {
		return status;
	}
	
	@Override
	public void on() {
		status = true;
		System.out.println("Lampada LED Ligada");

	}

	@Override
	public void off() {
		status = false;
		System.out.println("Lamapda LED Desligada");

	}

}
