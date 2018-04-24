package etc;

public class Main {

	public static void main(String[] args) {
		Thread A = new Thread(new ThreadPar());
		Thread B = new Thread(new ThreadImpar());
		A.start();
		B.start();
	}

}
