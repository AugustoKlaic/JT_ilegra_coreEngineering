package com.ilegra.threads;

import com.ilegra.controle.Operations;

public class ThreadGenerateRandomEven {
	static final long EVEN_THREAD_SLEEP = 100;
	private static Runnable thread = new Runnable() {
		public void run() {
			while (true)
				try {
					Thread.sleep(EVEN_THREAD_SLEEP);
					System.out.println("N�mero par: " + Operations.randomEven());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	};

	public Runnable getRunnable() {
		return thread;
	}
}
