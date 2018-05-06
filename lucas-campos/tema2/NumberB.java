package com.ilegra.campostema2;
import java.util.TimerTask;
import java.util.Random;
public class NumberB extends TimerTask {

	@Override
	public void run() {
		
		int even = new Random().nextInt(100);
		if (even%2 != 0)
			even = even - 1;
		
		System.out.println(even);
	}
}
