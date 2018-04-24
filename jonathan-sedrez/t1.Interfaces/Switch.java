package etc;

public class Switch {
	
	public Lampada lampada;
	
	public Switch (Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void liga(){
		lampada.on();
	}
	public void desliga(){
		lampada.off();
	}
}
