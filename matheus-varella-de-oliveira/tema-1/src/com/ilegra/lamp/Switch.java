package com.ilegra.lamp;

public class Switch {
    private Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void switcher() {
        if (lamp.getStatus()) {
            lamp.off();
        } else {
            lamp.on();
        }
    }
    
    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }
}
