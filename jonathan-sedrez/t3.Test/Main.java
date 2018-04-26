package com.jonathansedrez.lampada;

public class Main {
	public static void main (String [] args) {
		Switch LampadaIncandecente  = new Switch(new Incandecente());
		Switch LampadaFluorescente  = new Switch(new Fluorescente());
		
		LampadaIncandecente.change();
		LampadaIncandecente.change();
		LampadaIncandecente.change();		
		
		LampadaFluorescente.change();
		LampadaFluorescente.change();
		LampadaFluorescente.change();
		LampadaFluorescente.verStatus();
		
	}
}