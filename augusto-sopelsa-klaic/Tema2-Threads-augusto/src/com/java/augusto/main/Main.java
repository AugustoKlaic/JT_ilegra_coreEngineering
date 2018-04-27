package com.java.augusto.main;

import com.java.augusto.business.*;

public class Main {
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadImpar(1));
		Thread t2 = new Thread(new ThreadPar(2));
		
			t1.start();
			t2.start();
	}
}