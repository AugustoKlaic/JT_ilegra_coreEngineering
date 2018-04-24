

public class Lampada_incandescente implements Lampada {
	
	private boolean ligada;
	
	public Lampada_incandescente() {
	}
	@Override
	public void on() {
		System.out.println("Lampada incandescente acesa");
		this.ligada=true;
		
	}

	@Override
	public void off() {
		System.out.println("Lampada incandescente apagada");
		this.ligada=false;
		
	}
	@Override
	public boolean getLigada() {
		if(this.ligada)
			System.out.println("Lampada Ligada");
		else
			System.out.println("Lampada desligada");
		return this.ligada;
	}

}
