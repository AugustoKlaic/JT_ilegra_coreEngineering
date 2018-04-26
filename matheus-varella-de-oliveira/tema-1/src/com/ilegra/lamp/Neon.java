package com.ilegra.lamp;

public class Neon implements Lamp {

    boolean status = false;

    public void on() {
        status = true;
        System.out.println("Lampada neon ligada");
    }

    public void off() {
        status = true;
        System.out.println("Lampada neon desligada");
    }

    public boolean getStatus() {
        return status;
    }

}
