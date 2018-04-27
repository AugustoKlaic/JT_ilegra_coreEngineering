package com.jonathansedrez.thread;

public class Main {

	public static void main(String[] args) {
		Thread threadPar = new Thread(new ThreadPar());
		Thread threadImpar = new Thread(new ThreadImpar());
		
		threadPar.start();
		threadImpar.start();
	}
}
