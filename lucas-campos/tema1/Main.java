package com.ilegra.campostema1;

public class Main {

	public static void main(String[] args) {

		Interruptor interruptor = new Interruptor(new LED());
		interruptor.switch();
		interruptor.switch();
		interruptor.switch();
		interruptor.switch();

		interruptor = new Interruptor(new Fluorecente());
		interruptor.switch();
		interruptor.switch();
		interruptor.switch();
		interruptor.switch();

	}
}
