package com.ilegra.controle;

import com.ilegra.threads.ThreadGenerateRandomEven;
import com.ilegra.threads.ThreadGenerateRandomOdd;

public class Main {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadGenerateRandomEven().getRunnable());
		Thread thread2 = new Thread(new ThreadGenerateRandomOdd().getRunnable());
		thread1.start();
		thread2.start();
	}

}