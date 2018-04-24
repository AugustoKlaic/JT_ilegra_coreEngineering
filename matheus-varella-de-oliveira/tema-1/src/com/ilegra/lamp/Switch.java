package com.ilegra.lamp;

public class Switch {
    ILamp lamp;

    public Switch(ILamp nojeira) {
        this.lamp = nojeira;
    }

    public void switcher(){
        if (lamp.getStatus()){
            lamp.off();
            return;
        }
        lamp.on();
    }
}
