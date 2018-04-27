package com.java.augusto.main;

import com.java.augusto.business.*;

public class Main{
	public static void main(String[] args) {
		
		Switch switch1 = new Switch(new LampadaFluorescente());
		Switch switch2 = new Switch(new LampadaIncandescente());
		
		while(true) {
			switch1.switchOnOff();
			switch1.switchOnOff();
		
			switch2.switchOnOff();
			switch2.switchOnOff();
		}
	}
}