
public class Switches {

	public Lampada lampada;
	
	public Switches(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void Switch() {
		
		if(lampada.isOn()) {
			lampada.Off();
		}
		else {
			lampada.On();
		}
	}
}
