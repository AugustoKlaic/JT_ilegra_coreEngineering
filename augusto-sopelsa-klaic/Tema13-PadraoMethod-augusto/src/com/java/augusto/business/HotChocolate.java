package com.java.augusto.business;

public class HotChocolate extends HotDrinksMethod{

	@Override
	public void preparaBebida() {
		System.out.println("Preparando chocolate quente.");
	}

	@Override
	public void serveBebida() {
		System.out.println("Servindo o chocolate quente.");
		
	}
	
}