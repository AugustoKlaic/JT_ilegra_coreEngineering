package com.ilegra.campostema2;
import java.util.TimerTask;
import java.util.Random;
public class NumberA extends TimerTask {

	@Override
	public void run() {

		int odd = new Random().nextInt(100);
		if (odd%2 == 0)
			odd = odd + 1;
		
		System.out.println(odd);
		
	}
}
