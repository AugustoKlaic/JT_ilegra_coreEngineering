package com.ilegra.lampadas;

public class LED implements Lampada{
	
	boolean status;
	
	public LED() {
		status = false;
	}
	
	@Override
	public void on() {
		System.out.println("Lampada LED: ligada");
		status = true;
	}

	@Override
	public void off() {
		System.out.println("Lampada LED: desligada");
		status = false;
	}


	@Override
	public boolean isSet() {
		return status;
	}


	
}