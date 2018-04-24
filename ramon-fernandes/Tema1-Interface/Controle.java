
public class Controle {
	 private Lampada l1;

	public Controle(Lampada l1) {
		super();
		this.l1 = l1;
	}
	 
	public void switchStat() {
		if(l1.isSet())
			l1.off();
		else
			l1.on();
	}
}
