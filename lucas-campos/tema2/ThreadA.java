package com.ilegra.campostema2;
import java.util.Timer;
public class ThreadA extends Thread {
	@Override
	public void run() {

		Timer odd = new Timer();
		odd.schedule(new NumberA(), 0, 100);
	}

}
