package com.java.Augusto.Main;

import com.java.Augusto.Business.*;

public class Main{
	public static void main(String[] args) {
		
		Switch switch1 = new Switch(new LampadaFluorescente());
		Switch switch2 = new Switch(new LampadaIncandescente());
		
		while(true) {
			switch1.SwitchOnOff();
			switch1.SwitchOnOff();
		
			switch2.SwitchOnOff();
			switch2.SwitchOnOff();
		}
	}
}