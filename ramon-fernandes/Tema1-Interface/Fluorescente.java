
public class Fluorescente implements Lampada{

	boolean status = false;
	
	@Override
	public void on() {
		System.out.println("Lampada Fluorescente: ligada");
		Set(true);
	}

	@Override
	public void off() {
		System.out.println("Lampada Fluorescente: desligada");
		Set(false);
	}

	@Override
	public void Set(boolean bool) {
		status = bool;
	}

	@Override
	public boolean isSet() {
		return status;
	}
	
	
}
