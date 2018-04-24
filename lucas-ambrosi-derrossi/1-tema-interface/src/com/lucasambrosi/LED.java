package com.lucasambrosi;

public class LED implements ILampada {

    private boolean estado;

    @Override
    public void on() {
        System.out.println("Lampada LED ligada");
        estado = true;
    }

    @Override
    public void off() {
        System.out.println("Lampada LED desligada");
        estado = false;
    }

    @Override
    public boolean getEstado() {
        return estado;
    }
}
