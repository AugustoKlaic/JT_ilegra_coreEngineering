package Business;

public class Switch{
	private Lampada lampada;
	
	public Switch(Lampada l) {
		this.lampada = l;
	}
	
	public void SwitchOnOff() {
		if(lampada.getLigada() == true) {
			lampada.Off();
		}
		else if(lampada.getLigada() == false) {
			lampada.On();
		}
	}
}