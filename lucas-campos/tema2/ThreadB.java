package com.ilegra.campostema2;
import java.util.Timer; 
public class ThreadB extends Thread {
	@Override
	public void run() {
		
		Timer even = new Timer();
		even.schedule(new NumberB(), 0, 500);
	}
}
