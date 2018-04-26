package com.lucasambrosi._3_tema_tests;

public class Fluorescente implements Lamp {

    private boolean state;

    @Override
    public void on() {
        System.out.println("Lampada Fluorescente ligada");
        state = true;
    }

    @Override
    public void off() {
        System.out.println("Lampada Fluorescente desligada");
        state = false;
    }

    @Override
    public boolean getState() {
        return state;
    }
}
