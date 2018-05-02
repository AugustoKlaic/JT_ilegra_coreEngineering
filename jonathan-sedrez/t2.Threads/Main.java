package com.jonathansedrez.thread;

public class Main {

	public static void main(String[] args) {	
		Thread ThreadPar = new Thread(new ThreadPar());
		Thread ThreadImpar = new Thread(new ThreadImpar());
		
		ThreadPar.start();
		ThreadImpar.start();
	}
}
