
public class Lampada_troca {
	private Lampada lampada;
	
	public Lampada_troca(Lampada a) {
		this.lampada = a;
	}
	
	public void SwitchOnOff() {
		if(lampada.getLigada() == true) {
			lampada.off();
		}
		else if(lampada.getLigada() == false) {
			lampada.on();
		}
	}
}
