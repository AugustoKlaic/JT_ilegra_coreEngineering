package Util;

public class Operations {
	public static void randomEven() throws InterruptedException {
		int evenNumber = Integer.valueOf((int) (Math.random() * 100));
		if (evenNumber % 2 != 0)
			evenNumber += 1;
		System.out.println("Número par: " + evenNumber);
		Thread.sleep(500);

	}

	public static void randomOdd() throws InterruptedException {
		int oddNumber = Integer.valueOf((int) (Math.random() * 100));
		if (oddNumber % 2 == 0)
			oddNumber += 1;
		System.out.println("Número ímpar: " + oddNumber);
		Thread.sleep(100);
	};
}
