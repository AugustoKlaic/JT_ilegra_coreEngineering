package com.java.augusto.business;

public class ThreadParImpar implements Runnable {

	private int threadID;
	private GeraNumero RandonNumb;

	public static final int timesleepimpar = 100;
	public static final int timesleeppar = 500;

	public ThreadParImpar(int id) {
		this.threadID = id;
		this.RandonNumb = new GeraNumero();
	}

	public void run() {
		while (true) {

			System.out.println("Thread number " + threadID + "-> " + RandonNumb.getNumero());

			if (threadID == 1) {
				GeraNumero.randomOdd();
				try {
					Thread.sleep(timesleepimpar);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (threadID == 2) {
				GeraNumero.randomEven();
				try {
					Thread.sleep(timesleeppar);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	};