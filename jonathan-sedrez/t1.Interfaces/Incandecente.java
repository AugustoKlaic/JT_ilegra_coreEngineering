package etc;

public class Incandecente implements Lampada{

	public int status = 0;

	@Override
	public void on() {
		if (status == 0) {
			status = 1;
			System.out.println("Lampada Incandecente ligada");
		} else {
			System.out.println("Lampa Incandecente ja esta ligada");	
		}
	}

	@Override
	public void off() {
		if (status == 1) {
			status = 0;
			System.out.println("Lampada Incandecente desligada");
		} else {
			System.out.println("Lampa Incandecente ja esta desligada");
		}
	}
	
}