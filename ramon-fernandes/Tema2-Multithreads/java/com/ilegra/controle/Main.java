package java.com.ilegra.controle;

import java.com.ilegra.threads.TheradGenerateRandomEven;
import java.com.ilegra.threads.ThreadGenerateRandomOdd;

public class Main {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new TheradGenerateRandomEven().getRunnable());
		Thread thread2 = new Thread(new ThreadGenerateRandomOdd().getRunnable());
		thread1.start();
		thread2.start();
	}

}