package java.com.ilegra.threads;

import java.com.ilegra.controle.Operations;

public class TheradGenerateRandomEven {
	static final long EVEN_THREAD_SLEEP = 100;
	private static Runnable thread = new Runnable() {
		public void run() {
			while (true)
				try {
					Thread.sleep(EVEN_THREAD_SLEEP);
					System.out.println("Número par: " + Operations.randomEven());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	};

	public Runnable getRunnable() {
		return thread;
	}
}
