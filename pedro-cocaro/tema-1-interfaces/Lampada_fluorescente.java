

public class Lampada_fluorescente implements Lampada {
	
	private boolean ligada;
	
	public Lampada_fluorescente() {
	}
	@Override
	public void on() {
		System.out.println("Lampada fluorescente acesa");
		this.ligada=true;
		
	}

	@Override
	public void off() {
		System.out.println("Lampada fluorescente apagada");
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
