
public class Main {

	public static void main(String[] args) {
		
		LED lampadaLED = new LED() ;
		Fluorescente lampadaFluo = new Fluorescente();
		Switches interruptor = new Switches(lampadaLED);
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();
		interruptor = new Switches(lampadaFluo);
		interruptor.Switch();
		interruptor.Switch();
		interruptor.Switch();
	
	}

}
