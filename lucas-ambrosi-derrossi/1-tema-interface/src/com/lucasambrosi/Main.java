package com.lucasambrosi;

public class Main {

    public static void main(String[] args){

        Controle control = new Controle(new Fluorescente());
        control.switcher();

        Controle control2 = new Controle(new LED());
        control2.switcher();
        control2.switcher();
    }
}
