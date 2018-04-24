
public class LED implements Lampada{
	
	boolean status = false;
	
	@Override
	public void on() {
		System.out.println("Lampada LED: ligada");
		Set(true);
	}

	@Override
	public void off() {
		System.out.println("Lampada LED: desligada");
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
