package com.lsievert.temaInterface;

public class LED implements Lampada {

	public boolean lightStatus = false;
	
	public LED() {
		
	}
	
	@Override
	public void on() {

		System.out.println("LED On");
		lightStatus = true;

	}

	@Override
	public void off() {

		System.out.println("LED Off");
		lightStatus = false;
	}
	
	public boolean isOn(){
		return lightStatus;
	}

}
