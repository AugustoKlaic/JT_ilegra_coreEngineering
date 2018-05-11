package com.java.augusto.main;

import com.java.augusto.business.*;

public class Main{
	public static void main(String[] args) {
		
		LampadaFactory factory = new LampadaFactory();
		Lampada lampada = factory.criaLampadaFactory("Incandescente");
		Lampada lamp = factory.criaLampadaFactory("Fluorescente");
		
		System.out.println(lampada.toString());
		System.out.println(lamp.toString());
	}
}