package com.lucasambrosi._2_tema_multithread;

public class GenerateOdd implements Runnable {

    private final long SLEEP_TIME_ODD = 500;

    @Override
    public void run() {
        try {
            while(true){
                System.out.println(GenerateNumber.generate(true));
                Thread.sleep(SLEEP_TIME_ODD);
            }
        } catch (Exception e){}
    }
}
