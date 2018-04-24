package threads;

import Util.Operations;

public class T2randomOdd {
	private static Runnable t2 = new Runnable() {
		public void run() {
			try {
				while (true)
					Operations.randomOdd();
			} catch (Exception e) {
			}
		}
	};

	public Runnable getRunnable() {
		return t2;
	}
}
