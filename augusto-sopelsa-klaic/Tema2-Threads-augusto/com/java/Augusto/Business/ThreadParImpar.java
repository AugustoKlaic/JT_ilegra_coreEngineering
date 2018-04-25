package com.java.Augusto.Business;

public class ThreadParImpar implements Runnable {

	private int threadID;
	private int RandonNumb;

	public ThreadParImpar(int id) {
		this.threadID = id;
		this.RandonNumb = 0;
	}

	public void run() {
		while (true) {

			System.out.println("Thread number " + threadID + "-> " + RandonNumb);

			try {
				if (threadID == 1) {
					randomOdd();
				} else if (threadID == 2) {
					randomEven();
				}
			} catch (InterruptedException e) {

			}
		}
	}

	public void randomEven() throws InterruptedException {
		int numeroPar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroPar % 2 != 0)
			numeroPar += 1;

		RandonNumb = numeroPar;
		Thread.sleep(500);

	}

	public void randomOdd() throws InterruptedException {
		int numeroImpar = Integer.valueOf((int) (Math.random() * 10));
		if (numeroImpar % 2 == 0)
			numeroImpar += 1;

		RandonNumb = numeroImpar;
		Thread.sleep(100);
	};
}