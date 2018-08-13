package com.java.augusto.business;

public class LampadaSingleton{
	private static  LampadaSingleton singletonlampada = new LampadaSingleton();
	
	private LampadaSingleton() {
	}
	
	public static LampadaSingleton getInstancia() {
		return singletonlampada;
	}
	
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