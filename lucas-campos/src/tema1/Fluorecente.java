package tema1;

public class Fluorecente implements Lampada {

	int status = 0; //estado desligado
	
	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Fluorecente On");
	}


	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("Fluorecente Off");
	}

}
