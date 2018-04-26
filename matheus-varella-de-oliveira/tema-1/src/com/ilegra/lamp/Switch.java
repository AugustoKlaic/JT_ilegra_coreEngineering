package com.ilegra.lamp;

public class Switch {
    Lamp lamp;

    public Switch(Lamp nojeira) {
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
