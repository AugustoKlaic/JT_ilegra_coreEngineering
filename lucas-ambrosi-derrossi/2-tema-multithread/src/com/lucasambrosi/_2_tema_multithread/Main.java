package com.lucasambrosi._2_tema_multithread;

public class Main {

    public static void main(String[] args){
        Thread thread1 = new Thread(new GenerateOdd());
        thread1.start();

        Thread thread2 = new Thread(new GenerateEven());
        thread2.start();
    }
}
