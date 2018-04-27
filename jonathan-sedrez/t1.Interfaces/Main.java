package com.jonathansedrez.lampada;

public class Main {
	public static void main (String [] args) {
		Switch lampadaIncandecente  = new Switch(new Incandecente());
		Switch lampadaFluorescente  = new Switch(new Fluorescente());
		
		lampadaIncandecente.change();
		lampadaIncandecente.change();
		lampadaIncandecente.change();		
		
		lampadaFluorescente.change();
		lampadaFluorescente.change();
		lampadaFluorescente.change();
	}
}
