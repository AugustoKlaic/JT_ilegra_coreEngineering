package com.ilegra.lamp;

public class LampTest {

    public static void main(String[] args) {
        Switch controller = new Switch(new Neon());

        controller.switcher();
        controller.switcher();
    }
}


