package com.ilegra.lamp;

public class Led implements ILamp {
    boolean status = false;

    public void on() {
        status = true;
        System.out.println("Lampada Led ligada");
    }

    public void off() {
        status = false;
        System.out.println("Lampada Led desligada");

    }

    public boolean getStatus() {
        return status;
    }
}
