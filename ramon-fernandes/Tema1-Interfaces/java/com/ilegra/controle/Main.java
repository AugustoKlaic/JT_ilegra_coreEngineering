package java.com.ilegra.controle;

import java.com.ilegra.lampadas.Fluorescente;
import java.com.ilegra.lampadas.LED;

public class Main {

	public static void main(String[] args) {
		Controle controle = new Controle (new Fluorescente());
		controle.switchStat();
		controle.switchStat();
		controle.switchStat();
		
		controle = new Controle (new LED());
		controle.switchStat();
		controle.switchStat();
		controle.switchStat();
	}

}
