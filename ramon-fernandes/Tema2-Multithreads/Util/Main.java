package Util;

import threads.T1randomEven;
import threads.T2randomOdd;

public class Main {
	public static void main(String[] args) {
		Thread td1 = new Thread(new T1randomEven().getRunnable());
		Thread td2 = new Thread(new T2randomOdd().getRunnable());
		td1.start();
		td2.start();
	}

}