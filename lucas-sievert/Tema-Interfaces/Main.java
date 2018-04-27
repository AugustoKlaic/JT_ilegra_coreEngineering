package com.lsievert.temaInterface;

public class Main {

	public static void main(String[] args) {
		
		LED lampadaLED = new LED() ;
		Fluorescente lampadaFluo = new Fluorescente();
		Switches interruptor = new Switches(lampadaLED);
		interruptor.lightSwitch();
		interruptor.lightSwitch();
		interruptor.lightSwitch();
		interruptor = new Switches(lampadaFluo);
		interruptor.lightSwitch();
		interruptor.lightSwitch();
		interruptor.lightSwitch();
	
	}

}
