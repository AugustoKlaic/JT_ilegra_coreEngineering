
public class Main {

	public static void main(String[] args) {
		
		LED lampadaLED = new LED() ;
		Fluorescente lampadaFluo = new Fluorescente();
		Switches interruptor = new Switches(lampadaLED);
		interruptor.Switch("On");
		interruptor.Switch("Off");
		Switches interruptor1 = new Switches(lampadaFluo);
		interruptor1.Switch("On");
		interruptor1.Switch("Off");
	
	}

}
