package com.ilegra.campostema3;

public class Main {

	public static void main(String[] args) {

		Interruptor interruptor = new Interruptor(new LED());
		interruptor.lightswitch();
		interruptor.lightswitch();
		interruptor.lightswitch();
		interruptor.lightswitch();

		interruptor = new Interruptor(new Fluorecente());
		interruptor.lightswitch();
		interruptor.lightswitch();
		interruptor.lightswitch();
		interruptor.lightswitch();

	}
}
