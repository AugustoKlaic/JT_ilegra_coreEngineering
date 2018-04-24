package com.lucasambrosi;

public class Fluorescente implements ILampada {

    private boolean estado;

    @Override
    public void on() {
        System.out.println("Lampada Fluorescente ligada");
        estado = true;
    }

    @Override
    public void off() {
        System.out.println("Lampada Fluorescente desligada");
        estado = false;
    }

    @Override
    public boolean getEstado() {
        return estado;
    }
}
