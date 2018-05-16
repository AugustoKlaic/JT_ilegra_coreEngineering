package com.java.augusto.main;

import com.java.augusto.business.Coffe;
import com.java.augusto.business.HotChocolate;
import com.java.augusto.business.HotDrinksMethod;

public class Main{
	public static void main(String[] args) {
		HotDrinksMethod coffe = new Coffe();
		HotDrinksMethod hotchocolate = new HotChocolate();
		
		coffe.vendeBebida();
		hotchocolate.vendeBebida();
	}
}