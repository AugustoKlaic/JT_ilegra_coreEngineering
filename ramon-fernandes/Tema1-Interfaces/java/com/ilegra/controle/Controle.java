package java.com.ilegra.controle;
import java.com.ilegra.lampadas.Lampada;

public class Controle {
	 private Lampada lampada;

	public Controle(Lampada lampada) {
		this.lampada = lampada;
	}
	 
	public void switchStat() {
		if(lampada.isSet())
			lampada.off();
		else
			lampada.on();
	}
}
