package com.ilegra.campostema2;

public class Main {

	
	public static void main (String[] args) {
		
		ThreadB even = new ThreadB();
		even.start();
		
		ThreadA odd = new ThreadA();
		odd.start();

	}
}
