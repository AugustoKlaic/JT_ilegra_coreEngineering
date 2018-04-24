package com.lucasambrosi;

public class Controle {

    private ILampada lamp;

    public Controle(ILampada lamp){
        this.lamp = lamp;
    }

    public void switcher(){
        if(lamp.getEstado())
            lamp.off();
        else
            lamp.on();
    }
}
