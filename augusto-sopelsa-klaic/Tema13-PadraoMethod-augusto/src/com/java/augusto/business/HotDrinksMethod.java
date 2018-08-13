package com.java.augusto.business;

public abstract class HotDrinksMethod{
	
	public abstract void preparaBebida();
	
	public abstract void serveBebida();
	
	public final void entregaBebida() {
		System.out.println("Pode retirar sua bebida.");
	}
	
	public final void vendeBebida() {
		preparaBebida();
		serveBebida();
		entregaBebida();
	}
}