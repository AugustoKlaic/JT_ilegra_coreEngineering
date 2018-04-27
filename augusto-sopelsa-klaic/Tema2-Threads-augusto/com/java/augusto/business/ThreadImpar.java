package com.java.augusto.business;

public class ThreadImpar implements Runnable {

	private int threadID;
	private GeraNumero RandonNumb;

	private static final int TIME_SLEEP_IMPAR = 100;

	public ThreadImpar(int id) {
		this.threadID = id;
		this.RandonNumb = new GeraNumero();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Thread number " + threadID + "-> " + RandonNumb.randomOdd());
			try {
				Thread.sleep(TIME_SLEEP_IMPAR);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
};