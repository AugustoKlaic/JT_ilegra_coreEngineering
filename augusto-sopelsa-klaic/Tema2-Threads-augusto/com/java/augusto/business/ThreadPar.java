package com.java.augusto.business;

public class ThreadPar implements Runnable {
	
	private int threadID;
	private GeraNumero RandonNumb;

	private static final int TIME_SLEEP_PAR = 500;

	public ThreadPar(int id) {
		this.threadID = id;
		this.RandonNumb = new GeraNumero();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Thread number " + threadID + "-> " + RandonNumb.randomEven());
			try {
				Thread.sleep(TIME_SLEEP_PAR);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}