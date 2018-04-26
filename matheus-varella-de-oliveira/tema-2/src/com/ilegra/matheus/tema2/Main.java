package com.ilegra.matheus.tema2;


public class Main {
    public static void main(String[] args) {
        Thread threadEven = new Thread(new PrinterEven());
        threadEven.start();
        Thread threadOdd = new Thread(new PrinterOdd());
        threadOdd.start();
    }
}



