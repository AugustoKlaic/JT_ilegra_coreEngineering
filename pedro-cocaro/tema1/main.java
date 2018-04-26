package com.java.cocaro.tema1;

public class main {

	public static void main(String[] args) {
		
		Lampadafluorescente branca = new Lampadafluorescente();
		Lampadatroca interruptor = new Lampadatroca(branca); 
		interruptor.SwitchOnOff();
		interruptor.SwitchOnOff();
		interruptor.SwitchOnOff();


		Lampadaincandescente azul = new Lampadaincandescente();
		Lampadatroca interruptor2 = new Lampadatroca(azul); 
		interruptor2.SwitchOnOff();
		interruptor2.SwitchOnOff();
		interruptor2.SwitchOnOff();


	}

}
