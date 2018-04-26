package com.ilegra.campostema1;

public class Main {

	public static void main(String[] args) {

		Interruptor interruptor = new Interruptor(new LED());
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();

		interruptor = new Interruptor(new Fluorecente());
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();

	}
}
