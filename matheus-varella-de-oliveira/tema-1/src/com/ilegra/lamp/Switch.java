package com.ilegra.lamp;

public class Switch {
    Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void switcher(){
        if (lamp.getStatus()){
            lamp.off();
            return;
        }
        lamp.on();
    }
}
