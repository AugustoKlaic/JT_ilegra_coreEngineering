package etc;

public class Main {
	public static void main (String [] args) {
		Switch l1 = new Switch(new Incandecente());
		Switch l2 = new Switch(new Fluorescente());
		
		l1.liga();
		l1.desliga();
		l1.liga();		
		
		l2.liga();
		l2.desliga();
		l2.liga();	
	}
}
