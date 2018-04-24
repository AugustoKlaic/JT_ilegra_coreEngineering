package etc;

public class ThreadImpar implements Runnable {
	
	
	@Override
	public void run() {
		ThreadRandom impar = new ThreadRandom();
		impar.run();
	}
}
