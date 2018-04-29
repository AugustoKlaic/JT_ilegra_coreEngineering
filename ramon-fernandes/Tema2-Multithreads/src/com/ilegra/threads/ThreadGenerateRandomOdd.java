package com.ilegra.threads;

import com.ilegra.controle.Operations;

public class ThreadGenerateRandomOdd {
	static final long ODD_THREAD_SLEEP = 500;
	private static Runnable thread = new Runnable() {
		public void run() {
			while (true) {
				try {
					System.out.println("N�mero �mpar: " + Operations.randomOdd());
					Thread.sleep(ODD_THREAD_SLEEP);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public Runnable getRunnable() {
		return thread;
	}
}
