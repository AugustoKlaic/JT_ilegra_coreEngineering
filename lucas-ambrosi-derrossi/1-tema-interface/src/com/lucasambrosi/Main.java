package com.lucasambrosi._1_tema_interface;

public class Main {

    public static void main(String[] args){

        Controller control = new Controller(new Fluorescente());
        control.switcher();

        Controller control2 = new Controller(new LED());
        control2.switcher();
        control2.switcher();
    }
}
