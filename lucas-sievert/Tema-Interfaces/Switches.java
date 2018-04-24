
public class Switches {

	public Lampada lampada;
	
	public Switches(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void Switch(String Modo) {
		
		if(Modo == "On") {
			lampada.On();
		}
		else {
			if(Modo == "Off") {
				lampada.Off();
			}
			else {
				System.out.println("Unknow");
			}
		}
	}
}
