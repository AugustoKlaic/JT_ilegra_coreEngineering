package com.lucasambrosi._2_tema_multithread;

public class GenerateEven implements Runnable {

    private final long SLEEP_TIME_EVEN = 100;

    @Override
    public void run() {
        try {
            while(true){
                System.out.println(GenerateNumber.generate(false));
                Thread.sleep(SLEEP_TIME_EVEN);
            }
        } catch (Exception e){}
    }
}
