package com.lucasambrosi;

public class Main {

    public static void main(String[] args){
        Thread thread1 = new Thread(new GeraNumero(true));
        thread1.start();

        Thread thread2 = new Thread(new GeraNumero());
        thread2.start();
    }
}
