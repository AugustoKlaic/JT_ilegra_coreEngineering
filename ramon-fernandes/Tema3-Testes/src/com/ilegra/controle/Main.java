package com.ilegra.controle;

import com.ilegra.lampadas.Fluorescente;
import com.ilegra.lampadas.LED;

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
