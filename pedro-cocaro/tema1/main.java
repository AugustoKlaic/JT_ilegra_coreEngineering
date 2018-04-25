package com.java.cocaro.tema1;

public class main {

	public static void main(String[] args) {
		
		Lampada_fluorescente branca = new Lampada_fluorescente();
		Lampada_troca interruptor = new Lampada_troca(branca); 
		interruptor.SwitchOnOff();
		interruptor.SwitchOnOff();
		interruptor.SwitchOnOff();


		Lampada_incandescente azul = new Lampada_incandescente();
		Lampada_troca interruptor2 = new Lampada_troca(azul); 
		interruptor2.SwitchOnOff();
		interruptor2.SwitchOnOff();
		interruptor2.SwitchOnOff();


	}

}
