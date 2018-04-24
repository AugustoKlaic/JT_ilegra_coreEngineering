package etc;

public class ThreadPar implements Runnable{
	
	
	@Override
	public void run() {
		ThreadRandom par = new ThreadRandom();
		par.run();
	}
}
