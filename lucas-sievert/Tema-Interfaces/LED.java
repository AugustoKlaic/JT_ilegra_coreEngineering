
public class LED implements Lampada {

	public boolean status = false;
	
	public LED() {
		
	}
	
	@Override
	public void On() {

		System.out.println("LED On");
		status = true;

	}

	@Override
	public void Off() {

		System.out.println("LED Off");
		status = false;
	}
	
	public boolean isOn(){
		return status;
	}

}
