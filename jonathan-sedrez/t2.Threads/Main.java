package com.jonathansedrez.thread;

public class Main {

	public static void main(String[] args) {
		
		//Cria as Threads
		Thread ThreadPar = new Thread(new ThreadPar());
		Thread ThreadImpar = new Thread(new ThreadImpar());
		
		//Inicia as Threads
		ThreadPar.start();
		ThreadImpar.start();
	}
}
