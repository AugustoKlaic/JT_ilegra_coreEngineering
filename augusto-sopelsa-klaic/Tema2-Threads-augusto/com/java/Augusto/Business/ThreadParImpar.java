package com.java.Augusto.Business;

public class ThreadParImpar implements Runnable {

	private int threadID;
	private int RandonNumb;

	public static final int timesleepimpar = 100;
	public static final int timesleeppar = 500;

	public ThreadParImpar(int id) {
		this.threadID = id;
		this.RandonNumb = 0;
	}

	public void run() {
		while (true) {

			System.out.println("Thread number " + threadID + "-> " + RandonNumb);

			if (threadID == 1) {
				randomOdd();
			} else if (threadID == 2) {
				randomEven();
			}
		}
	}

	public void randomEven() {
		int numeroPar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroPar % 2 != 0)
			numeroPar += 1;

		RandonNumb = numeroPar;
		try {
			Thread.sleep(timesleeppar);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void randomOdd() {
		int numeroImpar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroImpar % 2 == 0)
			numeroImpar += 1;

		RandonNumb = numeroImpar;
		try {
			Thread.sleep(timesleepimpar);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
}
