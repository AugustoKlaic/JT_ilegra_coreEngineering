package com.lucasambrosi._3_tema_tests;

public class Controller {

    private Lamp lamp;

    public Controller(Lamp lamp){
        this.lamp = lamp;
    }

    public void switcher(){
        if(lamp.getState())
            lamp.off();
        else
            lamp.on();
    }
}
