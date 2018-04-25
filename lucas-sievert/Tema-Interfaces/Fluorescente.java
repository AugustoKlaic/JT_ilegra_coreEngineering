
public class Fluorescente implements Lampada {

	public Fluorescente() {
		
	}

	@Override
	public void On() {

		System.out.println("Fluorescente On");
		status = true;

	}

	@Override
	public void Off() {

		System.out.println("Fluorescente Off");
		status = false;
	}
	
	public boolean isOn(){
		return status;
	}

}
