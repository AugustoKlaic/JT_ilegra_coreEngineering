package com.lsievert.temaInterface;

public class Fluorescente implements Lampada {

	public boolean lightStatus = false;
	
	

	@Override
	public void on() {

		System.out.println("Fluorescente On");
		lightStatus = true;

	}

	@Override
	public void off() {

		System.out.println("Fluorescente Off");
		lightStatus = false;
	}
	
	public boolean isOn(){
		return lightStatus;
	}

}
