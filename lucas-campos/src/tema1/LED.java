package tema1;

public class LED implements Lampada{

	int status = 0; //estado desligado
	
	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("LED On");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("LED Off");
	}

}
