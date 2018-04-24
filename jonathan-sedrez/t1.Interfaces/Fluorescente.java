package etc;

public class Fluorescente implements Lampada{

	public int status = 0;

	@Override
	public void on() {
		if (status == 0) {
			status = 1;
			System.out.println("Lampada Fluorescente ligada");
		} else {
			System.out.println("Lampa Fluorescente ja esta ligada");	
		}
	}

	@Override
	public void off() {
		if (status == 1) {
			status = 0;
			System.out.println("Lampada Fluorescente desligada");
		} else {
			System.out.println("Lampa Fluorescente ja esta desligada");
		}
	}
	
}
