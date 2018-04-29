package com.ilegra.lamp;

public class Neon implements Lamp {

    private boolean status = false;

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

    public void setStatus(boolean status) {
        this.status = status;
    }
}
