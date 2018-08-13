package com.java.augusto.business;

public class LampadaFactory{
	
	public Lampada criaLampadaFactory(String tipo) {
		switch(tipo) {
			case "Incandescente":
				return new LampadaIncandescente();
			case "Fluorescente":
				return new LampadaFluorescente();
			default:
				return null;
		}
	}
}