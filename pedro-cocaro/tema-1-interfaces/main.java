
public class main {

	public static void main(String[] args) {
		
		Lampada_fluorescente branca = new Lampada_fluorescente();
		Lampada_troca interruptor = new Lampada_troca(branca); 
		interruptor.SwitchOnOff();

		

	}

}
