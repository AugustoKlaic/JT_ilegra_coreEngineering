package com.java.augusto.business;

public class LampadaSingleton{
		private static  LampadaFactory singletonlampada = new LampadaFactory();
		
		private LampadaSingleton() {
		}
		
		public static LampadaFactory getInstancia() {
			return singletonlampada;
		}
}