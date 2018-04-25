package com.lucasambrosi._1_tema_interface;

public class LED implements Lamp {

    private boolean state;

    @Override
    public void on() {
        System.out.println("Lampada LED ligada");
        state = true;
    }

    @Override
    public void off() {
        System.out.println("Lampada LED desligada");
        state = false;
    }

    @Override
    public boolean getEstado() {
        return state;
    }
}
