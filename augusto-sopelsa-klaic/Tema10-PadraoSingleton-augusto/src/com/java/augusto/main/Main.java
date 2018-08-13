package com.java.augusto.main;

import com.java.augusto.business.*;

public class Main{
	public static void main(String[] args) {
		
		System.out.println(LampadaSingleton.getInstancia().criaLampadaFactory("Incandescente").toString());
		System.out.println(LampadaSingleton.getInstancia().criaLampadaFactory("Fluorescente").toString());
	}
}